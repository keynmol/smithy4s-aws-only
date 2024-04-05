package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object AttributeNamesList extends Newtype[List[AttributeNamesListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "AttributeNamesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[AttributeNamesListItem]] = list(AttributeNamesListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[AttributeNamesList] = bijection(underlyingSchema, asBijection)
}
