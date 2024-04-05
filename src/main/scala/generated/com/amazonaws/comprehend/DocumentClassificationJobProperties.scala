package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information about a document classification job.</p>
  * @param SubmitTime
  *   <p>The time that the document classification job was submitted for processing.</p>
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
  *   <p>The identifier assigned to the document classification job.</p>
  * @param JobName
  *   <p>The name that you assigned to the document classification job.</p>
  * @param JobStatus
  *   <p>The current status of the document classification job. If the status is
  *           <code>FAILED</code>, the <code>Message</code> field shows the reason for the failure.</p>
  * @param EndTime
  *   <p>The time that the document classification job completed.</p>
  * @param VpcConfig
  *   <p> Configuration parameters for a private Virtual Private Cloud (VPC) containing the
  *         resources you are using for your document classification job. For more information, see <a href="https://docs.aws.amazon.com/vppc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Message
  *   <p>A description of the status of the job.</p>
  * @param JobArn
  *   <p>The Amazon Resource Name (ARN) of the document classification job. It is a unique, fully
  *         qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The
  *         format of the ARN is as follows:</p>
  *            <p>
  *               <code>arn:<partition>:comprehend:<region>:<account-id>:document-classification-job/<job-id></code>
  *            </p>
  *            <p>The following is an example job ARN:</p>
  *            <p>
  *               <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
  *            </p>
  * @param InputDataConfig
  *   <p>The input data configuration that you supplied when you created the document
  *         classification job.</p>
  * @param DocumentClassifierArn
  *   <p>The Amazon Resource Name (ARN) that identifies the document classifier. </p>
  * @param OutputDataConfig
  *   <p>The output data configuration that you supplied when you created the document
  *         classification job.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel</p>
  */
final case class DocumentClassificationJobProperties(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobName: Option[JobName] = None, jobStatus: Option[JobStatus] = None, message: Option[AnyLengthString] = None, submitTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, documentClassifierArn: Option[DocumentClassifierArn] = None, inputDataConfig: Option[InputDataConfig] = None, outputDataConfig: Option[OutputDataConfig] = None, dataAccessRoleArn: Option[IamRoleArn] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, flywheelArn: Option[ComprehendFlywheelArn] = None)

object DocumentClassificationJobProperties extends ShapeTag.Companion[DocumentClassificationJobProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassificationJobProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about a document classification job.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobName: Option[JobName], jobStatus: Option[JobStatus], message: Option[AnyLengthString], submitTime: Option[Timestamp], endTime: Option[Timestamp], documentClassifierArn: Option[DocumentClassifierArn], inputDataConfig: Option[InputDataConfig], outputDataConfig: Option[OutputDataConfig], dataAccessRoleArn: Option[IamRoleArn], volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], flywheelArn: Option[ComprehendFlywheelArn]): DocumentClassificationJobProperties = DocumentClassificationJobProperties(jobId, jobArn, jobName, jobStatus, message, submitTime, endTime, documentClassifierArn, inputDataConfig, outputDataConfig, dataAccessRoleArn, volumeKmsKeyId, vpcConfig, flywheelArn)

  implicit val schema: Schema[DocumentClassificationJobProperties] = struct(
    JobId.schema.optional[DocumentClassificationJobProperties]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier assigned to the document classification job.</p>")),
    ComprehendArn.schema.optional[DocumentClassificationJobProperties]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the document classification job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:document-classification-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobName.schema.optional[DocumentClassificationJobProperties]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The name that you assigned to the document classification job.</p>")),
    JobStatus.schema.optional[DocumentClassificationJobProperties]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The current status of the document classification job. If the status is\n        <code>FAILED</code>, the <code>Message</code> field shows the reason for the failure.</p>")),
    AnyLengthString.schema.optional[DocumentClassificationJobProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of the job.</p>")),
    timestamp.optional[DocumentClassificationJobProperties]("SubmitTime", _.submitTime).addHints(smithy.api.Documentation("<p>The time that the document classification job was submitted for processing.</p>")),
    timestamp.optional[DocumentClassificationJobProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The time that the document classification job completed.</p>")),
    DocumentClassifierArn.schema.optional[DocumentClassificationJobProperties]("DocumentClassifierArn", _.documentClassifierArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the document classifier. </p>")),
    InputDataConfig.schema.optional[DocumentClassificationJobProperties]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>The input data configuration that you supplied when you created the document\n      classification job.</p>")),
    OutputDataConfig.schema.optional[DocumentClassificationJobProperties]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>The output data configuration that you supplied when you created the document\n      classification job.</p>")),
    IamRoleArn.schema.optional[DocumentClassificationJobProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    KmsKeyId.schema.optional[DocumentClassificationJobProperties]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[DocumentClassificationJobProperties]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p> Configuration parameters for a private Virtual Private Cloud (VPC) containing the\n      resources you are using for your document classification job. For more information, see <a href=\"https://docs.aws.amazon.com/vppc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    ComprehendFlywheelArn.schema.optional[DocumentClassificationJobProperties]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel</p>")),
  )(make).withId(id).addHints(hints)
}
