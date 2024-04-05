package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.double
import smithy4s.schema.Schema.struct

/** <p>Detailed information about the accuracy of an entity recognizer. </p>
  * @param Precision
  *   <p>A measure of the usefulness of the recognizer results in the test data. High precision
  *         means that the recognizer returned substantially more relevant results than irrelevant ones.
  *       </p>
  * @param Recall
  *   <p>A measure of how complete the recognizer results are for the test data. High recall means
  *         that the recognizer returned most of the relevant results.</p>
  * @param F1Score
  *   <p>A measure of how accurate the recognizer results are for the test data. It is derived from
  *         the <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the
  *         harmonic average of the two scores. For plain text entity recognizer models, the range is 0 to 100,
  *         where 100 is the best score. For PDF/Word entity recognizer models, the range is 0 to 1,
  *         where 1 is the best score.
  *       </p>
  */
final case class EntityRecognizerEvaluationMetrics(precision: Option[Double] = None, recall: Option[Double] = None, f1Score: Option[Double] = None)

object EntityRecognizerEvaluationMetrics extends ShapeTag.Companion[EntityRecognizerEvaluationMetrics] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerEvaluationMetrics")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Detailed information about the accuracy of an entity recognizer. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(precision: Option[Double], recall: Option[Double], f1Score: Option[Double]): EntityRecognizerEvaluationMetrics = EntityRecognizerEvaluationMetrics(precision, recall, f1Score)

  implicit val schema: Schema[EntityRecognizerEvaluationMetrics] = struct(
    double.optional[EntityRecognizerEvaluationMetrics]("Precision", _.precision).addHints(smithy.api.Documentation("<p>A measure of the usefulness of the recognizer results in the test data. High precision\n      means that the recognizer returned substantially more relevant results than irrelevant ones.\n    </p>")),
    double.optional[EntityRecognizerEvaluationMetrics]("Recall", _.recall).addHints(smithy.api.Documentation("<p>A measure of how complete the recognizer results are for the test data. High recall means\n      that the recognizer returned most of the relevant results.</p>")),
    double.optional[EntityRecognizerEvaluationMetrics]("F1Score", _.f1Score).addHints(smithy.api.Documentation("<p>A measure of how accurate the recognizer results are for the test data. It is derived from\n      the <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the\n      harmonic average of the two scores. For plain text entity recognizer models, the range is 0 to 100,\n      where 100 is the best score. For PDF/Word entity recognizer models, the range is 0 to 1,\n      where 1 is the best score.\n    </p>")),
  )(make).withId(id).addHints(hints)
}
