package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>The configuration properties of a flywheel iteration.</p>
  * @param EvaluatedModelArn
  *   <p>The ARN of the evaluated model associated with this flywheel iteration.</p>
  * @param EvaluationManifestS3Prefix
  *   <p></p>
  * @param FlywheelIterationId
  *   <p></p>
  * @param EndTime
  *   <p>The completion time of this flywheel iteration.</p>
  * @param EvaluatedModelMetrics
  *   <p>The evaluation metrics associated with the evaluated model.</p>
  * @param Message
  *   <p>A description of the status of the flywheel iteration.</p>
  * @param TrainedModelMetrics
  *   <p>The metrics associated with the trained model.</p>
  * @param TrainedModelArn
  *   <p>The ARN of the trained model associated with this flywheel iteration.</p>
  * @param Status
  *   <p>The status of the flywheel iteration.</p>
  * @param FlywheelArn
  *   <p></p>
  * @param CreationTime
  *   <p>The creation start time of the flywheel iteration.</p>
  */
final case class FlywheelIterationProperties(flywheelArn: Option[ComprehendFlywheelArn] = None, flywheelIterationId: Option[FlywheelIterationId] = None, creationTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, status: Option[FlywheelIterationStatus] = None, message: Option[AnyLengthString] = None, evaluatedModelArn: Option[ComprehendModelArn] = None, evaluatedModelMetrics: Option[FlywheelModelEvaluationMetrics] = None, trainedModelArn: Option[ComprehendModelArn] = None, trainedModelMetrics: Option[FlywheelModelEvaluationMetrics] = None, evaluationManifestS3Prefix: Option[S3Uri] = None)

object FlywheelIterationProperties extends ShapeTag.Companion[FlywheelIterationProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelIterationProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The configuration properties of a flywheel iteration.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: Option[ComprehendFlywheelArn], flywheelIterationId: Option[FlywheelIterationId], creationTime: Option[Timestamp], endTime: Option[Timestamp], status: Option[FlywheelIterationStatus], message: Option[AnyLengthString], evaluatedModelArn: Option[ComprehendModelArn], evaluatedModelMetrics: Option[FlywheelModelEvaluationMetrics], trainedModelArn: Option[ComprehendModelArn], trainedModelMetrics: Option[FlywheelModelEvaluationMetrics], evaluationManifestS3Prefix: Option[S3Uri]): FlywheelIterationProperties = FlywheelIterationProperties(flywheelArn, flywheelIterationId, creationTime, endTime, status, message, evaluatedModelArn, evaluatedModelMetrics, trainedModelArn, trainedModelMetrics, evaluationManifestS3Prefix)

  implicit val schema: Schema[FlywheelIterationProperties] = struct(
    ComprehendFlywheelArn.schema.optional[FlywheelIterationProperties]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p></p>")),
    FlywheelIterationId.schema.optional[FlywheelIterationProperties]("FlywheelIterationId", _.flywheelIterationId).addHints(smithy.api.Documentation("<p></p>")),
    timestamp.optional[FlywheelIterationProperties]("CreationTime", _.creationTime).addHints(smithy.api.Documentation("<p>The creation start time of the flywheel iteration.</p>")),
    timestamp.optional[FlywheelIterationProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The completion time of this flywheel iteration.</p>")),
    FlywheelIterationStatus.schema.optional[FlywheelIterationProperties]("Status", _.status).addHints(smithy.api.Documentation("<p>The status of the flywheel iteration.</p>")),
    AnyLengthString.schema.optional[FlywheelIterationProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of the flywheel iteration.</p>")),
    ComprehendModelArn.schema.optional[FlywheelIterationProperties]("EvaluatedModelArn", _.evaluatedModelArn).addHints(smithy.api.Documentation("<p>The ARN of the evaluated model associated with this flywheel iteration.</p>")),
    FlywheelModelEvaluationMetrics.schema.optional[FlywheelIterationProperties]("EvaluatedModelMetrics", _.evaluatedModelMetrics),
    ComprehendModelArn.schema.optional[FlywheelIterationProperties]("TrainedModelArn", _.trainedModelArn).addHints(smithy.api.Documentation("<p>The ARN of the trained model associated with this flywheel iteration.</p>")),
    FlywheelModelEvaluationMetrics.schema.optional[FlywheelIterationProperties]("TrainedModelMetrics", _.trainedModelMetrics).addHints(smithy.api.Documentation("<p>The metrics associated with the trained model.</p>")),
    S3Uri.schema.optional[FlywheelIterationProperties]("EvaluationManifestS3Prefix", _.evaluationManifestS3Prefix).addHints(smithy.api.Documentation("<p></p>")),
  )(make).withId(id).addHints(hints)
}
