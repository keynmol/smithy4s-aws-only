package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Description
  *   <p>Description of the dataset.</p>
  * @param DatasetType
  *   <p>The dataset type. You can specify that the data in a dataset is for training
  *         the model or for testing the model.</p>
  * @param DatasetName
  *   <p>Name of the dataset.</p>
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param Tags
  *   <p>Tags for the dataset.</p>
  * @param InputDataConfig
  *   <p>Information about the input data configuration. The type of input data varies based
  *         on the format of the input and whether the data is for a classifier model or an entity recognition model.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.</p>
  */
final case class CreateDatasetRequest(flywheelArn: ComprehendFlywheelArn, datasetName: ComprehendArnName, inputDataConfig: DatasetInputDataConfig, datasetType: Option[DatasetType] = None, description: Option[Description] = None, clientRequestToken: Option[ClientRequestTokenString] = None, tags: Option[List[Tag]] = None)

object CreateDatasetRequest extends ShapeTag.Companion[CreateDatasetRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateDatasetRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: ComprehendFlywheelArn, datasetName: ComprehendArnName, datasetType: Option[DatasetType], description: Option[Description], inputDataConfig: DatasetInputDataConfig, clientRequestToken: Option[ClientRequestTokenString], tags: Option[List[Tag]]): CreateDatasetRequest = CreateDatasetRequest(flywheelArn, datasetName, inputDataConfig, datasetType, description, clientRequestToken, tags)

  implicit val schema: Schema[CreateDatasetRequest] = struct(
    ComprehendFlywheelArn.schema.required[CreateDatasetRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.</p>")),
    ComprehendArnName.schema.required[CreateDatasetRequest]("DatasetName", _.datasetName).addHints(smithy.api.Documentation("<p>Name of the dataset.</p>")),
    DatasetType.schema.optional[CreateDatasetRequest]("DatasetType", _.datasetType).addHints(smithy.api.Documentation("<p>The dataset type. You can specify that the data in a dataset is for training\n      the model or for testing the model.</p>")),
    Description.schema.optional[CreateDatasetRequest]("Description", _.description).addHints(smithy.api.Documentation("<p>Description of the dataset.</p>")),
    DatasetInputDataConfig.schema.required[CreateDatasetRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>Information about the input data configuration. The type of input data varies based\n      on the format of the input and whether the data is for a classifier model or an entity recognition model.</p>")),
    ClientRequestTokenString.schema.optional[CreateDatasetRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    TagList.underlyingSchema.optional[CreateDatasetRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags for the dataset.</p>")),
  )(make).withId(id).addHints(hints)
}
