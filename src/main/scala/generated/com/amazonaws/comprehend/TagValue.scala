package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.string

object TagValue extends Newtype[String] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TagValue")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[String] = string.withId(id).addHints(hints)
  implicit val schema: Schema[TagValue] = bijection(underlyingSchema, asBijection)
}