package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class StopTrainingEntityRecognizerResponse()

object StopTrainingEntityRecognizerResponse extends ShapeTag.Companion[StopTrainingEntityRecognizerResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopTrainingEntityRecognizerResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[StopTrainingEntityRecognizerResponse] = constant(StopTrainingEntityRecognizerResponse()).withId(id).addHints(hints)
}
