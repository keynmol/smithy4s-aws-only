package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Returns the code for the dominant language in the input text and the level of
  *         confidence that Amazon Comprehend has in the accuracy of the detection.</p>
  */
object ListOfDominantLanguages extends Newtype[List[DominantLanguage]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDominantLanguages")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DominantLanguage]] = list(DominantLanguage.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDominantLanguages] = bijection(underlyingSchema, asBijection)
}
