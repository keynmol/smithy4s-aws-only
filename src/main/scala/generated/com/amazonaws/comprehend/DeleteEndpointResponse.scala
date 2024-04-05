package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class DeleteEndpointResponse()

object DeleteEndpointResponse extends ShapeTag.Companion[DeleteEndpointResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteEndpointResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[DeleteEndpointResponse] = constant(DeleteEndpointResponse()).withId(id).addHints(hints)
}
