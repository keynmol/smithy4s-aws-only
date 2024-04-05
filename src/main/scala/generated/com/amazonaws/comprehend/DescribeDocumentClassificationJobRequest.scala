package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier that Amazon Comprehend generated for the job. The
  *         <code>StartDocumentClassificationJob</code> operation returns this identifier in its response.</p>
  */
final case class DescribeDocumentClassificationJobRequest(jobId: JobId)

object DescribeDocumentClassificationJobRequest extends ShapeTag.Companion[DescribeDocumentClassificationJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDocumentClassificationJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): DescribeDocumentClassificationJobRequest = DescribeDocumentClassificationJobRequest(jobId)

  implicit val schema: Schema[DescribeDocumentClassificationJobRequest] = struct(
    JobId.schema.required[DescribeDocumentClassificationJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier that Amazon Comprehend generated for the job. The\n      <code>StartDocumentClassificationJob</code> operation returns this identifier in its response.</p>")),
  )(make).withId(id).addHints(hints)
}
