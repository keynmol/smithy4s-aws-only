package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class DeleteEntityRecognizerResponse()

object DeleteEntityRecognizerResponse extends ShapeTag.Companion[DeleteEntityRecognizerResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteEntityRecognizerResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[DeleteEntityRecognizerResponse] = constant(DeleteEntityRecognizerResponse()).withId(id).addHints(hints)
}
