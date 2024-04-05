package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

object ListOfPiiEntityTypes extends Newtype[List[PiiEntityType]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfPiiEntityTypes")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[PiiEntityType]] = list(PiiEntityType.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfPiiEntityTypes] = bijection(underlyingSchema, asBijection)
}
