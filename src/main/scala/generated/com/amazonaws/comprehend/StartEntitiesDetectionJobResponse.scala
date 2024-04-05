package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier generated for the job. To get the status of job, use this identifier with
  *         the  operation.</p>
  * @param JobArn
  *   <p>The Amazon Resource Name (ARN) of the entities detection job. It is a unique, fully
  *         qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The
  *         format of the ARN is as follows:</p>
  *            <p>
  *               <code>arn:<partition>:comprehend:<region>:<account-id>:entities-detection-job/<job-id></code>
  *            </p>
  *            <p>The following is an example job ARN:</p>
  *            <p>
  *               <code>arn:aws:comprehend:us-west-2:111122223333:entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
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
  *               <li>
  *                  <p>STOP_REQUESTED - Amazon Comprehend has received a stop request for the job and is
  *             processing the request.</p>
  *               </li>
  *               <li>
  *                  <p>STOPPED - The job was successfully stopped without completing.</p>
  *               </li>
  *            </ul>
  * @param EntityRecognizerArn
  *   <p>The ARN of the custom entity recognition model.</p>
  */
final case class StartEntitiesDetectionJobResponse(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobStatus: Option[JobStatus] = None, entityRecognizerArn: Option[EntityRecognizerArn] = None)

object StartEntitiesDetectionJobResponse extends ShapeTag.Companion[StartEntitiesDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartEntitiesDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobStatus: Option[JobStatus], entityRecognizerArn: Option[EntityRecognizerArn]): StartEntitiesDetectionJobResponse = StartEntitiesDetectionJobResponse(jobId, jobArn, jobStatus, entityRecognizerArn)

  implicit val schema: Schema[StartEntitiesDetectionJobResponse] = struct(
    JobId.schema.optional[StartEntitiesDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier generated for the job. To get the status of job, use this identifier with\n      the  operation.</p>")),
    ComprehendArn.schema.optional[StartEntitiesDetectionJobResponse]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the entities detection job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:entities-detection-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobStatus.schema.optional[StartEntitiesDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The status of the job. </p>\n         <ul>\n            <li>\n               <p>SUBMITTED - The job has been received and is queued for processing.</p>\n            </li>\n            <li>\n               <p>IN_PROGRESS - Amazon Comprehend is processing the job.</p>\n            </li>\n            <li>\n               <p>COMPLETED - The job was successfully completed and the output is available.</p>\n            </li>\n            <li>\n               <p>FAILED - The job did not complete. To get details, use the  operation.</p>\n            </li>\n            <li>\n               <p>STOP_REQUESTED - Amazon Comprehend has received a stop request for the job and is\n          processing the request.</p>\n            </li>\n            <li>\n               <p>STOPPED - The job was successfully stopped without completing.</p>\n            </li>\n         </ul>")),
    EntityRecognizerArn.schema.optional[StartEntitiesDetectionJobResponse]("EntityRecognizerArn", _.entityRecognizerArn).addHints(smithy.api.Documentation("<p>The ARN of the custom entity recognition model.</p>")),
  )(make).withId(id).addHints(hints)
}
