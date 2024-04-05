package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Describes information about a document classifier and its versions.</p>
  */
object DocumentClassifierSummariesList extends Newtype[List[DocumentClassifierSummary]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierSummariesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DocumentClassifierSummary]] = list(DocumentClassifierSummary.schema).withId(id).addHints(hints)
  implicit val schema: Schema[DocumentClassifierSummariesList] = bijection(underlyingSchema, asBijection)
}
