package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about an entities detection job.</p>
  */
object EntitiesDetectionJobPropertiesList extends Newtype[List[EntitiesDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntitiesDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EntitiesDetectionJobProperties]] = list(EntitiesDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[EntitiesDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
