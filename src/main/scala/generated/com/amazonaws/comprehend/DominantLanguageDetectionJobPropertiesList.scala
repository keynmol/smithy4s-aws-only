package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a dominant language detection job.</p>
  */
object DominantLanguageDetectionJobPropertiesList extends Newtype[List[DominantLanguageDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DominantLanguageDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DominantLanguageDetectionJobProperties]] = list(DominantLanguageDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[DominantLanguageDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
