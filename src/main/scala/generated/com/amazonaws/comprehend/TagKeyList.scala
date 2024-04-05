package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object TagKeyList extends Newtype[List[TagKey]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TagKeyList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[TagKey]] = list(TagKey.schema).withId(id).addHints(hints)
  implicit val schema: Schema[TagKeyList] = bijection(underlyingSchema, asBijection)
}
