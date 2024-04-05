package com.amazonaws.comprehend

import smithy4s.Blob
import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.bytes

object SemiStructuredDocumentBlob extends Newtype[Blob] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "SemiStructuredDocumentBlob")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[Blob] = bytes.withId(id).addHints(hints).validated(smithy.api.Length(min = Some(1L), max = None))
  implicit val schema: Schema[SemiStructuredDocumentBlob] = bijection(underlyingSchema, asBijection)
}
