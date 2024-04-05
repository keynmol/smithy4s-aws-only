package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>The configuration properties of a flywheel iteration.</p>
  */
object FlywheelIterationPropertiesList extends Newtype[List[FlywheelIterationProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelIterationPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[FlywheelIterationProperties]] = list(FlywheelIterationProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[FlywheelIterationPropertiesList] = bijection(underlyingSchema, asBijection)
}
