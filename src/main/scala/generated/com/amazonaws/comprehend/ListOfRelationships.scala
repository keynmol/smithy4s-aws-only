package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>List of child blocks for the current block.</p>
  */
object ListOfRelationships extends Newtype[List[RelationshipsListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfRelationships")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[RelationshipsListItem]] = list(RelationshipsListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfRelationships] = bijection(underlyingSchema, asBijection)
}
