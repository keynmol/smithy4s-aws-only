package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel to delete.</p>
  */
final case class DeleteFlywheelRequest(flywheelArn: ComprehendFlywheelArn)

object DeleteFlywheelRequest extends ShapeTag.Companion[DeleteFlywheelRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteFlywheelRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: ComprehendFlywheelArn): DeleteFlywheelRequest = DeleteFlywheelRequest(flywheelArn)

  implicit val schema: Schema[DeleteFlywheelRequest] = struct(
    ComprehendFlywheelArn.schema.required[DeleteFlywheelRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel to delete.</p>")),
  )(make).withId(id).addHints(hints)
}
