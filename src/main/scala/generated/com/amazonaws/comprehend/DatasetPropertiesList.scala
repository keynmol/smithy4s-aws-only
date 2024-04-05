package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Properties associated with the dataset.</p>
  */
object DatasetPropertiesList extends Newtype[List[DatasetProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DatasetProperties]] = list(DatasetProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[DatasetPropertiesList] = bijection(underlyingSchema, asBijection)
}
