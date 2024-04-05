package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object CustomerInputStringList extends Newtype[List[CustomerInputString]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CustomerInputStringList")
  val hints: Hints = Hints(
    smithy.api.Sensitive(),
  ).lazily
  val underlyingSchema: Schema[List[CustomerInputString]] = list(CustomerInputString.schema).withId(id).addHints(hints).validated(smithy.api.Length(min = Some(1L), max = None))
  implicit val schema: Schema[CustomerInputStringList] = bijection(underlyingSchema, asBijection)
}
