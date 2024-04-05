package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information about a topic detection job.</p>
  * @param SubmitTime
  *   <p>The time that the topic detection job was submitted for processing.</p>
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
  * @param JobId
  *   <p>The identifier assigned to the topic detection job.</p>
  * @param NumberOfTopics
  *   <p>The number of topics to detect supplied when you created the topic detection job. The
  *         default is 10. </p>
  * @param JobName
  *   <p>The name of the topic detection job.</p>
  * @param JobStatus
  *   <p>The current status of the topic detection job. If the status is <code>Failed</code>,
  *         the reason for the failure is shown in the <code>Message</code> field.</p>
  * @param EndTime
  *   <p>The time that the topic detection job was completed.</p>
  * @param VpcConfig
  *   <p>Configuration parameters for a private Virtual Private Cloud (VPC) containing the
  *         resources you are using for your topic detection job. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Message
  *   <p>A description for the status of a job.</p>
  * @param JobArn
  *   <p>The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully
  *         qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The
  *         format of the ARN is as follows:</p>
  *            <p>
  *               <code>arn:<partition>:comprehend:<region>:<account-id>:topics-detection-job/<job-id></code>
  *            </p>
  *            <p>The following is an example job ARN:</p>
  *            <p>
  *               <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
  *            </p>
  * @param InputDataConfig
  *   <p>The input data configuration supplied when you created the topic detection
  *         job.</p>
  * @param OutputDataConfig
  *   <p>The output data configuration supplied when you created the topic detection
  *         job.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your job data. </p>
  */
final case class TopicsDetectionJobProperties(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobName: Option[JobName] = None, jobStatus: Option[JobStatus] = None, message: Option[AnyLengthString] = None, submitTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, inputDataConfig: Option[InputDataConfig] = None, outputDataConfig: Option[OutputDataConfig] = None, numberOfTopics: Option[Int] = None, dataAccessRoleArn: Option[IamRoleArn] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None)

object TopicsDetectionJobProperties extends ShapeTag.Companion[TopicsDetectionJobProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TopicsDetectionJobProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about a topic detection job.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobName: Option[JobName], jobStatus: Option[JobStatus], message: Option[AnyLengthString], submitTime: Option[Timestamp], endTime: Option[Timestamp], inputDataConfig: Option[InputDataConfig], outputDataConfig: Option[OutputDataConfig], numberOfTopics: Option[Int], dataAccessRoleArn: Option[IamRoleArn], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig]): TopicsDetectionJobProperties = TopicsDetectionJobProperties(jobId, jobArn, jobName, jobStatus, message, submitTime, endTime, inputDataConfig, outputDataConfig, numberOfTopics, dataAccessRoleArn, volumeKmsKeyId, vpcConfig)

  implicit val schema: Schema[TopicsDetectionJobProperties] = struct(
    JobId.schema.optional[TopicsDetectionJobProperties]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier assigned to the topic detection job.</p>")),
    ComprehendArn.schema.optional[TopicsDetectionJobProperties]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:topics-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobName.schema.optional[TopicsDetectionJobProperties]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The name of the topic detection job.</p>")),
    JobStatus.schema.optional[TopicsDetectionJobProperties]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The current status of the topic detection job. If the status is <code>Failed</code>,\n      the reason for the failure is shown in the <code>Message</code> field.</p>")),
    AnyLengthString.schema.optional[TopicsDetectionJobProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description for the status of a job.</p>")),
    timestamp.optional[TopicsDetectionJobProperties]("SubmitTime", _.submitTime).addHints(smithy.api.Documentation("<p>The time that the topic detection job was submitted for processing.</p>")),
    timestamp.optional[TopicsDetectionJobProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The time that the topic detection job was completed.</p>")),
    InputDataConfig.schema.optional[TopicsDetectionJobProperties]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>The input data configuration supplied when you created the topic detection\n      job.</p>")),
    OutputDataConfig.schema.optional[TopicsDetectionJobProperties]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>The output data configuration supplied when you created the topic detection\n      job.</p>")),
    int.optional[TopicsDetectionJobProperties]("NumberOfTopics", _.numberOfTopics).addHints(smithy.api.Documentation("<p>The number of topics to detect supplied when you created the topic detection job. The\n      default is 10. </p>")),
    IamRoleArn.schema.optional[TopicsDetectionJobProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your job data. </p>")),
    KmsKeyId.schema.optional[TopicsDetectionJobProperties]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[TopicsDetectionJobProperties]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p>Configuration parameters for a private Virtual Private Cloud (VPC) containing the\n      resources you are using for your topic detection job. For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
  )(make).withId(id).addHints(hints)
}
