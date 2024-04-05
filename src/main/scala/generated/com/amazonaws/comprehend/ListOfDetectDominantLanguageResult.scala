package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>The result of calling the  operation.
  *         The operation returns one object for each document that is successfully processed by the
  *         operation.</p>
  */
object ListOfDetectDominantLanguageResult extends Newtype[List[BatchDetectDominantLanguageItemResult]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDetectDominantLanguageResult")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[BatchDetectDominantLanguageItemResult]] = list(BatchDetectDominantLanguageItemResult.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDetectDominantLanguageResult] = bijection(underlyingSchema, asBijection)
}
