package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Describes an error that occurred while processing a document in a batch. The operation
  *         returns on <code>BatchItemError</code> object for each document that contained an
  *         error.</p>
  */
object BatchItemErrorList extends Newtype[List[BatchItemError]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchItemErrorList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[BatchItemError]] = list(BatchItemError.schema).withId(id).addHints(hints)
  implicit val schema: Schema[BatchItemErrorList] = bijection(underlyingSchema, asBijection)
}
