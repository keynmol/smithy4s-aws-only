package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier generated for the job. To get the status of a job, use this identifier with
  *         the <code>DescribeTargetedSentimentDetectionJob</code> operation.</p>
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
  *                  <p>FAILED - The job did not complete. To get details, use the
  *             <code>DescribeTargetedSentimentDetectionJob</code> operation.</p>
  *               </li>
  *            </ul>
  */
final case class StartTargetedSentimentDetectionJobResponse(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobStatus: Option[JobStatus] = None)

object StartTargetedSentimentDetectionJobResponse extends ShapeTag.Companion[StartTargetedSentimentDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartTargetedSentimentDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobStatus: Option[JobStatus]): StartTargetedSentimentDetectionJobResponse = StartTargetedSentimentDetectionJobResponse(jobId, jobArn, jobStatus)

  implicit val schema: Schema[StartTargetedSentimentDetectionJobResponse] = struct(
    JobId.schema.optional[StartTargetedSentimentDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier generated for the job. To get the status of a job, use this identifier with\n      the <code>DescribeTargetedSentimentDetectionJob</code> operation.</p>")),
    ComprehendArn.schema.optional[StartTargetedSentimentDetectionJobResponse]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the targeted sentiment detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:targeted-sentiment-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:targeted-sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobStatus.schema.optional[StartTargetedSentimentDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The status of the job. </p>\n         <ul>\n            <li>\n               <p>SUBMITTED - The job has been received and is queued for processing.</p>\n            </li>\n            <li>\n               <p>IN_PROGRESS - Amazon Comprehend is processing the job.</p>\n            </li>\n            <li>\n               <p>COMPLETED - The job was successfully completed and the output is available.</p>\n            </li>\n            <li>\n               <p>FAILED - The job did not complete. To get details, use the\n          <code>DescribeTargetedSentimentDetectionJob</code> operation.</p>\n            </li>\n         </ul>")),
  )(make).withId(id).addHints(hints)
}
