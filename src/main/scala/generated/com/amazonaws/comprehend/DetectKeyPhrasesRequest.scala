package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Text
  *   <p>A UTF-8 text string. The string must contain less than 100 KB of UTF-8 encoded
  *         characters.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. You can specify any of the primary languages
  *         supported by Amazon Comprehend. All documents must be in the same language.</p>
  */
final case class DetectKeyPhrasesRequest(text: CustomerInputString, languageCode: LanguageCode)

object DetectKeyPhrasesRequest extends ShapeTag.Companion[DetectKeyPhrasesRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectKeyPhrasesRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: CustomerInputString, languageCode: LanguageCode): DetectKeyPhrasesRequest = DetectKeyPhrasesRequest(text, languageCode)

  implicit val schema: Schema[DetectKeyPhrasesRequest] = struct(
    CustomerInputString.schema.required[DetectKeyPhrasesRequest]("Text", _.text).addHints(smithy.api.Documentation("<p>A UTF-8 text string. The string must contain less than 100 KB of UTF-8 encoded\n      characters.</p>")),
    LanguageCode.schema.required[DetectKeyPhrasesRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. You can specify any of the primary languages\n      supported by Amazon Comprehend. All documents must be in the same language.</p>")),
  )(make).withId(id).addHints(hints)
}
