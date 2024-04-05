package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the entities detection job to stop.</p>
  */
final case class StopEntitiesDetectionJobRequest(jobId: JobId)

object StopEntitiesDetectionJobRequest extends ShapeTag.Companion[StopEntitiesDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopEntitiesDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): StopEntitiesDetectionJobRequest = StopEntitiesDetectionJobRequest(jobId)

  implicit val schema: Schema[StopEntitiesDetectionJobRequest] = struct(
    JobId.schema.required[StopEntitiesDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the entities detection job to stop.</p>")),
  )(make).withId(id).addHints(hints)
}
