package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.int

object NumberOfTopicsInteger extends Newtype[Int] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "NumberOfTopicsInteger")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[Int] = int.withId(id).addHints(hints).validated(smithy.api.Range(min = Some(scala.math.BigDecimal(1.0)), max = Some(scala.math.BigDecimal(100.0))))
  implicit val schema: Schema[NumberOfTopicsInteger] = bijection(underlyingSchema, asBijection)
}
