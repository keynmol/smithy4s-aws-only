package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Text
  *   <p>A UTF-8 text string. The maximum string length is 5 KB.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. Currently, English is the only supported language.</p>
  */
final case class DetectTargetedSentimentRequest(text: CustomerInputString, languageCode: LanguageCode)

object DetectTargetedSentimentRequest extends ShapeTag.Companion[DetectTargetedSentimentRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectTargetedSentimentRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: CustomerInputString, languageCode: LanguageCode): DetectTargetedSentimentRequest = DetectTargetedSentimentRequest(text, languageCode)

  implicit val schema: Schema[DetectTargetedSentimentRequest] = struct(
    CustomerInputString.schema.required[DetectTargetedSentimentRequest]("Text", _.text).addHints(smithy.api.Documentation("<p>A UTF-8 text string. The maximum string length is 5 KB.</p>")),
    LanguageCode.schema.required[DetectTargetedSentimentRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. Currently, English is the only supported language.</p>")),
  )(make).withId(id).addHints(hints)
}
