package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Individual item from the list of entity types in the metadata of an entity
  *       recognizer.</p>
  * @param Type
  *   <p>Type of entity from the list of entity types in the metadata of an entity recognizer.
  *       </p>
  * @param EvaluationMetrics
  *   <p>Detailed information about the accuracy of the entity recognizer for a specific item on
  *         the list of entity types. </p>
  * @param NumberOfTrainMentions
  *   <p>Indicates the number of times the given entity type was seen in the training data. </p>
  */
final case class EntityRecognizerMetadataEntityTypesListItem(_type: Option[AnyLengthString] = None, evaluationMetrics: Option[EntityTypesEvaluationMetrics] = None, numberOfTrainMentions: Option[Int] = None)

object EntityRecognizerMetadataEntityTypesListItem extends ShapeTag.Companion[EntityRecognizerMetadataEntityTypesListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerMetadataEntityTypesListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Individual item from the list of entity types in the metadata of an entity\n      recognizer.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(_type: Option[AnyLengthString], evaluationMetrics: Option[EntityTypesEvaluationMetrics], numberOfTrainMentions: Option[Int]): EntityRecognizerMetadataEntityTypesListItem = EntityRecognizerMetadataEntityTypesListItem(_type, evaluationMetrics, numberOfTrainMentions)

  implicit val schema: Schema[EntityRecognizerMetadataEntityTypesListItem] = struct(
    AnyLengthString.schema.optional[EntityRecognizerMetadataEntityTypesListItem]("Type", _._type).addHints(smithy.api.Documentation("<p>Type of entity from the list of entity types in the metadata of an entity recognizer.\n    </p>")),
    EntityTypesEvaluationMetrics.schema.optional[EntityRecognizerMetadataEntityTypesListItem]("EvaluationMetrics", _.evaluationMetrics).addHints(smithy.api.Documentation("<p>Detailed information about the accuracy of the entity recognizer for a specific item on\n      the list of entity types. </p>")),
    int.optional[EntityRecognizerMetadataEntityTypesListItem]("NumberOfTrainMentions", _.numberOfTrainMentions).addHints(smithy.api.Documentation("<p>Indicates the number of times the given entity type was seen in the training data. </p>")),
  )(make).withId(id).addHints(hints)
}
