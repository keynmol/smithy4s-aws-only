package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the events detection job to stop.</p>
  * @param JobStatus
  *   <p>The status of the events detection job.</p>
  */
final case class StopEventsDetectionJobResponse(jobId: Option[JobId] = None, jobStatus: Option[JobStatus] = None)

object StopEventsDetectionJobResponse extends ShapeTag.Companion[StopEventsDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopEventsDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobStatus: Option[JobStatus]): StopEventsDetectionJobResponse = StopEventsDetectionJobResponse(jobId, jobStatus)

  implicit val schema: Schema[StopEventsDetectionJobResponse] = struct(
    JobId.schema.optional[StopEventsDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the events detection job to stop.</p>")),
    JobStatus.schema.optional[StopEventsDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>The status of the events detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
