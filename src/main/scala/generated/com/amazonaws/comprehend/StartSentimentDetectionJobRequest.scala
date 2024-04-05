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
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param VpcConfig
  *   <p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing
  *         the resources you are using for your sentiment detection job. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Tags
  *   <p>Tags to associate with the sentiment detection job. A tag is a key-value pair that
  *         adds metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the
  *         key might be added to a resource to indicate its use by the sales department.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. You can specify any of the primary languages
  *         supported by Amazon Comprehend. All documents must be in the same language.</p>
  * @param InputDataConfig
  *   <p>Specifies the format and location of the input data for the job.</p>
  * @param OutputDataConfig
  *   <p>Specifies where to send the output files. </p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data. For more information, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/security_iam_id-based-policy-examples.html#auth-role-permissions">Role-based permissions</a>.</p>
  */
final case class StartSentimentDetectionJobRequest(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, languageCode: LanguageCode, jobName: Option[JobName] = None, clientRequestToken: Option[ClientRequestTokenString] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, tags: Option[List[Tag]] = None)

object StartSentimentDetectionJobRequest extends ShapeTag.Companion[StartSentimentDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartSentimentDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, jobName: Option[JobName], languageCode: LanguageCode, clientRequestToken: Option[ClientRequestTokenString], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], tags: Option[List[Tag]]): StartSentimentDetectionJobRequest = StartSentimentDetectionJobRequest(inputDataConfig, outputDataConfig, dataAccessRoleArn, languageCode, jobName, clientRequestToken, volumeKmsKeyId, vpcConfig, tags)

  implicit val schema: Schema[StartSentimentDetectionJobRequest] = struct(
    InputDataConfig.schema.required[StartSentimentDetectionJobRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>Specifies the format and location of the input data for the job.</p>")),
    OutputDataConfig.schema.required[StartSentimentDetectionJobRequest]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>Specifies where to send the output files. </p>")),
    IamRoleArn.schema.required[StartSentimentDetectionJobRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data. For more information, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/security_iam_id-based-policy-examples.html#auth-role-permissions\">Role-based permissions</a>.</p>")),
    JobName.schema.optional[StartSentimentDetectionJobRequest]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The identifier of the job.</p>")),
    LanguageCode.schema.required[StartSentimentDetectionJobRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. You can specify any of the primary languages\n      supported by Amazon Comprehend. All documents must be in the same language.</p>")),
    ClientRequestTokenString.schema.optional[StartSentimentDetectionJobRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    KmsKeyId.schema.optional[StartSentimentDetectionJobRequest]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[StartSentimentDetectionJobRequest]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing\n      the resources you are using for your sentiment detection job. For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    TagList.underlyingSchema.optional[StartSentimentDetectionJobRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the sentiment detection job. A tag is a key-value pair that\n      adds metadata to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the\n      key might be added to a resource to indicate its use by the sales department.</p>")),
  )(make).withId(id).addHints(hints)
}
