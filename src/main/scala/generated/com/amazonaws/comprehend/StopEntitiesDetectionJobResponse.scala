package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the entities detection job to stop.</p>
  * @param JobStatus
  *   <p>Either <code>STOP_REQUESTED</code> if the job is currently running, or
  *           <code>STOPPED</code> if the job was previously stopped with the
  *           <code>StopEntitiesDetectionJob</code> operation.</p>
  */
final case class StopEntitiesDetectionJobResponse(jobId: Option[JobId] = None, jobStatus: Option[JobStatus] = None)

object StopEntitiesDetectionJobResponse extends ShapeTag.Companion[StopEntitiesDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopEntitiesDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobStatus: Option[JobStatus]): StopEntitiesDetectionJobResponse = StopEntitiesDetectionJobResponse(jobId, jobStatus)

  implicit val schema: Schema[StopEntitiesDetectionJobResponse] = struct(
    JobId.schema.optional[StopEntitiesDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the entities detection job to stop.</p>")),
    JobStatus.schema.optional[StopEntitiesDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>Either <code>STOP_REQUESTED</code> if the job is currently running, or\n        <code>STOPPED</code> if the job was previously stopped with the\n        <code>StopEntitiesDetectionJob</code> operation.</p>")),
  )(make).withId(id).addHints(hints)
}
