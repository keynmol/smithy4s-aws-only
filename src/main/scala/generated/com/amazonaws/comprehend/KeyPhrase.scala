package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Describes a key noun phrase.</p>
  * @param Score
  *   <p>The level of confidence that Amazon Comprehend has in the accuracy of the
  *         detection.</p>
  * @param Text
  *   <p>The text of a key noun phrase.</p>
  * @param BeginOffset
  *   <p>The zero-based offset from the beginning of the source text to the first character in the
  *         key phrase.</p>
  * @param EndOffset
  *   <p>The zero-based offset from the beginning of the source text to the last character in the
  *         key phrase.</p>
  */
final case class KeyPhrase(score: Option[Float] = None, text: Option[String] = None, beginOffset: Option[Int] = None, endOffset: Option[Int] = None)

object KeyPhrase extends ShapeTag.Companion[KeyPhrase] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "KeyPhrase")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes a key noun phrase.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(score: Option[Float], text: Option[String], beginOffset: Option[Int], endOffset: Option[Int]): KeyPhrase = KeyPhrase(score, text, beginOffset, endOffset)

  implicit val schema: Schema[KeyPhrase] = struct(
    float.optional[KeyPhrase]("Score", _.score).addHints(smithy.api.Documentation("<p>The level of confidence that Amazon Comprehend has in the accuracy of the\n      detection.</p>")),
    string.optional[KeyPhrase]("Text", _.text).addHints(smithy.api.Documentation("<p>The text of a key noun phrase.</p>")),
    int.optional[KeyPhrase]("BeginOffset", _.beginOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the first character in the\n      key phrase.</p>")),
    int.optional[KeyPhrase]("EndOffset", _.endOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the last character in the\n      key phrase.</p>")),
  )(make).withId(id).addHints(hints)
}
