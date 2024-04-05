package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Specifies one of the label or labels that categorize the document being analyzed.</p>
  */
object ListOfLabels extends Newtype[List[DocumentLabel]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfLabels")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DocumentLabel]] = list(DocumentLabel.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfLabels] = bijection(underlyingSchema, asBijection)
}
