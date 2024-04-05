package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelName
  *   <p>Name for the flywheel.</p>
  * @param TaskConfig
  *   <p>Configuration about the custom classifier associated with the flywheel.</p>
  * @param DataLakeS3Uri
  *   <p>Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an
  *       existing S3 bucket. The flywheel creates the data lake at this location.</p>
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param Tags
  *   <p>The tags to associate with this flywheel.</p>
  * @param ModelType
  *   <p>The model type.</p>
  * @param DataSecurityConfig
  *   <p>Data security configurations.</p>
  * @param ActiveModelArn
  *   <p>To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model version.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend the permissions required to access the flywheel data in the data lake.</p>
  */
final case class CreateFlywheelRequest(flywheelName: ComprehendArnName, dataAccessRoleArn: IamRoleArn, dataLakeS3Uri: FlywheelS3Uri, activeModelArn: Option[ComprehendModelArn] = None, taskConfig: Option[TaskConfig] = None, modelType: Option[ModelType] = None, dataSecurityConfig: Option[DataSecurityConfig] = None, clientRequestToken: Option[ClientRequestTokenString] = None, tags: Option[List[Tag]] = None)

object CreateFlywheelRequest extends ShapeTag.Companion[CreateFlywheelRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateFlywheelRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelName: ComprehendArnName, activeModelArn: Option[ComprehendModelArn], dataAccessRoleArn: IamRoleArn, taskConfig: Option[TaskConfig], modelType: Option[ModelType], dataLakeS3Uri: FlywheelS3Uri, dataSecurityConfig: Option[DataSecurityConfig], clientRequestToken: Option[ClientRequestTokenString], tags: Option[List[Tag]]): CreateFlywheelRequest = CreateFlywheelRequest(flywheelName, dataAccessRoleArn, dataLakeS3Uri, activeModelArn, taskConfig, modelType, dataSecurityConfig, clientRequestToken, tags)

  implicit val schema: Schema[CreateFlywheelRequest] = struct(
    ComprehendArnName.schema.required[CreateFlywheelRequest]("FlywheelName", _.flywheelName).addHints(smithy.api.Documentation("<p>Name for the flywheel.</p>")),
    ComprehendModelArn.schema.optional[CreateFlywheelRequest]("ActiveModelArn", _.activeModelArn).addHints(smithy.api.Documentation("<p>To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model version.</p>")),
    IamRoleArn.schema.required[CreateFlywheelRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend the permissions required to access the flywheel data in the data lake.</p>")),
    TaskConfig.schema.optional[CreateFlywheelRequest]("TaskConfig", _.taskConfig).addHints(smithy.api.Documentation("<p>Configuration about the custom classifier associated with the flywheel.</p>")),
    ModelType.schema.optional[CreateFlywheelRequest]("ModelType", _.modelType).addHints(smithy.api.Documentation("<p>The model type.</p>")),
    FlywheelS3Uri.schema.required[CreateFlywheelRequest]("DataLakeS3Uri", _.dataLakeS3Uri).addHints(smithy.api.Documentation("<p>Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an\n    existing S3 bucket. The flywheel creates the data lake at this location.</p>")),
    DataSecurityConfig.schema.optional[CreateFlywheelRequest]("DataSecurityConfig", _.dataSecurityConfig).addHints(smithy.api.Documentation("<p>Data security configurations.</p>")),
    ClientRequestTokenString.schema.optional[CreateFlywheelRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    TagList.underlyingSchema.optional[CreateFlywheelRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>The tags to associate with this flywheel.</p>")),
  )(make).withId(id).addHints(hints)
}
