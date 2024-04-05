package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>A reference to a block. </p>
  */
object ListOfBlockReferences extends Newtype[List[BlockReference]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfBlockReferences")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[BlockReference]] = list(BlockReference.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfBlockReferences] = bijection(underlyingSchema, asBijection)
}
