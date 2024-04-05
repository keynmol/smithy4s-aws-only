package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Flywheel summary information.</p>
  * @param DataLakeS3Uri
  *   <p>Amazon S3 URI of the data lake location. </p>
  * @param LastModifiedTime
  *   <p>Last modified time for the flywheel.</p>
  * @param LatestFlywheelIteration
  *   <p>The most recent flywheel iteration.</p>
  * @param Message
  *   <p>A description of the status of the flywheel.</p>
  * @param ModelType
  *   <p>Model type of the flywheel's model.</p>
  * @param ActiveModelArn
  *   <p>ARN of the active model version for the flywheel.</p>
  * @param Status
  *   <p>The status of the flywheel.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel</p>
  * @param CreationTime
  *   <p>Creation time of the flywheel.</p>
  */
final case class FlywheelSummary(flywheelArn: Option[ComprehendFlywheelArn] = None, activeModelArn: Option[ComprehendModelArn] = None, dataLakeS3Uri: Option[S3Uri] = None, status: Option[FlywheelStatus] = None, modelType: Option[ModelType] = None, message: Option[AnyLengthString] = None, creationTime: Option[Timestamp] = None, lastModifiedTime: Option[Timestamp] = None, latestFlywheelIteration: Option[FlywheelIterationId] = None)

object FlywheelSummary extends ShapeTag.Companion[FlywheelSummary] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelSummary")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Flywheel summary information.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: Option[ComprehendFlywheelArn], activeModelArn: Option[ComprehendModelArn], dataLakeS3Uri: Option[S3Uri], status: Option[FlywheelStatus], modelType: Option[ModelType], message: Option[AnyLengthString], creationTime: Option[Timestamp], lastModifiedTime: Option[Timestamp], latestFlywheelIteration: Option[FlywheelIterationId]): FlywheelSummary = FlywheelSummary(flywheelArn, activeModelArn, dataLakeS3Uri, status, modelType, message, creationTime, lastModifiedTime, latestFlywheelIteration)

  implicit val schema: Schema[FlywheelSummary] = struct(
    ComprehendFlywheelArn.schema.optional[FlywheelSummary]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel</p>")),
    ComprehendModelArn.schema.optional[FlywheelSummary]("ActiveModelArn", _.activeModelArn).addHints(smithy.api.Documentation("<p>ARN of the active model version for the flywheel.</p>")),
    S3Uri.schema.optional[FlywheelSummary]("DataLakeS3Uri", _.dataLakeS3Uri).addHints(smithy.api.Documentation("<p>Amazon S3 URI of the data lake location. </p>")),
    FlywheelStatus.schema.optional[FlywheelSummary]("Status", _.status).addHints(smithy.api.Documentation("<p>The status of the flywheel.</p>")),
    ModelType.schema.optional[FlywheelSummary]("ModelType", _.modelType).addHints(smithy.api.Documentation("<p>Model type of the flywheel\'s model.</p>")),
    AnyLengthString.schema.optional[FlywheelSummary]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of the flywheel.</p>")),
    timestamp.optional[FlywheelSummary]("CreationTime", _.creationTime).addHints(smithy.api.Documentation("<p>Creation time of the flywheel.</p>")),
    timestamp.optional[FlywheelSummary]("LastModifiedTime", _.lastModifiedTime).addHints(smithy.api.Documentation("<p>Last modified time for the flywheel.</p>")),
    FlywheelIterationId.schema.optional[FlywheelSummary]("LatestFlywheelIteration", _.latestFlywheelIteration).addHints(smithy.api.Documentation("<p>The most recent flywheel iteration.</p>")),
  )(make).withId(id).addHints(hints)
}
