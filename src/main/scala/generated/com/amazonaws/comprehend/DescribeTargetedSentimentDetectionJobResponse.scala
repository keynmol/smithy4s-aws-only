package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param TargetedSentimentDetectionJobProperties
  *   <p>An object that contains the properties associated with a targeted sentiment detection job.</p>
  */
final case class DescribeTargetedSentimentDetectionJobResponse(targetedSentimentDetectionJobProperties: Option[TargetedSentimentDetectionJobProperties] = None)

object DescribeTargetedSentimentDetectionJobResponse extends ShapeTag.Companion[DescribeTargetedSentimentDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeTargetedSentimentDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(targetedSentimentDetectionJobProperties: Option[TargetedSentimentDetectionJobProperties]): DescribeTargetedSentimentDetectionJobResponse = DescribeTargetedSentimentDetectionJobResponse(targetedSentimentDetectionJobProperties)

  implicit val schema: Schema[DescribeTargetedSentimentDetectionJobResponse] = struct(
    TargetedSentimentDetectionJobProperties.schema.optional[DescribeTargetedSentimentDetectionJobResponse]("TargetedSentimentDetectionJobProperties", _.targetedSentimentDetectionJobProperties).addHints(smithy.api.Documentation("<p>An object that contains the properties associated with a targeted sentiment detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
