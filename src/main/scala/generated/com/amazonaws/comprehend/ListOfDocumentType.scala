package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Document type for each page in the document.</p>
  */
object ListOfDocumentType extends Newtype[List[DocumentTypeListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDocumentType")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DocumentTypeListItem]] = list(DocumentTypeListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDocumentType] = bijection(underlyingSchema, asBijection)
}
