package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param TextList
  *   <p>A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25
  *         documents. The maximum size of each document is 5 KB. </p>
  * @param LanguageCode
  *   <p>The language of the input documents. You can specify any of the primary languages
  *         supported by Amazon Comprehend. All documents must be in the same language.</p>
  */
final case class BatchDetectSentimentRequest(textList: List[CustomerInputString], languageCode: LanguageCode)

object BatchDetectSentimentRequest extends ShapeTag.Companion[BatchDetectSentimentRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectSentimentRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(textList: List[CustomerInputString], languageCode: LanguageCode): BatchDetectSentimentRequest = BatchDetectSentimentRequest(textList, languageCode)

  implicit val schema: Schema[BatchDetectSentimentRequest] = struct(
    CustomerInputStringList.underlyingSchema.required[BatchDetectSentimentRequest]("TextList", _.textList).addHints(smithy.api.Documentation("<p>A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25\n      documents. The maximum size of each document is 5 KB. </p>")),
    LanguageCode.schema.required[BatchDetectSentimentRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. You can specify any of the primary languages\n      supported by Amazon Comprehend. All documents must be in the same language.</p>")),
  )(make).withId(id).addHints(hints)
}
