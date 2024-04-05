package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Detailed information about an entity recognizer.</p>
  * @param NumberOfTrainedDocuments
  *   <p> The number of documents in the input data that were used to train the entity recognizer.
  *         Typically this is 80 to 90 percent of the input documents.</p>
  * @param NumberOfTestDocuments
  *   <p> The number of documents in the input data that were used to test the entity recognizer.
  *         Typically this is 10 to 20 percent of the input documents.</p>
  * @param EvaluationMetrics
  *   <p>Detailed information about the accuracy of an entity recognizer.</p>
  * @param EntityTypes
  *   <p>Entity types from the metadata of an entity recognizer.</p>
  */
final case class EntityRecognizerMetadata(numberOfTrainedDocuments: Option[Int] = None, numberOfTestDocuments: Option[Int] = None, evaluationMetrics: Option[EntityRecognizerEvaluationMetrics] = None, entityTypes: Option[List[EntityRecognizerMetadataEntityTypesListItem]] = None)

object EntityRecognizerMetadata extends ShapeTag.Companion[EntityRecognizerMetadata] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerMetadata")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Detailed information about an entity recognizer.</p>"),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(numberOfTrainedDocuments: Option[Int], numberOfTestDocuments: Option[Int], evaluationMetrics: Option[EntityRecognizerEvaluationMetrics], entityTypes: Option[List[EntityRecognizerMetadataEntityTypesListItem]]): EntityRecognizerMetadata = EntityRecognizerMetadata(numberOfTrainedDocuments, numberOfTestDocuments, evaluationMetrics, entityTypes)

  implicit val schema: Schema[EntityRecognizerMetadata] = struct(
    int.optional[EntityRecognizerMetadata]("NumberOfTrainedDocuments", _.numberOfTrainedDocuments).addHints(smithy.api.Documentation("<p> The number of documents in the input data that were used to train the entity recognizer.\n      Typically this is 80 to 90 percent of the input documents.</p>")),
    int.optional[EntityRecognizerMetadata]("NumberOfTestDocuments", _.numberOfTestDocuments).addHints(smithy.api.Documentation("<p> The number of documents in the input data that were used to test the entity recognizer.\n      Typically this is 10 to 20 percent of the input documents.</p>")),
    EntityRecognizerEvaluationMetrics.schema.optional[EntityRecognizerMetadata]("EvaluationMetrics", _.evaluationMetrics).addHints(smithy.api.Documentation("<p>Detailed information about the accuracy of an entity recognizer.</p>")),
    EntityRecognizerMetadataEntityTypesList.underlyingSchema.optional[EntityRecognizerMetadata]("EntityTypes", _.entityTypes).addHints(smithy.api.Documentation("<p>Entity types from the metadata of an entity recognizer.</p>")),
  )(make).withId(id).addHints(hints)
}
