package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Describes information about an entity recognizer.</p>
  */
object EntityRecognizerPropertiesList extends Newtype[List[EntityRecognizerProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EntityRecognizerProperties]] = list(EntityRecognizerProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[EntityRecognizerPropertiesList] = bijection(underlyingSchema, asBijection)
}
