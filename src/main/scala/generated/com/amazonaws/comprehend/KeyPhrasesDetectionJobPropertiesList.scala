package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a key phrases detection job.</p>
  */
object KeyPhrasesDetectionJobPropertiesList extends Newtype[List[KeyPhrasesDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "KeyPhrasesDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[KeyPhrasesDetectionJobProperties]] = list(KeyPhrasesDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[KeyPhrasesDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
