package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelProperties
  *   <p>The flywheel properties.</p>
  */
final case class DescribeFlywheelResponse(flywheelProperties: Option[FlywheelProperties] = None)

object DescribeFlywheelResponse extends ShapeTag.Companion[DescribeFlywheelResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeFlywheelResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelProperties: Option[FlywheelProperties]): DescribeFlywheelResponse = DescribeFlywheelResponse(flywheelProperties)

  implicit val schema: Schema[DescribeFlywheelResponse] = struct(
    FlywheelProperties.schema.optional[DescribeFlywheelResponse]("FlywheelProperties", _.flywheelProperties).addHints(smithy.api.Documentation("<p>The flywheel properties.</p>")),
  )(make).withId(id).addHints(hints)
}
