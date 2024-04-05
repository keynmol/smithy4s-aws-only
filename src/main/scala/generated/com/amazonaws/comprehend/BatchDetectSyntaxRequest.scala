package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param TextList
  *   <p>A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25
  *         documents. The maximum size for each document is 5 KB.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. You can specify any of the following languages
  *         supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"),
  *         Italian ("it"), or Portuguese ("pt"). All documents must be in the same language.</p>
  */
final case class BatchDetectSyntaxRequest(textList: List[CustomerInputString], languageCode: SyntaxLanguageCode)

object BatchDetectSyntaxRequest extends ShapeTag.Companion[BatchDetectSyntaxRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectSyntaxRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(textList: List[CustomerInputString], languageCode: SyntaxLanguageCode): BatchDetectSyntaxRequest = BatchDetectSyntaxRequest(textList, languageCode)

  implicit val schema: Schema[BatchDetectSyntaxRequest] = struct(
    CustomerInputStringList.underlyingSchema.required[BatchDetectSyntaxRequest]("TextList", _.textList).addHints(smithy.api.Documentation("<p>A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25\n      documents. The maximum size for each document is 5 KB.</p>")),
    SyntaxLanguageCode.schema.required[BatchDetectSyntaxRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. You can specify any of the following languages\n      supported by Amazon Comprehend: German (\"de\"), English (\"en\"), Spanish (\"es\"), French (\"fr\"),\n      Italian (\"it\"), or Portuguese (\"pt\"). All documents must be in the same language.</p>")),
  )(make).withId(id).addHints(hints)
}
