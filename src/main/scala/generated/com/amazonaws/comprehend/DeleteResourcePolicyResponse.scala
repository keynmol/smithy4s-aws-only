package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class DeleteResourcePolicyResponse()

object DeleteResourcePolicyResponse extends ShapeTag.Companion[DeleteResourcePolicyResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteResourcePolicyResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[DeleteResourcePolicyResponse] = constant(DeleteResourcePolicyResponse()).withId(id).addHints(hints)
}
