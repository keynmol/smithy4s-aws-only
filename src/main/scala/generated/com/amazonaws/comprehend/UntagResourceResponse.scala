package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class UntagResourceResponse()

object UntagResourceResponse extends ShapeTag.Companion[UntagResourceResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "UntagResourceResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[UntagResourceResponse] = constant(UntagResourceResponse()).withId(id).addHints(hints)
}
