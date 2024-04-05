package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a PII entity.</p>
  */
object ListOfPiiEntities extends Newtype[List[PiiEntity]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfPiiEntities")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[PiiEntity]] = list(PiiEntity.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfPiiEntities] = bijection(underlyingSchema, asBijection)
}
