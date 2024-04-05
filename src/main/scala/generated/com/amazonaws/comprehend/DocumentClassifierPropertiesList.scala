package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a document classifier.</p>
  */
object DocumentClassifierPropertiesList extends Newtype[List[DocumentClassifierProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DocumentClassifierProperties]] = list(DocumentClassifierProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[DocumentClassifierPropertiesList] = bijection(underlyingSchema, asBijection)
}
