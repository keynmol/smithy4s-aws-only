package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Text
  *   <p>A UTF-8 string. The maximum string size is 5 KB.</p>
  * @param LanguageCode
  *   <p>The language code of the input documents. You can specify any of the following languages
  *         supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"),
  *         Italian ("it"), or Portuguese ("pt").</p>
  */
final case class DetectSyntaxRequest(text: CustomerInputString, languageCode: SyntaxLanguageCode)

object DetectSyntaxRequest extends ShapeTag.Companion[DetectSyntaxRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectSyntaxRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: CustomerInputString, languageCode: SyntaxLanguageCode): DetectSyntaxRequest = DetectSyntaxRequest(text, languageCode)

  implicit val schema: Schema[DetectSyntaxRequest] = struct(
    CustomerInputString.schema.required[DetectSyntaxRequest]("Text", _.text).addHints(smithy.api.Documentation("<p>A UTF-8 string. The maximum string size is 5 KB.</p>")),
    SyntaxLanguageCode.schema.required[DetectSyntaxRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language code of the input documents. You can specify any of the following languages\n      supported by Amazon Comprehend: German (\"de\"), English (\"en\"), Spanish (\"es\"), French (\"fr\"),\n      Italian (\"it\"), or Portuguese (\"pt\").</p>")),
  )(make).withId(id).addHints(hints)
}
