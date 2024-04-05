package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Provides information about a document classification job.</p>
  */
object DocumentClassificationJobPropertiesList extends Newtype[List[DocumentClassificationJobProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassificationJobPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DocumentClassificationJobProperties]] = list(DocumentClassificationJobProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[DocumentClassificationJobPropertiesList] = bijection(underlyingSchema, asBijection)
}
