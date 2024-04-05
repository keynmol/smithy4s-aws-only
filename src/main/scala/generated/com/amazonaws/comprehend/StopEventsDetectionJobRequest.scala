package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the events detection job to stop.</p>
  */
final case class StopEventsDetectionJobRequest(jobId: JobId)

object StopEventsDetectionJobRequest extends ShapeTag.Companion[StopEventsDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopEventsDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): StopEventsDetectionJobRequest = StopEventsDetectionJobRequest(jobId)

  implicit val schema: Schema[StopEventsDetectionJobRequest] = struct(
    JobId.schema.required[StopEventsDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the events detection job to stop.</p>")),
  )(make).withId(id).addHints(hints)
}
