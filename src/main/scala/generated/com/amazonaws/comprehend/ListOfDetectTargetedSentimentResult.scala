package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Analysis results for one of the documents in the batch.</p>
  */
object ListOfDetectTargetedSentimentResult extends Newtype[List[BatchDetectTargetedSentimentItemResult]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDetectTargetedSentimentResult")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[BatchDetectTargetedSentimentItemResult]] = list(BatchDetectTargetedSentimentItemResult.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDetectTargetedSentimentResult] = bijection(underlyingSchema, asBijection)
}
