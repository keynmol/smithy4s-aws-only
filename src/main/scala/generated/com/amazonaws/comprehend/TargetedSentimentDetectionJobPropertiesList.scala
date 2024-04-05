package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a targeted sentiment detection job.</p>
  */
object TargetedSentimentDetectionJobPropertiesList extends Newtype[List[TargetedSentimentDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TargetedSentimentDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[TargetedSentimentDetectionJobProperties]] = list(TargetedSentimentDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[TargetedSentimentDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
