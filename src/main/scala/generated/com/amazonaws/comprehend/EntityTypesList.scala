package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>An entity type within a labeled training dataset that Amazon Comprehend uses to train a
  *         custom entity recognizer.</p>
  */
object EntityTypesList extends Newtype[List[EntityTypesListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityTypesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EntityTypesListItem]] = list(EntityTypesListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[EntityTypesList] = bijection(underlyingSchema, asBijection)
}
