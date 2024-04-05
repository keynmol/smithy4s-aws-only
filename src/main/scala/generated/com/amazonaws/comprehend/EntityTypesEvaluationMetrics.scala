package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.double
import smithy4s.schema.Schema.struct

/** <p>Detailed information about the accuracy of an entity recognizer for a specific entity
  *       type. </p>
  * @param Precision
  *   <p>A measure of the usefulness of the recognizer results for a specific entity type in the
  *         test data. High precision means that the recognizer returned substantially more relevant
  *         results than irrelevant ones. </p>
  * @param Recall
  *   <p>A measure of how complete the recognizer results are for a specific entity type in the
  *         test data. High recall means that the recognizer returned most of the relevant results.</p>
  * @param F1Score
  *   <p>A measure of how accurate the recognizer results are for a specific entity type in the
  *         test data. It is derived from the <code>Precision</code> and <code>Recall</code> values. The
  *           <code>F1Score</code> is the harmonic average of the two scores. The highest score is 1, and
  *         the worst score is 0. </p>
  */
final case class EntityTypesEvaluationMetrics(precision: Option[Double] = None, recall: Option[Double] = None, f1Score: Option[Double] = None)

object EntityTypesEvaluationMetrics extends ShapeTag.Companion[EntityTypesEvaluationMetrics] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityTypesEvaluationMetrics")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Detailed information about the accuracy of an entity recognizer for a specific entity\n      type. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(precision: Option[Double], recall: Option[Double], f1Score: Option[Double]): EntityTypesEvaluationMetrics = EntityTypesEvaluationMetrics(precision, recall, f1Score)

  implicit val schema: Schema[EntityTypesEvaluationMetrics] = struct(
    double.optional[EntityTypesEvaluationMetrics]("Precision", _.precision).addHints(smithy.api.Documentation("<p>A measure of the usefulness of the recognizer results for a specific entity type in the\n      test data. High precision means that the recognizer returned substantially more relevant\n      results than irrelevant ones. </p>")),
    double.optional[EntityTypesEvaluationMetrics]("Recall", _.recall).addHints(smithy.api.Documentation("<p>A measure of how complete the recognizer results are for a specific entity type in the\n      test data. High recall means that the recognizer returned most of the relevant results.</p>")),
    double.optional[EntityTypesEvaluationMetrics]("F1Score", _.f1Score).addHints(smithy.api.Documentation("<p>A measure of how accurate the recognizer results are for a specific entity type in the\n      test data. It is derived from the <code>Precision</code> and <code>Recall</code> values. The\n        <code>F1Score</code> is the harmonic average of the two scores. The highest score is 1, and\n      the worst score is 0. </p>")),
  )(make).withId(id).addHints(hints)
}
