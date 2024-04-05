package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param KeyPhrases
  *   <p>A collection of key phrases that Amazon Comprehend identified in the input text. For
  *         each key phrase, the response provides the text of the key phrase, where the key phrase begins
  *         and ends, and the level of confidence that Amazon Comprehend has in the accuracy of the
  *         detection. </p>
  */
final case class DetectKeyPhrasesResponse(keyPhrases: Option[List[KeyPhrase]] = None)

object DetectKeyPhrasesResponse extends ShapeTag.Companion[DetectKeyPhrasesResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectKeyPhrasesResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(keyPhrases: Option[List[KeyPhrase]]): DetectKeyPhrasesResponse = DetectKeyPhrasesResponse(keyPhrases)

  implicit val schema: Schema[DetectKeyPhrasesResponse] = struct(
    ListOfKeyPhrases.underlyingSchema.optional[DetectKeyPhrasesResponse]("KeyPhrases", _.keyPhrases).addHints(smithy.api.Documentation("<p>A collection of key phrases that Amazon Comprehend identified in the input text. For\n      each key phrase, the response provides the text of the key phrase, where the key phrase begins\n      and ends, and the level of confidence that Amazon Comprehend has in the accuracy of the\n      detection. </p>")),
  )(make).withId(id).addHints(hints)
}
