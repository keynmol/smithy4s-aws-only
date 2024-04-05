package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param KeyPhrasesDetectionJobProperties
  *   <p>An object that contains the properties associated with a key phrases detection job.
  *       </p>
  */
final case class DescribeKeyPhrasesDetectionJobResponse(keyPhrasesDetectionJobProperties: Option[KeyPhrasesDetectionJobProperties] = None)

object DescribeKeyPhrasesDetectionJobResponse extends ShapeTag.Companion[DescribeKeyPhrasesDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeKeyPhrasesDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(keyPhrasesDetectionJobProperties: Option[KeyPhrasesDetectionJobProperties]): DescribeKeyPhrasesDetectionJobResponse = DescribeKeyPhrasesDetectionJobResponse(keyPhrasesDetectionJobProperties)

  implicit val schema: Schema[DescribeKeyPhrasesDetectionJobResponse] = struct(
    KeyPhrasesDetectionJobProperties.schema.optional[DescribeKeyPhrasesDetectionJobResponse]("KeyPhrasesDetectionJobProperties", _.keyPhrasesDetectionJobProperties).addHints(smithy.api.Documentation("<p>An object that contains the properties associated with a key phrases detection job.\n    </p>")),
  )(make).withId(id).addHints(hints)
}
