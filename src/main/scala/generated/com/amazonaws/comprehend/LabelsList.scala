package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object LabelsList extends Newtype[List[LabelListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "LabelsList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[LabelListItem]] = list(LabelListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[LabelsList] = bijection(underlyingSchema, asBijection)
}
