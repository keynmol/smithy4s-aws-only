package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Individual item from the list of entity types in the metadata of an entity
  *         recognizer.</p>
  */
object EntityRecognizerMetadataEntityTypesList extends Newtype[List[EntityRecognizerMetadataEntityTypesListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerMetadataEntityTypesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EntityRecognizerMetadataEntityTypesListItem]] = list(EntityRecognizerMetadataEntityTypesListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[EntityRecognizerMetadataEntityTypesList] = bijection(underlyingSchema, asBijection)
}
