package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>An unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
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
  * @param JobStatus
  *   <p>The status of the events detection job.</p>
  */
final case class StartEventsDetectionJobResponse(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobStatus: Option[JobStatus] = None)

object StartEventsDetectionJobResponse extends ShapeTag.Companion[StartEventsDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartEventsDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobStatus: Option[JobStatus]): StartEventsDetectionJobResponse = StartEventsDetectionJobResponse(jobId, jobArn, jobStatus)

  implicit val schema: Schema[StartEventsDetectionJobResponse] = struct(
    JobId.schema.optional[StartEventsDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>An unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>")),
    ComprehendArn.schema.optional[StartEventsDetectionJobResponse]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the events detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:events-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:events-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobStatus.schema.optional[StartEventsDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The status of the events detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
