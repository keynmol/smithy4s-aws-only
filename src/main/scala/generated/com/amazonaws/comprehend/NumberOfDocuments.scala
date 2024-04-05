package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.long

object NumberOfDocuments extends Newtype[Long] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "NumberOfDocuments")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[Long] = long.withId(id).addHints(hints)
  implicit val schema: Schema[NumberOfDocuments] = bijection(underlyingSchema, asBijection)
}
