package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Languages
  *   <p>Array of languages that Amazon Comprehend detected in the input text.
  *         The array is sorted in descending order of the score
  *         (the dominant language is always the first element in the array).</p>
  *            <p>For each language, the
  *         response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend
  *         has in the accuracy of its inference. For more information about RFC 5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the
  *           <i>IETF Tools</i> web site.</p>
  */
final case class DetectDominantLanguageResponse(languages: Option[List[DominantLanguage]] = None)

object DetectDominantLanguageResponse extends ShapeTag.Companion[DetectDominantLanguageResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectDominantLanguageResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(languages: Option[List[DominantLanguage]]): DetectDominantLanguageResponse = DetectDominantLanguageResponse(languages)

  implicit val schema: Schema[DetectDominantLanguageResponse] = struct(
    ListOfDominantLanguages.underlyingSchema.optional[DetectDominantLanguageResponse]("Languages", _.languages).addHints(smithy.api.Documentation("<p>Array of languages that Amazon Comprehend detected in the input text.\n      The array is sorted in descending order of the score\n      (the dominant language is always the first element in the array).</p>\n         <p>For each language, the\n      response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend\n      has in the accuracy of its inference. For more information about RFC 5646, see <a href=\"https://tools.ietf.org/html/rfc5646\">Tags for Identifying Languages</a> on the\n        <i>IETF Tools</i> web site.</p>")),
  )(make).withId(id).addHints(hints)
}
