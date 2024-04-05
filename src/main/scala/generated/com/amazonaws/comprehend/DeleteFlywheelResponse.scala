package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class DeleteFlywheelResponse()

object DeleteFlywheelResponse extends ShapeTag.Companion[DeleteFlywheelResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteFlywheelResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[DeleteFlywheelResponse] = constant(DeleteFlywheelResponse()).withId(id).addHints(hints)
}
