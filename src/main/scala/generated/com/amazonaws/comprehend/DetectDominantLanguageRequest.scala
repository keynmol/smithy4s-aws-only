package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Text
  *   <p>A UTF-8 text string. The string must contain at least 20 characters. The maximum string size is 100 KB.</p>
  */
final case class DetectDominantLanguageRequest(text: CustomerInputString)

object DetectDominantLanguageRequest extends ShapeTag.Companion[DetectDominantLanguageRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectDominantLanguageRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: CustomerInputString): DetectDominantLanguageRequest = DetectDominantLanguageRequest(text)

  implicit val schema: Schema[DetectDominantLanguageRequest] = struct(
    CustomerInputString.schema.required[DetectDominantLanguageRequest]("Text", _.text).addHints(smithy.api.Documentation("<p>A UTF-8 text string. The string must contain at least 20 characters. The maximum string size is 100 KB.</p>")),
  )(make).withId(id).addHints(hints)
}
