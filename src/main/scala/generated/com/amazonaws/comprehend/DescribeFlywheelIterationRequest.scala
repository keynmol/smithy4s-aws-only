package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p></p>
  * @param FlywheelIterationId
  *   <p></p>
  */
final case class DescribeFlywheelIterationRequest(flywheelArn: ComprehendFlywheelArn, flywheelIterationId: FlywheelIterationId)

object DescribeFlywheelIterationRequest extends ShapeTag.Companion[DescribeFlywheelIterationRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeFlywheelIterationRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: ComprehendFlywheelArn, flywheelIterationId: FlywheelIterationId): DescribeFlywheelIterationRequest = DescribeFlywheelIterationRequest(flywheelArn, flywheelIterationId)

  implicit val schema: Schema[DescribeFlywheelIterationRequest] = struct(
    ComprehendFlywheelArn.schema.required[DescribeFlywheelIterationRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p></p>")),
    FlywheelIterationId.schema.required[DescribeFlywheelIterationRequest]("FlywheelIterationId", _.flywheelIterationId).addHints(smithy.api.Documentation("<p></p>")),
  )(make).withId(id).addHints(hints)
}
