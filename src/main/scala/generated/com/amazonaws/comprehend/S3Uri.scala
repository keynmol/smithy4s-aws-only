package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.string

object S3Uri extends Newtype[String] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "S3Uri")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[String] = string.withId(id).addHints(hints)
  implicit val schema: Schema[S3Uri] = bijection(underlyingSchema, asBijection)
}
