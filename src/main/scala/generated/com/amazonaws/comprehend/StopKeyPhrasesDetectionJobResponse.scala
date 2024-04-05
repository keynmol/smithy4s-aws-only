package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the key phrases detection job to stop.</p>
  * @param JobStatus
  *   <p>Either <code>STOP_REQUESTED</code> if the job is currently running, or
  *           <code>STOPPED</code> if the job was previously stopped with the
  *           <code>StopKeyPhrasesDetectionJob</code> operation.</p>
  */
final case class StopKeyPhrasesDetectionJobResponse(jobId: Option[JobId] = None, jobStatus: Option[JobStatus] = None)

object StopKeyPhrasesDetectionJobResponse extends ShapeTag.Companion[StopKeyPhrasesDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopKeyPhrasesDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: Option[JobId], jobStatus: Option[JobStatus]): StopKeyPhrasesDetectionJobResponse = StopKeyPhrasesDetectionJobResponse(jobId, jobStatus)

  implicit val schema: Schema[StopKeyPhrasesDetectionJobResponse] = struct(
    JobId.schema.optional[StopKeyPhrasesDetectionJobResponse]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the key phrases detection job to stop.</p>")),
    JobStatus.schema.optional[StopKeyPhrasesDetectionJobResponse]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>Either <code>STOP_REQUESTED</code> if the job is currently running, or\n        <code>STOPPED</code> if the job was previously stopped with the\n        <code>StopKeyPhrasesDetectionJob</code> operation.</p>")),
  )(make).withId(id).addHints(hints)
}
