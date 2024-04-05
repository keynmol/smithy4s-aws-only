package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information about an events detection job.</p>
  * @param SubmitTime
  *   <p>The time that the events detection job was submitted for processing.</p>
  * @param JobId
  *   <p>The identifier assigned to the events detection job.</p>
  * @param JobName
  *   <p>The name you assigned the events detection job.</p>
  * @param JobStatus
  *   <p>The current status of the events detection job.</p>
  * @param EndTime
  *   <p>The time that the events detection job completed.</p>
  * @param TargetEventTypes
  *   <p>The types of events that are detected by the job.</p>
  * @param Message
  *   <p>A description of the status of the events detection job.</p>
  * @param JobArn
  *   <p>The Amazon Resource Name (ARN) of the events detection job. It is a unique, fully
  *         qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The
  *         format of the ARN is as follows:</p>
  *            <p>
  *               <code>arn:<partition>:comprehend:<region>:<account-id>:events-detection-job/<job-id></code>
  *            </p>
  *            <p>The following is an example job ARN:</p>
  *            <p>
  *               <code>arn:aws:comprehend:us-west-2:111122223333:events-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
  *            </p>
  * @param LanguageCode
  *   <p>The language code of the input documents.</p>
  * @param InputDataConfig
  *   <p>The input data configuration that you supplied when you created the events detection
  *         job.</p>
  * @param OutputDataConfig
  *   <p>The output data configuration that you supplied when you created the events detection
  *         job.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  */
final case class EventsDetectionJobProperties(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobName: Option[JobName] = None, jobStatus: Option[JobStatus] = None, message: Option[AnyLengthString] = None, submitTime: Option[Timestamp] = None, endTime: Option[Timestamp] = None, inputDataConfig: Option[InputDataConfig] = None, outputDataConfig: Option[OutputDataConfig] = None, languageCode: Option[LanguageCode] = None, dataAccessRoleArn: Option[IamRoleArn] = None, targetEventTypes: Option[List[EventTypeString]] = None)

object EventsDetectionJobProperties extends ShapeTag.Companion[EventsDetectionJobProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EventsDetectionJobProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about an events detection job.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobName: Option[JobName], jobStatus: Option[JobStatus], message: Option[AnyLengthString], submitTime: Option[Timestamp], endTime: Option[Timestamp], inputDataConfig: Option[InputDataConfig], outputDataConfig: Option[OutputDataConfig], languageCode: Option[LanguageCode], dataAccessRoleArn: Option[IamRoleArn], targetEventTypes: Option[List[EventTypeString]]): EventsDetectionJobProperties = EventsDetectionJobProperties(jobId, jobArn, jobName, jobStatus, message, submitTime, endTime, inputDataConfig, outputDataConfig, languageCode, dataAccessRoleArn, targetEventTypes)

  implicit val schema: Schema[EventsDetectionJobProperties] = struct(
    JobId.schema.optional[EventsDetectionJobProperties]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier assigned to the events detection job.</p>")),
    ComprehendArn.schema.optional[EventsDetectionJobProperties]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the events detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:events-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:events-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobName.schema.optional[EventsDetectionJobProperties]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The name you assigned the events detection job.</p>")),
    JobStatus.schema.optional[EventsDetectionJobProperties]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The current status of the events detection job.</p>")),
    AnyLengthString.schema.optional[EventsDetectionJobProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>A description of the status of the events detection job.</p>")),
    timestamp.optional[EventsDetectionJobProperties]("SubmitTime", _.submitTime).addHints(smithy.api.Documentation("<p>The time that the events detection job was submitted for processing.</p>")),
    timestamp.optional[EventsDetectionJobProperties]("EndTime", _.endTime).addHints(smithy.api.Documentation("<p>The time that the events detection job completed.</p>")),
    InputDataConfig.schema.optional[EventsDetectionJobProperties]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>The input data configuration that you supplied when you created the events detection\n      job.</p>")),
    OutputDataConfig.schema.optional[EventsDetectionJobProperties]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>The output data configuration that you supplied when you created the events detection\n      job.</p>")),
    LanguageCode.schema.optional[EventsDetectionJobProperties]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language code of the input documents.</p>")),
    IamRoleArn.schema.optional[EventsDetectionJobProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    TargetEventTypes.underlyingSchema.optional[EventsDetectionJobProperties]("TargetEventTypes", _.targetEventTypes).addHints(smithy.api.Documentation("<p>The types of events that are detected by the job.</p>")),
  )(make).withId(id).addHints(hints)
}
