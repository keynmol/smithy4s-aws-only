package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Properties associated with the dataset.</p>
  * @param DatasetS3Uri
  *   <p>The S3 URI where the dataset is stored.</p>
  * @param Description
  *   <p>Description of the dataset.</p>
  * @param DatasetType
  *   <p>The dataset type (training data or test data).</p>
  * @param EndTime
  *   <p>Time when the data from the dataset becomes available in the data lake.</p>
  * @param DatasetName
  *   <p>The name of the dataset.</p>
  * @param NumberOfDocuments
  *   <p>The number of documents in the dataset.</p>
  * @param Message
  *   <p>A description of the status of the dataset.</p>
  * @param DatasetArn
  *   <p>The ARN of the dataset.</p>
  * @param Status
  *   <p>The dataset status. While the system creates the dataset, the status is <code>CREATING</code>.
  *         When the dataset is ready to use, the status changes to <code>COMPLETED</code>. </p>
  * @param CreationTime
  *   <p>Creation time of the dataset.</p>
  */
final case class DatasetProperties(datasetArn: Option[ComprehendDatasetArn] = None, datasetName: Option[ComprehendArnName] = None, datasetType: Option[DatasetType] = None, datasetS3Uri: Option[S3Uri] = None, description: Option[Description] = None, status: Option[DatasetStatus] = None, message: Option[AnyLengthString] = None, numberOfDocuments: Option[NumberOfDocuments] = None, creationTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None)

object DatasetProperties extends ShapeTag.Companion[DatasetProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Properties associated with the dataset.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(datasetArn: Option[ComprehendDatasetArn], datasetName: Option[ComprehendArnName], datasetType: Option[DatasetType], datasetS3Uri: Option[S3Uri], description: Option[Description], status: Option[DatasetStatus], message: Option[AnyLengthString], numberOfDocuments: Option[NumberOfDocuments], creationTime: Option[Timestamp], endTime: Option[Timestamp]): DatasetProperties = DatasetProperties(datasetArn, datasetName, datasetType, datasetS3Uri, description, status, message, numberOfDocuments, creationTime, endTime)

  implicit val schema: Schema[DatasetProperties] = struct(
    ComprehendDatasetArn.schema.optional[DatasetProperties]("DatasetArn", _.datasetArn).addHints(smithy.api.Documentation("<p>The ARN of the dataset.</p>")),
    ComprehendArnName.schema.optional[DatasetProperties]("DatasetName", _.datasetName).addHints(smithy.api.Documentation("<p>The name of the dataset.</p>")),
    DatasetType.schema.optional[DatasetProperties]("DatasetType", _.datasetType).addHints(smithy.api.Documentation("<p>The dataset type (training data or test data).</p>")),
    S3Uri.schema.optional[DatasetProperties]("DatasetS3Uri", _.datasetS3Uri).addHints(smithy.api.Documentation("<p>The S3 URI where the dataset is stored.</p>")),
    Description.schema.optional[DatasetProperties]("Description", _.description).addHints(smithy.api.Documentation("<p>Description of the dataset.</p>")),
    DatasetStatus.schema.optional[DatasetProperties]("Status", _.status).addHints(smithy.api.Documentation("<p>The dataset status. While the system creates the dataset, the status is <code>CREATING</code>.\n      When the dataset is ready to use, the status changes to <code>COMPLETED</code>. </p>")),
    AnyLengthString.schema.optional[DatasetProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of the dataset.</p>")),
    NumberOfDocuments.schema.optional[DatasetProperties]("NumberOfDocuments", _.numberOfDocuments).addHints(smithy.api.Documentation("<p>The number of documents in the dataset.</p>")),
    timestamp.optional[DatasetProperties]("CreationTime", _.creationTime).addHints(smithy.api.Documentation("<p>Creation time of the dataset.</p>")),
    timestamp.optional[DatasetProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>Time when the data from the dataset becomes available in the data lake.</p>")),
  )(make).withId(id).addHints(hints)
}
