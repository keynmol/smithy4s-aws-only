package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelProperties
  *   <p>The flywheel properties.</p>
  */
final case class UpdateFlywheelResponse(flywheelProperties: Option[FlywheelProperties] = None)

object UpdateFlywheelResponse extends ShapeTag.Companion[UpdateFlywheelResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "UpdateFlywheelResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelProperties: Option[FlywheelProperties]): UpdateFlywheelResponse = UpdateFlywheelResponse(flywheelProperties)

  implicit val schema: Schema[UpdateFlywheelResponse] = struct(
    FlywheelProperties.schema.optional[UpdateFlywheelResponse]("FlywheelProperties", _.flywheelProperties).addHints(smithy.api.Documentation("<p>The flywheel properties.</p>")),
  )(make).withId(id).addHints(hints)
}
