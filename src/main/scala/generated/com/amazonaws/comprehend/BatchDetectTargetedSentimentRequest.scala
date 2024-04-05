package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param TextList
  *   <p>A list containing the UTF-8 encoded text of the input documents.
  *         The list can contain a maximum of 25 documents. The maximum size of each document is 5 KB.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. Currently, English is the only supported language.</p>
  */
final case class BatchDetectTargetedSentimentRequest(textList: List[CustomerInputString], languageCode: LanguageCode)

object BatchDetectTargetedSentimentRequest extends ShapeTag.Companion[BatchDetectTargetedSentimentRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectTargetedSentimentRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(textList: List[CustomerInputString], languageCode: LanguageCode): BatchDetectTargetedSentimentRequest = BatchDetectTargetedSentimentRequest(textList, languageCode)

  implicit val schema: Schema[BatchDetectTargetedSentimentRequest] = struct(
    CustomerInputStringList.underlyingSchema.required[BatchDetectTargetedSentimentRequest]("TextList", _.textList).addHints(smithy.api.Documentation("<p>A list containing the UTF-8 encoded text of the input documents.\n      The list can contain a maximum of 25 documents. The maximum size of each document is 5 KB.</p>")),
    LanguageCode.schema.required[BatchDetectTargetedSentimentRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. Currently, English is the only supported language.</p>")),
  )(make).withId(id).addHints(hints)
}
