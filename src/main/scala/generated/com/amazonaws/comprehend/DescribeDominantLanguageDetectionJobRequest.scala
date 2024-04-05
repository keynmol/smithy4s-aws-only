package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier that Amazon Comprehend generated for the job. The
  *         <code>StartDominantLanguageDetectionJob</code> operation returns this identifier in its response.</p>
  */
final case class DescribeDominantLanguageDetectionJobRequest(jobId: JobId)

object DescribeDominantLanguageDetectionJobRequest extends ShapeTag.Companion[DescribeDominantLanguageDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDominantLanguageDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): DescribeDominantLanguageDetectionJobRequest = DescribeDominantLanguageDetectionJobRequest(jobId)

  implicit val schema: Schema[DescribeDominantLanguageDetectionJobRequest] = struct(
    JobId.schema.required[DescribeDominantLanguageDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier that Amazon Comprehend generated for the job. The\n      <code>StartDominantLanguageDetectionJob</code> operation returns this identifier in its response.</p>")),
  )(make).withId(id).addHints(hints)
}
