package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>The flywheel properties.</p>
  * @param TaskConfig
  *   <p>Configuration about the custom classifier associated with the flywheel.</p>
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
  * @param DataSecurityConfig
  *   <p>Data security configuration.</p>
  * @param ActiveModelArn
  *   <p>The Amazon Resource Number (ARN) of the active model version.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend permission to access the flywheel data.</p>
  * @param Status
  *   <p>The status of the flywheel.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel.</p>
  * @param CreationTime
  *   <p>Creation time of the flywheel.</p>
  */
final case class FlywheelProperties(flywheelArn: Option[ComprehendFlywheelArn] = None, activeModelArn: Option[ComprehendModelArn] = None, dataAccessRoleArn: Option[IamRoleArn] = None, taskConfig: Option[TaskConfig] = None, dataLakeS3Uri: Option[S3Uri] = None, dataSecurityConfig: Option[DataSecurityConfig] = None, status: Option[FlywheelStatus] = None, modelType: Option[ModelType] = None, message: Option[AnyLengthString] = None, creationTime: Option[Timestamp] = None, lastModifiedTime: Option[Timestamp] = None, latestFlywheelIteration: Option[FlywheelIterationId] = None)

object FlywheelProperties extends ShapeTag.Companion[FlywheelProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The flywheel properties.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: Option[ComprehendFlywheelArn], activeModelArn: Option[ComprehendModelArn], dataAccessRoleArn: Option[IamRoleArn], taskConfig: Option[TaskConfig], dataLakeS3Uri: Option[S3Uri], dataSecurityConfig: Option[DataSecurityConfig], status: Option[FlywheelStatus], modelType: Option[ModelType], message: Option[AnyLengthString], creationTime: Option[Timestamp], lastModifiedTime: Option[Timestamp], latestFlywheelIteration: Option[FlywheelIterationId]): FlywheelProperties = FlywheelProperties(flywheelArn, activeModelArn, dataAccessRoleArn, taskConfig, dataLakeS3Uri, dataSecurityConfig, status, modelType, message, creationTime, lastModifiedTime, latestFlywheelIteration)

  implicit val schema: Schema[FlywheelProperties] = struct(
    ComprehendFlywheelArn.schema.optional[FlywheelProperties]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel.</p>")),
    ComprehendModelArn.schema.optional[FlywheelProperties]("ActiveModelArn", _.activeModelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the active model version.</p>")),
    IamRoleArn.schema.optional[FlywheelProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend permission to access the flywheel data.</p>")),
    TaskConfig.schema.optional[FlywheelProperties]("TaskConfig", _.taskConfig).addHints(smithy.api.Documentation("<p>Configuration about the custom classifier associated with the flywheel.</p>")),
    S3Uri.schema.optional[FlywheelProperties]("DataLakeS3Uri", _.dataLakeS3Uri).addHints(smithy.api.Documentation("<p>Amazon S3 URI of the data lake location. </p>")),
    DataSecurityConfig.schema.optional[FlywheelProperties]("DataSecurityConfig", _.dataSecurityConfig).addHints(smithy.api.Documentation("<p>Data security configuration.</p>")),
    FlywheelStatus.schema.optional[FlywheelProperties]("Status", _.status).addHints(smithy.api.Documentation("<p>The status of the flywheel.</p>")),
    ModelType.schema.optional[FlywheelProperties]("ModelType", _.modelType).addHints(smithy.api.Documentation("<p>Model type of the flywheel\'s model.</p>")),
    AnyLengthString.schema.optional[FlywheelProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of the flywheel.</p>")),
    timestamp.optional[FlywheelProperties]("CreationTime", _.creationTime).addHints(smithy.api.Documentation("<p>Creation time of the flywheel.</p>")),
    timestamp.optional[FlywheelProperties]("LastModifiedTime", _.lastModifiedTime).addHints(smithy.api.Documentation("<p>Last modified time for the flywheel.</p>")),
    FlywheelIterationId.schema.optional[FlywheelProperties]("LatestFlywheelIteration", _.latestFlywheelIteration).addHints(smithy.api.Documentation("<p>The most recent flywheel iteration.</p>")),
  )(make).withId(id).addHints(hints)
}
