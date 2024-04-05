package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Specifies the class that categorizes the document being analyzed</p>
  */
object ListOfClasses extends Newtype[List[DocumentClass]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfClasses")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DocumentClass]] = list(DocumentClass.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfClasses] = bijection(underlyingSchema, asBijection)
}
