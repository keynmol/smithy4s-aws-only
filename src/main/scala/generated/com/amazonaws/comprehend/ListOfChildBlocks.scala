package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Nested block contained within a block.</p>
  */
object ListOfChildBlocks extends Newtype[List[ChildBlock]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfChildBlocks")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[ChildBlock]] = list(ChildBlock.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfChildBlocks] = bijection(underlyingSchema, asBijection)
}
