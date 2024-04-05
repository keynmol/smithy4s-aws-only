package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.constant

final case class DeleteDocumentClassifierResponse()

object DeleteDocumentClassifierResponse extends ShapeTag.Companion[DeleteDocumentClassifierResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteDocumentClassifierResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily


  implicit val schema: Schema[DeleteDocumentClassifierResponse] = constant(DeleteDocumentClassifierResponse()).withId(id).addHints(hints)
}
