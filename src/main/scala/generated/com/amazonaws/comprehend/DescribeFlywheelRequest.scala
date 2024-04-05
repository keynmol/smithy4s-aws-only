package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel.</p>
  */
final case class DescribeFlywheelRequest(flywheelArn: ComprehendFlywheelArn)

object DescribeFlywheelRequest extends ShapeTag.Companion[DescribeFlywheelRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeFlywheelRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: ComprehendFlywheelArn): DescribeFlywheelRequest = DescribeFlywheelRequest(flywheelArn)

  implicit val schema: Schema[DescribeFlywheelRequest] = struct(
    ComprehendFlywheelArn.schema.required[DescribeFlywheelRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel.</p>")),
  )(make).withId(id).addHints(hints)
}
