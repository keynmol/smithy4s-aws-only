package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Represents a work in the input text that was recognized and assigned a part of speech.
  *       There is one syntax token record for each word in the source text.</p>
  * @param BeginOffset
  *   <p>The zero-based offset from the beginning of the source text to the first character in the
  *         word.</p>
  * @param EndOffset
  *   <p>The zero-based offset from the beginning of the source text to the last character in the
  *         word.</p>
  * @param Text
  *   <p>The word that was recognized in the source text.</p>
  * @param TokenId
  *   <p>A unique identifier for a token.</p>
  * @param PartOfSpeech
  *   <p>Provides the part of speech label and the confidence level that Amazon Comprehend has that
  *         the part of speech was correctly identified. For more information, see
  *         <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html">Syntax</a> in the Comprehend Developer Guide.
  *       </p>
  */
final case class SyntaxToken(tokenId: Option[Int] = None, text: Option[String] = None, beginOffset: Option[Int] = None, endOffset: Option[Int] = None, partOfSpeech: Option[PartOfSpeechTag] = None)

object SyntaxToken extends ShapeTag.Companion[SyntaxToken] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "SyntaxToken")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Represents a work in the input text that was recognized and assigned a part of speech.\n      There is one syntax token record for each word in the source text.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(tokenId: Option[Int], text: Option[String], beginOffset: Option[Int], endOffset: Option[Int], partOfSpeech: Option[PartOfSpeechTag]): SyntaxToken = SyntaxToken(tokenId, text, beginOffset, endOffset, partOfSpeech)

  implicit val schema: Schema[SyntaxToken] = struct(
    int.optional[SyntaxToken]("TokenId", _.tokenId).addHints(smithy.api.Documentation("<p>A unique identifier for a token.</p>")),
    string.optional[SyntaxToken]("Text", _.text).addHints(smithy.api.Documentation("<p>The word that was recognized in the source text.</p>")),
    int.optional[SyntaxToken]("BeginOffset", _.beginOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the first character in the\n      word.</p>")),
    int.optional[SyntaxToken]("EndOffset", _.endOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the last character in the\n      word.</p>")),
    PartOfSpeechTag.schema.optional[SyntaxToken]("PartOfSpeech", _.partOfSpeech).addHints(smithy.api.Documentation("<p>Provides the part of speech label and the confidence level that Amazon Comprehend has that\n      the part of speech was correctly identified. For more information, see\n      <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html\">Syntax</a> in the Comprehend Developer Guide.\n    </p>")),
  )(make).withId(id).addHints(hints)
}
