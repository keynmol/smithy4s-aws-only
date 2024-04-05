package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier that Amazon Comprehend generated for the job. The
  *           <code>StartKeyPhrasesDetectionJob</code> operation returns this identifier in its
  *         response.</p>
  */
final case class DescribeKeyPhrasesDetectionJobRequest(jobId: JobId)

object DescribeKeyPhrasesDetectionJobRequest extends ShapeTag.Companion[DescribeKeyPhrasesDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeKeyPhrasesDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): DescribeKeyPhrasesDetectionJobRequest = DescribeKeyPhrasesDetectionJobRequest(jobId)

  implicit val schema: Schema[DescribeKeyPhrasesDetectionJobRequest] = struct(
    JobId.schema.required[DescribeKeyPhrasesDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier that Amazon Comprehend generated for the job. The\n        <code>StartKeyPhrasesDetectionJob</code> operation returns this identifier in its\n      response.</p>")),
  )(make).withId(id).addHints(hints)
}
