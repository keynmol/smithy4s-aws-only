package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information about a PII entities detection job.</p>
  * @param SubmitTime
  *   <p>The time that the PII entities detection job was submitted for processing.</p>
  * @param JobId
  *   <p>The identifier assigned to the PII entities detection job.</p>
  * @param JobName
  *   <p>The name that you assigned the PII entities detection job.</p>
  * @param JobStatus
  *   <p>The current status of the PII entities detection job. If the status is
  *         <code>FAILED</code>, the <code>Message</code> field shows the reason for the failure.</p>
  * @param RedactionConfig
  *   <p>Provides configuration parameters for PII entity redaction.</p>
  *            <p>This parameter is required if you set the <code>Mode</code> parameter to
  *           <code>ONLY_REDACTION</code>. In that case, you must provide a <code>RedactionConfig</code>
  *         definition that includes the <code>PiiEntityTypes</code> parameter.</p>
  * @param EndTime
  *   <p>The time that the PII entities detection job completed.</p>
  * @param Mode
  *   <p>Specifies whether the output provides the locations (offsets) of PII entities or a file in
  *         which PII entities are redacted.</p>
  * @param Message
  *   <p>A description of the status of a job.</p>
  * @param JobArn
  *   <p>The Amazon Resource Name (ARN) of the PII entities detection job. It is a unique, fully
  *         qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The
  *         format of the ARN is as follows:</p>
  *            <p>
  *               <code>arn:<partition>:comprehend:<region>:<account-id>:pii-entities-detection-job/<job-id></code>
  *            </p>
  *            <p>The following is an example job ARN:</p>
  *            <p>
  *               <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
  *            </p>
  * @param LanguageCode
  *   <p>The language code of the input documents</p>
  * @param InputDataConfig
  *   <p>The input properties for a PII entities detection job.</p>
  * @param OutputDataConfig
  *   <p>The output data configuration that you supplied when you created the PII entities
  *         detection job.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  */
final case class PiiEntitiesDetectionJobProperties(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobName: Option[JobName] = None, jobStatus: Option[JobStatus] = None, message: Option[AnyLengthString] = None, submitTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, inputDataConfig: Option[InputDataConfig] = None, outputDataConfig: Option[PiiOutputDataConfig] = None, redactionConfig: Option[RedactionConfig] = None, languageCode: Option[LanguageCode] = None, dataAccessRoleArn: Option[IamRoleArn] = None, mode: Option[PiiEntitiesDetectionMode] = None)

object PiiEntitiesDetectionJobProperties extends ShapeTag.Companion[PiiEntitiesDetectionJobProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PiiEntitiesDetectionJobProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about a PII entities detection job.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobName: Option[JobName], jobStatus: Option[JobStatus], message: Option[AnyLengthString], submitTime: Option[Timestamp], endTime: Option[Timestamp], inputDataConfig: Option[InputDataConfig], outputDataConfig: Option[PiiOutputDataConfig], redactionConfig: Option[RedactionConfig], languageCode: Option[LanguageCode], dataAccessRoleArn: Option[IamRoleArn], mode: Option[PiiEntitiesDetectionMode]): PiiEntitiesDetectionJobProperties = PiiEntitiesDetectionJobProperties(jobId, jobArn, jobName, jobStatus, message, submitTime, endTime, inputDataConfig, outputDataConfig, redactionConfig, languageCode, dataAccessRoleArn, mode)

  implicit val schema: Schema[PiiEntitiesDetectionJobProperties] = struct(
    JobId.schema.optional[PiiEntitiesDetectionJobProperties]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier assigned to the PII entities detection job.</p>")),
    ComprehendArn.schema.optional[PiiEntitiesDetectionJobProperties]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the PII entities detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:pii-entities-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobName.schema.optional[PiiEntitiesDetectionJobProperties]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The name that you assigned the PII entities detection job.</p>")),
    JobStatus.schema.optional[PiiEntitiesDetectionJobProperties]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The current status of the PII entities detection job. If the status is\n      <code>FAILED</code>, the <code>Message</code> field shows the reason for the failure.</p>")),
    AnyLengthString.schema.optional[PiiEntitiesDetectionJobProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of a job.</p>")),
    timestamp.optional[PiiEntitiesDetectionJobProperties]("SubmitTime", _.submitTime).addHints(smithy.api.Documentation("<p>The time that the PII entities detection job was submitted for processing.</p>")),
    timestamp.optional[PiiEntitiesDetectionJobProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The time that the PII entities detection job completed.</p>")),
    InputDataConfig.schema.optional[PiiEntitiesDetectionJobProperties]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>The input properties for a PII entities detection job.</p>")),
    PiiOutputDataConfig.schema.optional[PiiEntitiesDetectionJobProperties]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>The output data configuration that you supplied when you created the PII entities\n      detection job.</p>")),
    RedactionConfig.schema.optional[PiiEntitiesDetectionJobProperties]("RedactionConfig", _.redactionConfig).addHints(smithy.api.Documentation("<p>Provides configuration parameters for PII entity redaction.</p>\n         <p>This parameter is required if you set the <code>Mode</code> parameter to\n        <code>ONLY_REDACTION</code>. In that case, you must provide a <code>RedactionConfig</code>\n      definition that includes the <code>PiiEntityTypes</code> parameter.</p>")),
    LanguageCode.schema.optional[PiiEntitiesDetectionJobProperties]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language code of the input documents</p>")),
    IamRoleArn.schema.optional[PiiEntitiesDetectionJobProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    PiiEntitiesDetectionMode.schema.optional[PiiEntitiesDetectionJobProperties]("Mode", _.mode).addHints(smithy.api.Documentation("<p>Specifies whether the output provides the locations (offsets) of PII entities or a file in\n      which PII entities are redacted.</p>")),
  )(make).withId(id).addHints(hints)
}
