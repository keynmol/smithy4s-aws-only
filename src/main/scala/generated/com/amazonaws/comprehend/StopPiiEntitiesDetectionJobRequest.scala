package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the PII entities detection job to stop.</p>
  */
final case class StopPiiEntitiesDetectionJobRequest(jobId: JobId)

object StopPiiEntitiesDetectionJobRequest extends ShapeTag.Companion[StopPiiEntitiesDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopPiiEntitiesDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): StopPiiEntitiesDetectionJobRequest = StopPiiEntitiesDetectionJobRequest(jobId)

  implicit val schema: Schema[StopPiiEntitiesDetectionJobRequest] = struct(
    JobId.schema.required[StopPiiEntitiesDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the PII entities detection job to stop.</p>")),
  )(make).withId(id).addHints(hints)
}
