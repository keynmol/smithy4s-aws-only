package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the PII entities detection job to stop.</p>
  * @param JobStatus
  *   <p>The status of the PII entities detection job.</p>
  */
final case class StopPiiEntitiesDetectionJobResponse(jobId: Option[JobId] = None, jobStatus: Option[JobStatus] = None)

object StopPiiEntitiesDetectionJobResponse extends ShapeTag.Companion[StopPiiEntitiesDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopPiiEntitiesDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobStatus: Option[JobStatus]): StopPiiEntitiesDetectionJobResponse = StopPiiEntitiesDetectionJobResponse(jobId, jobStatus)

  implicit val schema: Schema[StopPiiEntitiesDetectionJobResponse] = struct(
    JobId.schema.optional[StopPiiEntitiesDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the PII entities detection job to stop.</p>")),
    JobStatus.schema.optional[StopPiiEntitiesDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The status of the PII entities detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
