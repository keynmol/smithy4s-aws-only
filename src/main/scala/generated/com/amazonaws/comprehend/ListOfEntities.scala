package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about an entity. </p>
  *            <p> </p>
  */
object ListOfEntities extends Newtype[List[Entity]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfEntities")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[Entity]] = list(Entity.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfEntities] = bijection(underlyingSchema, asBijection)
}
