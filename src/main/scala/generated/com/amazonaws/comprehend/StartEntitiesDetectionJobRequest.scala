package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param VolumeKmsKeyId
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
  * @param JobName
  *   <p>The identifier of the job.</p>
  * @param EntityRecognizerArn
  *   <p>The Amazon Resource Name (ARN) that identifies the specific entity recognizer to be used
  *         by the <code>StartEntitiesDetectionJob</code>. This ARN is optional and is only used for a
  *         custom entity recognition job.</p>
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param VpcConfig
  *   <p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing
  *         the resources you are using for your entity detection job. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Tags
  *   <p>Tags to associate with the entities detection job. A tag is a key-value pair that adds
  *         metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key
  *         might be added to a resource to indicate its use by the sales department.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. All documents must be in the same language. You can
  *         specify any of the languages supported by Amazon Comprehend. If custom entities recognition is
  *         used, this parameter is ignored and the language used for training the model is used
  *         instead.</p>
  * @param InputDataConfig
  *   <p>Specifies the format and location of the input data for the job.</p>
  * @param OutputDataConfig
  *   <p>Specifies where to send the output files.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data. For more information, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/security_iam_id-based-policy-examples.html#auth-role-permissions">Role-based permissions</a>.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel associated with the model to use.</p>
  */
final case class StartEntitiesDetectionJobRequest(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, languageCode: LanguageCode, jobName: Option[JobName] = None, entityRecognizerArn: Option[EntityRecognizerArn] = None, clientRequestToken: Option[ClientRequestTokenString] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, tags: Option[List[Tag]] = None, flywheelArn: Option[ComprehendFlywheelArn] = None)

object StartEntitiesDetectionJobRequest extends ShapeTag.Companion[StartEntitiesDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartEntitiesDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, jobName: Option[JobName], entityRecognizerArn: Option[EntityRecognizerArn], languageCode: LanguageCode, clientRequestToken: Option[ClientRequestTokenString], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], tags: Option[List[Tag]], flywheelArn: Option[ComprehendFlywheelArn]): StartEntitiesDetectionJobRequest = StartEntitiesDetectionJobRequest(inputDataConfig, outputDataConfig, dataAccessRoleArn, languageCode, jobName, entityRecognizerArn, clientRequestToken, volumeKmsKeyId, vpcConfig, tags, flywheelArn)

  implicit val schema: Schema[StartEntitiesDetectionJobRequest] = struct(
    InputDataConfig.schema.required[StartEntitiesDetectionJobRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>Specifies the format and location of the input data for the job.</p>")),
    OutputDataConfig.schema.required[StartEntitiesDetectionJobRequest]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>Specifies where to send the output files.</p>")),
    IamRoleArn.schema.required[StartEntitiesDetectionJobRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data. For more information, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/security_iam_id-based-policy-examples.html#auth-role-permissions\">Role-based permissions</a>.</p>")),
    JobName.schema.optional[StartEntitiesDetectionJobRequest]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The identifier of the job.</p>")),
    EntityRecognizerArn.schema.optional[StartEntitiesDetectionJobRequest]("EntityRecognizerArn", _.entityRecognizerArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the specific entity recognizer to be used\n      by the <code>StartEntitiesDetectionJob</code>. This ARN is optional and is only used for a\n      custom entity recognition job.</p>")),
    LanguageCode.schema.required[StartEntitiesDetectionJobRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. All documents must be in the same language. You can\n      specify any of the languages supported by Amazon Comprehend. If custom entities recognition is\n      used, this parameter is ignored and the language used for training the model is used\n      instead.</p>")),
    ClientRequestTokenString.schema.optional[StartEntitiesDetectionJobRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    KmsKeyId.schema.optional[StartEntitiesDetectionJobRequest]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[StartEntitiesDetectionJobRequest]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing\n      the resources you are using for your entity detection job. For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    TagList.underlyingSchema.optional[StartEntitiesDetectionJobRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the entities detection job. A tag is a key-value pair that adds\n      metadata to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the key\n      might be added to a resource to indicate its use by the sales department.</p>")),
    ComprehendFlywheelArn.schema.optional[StartEntitiesDetectionJobRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel associated with the model to use.</p>")),
  )(make).withId(id).addHints(hints)
}
