package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information for filtering a list of entity recognizers. You can only specify one
  *       filtering parameter in a request. For more information, see the
  *         <code>ListEntityRecognizers</code> operation./></p>
  * @param Status
  *   <p>The status of an entity recognizer.</p>
  * @param RecognizerName
  *   <p>The name that you assigned the entity recognizer.</p>
  * @param SubmitTimeBefore
  *   <p>Filters the list of entities based on the time that the list was submitted for processing.
  *         Returns only jobs submitted before the specified time. Jobs are returned in descending order,
  *         newest to oldest.</p>
  * @param SubmitTimeAfter
  *   <p>Filters the list of entities based on the time that the list was submitted for processing.
  *         Returns only jobs submitted after the specified time. Jobs are returned in ascending order,
  *         oldest to newest.</p>
  */
final case class EntityRecognizerFilter(status: Option[ModelStatus] = None, recognizerName: Option[ComprehendArnName] = None, submitTimeBefore: Option[Timestamp] = None, submitTimeAfter: Option[Timestamp] = None)

object EntityRecognizerFilter extends ShapeTag.Companion[EntityRecognizerFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information for filtering a list of entity recognizers. You can only specify one\n      filtering parameter in a request. For more information, see the\n        <code>ListEntityRecognizers</code> operation./></p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(status: Option[ModelStatus], recognizerName: Option[ComprehendArnName], submitTimeBefore: Option[Timestamp], submitTimeAfter: Option[Timestamp]): EntityRecognizerFilter = EntityRecognizerFilter(status, recognizerName, submitTimeBefore, submitTimeAfter)

  implicit val schema: Schema[EntityRecognizerFilter] = struct(
    ModelStatus.schema.optional[EntityRecognizerFilter]("Status", _.status).addHints(smithy.api.Documentation("<p>The status of an entity recognizer.</p>")),
    ComprehendArnName.schema.optional[EntityRecognizerFilter]("RecognizerName", _.recognizerName).addHints(smithy.api.Documentation("<p>The name that you assigned the entity recognizer.</p>")),
    timestamp.optional[EntityRecognizerFilter]("SubmitTimeBefore", _.submitTimeBefore).addHints(smithy.api.Documentation("<p>Filters the list of entities based on the time that the list was submitted for processing.\n      Returns only jobs submitted before the specified time. Jobs are returned in descending order,\n      newest to oldest.</p>")),
    timestamp.optional[EntityRecognizerFilter]("SubmitTimeAfter", _.submitTimeAfter).addHints(smithy.api.Documentation("<p>Filters the list of entities based on the time that the list was submitted for processing.\n      Returns only jobs submitted after the specified time. Jobs are returned in ascending order,\n      oldest to newest.</p>")),
  )(make).withId(id).addHints(hints)
}
