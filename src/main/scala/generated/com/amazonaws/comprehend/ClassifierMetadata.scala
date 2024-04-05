package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Provides information about a document classifier.</p>
  * @param NumberOfLabels
  *   <p>The number of labels in the input data. </p>
  * @param NumberOfTrainedDocuments
  *   <p>The number of documents in the input data that were used to train the classifier.
  *         Typically this is 80 to 90 percent of the input documents.</p>
  * @param NumberOfTestDocuments
  *   <p>The number of documents in the input data that were used to test the classifier. Typically
  *         this is 10 to 20 percent of the input documents, up to 10,000 documents.</p>
  * @param EvaluationMetrics
  *   <p> Describes the result metrics for the test data associated with an documentation
  *         classifier.</p>
  */
final case class ClassifierMetadata(numberOfLabels: Option[Int] = None, numberOfTrainedDocuments: Option[Int] = None, numberOfTestDocuments: Option[Int] = None, evaluationMetrics: Option[ClassifierEvaluationMetrics] = None)

object ClassifierMetadata extends ShapeTag.Companion[ClassifierMetadata] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ClassifierMetadata")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about a document classifier.</p>"),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(numberOfLabels: Option[Int], numberOfTrainedDocuments: Option[Int], numberOfTestDocuments: Option[Int], evaluationMetrics: Option[ClassifierEvaluationMetrics]): ClassifierMetadata = ClassifierMetadata(numberOfLabels, numberOfTrainedDocuments, numberOfTestDocuments, evaluationMetrics)

  implicit val schema: Schema[ClassifierMetadata] = struct(
    int.optional[ClassifierMetadata]("NumberOfLabels", _.numberOfLabels).addHints(smithy.api.Documentation("<p>The number of labels in the input data. </p>")),
    int.optional[ClassifierMetadata]("NumberOfTrainedDocuments", _.numberOfTrainedDocuments).addHints(smithy.api.Documentation("<p>The number of documents in the input data that were used to train the classifier.\n      Typically this is 80 to 90 percent of the input documents.</p>")),
    int.optional[ClassifierMetadata]("NumberOfTestDocuments", _.numberOfTestDocuments).addHints(smithy.api.Documentation("<p>The number of documents in the input data that were used to test the classifier. Typically\n      this is 10 to 20 percent of the input documents, up to 10,000 documents.</p>")),
    ClassifierEvaluationMetrics.schema.optional[ClassifierMetadata]("EvaluationMetrics", _.evaluationMetrics).addHints(smithy.api.Documentation("<p> Describes the result metrics for the test data associated with an documentation\n      classifier.</p>")),
  )(make).withId(id).addHints(hints)
}
