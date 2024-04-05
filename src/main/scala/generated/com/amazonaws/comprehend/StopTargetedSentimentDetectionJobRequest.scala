package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the targeted sentiment detection job to stop.</p>
  */
final case class StopTargetedSentimentDetectionJobRequest(jobId: JobId)

object StopTargetedSentimentDetectionJobRequest extends ShapeTag.Companion[StopTargetedSentimentDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopTargetedSentimentDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): StopTargetedSentimentDetectionJobRequest = StopTargetedSentimentDetectionJobRequest(jobId)

  implicit val schema: Schema[StopTargetedSentimentDetectionJobRequest] = struct(
    JobId.schema.required[StopTargetedSentimentDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the targeted sentiment detection job to stop.</p>")),
  )(make).withId(id).addHints(hints)
}
