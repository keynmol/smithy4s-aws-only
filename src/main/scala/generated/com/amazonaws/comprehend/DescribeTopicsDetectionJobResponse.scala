package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param TopicsDetectionJobProperties
  *   <p>The list of properties for the requested job.</p>
  */
final case class DescribeTopicsDetectionJobResponse(topicsDetectionJobProperties: Option[TopicsDetectionJobProperties] = None)

object DescribeTopicsDetectionJobResponse extends ShapeTag.Companion[DescribeTopicsDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeTopicsDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(topicsDetectionJobProperties: Option[TopicsDetectionJobProperties]): DescribeTopicsDetectionJobResponse = DescribeTopicsDetectionJobResponse(topicsDetectionJobProperties)

  implicit val schema: Schema[DescribeTopicsDetectionJobResponse] = struct(
    TopicsDetectionJobProperties.schema.optional[DescribeTopicsDetectionJobResponse]("TopicsDetectionJobProperties", _.topicsDetectionJobProperties).addHints(smithy.api.Documentation("<p>The list of properties for the requested job.</p>")),
  )(make).withId(id).addHints(hints)
}
