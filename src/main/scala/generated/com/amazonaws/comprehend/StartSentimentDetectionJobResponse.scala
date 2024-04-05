package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier generated for the job. To get the status of a job, use this identifier with
  *         the  operation.</p>
  * @param JobArn
  *   <p>The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully
  *         qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The
  *         format of the ARN is as follows:</p>
  *            <p>
  *               <code>arn:<partition>:comprehend:<region>:<account-id>:sentiment-detection-job/<job-id></code>
  *            </p>
  *            <p>The following is an example job ARN:</p>
  *            <p>
  *               <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
  *            </p>
  * @param JobStatus
  *   <p>The status of the job. </p>
  *            <ul>
  *               <li>
  *                  <p>SUBMITTED - The job has been received and is queued for processing.</p>
  *               </li>
  *               <li>
  *                  <p>IN_PROGRESS - Amazon Comprehend is processing the job.</p>
  *               </li>
  *               <li>
  *                  <p>COMPLETED - The job was successfully completed and the output is available.</p>
  *               </li>
  *               <li>
  *                  <p>FAILED - The job did not complete. To get details, use the  operation.</p>
  *               </li>
  *            </ul>
  */
final case class StartSentimentDetectionJobResponse(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobStatus: Option[JobStatus] = None)

object StartSentimentDetectionJobResponse extends ShapeTag.Companion[StartSentimentDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartSentimentDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobStatus: Option[JobStatus]): StartSentimentDetectionJobResponse = StartSentimentDetectionJobResponse(jobId, jobArn, jobStatus)

  implicit val schema: Schema[StartSentimentDetectionJobResponse] = struct(
    JobId.schema.optional[StartSentimentDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier generated for the job. To get the status of a job, use this identifier with\n      the  operation.</p>")),
    ComprehendArn.schema.optional[StartSentimentDetectionJobResponse]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:sentiment-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobStatus.schema.optional[StartSentimentDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The status of the job. </p>\n         <ul>\n            <li>\n               <p>SUBMITTED - The job has been received and is queued for processing.</p>\n            </li>\n            <li>\n               <p>IN_PROGRESS - Amazon Comprehend is processing the job.</p>\n            </li>\n            <li>\n               <p>COMPLETED - The job was successfully completed and the output is available.</p>\n            </li>\n            <li>\n               <p>FAILED - The job did not complete. To get details, use the  operation.</p>\n            </li>\n         </ul>")),
  )(make).withId(id).addHints(hints)
}
