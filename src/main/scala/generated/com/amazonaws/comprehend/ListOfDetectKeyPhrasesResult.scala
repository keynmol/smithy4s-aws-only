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
object ListOfDetectKeyPhrasesResult extends Newtype[List[BatchDetectKeyPhrasesItemResult]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDetectKeyPhrasesResult")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[BatchDetectKeyPhrasesItemResult]] = list(BatchDetectKeyPhrasesItemResult.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDetectKeyPhrasesResult] = bijection(underlyingSchema, asBijection)
}
