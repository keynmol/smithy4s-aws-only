package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier that Amazon Comprehend generated for the job. The  operation returns this identifier in its
  *         response.</p>
  */
final case class DescribeSentimentDetectionJobRequest(jobId: JobId)

object DescribeSentimentDetectionJobRequest extends ShapeTag.Companion[DescribeSentimentDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeSentimentDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): DescribeSentimentDetectionJobRequest = DescribeSentimentDetectionJobRequest(jobId)

  implicit val schema: Schema[DescribeSentimentDetectionJobRequest] = struct(
    JobId.schema.required[DescribeSentimentDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier that Amazon Comprehend generated for the job. The  operation returns this identifier in its\n      response.</p>")),
  )(make).withId(id).addHints(hints)
}
