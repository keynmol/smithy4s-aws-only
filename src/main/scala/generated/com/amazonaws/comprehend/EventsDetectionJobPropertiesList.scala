package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about an events detection job.</p>
  */
object EventsDetectionJobPropertiesList extends Newtype[List[EventsDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EventsDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EventsDetectionJobProperties]] = list(EventsDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[EventsDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
