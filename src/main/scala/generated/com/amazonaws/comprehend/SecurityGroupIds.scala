package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object SecurityGroupIds extends Newtype[List[SecurityGroupId]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "SecurityGroupIds")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[SecurityGroupId]] = list(SecurityGroupId.schema).withId(id).addHints(hints)
  implicit val schema: Schema[SecurityGroupIds] = bijection(underlyingSchema, asBijection)
}
