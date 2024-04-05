package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the key phrases detection job to stop.</p>
  */
final case class StopKeyPhrasesDetectionJobRequest(jobId: JobId)

object StopKeyPhrasesDetectionJobRequest extends ShapeTag.Companion[StopKeyPhrasesDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopKeyPhrasesDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): StopKeyPhrasesDetectionJobRequest = StopKeyPhrasesDetectionJobRequest(jobId)

  implicit val schema: Schema[StopKeyPhrasesDetectionJobRequest] = struct(
    JobId.schema.required[StopKeyPhrasesDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the key phrases detection job to stop.</p>")),
  )(make).withId(id).addHints(hints)
}
