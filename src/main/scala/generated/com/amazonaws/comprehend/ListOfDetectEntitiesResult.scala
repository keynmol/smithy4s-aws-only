package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>The result of calling the  operation. The
  *         operation returns one object for each document that is successfully processed by the
  *         operation.</p>
  */
object ListOfDetectEntitiesResult extends Newtype[List[BatchDetectEntitiesItemResult]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDetectEntitiesResult")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[BatchDetectEntitiesItemResult]] = list(BatchDetectEntitiesItemResult.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDetectEntitiesResult] = bijection(underlyingSchema, asBijection)
}
