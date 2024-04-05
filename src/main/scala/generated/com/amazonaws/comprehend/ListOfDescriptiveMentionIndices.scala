package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.list

object ListOfDescriptiveMentionIndices extends Newtype[List[Int]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDescriptiveMentionIndices")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[Int]] = list(int).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDescriptiveMentionIndices] = bijection(underlyingSchema, asBijection)
}
