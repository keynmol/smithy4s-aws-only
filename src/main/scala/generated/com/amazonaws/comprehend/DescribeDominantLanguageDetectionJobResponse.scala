package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DominantLanguageDetectionJobProperties
  *   <p>An object that contains the properties associated with a dominant language detection
  *         job.</p>
  */
final case class DescribeDominantLanguageDetectionJobResponse(dominantLanguageDetectionJobProperties: Option[DominantLanguageDetectionJobProperties] = None)

object DescribeDominantLanguageDetectionJobResponse extends ShapeTag.Companion[DescribeDominantLanguageDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDominantLanguageDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(dominantLanguageDetectionJobProperties: Option[DominantLanguageDetectionJobProperties]): DescribeDominantLanguageDetectionJobResponse = DescribeDominantLanguageDetectionJobResponse(dominantLanguageDetectionJobProperties)

  implicit val schema: Schema[DescribeDominantLanguageDetectionJobResponse] = struct(
    DominantLanguageDetectionJobProperties.schema.optional[DescribeDominantLanguageDetectionJobResponse]("DominantLanguageDetectionJobProperties", _.dominantLanguageDetectionJobProperties).addHints(smithy.api.Documentation("<p>An object that contains the properties associated with a dominant language detection\n      job.</p>")),
  )(make).withId(id).addHints(hints)
}
