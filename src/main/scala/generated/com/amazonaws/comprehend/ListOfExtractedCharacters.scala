package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Array of the number of characters extracted from each page.</p>
  */
object ListOfExtractedCharacters extends Newtype[List[ExtractedCharactersListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfExtractedCharacters")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[ExtractedCharactersListItem]] = list(ExtractedCharactersListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfExtractedCharacters] = bijection(underlyingSchema, asBijection)
}
