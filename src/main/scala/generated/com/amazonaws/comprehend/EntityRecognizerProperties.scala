package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Describes information about an entity recognizer.</p>
  * @param SubmitTime
  *   <p>The time that the recognizer was submitted for processing.</p>
  * @param TrainingStartTime
  *   <p>The time that training of the entity recognizer started.</p>
  * @param VolumeKmsKeyId
  *   <p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt
  *         data on the storage volume attached to the ML compute instance(s) that process the analysis
  *         job. The VolumeKmsKeyId can be either of the following formats:</p>
  *            <ul>
  *               <li>
  *                  <p>KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *               <li>
  *                  <p>Amazon Resource Name (ARN) of a KMS Key:
  *               <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *            </ul>
  * @param RecognizerMetadata
  *   <p> Provides information about an entity recognizer.</p>
  * @param VersionName
  *   <p>The version name you assigned to the entity recognizer.</p>
  * @param EndTime
  *   <p>The time that the recognizer creation completed.</p>
  * @param SourceModelArn
  *   <p>The Amazon Resource Name (ARN) of the source model. This model was imported from a
  *         different Amazon Web Services account to create the entity recognizer model in your Amazon Web Services account.</p>
  * @param EntityRecognizerArn
  *   <p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>
  * @param ModelKmsKeyId
  *   <p>ID for the KMS key that Amazon Comprehend uses to encrypt
  *         trained custom models. The ModelKmsKeyId can be either of the following formats:</p>
  *            <ul>
  *               <li>
  *                  <p>KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *               <li>
  *                  <p>Amazon Resource Name (ARN) of a KMS Key:
  *               <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *            </ul>
  * @param VpcConfig
  *   <p> Configuration parameters for a private Virtual Private Cloud (VPC) containing the
  *         resources you are using for your custom entity recognizer. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Message
  *   <p> A description of the status of the recognizer.</p>
  * @param LanguageCode
  *   <p> The language of the input documents. All documents must be in the same language. Only
  *         English ("en") is currently supported.</p>
  * @param InputDataConfig
  *   <p>The input data properties of an entity recognizer.</p>
  * @param OutputDataConfig
  *   <p>Output data configuration.</p>
  * @param TrainingEndTime
  *   <p>The time that training of the entity recognizer was completed.</p>
  * @param DataAccessRoleArn
  *   <p> The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  * @param Status
  *   <p>Provides the status of the entity recognizer.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel</p>
  */
final case class EntityRecognizerProperties(entityRecognizerArn: Option[EntityRecognizerArn] = None, languageCode: Option[LanguageCode] = None, status: Option[ModelStatus] = None, message: Option[AnyLengthString] = None, submitTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, trainingStartTime: Option[Timestamp] = None, trainingEndTime: Option[Timestamp] = None, inputDataConfig: Option[EntityRecognizerInputDataConfig] = None, recognizerMetadata: Option[EntityRecognizerMetadata] = None, dataAccessRoleArn: Option[IamRoleArn] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, modelKmsKeyId: Option[KmsKeyId] = None, versionName: Option[VersionName] = None, sourceModelArn: Option[EntityRecognizerArn] = None, flywheelArn: Option[ComprehendFlywheelArn] = None, outputDataConfig: Option[EntityRecognizerOutputDataConfig] = None)

object EntityRecognizerProperties extends ShapeTag.Companion[EntityRecognizerProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes information about an entity recognizer.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerArn: Option[EntityRecognizerArn], languageCode: Option[LanguageCode], status: Option[ModelStatus], message: Option[AnyLengthString], submitTime: Option[Timestamp], endTime: Option[Timestamp], trainingStartTime: Option[Timestamp], trainingEndTime: Option[Timestamp], inputDataConfig: Option[EntityRecognizerInputDataConfig], recognizerMetadata: Option[EntityRecognizerMetadata], dataAccessRoleArn: Option[IamRoleArn], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], modelKmsKeyId: Option[KmsKeyId], versionName: Option[VersionName], sourceModelArn: Option[EntityRecognizerArn], flywheelArn: Option[ComprehendFlywheelArn], outputDataConfig: Option[EntityRecognizerOutputDataConfig]): EntityRecognizerProperties = EntityRecognizerProperties(entityRecognizerArn, languageCode, status, message, submitTime, endTime, trainingStartTime, trainingEndTime, inputDataConfig, recognizerMetadata, dataAccessRoleArn, volumeKmsKeyId, vpcConfig, modelKmsKeyId, versionName, sourceModelArn, flywheelArn, outputDataConfig)

  implicit val schema: Schema[EntityRecognizerProperties] = struct(
    EntityRecognizerArn.schema.optional[EntityRecognizerProperties]("EntityRecognizerArn", _.entityRecognizerArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>")),
    LanguageCode.schema.optional[EntityRecognizerProperties]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p> The language of the input documents. All documents must be in the same language. Only\n      English (\"en\") is currently supported.</p>")),
    ModelStatus.schema.optional[EntityRecognizerProperties]("Status", _.status).addHints(smithy.api.Documentation("<p>Provides the status of the entity recognizer.</p>")),
    AnyLengthString.schema.optional[EntityRecognizerProperties]("Message", _.message).addHints(smithy.api.Documentation("<p> A description of the status of the recognizer.</p>")),
    timestamp.optional[EntityRecognizerProperties]("SubmitTime", _.submitTime).addHints(smithy.api.Documentation("<p>The time that the recognizer was submitted for processing.</p>")),
    timestamp.optional[EntityRecognizerProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The time that the recognizer creation completed.</p>")),
    timestamp.optional[EntityRecognizerProperties]("TrainingStartTime", _.trainingStartTime).addHints(smithy.api.Documentation("<p>The time that training of the entity recognizer started.</p>")),
    timestamp.optional[EntityRecognizerProperties]("TrainingEndTime", _.trainingEndTime).addHints(smithy.api.Documentation("<p>The time that training of the entity recognizer was completed.</p>")),
    EntityRecognizerInputDataConfig.schema.optional[EntityRecognizerProperties]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>The input data properties of an entity recognizer.</p>")),
    EntityRecognizerMetadata.schema.optional[EntityRecognizerProperties]("RecognizerMetadata", _.recognizerMetadata).addHints(smithy.api.Documentation("<p> Provides information about an entity recognizer.</p>")),
    IamRoleArn.schema.optional[EntityRecognizerProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p> The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    KmsKeyId.schema.optional[EntityRecognizerProperties]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[EntityRecognizerProperties]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p> Configuration parameters for a private Virtual Private Cloud (VPC) containing the\n      resources you are using for your custom entity recognizer. For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    KmsKeyId.schema.optional[EntityRecognizerProperties]("ModelKmsKeyId", _.modelKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt\n      trained custom models. The ModelKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VersionName.schema.optional[EntityRecognizerProperties]("VersionName", _.versionName).addHints(smithy.api.Documentation("<p>The version name you assigned to the entity recognizer.</p>")),
    EntityRecognizerArn.schema.optional[EntityRecognizerProperties]("SourceModelArn", _.sourceModelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the source model. This model was imported from a\n      different Amazon Web Services account to create the entity recognizer model in your Amazon Web Services account.</p>")),
    ComprehendFlywheelArn.schema.optional[EntityRecognizerProperties]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel</p>")),
    EntityRecognizerOutputDataConfig.schema.optional[EntityRecognizerProperties]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>Output data configuration.</p>")),
  )(make).withId(id).addHints(hints)
}
