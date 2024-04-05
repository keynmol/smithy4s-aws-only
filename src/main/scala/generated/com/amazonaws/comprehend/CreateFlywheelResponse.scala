package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel.</p>
  * @param ActiveModelArn
  *   <p>The Amazon Resource Number (ARN) of the active model version.</p>
  */
final case class CreateFlywheelResponse(flywheelArn: Option[ComprehendFlywheelArn] = None, activeModelArn: Option[ComprehendModelArn] = None)

object CreateFlywheelResponse extends ShapeTag.Companion[CreateFlywheelResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateFlywheelResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: Option[ComprehendFlywheelArn], activeModelArn: Option[ComprehendModelArn]): CreateFlywheelResponse = CreateFlywheelResponse(flywheelArn, activeModelArn)

  implicit val schema: Schema[CreateFlywheelResponse] = struct(
    ComprehendFlywheelArn.schema.optional[CreateFlywheelResponse]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel.</p>")),
    ComprehendModelArn.schema.optional[CreateFlywheelResponse]("ActiveModelArn", _.activeModelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the active model version.</p>")),
  )(make).withId(id).addHints(hints)
}
