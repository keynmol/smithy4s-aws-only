package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information about a document classifier.</p>
  * @param SubmitTime
  *   <p>The time that the document classifier was submitted for training.</p>
  * @param TrainingStartTime
  *   <p>Indicates the time when the training starts on documentation classifiers. You are billed
  *         for the time interval between this time and the value of TrainingEndTime. </p>
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
  * @param VersionName
  *   <p>The version name that you assigned to the document classifier.</p>
  * @param ClassifierMetadata
  *   <p>Information about the document classifier, including the number of documents used for
  *         training the classifier, the number of documents used for test the classifier, and an accuracy
  *         rating.</p>
  * @param EndTime
  *   <p>The time that training the document classifier completed.</p>
  * @param SourceModelArn
  *   <p>The Amazon Resource Name (ARN) of the source model. This model was imported from a
  *         different Amazon Web Services account to create the document classifier model in your Amazon Web Services account.</p>
  * @param Mode
  *   <p>Indicates the mode in which the specific classifier was trained. This also indicates the
  *         format of input documents and the format of the confusion matrix. Each classifier can only be
  *         trained in one mode and this cannot be changed once the classifier is trained.</p>
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
  *         resources you are using for your custom classifier. For more information, see <a href="https://docs.aws.amazon.com/vppc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Message
  *   <p>Additional information about the status of the classifier.</p>
  * @param LanguageCode
  *   <p>The language code for the language of the documents that the classifier was trained
  *         on.</p>
  * @param InputDataConfig
  *   <p>The input data configuration that you supplied when you created the document classifier
  *         for training.</p>
  * @param DocumentClassifierArn
  *   <p>The Amazon Resource Name (ARN) that identifies the document classifier.</p>
  * @param OutputDataConfig
  *   <p> Provides output results configuration parameters for custom classifier jobs.</p>
  * @param TrainingEndTime
  *   <p>The time that training of the document classifier was completed. Indicates the time when
  *         the training completes on documentation classifiers. You are billed for the time interval
  *         between this time and the value of TrainingStartTime.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  * @param Status
  *   <p>The status of the document classifier. If the status is <code>TRAINED</code> the
  *         classifier is ready to use. If the status is <code>TRAINED_WITH_WARNINGS</code> the
  *         classifier training succeeded, but you should review the warnings returned in the
  *         <code>CreateDocumentClassifier</code> response.</p>
  *            <p>  If the status is <code>FAILED</code> you can see additional
  *         information about why the classifier wasn't trained in the <code>Message</code> field.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel</p>
  */
final case class DocumentClassifierProperties(documentClassifierArn: Option[DocumentClassifierArn] = None, languageCode: Option[LanguageCode] = None, status: Option[ModelStatus] = None, message: Option[AnyLengthString] = None, submitTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, trainingStartTime: Option[Timestamp] = None, trainingEndTime: Option[Timestamp] = None, inputDataConfig: Option[DocumentClassifierInputDataConfig] = None, outputDataConfig: Option[DocumentClassifierOutputDataConfig] = None, classifierMetadata: Option[ClassifierMetadata] = None, dataAccessRoleArn: Option[IamRoleArn] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, mode: Option[DocumentClassifierMode] = None, modelKmsKeyId: Option[KmsKeyId] = None, versionName: Option[VersionName] = None, sourceModelArn: Option[DocumentClassifierArn] = None, flywheelArn: Option[ComprehendFlywheelArn] = None)

object DocumentClassifierProperties extends ShapeTag.Companion[DocumentClassifierProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about a document classifier.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierArn: Option[DocumentClassifierArn], languageCode: Option[LanguageCode], status: Option[ModelStatus], message: Option[AnyLengthString], submitTime: Option[Timestamp], endTime: Option[Timestamp], trainingStartTime: Option[Timestamp], trainingEndTime: Option[Timestamp], inputDataConfig: Option[DocumentClassifierInputDataConfig], outputDataConfig: Option[DocumentClassifierOutputDataConfig], classifierMetadata: Option[ClassifierMetadata], dataAccessRoleArn: Option[IamRoleArn], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], mode: Option[DocumentClassifierMode], modelKmsKeyId: Option[KmsKeyId], versionName: Option[VersionName], sourceModelArn: Option[DocumentClassifierArn], flywheelArn: Option[ComprehendFlywheelArn]): DocumentClassifierProperties = DocumentClassifierProperties(documentClassifierArn, languageCode, status, message, submitTime, endTime, trainingStartTime, trainingEndTime, inputDataConfig, outputDataConfig, classifierMetadata, dataAccessRoleArn, volumeKmsKeyId, vpcConfig, mode, modelKmsKeyId, versionName, sourceModelArn, flywheelArn)

  implicit val schema: Schema[DocumentClassifierProperties] = struct(
    DocumentClassifierArn.schema.optional[DocumentClassifierProperties]("DocumentClassifierArn", _.documentClassifierArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the document classifier.</p>")),
    LanguageCode.schema.optional[DocumentClassifierProperties]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language code for the language of the documents that the classifier was trained\n      on.</p>")),
    ModelStatus.schema.optional[DocumentClassifierProperties]("Status", _.status).addHints(smithy.api.Documentation("<p>The status of the document classifier. If the status is <code>TRAINED</code> the\n      classifier is ready to use. If the status is <code>TRAINED_WITH_WARNINGS</code> the\n      classifier training succeeded, but you should review the warnings returned in the\n      <code>CreateDocumentClassifier</code> response.</p>\n         <p>  If the status is <code>FAILED</code> you can see additional\n      information about why the classifier wasn\'t trained in the <code>Message</code> field.</p>")),
    AnyLengthString.schema.optional[DocumentClassifierProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>Additional information about the status of the classifier.</p>")),
    timestamp.optional[DocumentClassifierProperties]("SubmitTime", _.submitTime).addHints(smithy.api.Documentation("<p>The time that the document classifier was submitted for training.</p>")),
    timestamp.optional[DocumentClassifierProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The time that training the document classifier completed.</p>")),
    timestamp.optional[DocumentClassifierProperties]("TrainingStartTime", _.trainingStartTime).addHints(smithy.api.Documentation("<p>Indicates the time when the training starts on documentation classifiers. You are billed\n      for the time interval between this time and the value of TrainingEndTime. </p>")),
    timestamp.optional[DocumentClassifierProperties]("TrainingEndTime", _.trainingEndTime).addHints(smithy.api.Documentation("<p>The time that training of the document classifier was completed. Indicates the time when\n      the training completes on documentation classifiers. You are billed for the time interval\n      between this time and the value of TrainingStartTime.</p>")),
    DocumentClassifierInputDataConfig.schema.optional[DocumentClassifierProperties]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>The input data configuration that you supplied when you created the document classifier\n      for training.</p>")),
    DocumentClassifierOutputDataConfig.schema.optional[DocumentClassifierProperties]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p> Provides output results configuration parameters for custom classifier jobs.</p>")),
    ClassifierMetadata.schema.optional[DocumentClassifierProperties]("ClassifierMetadata", _.classifierMetadata).addHints(smithy.api.Documentation("<p>Information about the document classifier, including the number of documents used for\n      training the classifier, the number of documents used for test the classifier, and an accuracy\n      rating.</p>")),
    IamRoleArn.schema.optional[DocumentClassifierProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    KmsKeyId.schema.optional[DocumentClassifierProperties]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[DocumentClassifierProperties]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p> Configuration parameters for a private Virtual Private Cloud (VPC) containing the\n      resources you are using for your custom classifier. For more information, see <a href=\"https://docs.aws.amazon.com/vppc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    DocumentClassifierMode.schema.optional[DocumentClassifierProperties]("Mode", _.mode).addHints(smithy.api.Documentation("<p>Indicates the mode in which the specific classifier was trained. This also indicates the\n      format of input documents and the format of the confusion matrix. Each classifier can only be\n      trained in one mode and this cannot be changed once the classifier is trained.</p>")),
    KmsKeyId.schema.optional[DocumentClassifierProperties]("ModelKmsKeyId", _.modelKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt\n      trained custom models. The ModelKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VersionName.schema.optional[DocumentClassifierProperties]("VersionName", _.versionName).addHints(smithy.api.Documentation("<p>The version name that you assigned to the document classifier.</p>")),
    DocumentClassifierArn.schema.optional[DocumentClassifierProperties]("SourceModelArn", _.sourceModelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the source model. This model was imported from a\n      different Amazon Web Services account to create the document classifier model in your Amazon Web Services account.</p>")),
    ComprehendFlywheelArn.schema.optional[DocumentClassifierProperties]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel</p>")),
  )(make).withId(id).addHints(hints)
}
