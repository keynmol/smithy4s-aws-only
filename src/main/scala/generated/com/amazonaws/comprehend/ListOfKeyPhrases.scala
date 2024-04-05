package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Describes a key noun phrase.</p>
  */
object ListOfKeyPhrases extends Newtype[List[KeyPhrase]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfKeyPhrases")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[KeyPhrase]] = list(KeyPhrase.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfKeyPhrases] = bijection(underlyingSchema, asBijection)
}
