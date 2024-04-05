package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class TagResourceResponse()

object TagResourceResponse extends ShapeTag.Companion[TagResourceResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TagResourceResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[TagResourceResponse] = constant(TagResourceResponse()).withId(id).addHints(hints)
}
