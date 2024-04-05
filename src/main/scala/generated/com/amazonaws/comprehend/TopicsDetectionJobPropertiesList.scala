package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a topic detection job.</p>
  */
object TopicsDetectionJobPropertiesList extends Newtype[List[TopicsDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TopicsDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[TopicsDetectionJobProperties]] = list(TopicsDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[TopicsDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
