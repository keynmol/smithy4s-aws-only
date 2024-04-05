package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Represents a work in the input text that was recognized and assigned a part of speech.
  *         There is one syntax token record for each word in the source text.</p>
  */
object ListOfSyntaxTokens extends Newtype[List[SyntaxToken]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfSyntaxTokens")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[SyntaxToken]] = list(SyntaxToken.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfSyntaxTokens] = bijection(underlyingSchema, asBijection)
}
