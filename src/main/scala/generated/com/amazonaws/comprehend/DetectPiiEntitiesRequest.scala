package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param Text
  *   <p>A UTF-8 text string. The maximum string size is 100 KB.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. Currently, English is the only valid language.</p>
  */
final case class DetectPiiEntitiesRequest(text: String, languageCode: LanguageCode)

object DetectPiiEntitiesRequest extends ShapeTag.Companion[DetectPiiEntitiesRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectPiiEntitiesRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: String, languageCode: LanguageCode): DetectPiiEntitiesRequest = DetectPiiEntitiesRequest(text, languageCode)

  implicit val schema: Schema[DetectPiiEntitiesRequest] = struct(
    string.required[DetectPiiEntitiesRequest]("Text", _.text).addHints(smithy.api.Documentation("<p>A UTF-8 text string. The maximum string size is 100 KB.</p>")),
    LanguageCode.schema.required[DetectPiiEntitiesRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. Currently, English is the only valid language.</p>")),
  )(make).withId(id).addHints(hints)
}
