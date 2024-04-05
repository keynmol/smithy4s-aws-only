package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the sentiment detection job to stop.</p>
  */
final case class StopSentimentDetectionJobRequest(jobId: JobId)

object StopSentimentDetectionJobRequest extends ShapeTag.Companion[StopSentimentDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopSentimentDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): StopSentimentDetectionJobRequest = StopSentimentDetectionJobRequest(jobId)

  implicit val schema: Schema[StopSentimentDetectionJobRequest] = struct(
    JobId.schema.required[StopSentimentDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the sentiment detection job to stop.</p>")),
  )(make).withId(id).addHints(hints)
}
