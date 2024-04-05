package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>The result of calling the  operation. The
  *         operation returns one object that is successfully processed by the operation.</p>
  */
object ListOfDetectSyntaxResult extends Newtype[List[BatchDetectSyntaxItemResult]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDetectSyntaxResult")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[BatchDetectSyntaxItemResult]] = list(BatchDetectSyntaxItemResult.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDetectSyntaxResult] = bijection(underlyingSchema, asBijection)
}
