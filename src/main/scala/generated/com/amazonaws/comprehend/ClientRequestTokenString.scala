package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.string

object ClientRequestTokenString extends Newtype[String] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ClientRequestTokenString")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[String] = string.withId(id).addHints(hints).validated(smithy.api.Length(min = Some(1L), max = Some(64L))).validated(smithy.api.Pattern(s"^[a-zA-Z0-9-]+$$"))
  implicit val schema: Schema[ClientRequestTokenString] = bijection(underlyingSchema, asBijection)
}
