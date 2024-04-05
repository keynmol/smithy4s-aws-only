package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.int

object InferenceUnitsInteger extends Newtype[Int] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "InferenceUnitsInteger")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[Int] = int.withId(id).addHints(hints)
  implicit val schema: Schema[InferenceUnitsInteger] = bijection(underlyingSchema, asBijection)
}
