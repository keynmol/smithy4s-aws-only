package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the sentiment detection job to stop.</p>
  * @param JobStatus
  *   <p>Either <code>STOP_REQUESTED</code> if the job is currently running, or
  *           <code>STOPPED</code> if the job was previously stopped with the
  *           <code>StopSentimentDetectionJob</code> operation.</p>
  */
final case class StopSentimentDetectionJobResponse(jobId: Option[JobId] = None, jobStatus: Option[JobStatus] = None)

object StopSentimentDetectionJobResponse extends ShapeTag.Companion[StopSentimentDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopSentimentDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobStatus: Option[JobStatus]): StopSentimentDetectionJobResponse = StopSentimentDetectionJobResponse(jobId, jobStatus)

  implicit val schema: Schema[StopSentimentDetectionJobResponse] = struct(
    JobId.schema.optional[StopSentimentDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the sentiment detection job to stop.</p>")),
    JobStatus.schema.optional[StopSentimentDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>Either <code>STOP_REQUESTED</code> if the job is currently running, or\n        <code>STOPPED</code> if the job was previously stopped with the\n        <code>StopSentimentDetectionJob</code> operation.</p>")),
  )(make).withId(id).addHints(hints)
}
