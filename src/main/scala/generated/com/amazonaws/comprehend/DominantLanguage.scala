package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Returns the code for the dominant language in the input text and the level of
  *       confidence that Amazon Comprehend has in the accuracy of the detection.</p>
  * @param LanguageCode
  *   <p>The RFC 5646 language code for the dominant language. For more information about RFC
  *         5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
  *           Languages</a> on the <i>IETF Tools</i> web site.</p>
  * @param Score
  *   <p>The level of confidence that Amazon Comprehend has in the accuracy of the
  *         detection.</p>
  */
final case class DominantLanguage(languageCode: Option[String] = None, score: Option[Float] = None)

object DominantLanguage extends ShapeTag.Companion[DominantLanguage] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DominantLanguage")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Returns the code for the dominant language in the input text and the level of\n      confidence that Amazon Comprehend has in the accuracy of the detection.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(languageCode: Option[String], score: Option[Float]): DominantLanguage = DominantLanguage(languageCode, score)

  implicit val schema: Schema[DominantLanguage] = struct(
    string.optional[DominantLanguage]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The RFC 5646 language code for the dominant language. For more information about RFC\n      5646, see <a href=\"https://tools.ietf.org/html/rfc5646\">Tags for Identifying\n        Languages</a> on the <i>IETF Tools</i> web site.</p>")),
    float.optional[DominantLanguage]("Score", _.score).addHints(smithy.api.Documentation("<p>The level of confidence that Amazon Comprehend has in the accuracy of the\n      detection.</p>")),
  )(make).withId(id).addHints(hints)
}
