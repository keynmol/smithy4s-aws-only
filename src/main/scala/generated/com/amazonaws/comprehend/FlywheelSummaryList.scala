package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Flywheel summary information.</p>
  */
object FlywheelSummaryList extends Newtype[List[FlywheelSummary]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelSummaryList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[FlywheelSummary]] = list(FlywheelSummary.schema).withId(id).addHints(hints)
  implicit val schema: Schema[FlywheelSummaryList] = bijection(underlyingSchema, asBijection)
}
