package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier generated for the job. To get the status of the job, use this identifier
  *         with the <code>DescribeDocumentClassificationJob</code> operation.</p>
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
  * @param JobStatus
  *   <p>The status of the job:</p>
  *            <ul>
  *               <li>
  *                  <p>SUBMITTED - The job has been received and queued for processing.</p>
  *               </li>
  *               <li>
  *                  <p>IN_PROGRESS - Amazon Comprehend is processing the job.</p>
  *               </li>
  *               <li>
  *                  <p>COMPLETED - The job was successfully completed and the output is available.</p>
  *               </li>
  *               <li>
  *                  <p>FAILED - The job did not complete. For details, use the
  *             <code>DescribeDocumentClassificationJob</code> operation.</p>
  *               </li>
  *               <li>
  *                  <p>STOP_REQUESTED - Amazon Comprehend has received a stop request for the job and is
  *             processing the request.</p>
  *               </li>
  *               <li>
  *                  <p>STOPPED - The job was successfully stopped without completing.</p>
  *               </li>
  *            </ul>
  * @param DocumentClassifierArn
  *   <p>The ARN of the custom classification model.</p>
  */
final case class StartDocumentClassificationJobResponse(jobId: Option[JobId] = None, jobArn: Option[ComprehendArn] = None, jobStatus: Option[JobStatus] = None, documentClassifierArn: Option[DocumentClassifierArn] = None)

object StartDocumentClassificationJobResponse extends ShapeTag.Companion[StartDocumentClassificationJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartDocumentClassificationJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobArn: Option[ComprehendArn], jobStatus: Option[JobStatus], documentClassifierArn: Option[DocumentClassifierArn]): StartDocumentClassificationJobResponse = StartDocumentClassificationJobResponse(jobId, jobArn, jobStatus, documentClassifierArn)

  implicit val schema: Schema[StartDocumentClassificationJobResponse] = struct(
    JobId.schema.optional[StartDocumentClassificationJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier generated for the job. To get the status of the job, use this identifier\n      with the <code>DescribeDocumentClassificationJob</code> operation.</p>")),
    ComprehendArn.schema.optional[StartDocumentClassificationJobResponse]("JobArn", _.jobArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the document classification job. It is a unique, fully\n      qualified identifier for the job. It includes the Amazon Web Services account, Amazon Web Services Region, and the job ID. The\n      format of the ARN is as follows:</p>\n         <p>\n            <code>arn:<partition>:comprehend:<region>:<account-id>:document-classification-job/<job-id></code>\n         </p>\n         <p>The following is an example job ARN:</p>\n         <p>\n            <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>\n         </p>")),
    JobStatus.schema.optional[StartDocumentClassificationJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The status of the job:</p>\n         <ul>\n            <li>\n               <p>SUBMITTED - The job has been received and queued for processing.</p>\n            </li>\n            <li>\n               <p>IN_PROGRESS - Amazon Comprehend is processing the job.</p>\n            </li>\n            <li>\n               <p>COMPLETED - The job was successfully completed and the output is available.</p>\n            </li>\n            <li>\n               <p>FAILED - The job did not complete. For details, use the\n          <code>DescribeDocumentClassificationJob</code> operation.</p>\n            </li>\n            <li>\n               <p>STOP_REQUESTED - Amazon Comprehend has received a stop request for the job and is\n          processing the request.</p>\n            </li>\n            <li>\n               <p>STOPPED - The job was successfully stopped without completing.</p>\n            </li>\n         </ul>")),
    DocumentClassifierArn.schema.optional[StartDocumentClassificationJobResponse]("DocumentClassifierArn", _.documentClassifierArn).addHints(smithy.api.Documentation("<p>The ARN of the custom classification model.</p>")),
  )(make).withId(id).addHints(hints)
}
