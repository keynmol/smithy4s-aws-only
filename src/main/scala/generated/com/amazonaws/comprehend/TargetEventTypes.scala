package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object TargetEventTypes extends Newtype[List[EventTypeString]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TargetEventTypes")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EventTypeString]] = list(EventTypeString.schema).withId(id).addHints(hints)
  implicit val schema: Schema[TargetEventTypes] = bijection(underlyingSchema, asBijection)
}
