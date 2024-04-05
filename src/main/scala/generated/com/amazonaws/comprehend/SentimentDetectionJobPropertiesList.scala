package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a sentiment detection job.</p>
  */
object SentimentDetectionJobPropertiesList extends Newtype[List[SentimentDetectionJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "SentimentDetectionJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[SentimentDetectionJobProperties]] = list(SentimentDetectionJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[SentimentDetectionJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
