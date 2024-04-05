package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.double
import smithy4s.schema.Schema.struct

/** <p>The evaluation metrics associated with the evaluated model.</p>
  * @param AverageF1Score
  *   <p>The average F1 score from the evaluation metrics.</p>
  * @param AveragePrecision
  *   <p>Average precision metric for the model.</p>
  * @param AverageRecall
  *   <p>Average recall metric for the model.</p>
  * @param AverageAccuracy
  *   <p>Average accuracy metric for the model.</p>
  */
final case class FlywheelModelEvaluationMetrics(averageF1Score: Option[Double] = None, averagePrecision: Option[Double] = None, averageRecall: Option[Double] = None, averageAccuracy: Option[Double] = None)

object FlywheelModelEvaluationMetrics extends ShapeTag.Companion[FlywheelModelEvaluationMetrics] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelModelEvaluationMetrics")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The evaluation metrics associated with the evaluated model.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(averageF1Score: Option[Double], averagePrecision: Option[Double], averageRecall: Option[Double], averageAccuracy: Option[Double]): FlywheelModelEvaluationMetrics = FlywheelModelEvaluationMetrics(averageF1Score, averagePrecision, averageRecall, averageAccuracy)

  implicit val schema: Schema[FlywheelModelEvaluationMetrics] = struct(
    double.optional[FlywheelModelEvaluationMetrics]("AverageF1Score", _.averageF1Score).addHints(smithy.api.Documentation("<p>The average F1 score from the evaluation metrics.</p>")),
    double.optional[FlywheelModelEvaluationMetrics]("AveragePrecision", _.averagePrecision).addHints(smithy.api.Documentation("<p>Average precision metric for the model.</p>")),
    double.optional[FlywheelModelEvaluationMetrics]("AverageRecall", _.averageRecall).addHints(smithy.api.Documentation("<p>Average recall metric for the model.</p>")),
    double.optional[FlywheelModelEvaluationMetrics]("AverageAccuracy", _.averageAccuracy).addHints(smithy.api.Documentation("<p>Average accuracy metric for the model.</p>")),
  )(make).withId(id).addHints(hints)
}
