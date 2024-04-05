package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class StopTrainingDocumentClassifierResponse()

object StopTrainingDocumentClassifierResponse extends ShapeTag.Companion[StopTrainingDocumentClassifierResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopTrainingDocumentClassifierResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[StopTrainingDocumentClassifierResponse] = constant(StopTrainingDocumentClassifierResponse()).withId(id).addHints(hints)
}
