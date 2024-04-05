package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information about a targeted sentiment detection job.</p>
  * @param SubmitTime
  *   <p>The time that the targeted sentiment detection job was submitted for processing.</p>
  * @param VolumeKmsKeyId
  *   <p>ID for the KMS key that Amazon Comprehend uses to encrypt the
  *         data on the storage volume attached to the ML compute instance(s) that process the
  *         targeted sentiment detection job. The VolumeKmsKeyId can be either of the following formats:</p>
  *            <ul>
  *               <li>
  *                  <p>KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *               <li>
  *                  <p>Amazon Resource Name (ARN) of a KMS Key:
  *             <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *            </ul>
  * @param JobId
  *   <p>The identifier assigned to the targeted sentiment detection job.</p>
  * @param JobName
  *   <p>The name that you assigned to the targeted sentiment detection job.</p>
  * @param JobStatus
  *   <p>The current status of the targeted sentiment detection job. If the status is <code>FAILED</code>,
  *         the <code>Messages</code> field shows the reason for the failure.</p>
  * @param EndTime
  *   <p>The time that the targeted sentiment detection job ended.</p>
  * @param VpcConfig
  *   <p> Configuration parameters for an optional private Virtual Private Cloud (VPC) containing
  *         the resources you are using for the job. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Message
  *   <p>A description of the status of a job.</p>
  * @param JobArn
  *   <p>The Amazon Resource Name (ARN) of the targeted sentiment detection job. It is a unique, fully
  *         qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The
  *         format of the ARN is as follows:</p>
  *            <p>
  *               <code>arn:<partition>:comprehend:<region>:<account-id>:targeted-sentiment-detection-job/<job-id></code>
  *            </p>
  *            <p>The following is an example job ARN:</p>
  *            <p>
  *               <code>arn:aws:comprehend:us-west-2:111122223333:targeted-sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
  *            </p>
  * @param LanguageCode
  *   <p>The language code of the input documents.</p>
  * @param InputDataConfig
  *   <p>The input properties for an inference job. The document reader config field applies
  *         only to non-text inputs for custom analysis.</p>
  * @param OutputDataConfig
  *   <p>Provides configuration parameters for the output of inference jobs.</p>
  *            <p></p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  */
final case class TargetedSentimentDetectionJobProperties(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobName: Option[JobName] = None, jobStatus: Option[JobStatus] = None, message: Option[AnyLengthString] = None, submitTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, inputDataConfig: Option[InputDataConfig] = None, outputDataConfig: Option[OutputDataConfig] = None, languageCode: Option[LanguageCode] = None, dataAccessRoleArn: Option[IamRoleArn] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None)

object TargetedSentimentDetectionJobProperties extends ShapeTag.Companion[TargetedSentimentDetectionJobProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TargetedSentimentDetectionJobProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about a targeted sentiment detection job.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobName: Option[JobName], jobStatus: Option[JobStatus], message: Option[AnyLengthString], submitTime: Option[Timestamp], endTime: Option[Timestamp], inputDataConfig: Option[InputDataConfig], outputDataConfig: Option[OutputDataConfig], languageCode: Option[LanguageCode], dataAccessRoleArn: Option[IamRoleArn], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig]): TargetedSentimentDetectionJobProperties = TargetedSentimentDetectionJobProperties(jobId, jobArn, jobName, jobStatus, message, submitTime, endTime, inputDataConfig, outputDataConfig, languageCode, dataAccessRoleArn, volumeKmsKeyId, vpcConfig)

  implicit val schema: Schema[TargetedSentimentDetectionJobProperties] = struct(
    JobId.schema.optional[TargetedSentimentDetectionJobProperties]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier assigned to the targeted sentiment detection job.</p>")),
    ComprehendArn.schema.optional[TargetedSentimentDetectionJobProperties]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the targeted sentiment detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:targeted-sentiment-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:targeted-sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobName.schema.optional[TargetedSentimentDetectionJobProperties]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The name that you assigned to the targeted sentiment detection job.</p>")),
    JobStatus.schema.optional[TargetedSentimentDetectionJobProperties]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The current status of the targeted sentiment detection job. If the status is <code>FAILED</code>,\n      the <code>Messages</code> field shows the reason for the failure.</p>")),
    AnyLengthString.schema.optional[TargetedSentimentDetectionJobProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of a job.</p>")),
    timestamp.optional[TargetedSentimentDetectionJobProperties]("SubmitTime", _.submitTime).addHints(smithy.api.Documentation("<p>The time that the targeted sentiment detection job was submitted for processing.</p>")),
    timestamp.optional[TargetedSentimentDetectionJobProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The time that the targeted sentiment detection job ended.</p>")),
    InputDataConfig.schema.optional[TargetedSentimentDetectionJobProperties]("InputDataConfig", _.inputDataConfig),
    OutputDataConfig.schema.optional[TargetedSentimentDetectionJobProperties]("OutputDataConfig", _.outputDataConfig),
    LanguageCode.schema.optional[TargetedSentimentDetectionJobProperties]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language code of the input documents.</p>")),
    IamRoleArn.schema.optional[TargetedSentimentDetectionJobProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    KmsKeyId.schema.optional[TargetedSentimentDetectionJobProperties]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt the\n      data on the storage volume attached to the ML compute instance(s) that process the\n      targeted sentiment detection job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n          <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[TargetedSentimentDetectionJobProperties]("VpcConfig", _.vpcConfig),
  )(make).withId(id).addHints(hints)
}
