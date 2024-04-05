package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Specifies one of the label or labels that categorize the personally identifiable
  *         information (PII) entity being analyzed.</p>
  */
object ListOfEntityLabels extends Newtype[List[EntityLabel]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfEntityLabels")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EntityLabel]] = list(EntityLabel.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfEntityLabels] = bijection(underlyingSchema, asBijection)
}
