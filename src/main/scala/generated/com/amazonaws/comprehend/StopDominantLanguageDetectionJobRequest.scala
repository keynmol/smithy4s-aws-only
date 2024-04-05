package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the dominant language detection job to stop.</p>
  */
final case class StopDominantLanguageDetectionJobRequest(jobId: JobId)

object StopDominantLanguageDetectionJobRequest extends ShapeTag.Companion[StopDominantLanguageDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopDominantLanguageDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): StopDominantLanguageDetectionJobRequest = StopDominantLanguageDetectionJobRequest(jobId)

  implicit val schema: Schema[StopDominantLanguageDetectionJobRequest] = struct(
    JobId.schema.required[StopDominantLanguageDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the dominant language detection job to stop.</p>")),
  )(make).withId(id).addHints(hints)
}
