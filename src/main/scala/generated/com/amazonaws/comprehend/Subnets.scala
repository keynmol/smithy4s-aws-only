package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object Subnets extends Newtype[List[SubnetId]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Subnets")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[SubnetId]] = list(SubnetId.schema).withId(id).addHints(hints)
  implicit val schema: Schema[Subnets] = bijection(underlyingSchema, asBijection)
}
