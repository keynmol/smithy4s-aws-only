package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelIterationProperties
  *   <p>The configuration properties of a flywheel iteration.</p>
  */
final case class DescribeFlywheelIterationResponse(flywheelIterationProperties: Option[FlywheelIterationProperties] = None)

object DescribeFlywheelIterationResponse extends ShapeTag.Companion[DescribeFlywheelIterationResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeFlywheelIterationResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelIterationProperties: Option[FlywheelIterationProperties]): DescribeFlywheelIterationResponse = DescribeFlywheelIterationResponse(flywheelIterationProperties)

  implicit val schema: Schema[DescribeFlywheelIterationResponse] = struct(
    FlywheelIterationProperties.schema.optional[DescribeFlywheelIterationResponse]("FlywheelIterationProperties", _.flywheelIterationProperties).addHints(smithy.api.Documentation("<p>The configuration properties of a flywheel iteration.</p>")),
  )(make).withId(id).addHints(hints)
}
