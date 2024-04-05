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
  * @param NumberOfTopics
  *   <p>The number of topics to detect.</p>
  * @param JobName
  *   <p>The identifier of the job.</p>
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you do not set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param VpcConfig
  *   <p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing
  *         the resources you are using for your topic detection job. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Tags
  *   <p>Tags to associate with the topics detection job. A tag is a key-value pair that adds
  *         metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key
  *         might be added to a resource to indicate its use by the sales department.</p>
  * @param InputDataConfig
  *   <p>Specifies the format and location of the input data for the job.</p>
  * @param OutputDataConfig
  *   <p>Specifies where to send the output files. The output is a compressed archive with two
  *         files, <code>topic-terms.csv</code> that lists the terms associated with each topic, and
  *           <code>doc-topics.csv</code> that lists the documents associated with each topic</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data. For more information, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/security_iam_id-based-policy-examples.html#auth-role-permissions">Role-based permissions</a>.</p>
  */
final case class StartTopicsDetectionJobRequest(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, jobName: Option[JobName] = None, numberOfTopics: Option[NumberOfTopicsInteger] = None, clientRequestToken: Option[ClientRequestTokenString] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, tags: Option[List[Tag]] = None)

object StartTopicsDetectionJobRequest extends ShapeTag.Companion[StartTopicsDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartTopicsDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, jobName: Option[JobName], numberOfTopics: Option[NumberOfTopicsInteger], clientRequestToken: Option[ClientRequestTokenString], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], tags: Option[List[Tag]]): StartTopicsDetectionJobRequest = StartTopicsDetectionJobRequest(inputDataConfig, outputDataConfig, dataAccessRoleArn, jobName, numberOfTopics, clientRequestToken, volumeKmsKeyId, vpcConfig, tags)

  implicit val schema: Schema[StartTopicsDetectionJobRequest] = struct(
    InputDataConfig.schema.required[StartTopicsDetectionJobRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>Specifies the format and location of the input data for the job.</p>")),
    OutputDataConfig.schema.required[StartTopicsDetectionJobRequest]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>Specifies where to send the output files. The output is a compressed archive with two\n      files, <code>topic-terms.csv</code> that lists the terms associated with each topic, and\n        <code>doc-topics.csv</code> that lists the documents associated with each topic</p>")),
    IamRoleArn.schema.required[StartTopicsDetectionJobRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data. For more information, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/security_iam_id-based-policy-examples.html#auth-role-permissions\">Role-based permissions</a>.</p>")),
    JobName.schema.optional[StartTopicsDetectionJobRequest]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The identifier of the job.</p>")),
    NumberOfTopicsInteger.schema.optional[StartTopicsDetectionJobRequest]("NumberOfTopics", _.numberOfTopics).addHints(smithy.api.Documentation("<p>The number of topics to detect.</p>")),
    ClientRequestTokenString.schema.optional[StartTopicsDetectionJobRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you do not set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    KmsKeyId.schema.optional[StartTopicsDetectionJobRequest]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[StartTopicsDetectionJobRequest]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing\n      the resources you are using for your topic detection job. For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    TagList.underlyingSchema.optional[StartTopicsDetectionJobRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the topics detection job. A tag is a key-value pair that adds\n      metadata to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the key\n      might be added to a resource to indicate its use by the sales department.</p>")),
  )(make).withId(id).addHints(hints)
}
