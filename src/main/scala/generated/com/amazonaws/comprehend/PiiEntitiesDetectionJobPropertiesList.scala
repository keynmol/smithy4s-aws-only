package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a PII entities detection job.</p>
  */
object PiiEntitiesDetectionJobPropertiesList extends Newtype[List[PiiEntitiesDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PiiEntitiesDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[PiiEntitiesDetectionJobProperties]] = list(PiiEntitiesDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[PiiEntitiesDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
