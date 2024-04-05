package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.struct

/** <p>Identifies the part of speech represented by the token and gives the confidence that
  *       Amazon Comprehend has that the part of speech was correctly identified. For more information
  *       about the parts of speech that Amazon Comprehend can identify, see
  *       <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html">Syntax</a> in the Comprehend Developer Guide.
  *        </p>
  * @param Tag
  *   <p>Identifies the part of speech that the token represents.</p>
  * @param Score
  *   <p>The confidence that Amazon Comprehend has that the part of speech was correctly
  *         identified.</p>
  */
final case class PartOfSpeechTag(tag: Option[PartOfSpeechTagType] = None, score: Option[Float] = None)

object PartOfSpeechTag extends ShapeTag.Companion[PartOfSpeechTag] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PartOfSpeechTag")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Identifies the part of speech represented by the token and gives the confidence that\n      Amazon Comprehend has that the part of speech was correctly identified. For more information\n      about the parts of speech that Amazon Comprehend can identify, see\n      <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html\">Syntax</a> in the Comprehend Developer Guide.\n       </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(tag: Option[PartOfSpeechTagType], score: Option[Float]): PartOfSpeechTag = PartOfSpeechTag(tag, score)

  implicit val schema: Schema[PartOfSpeechTag] = struct(
    PartOfSpeechTagType.schema.optional[PartOfSpeechTag]("Tag", _.tag).addHints(smithy.api.Documentation("<p>Identifies the part of speech that the token represents.</p>")),
    float.optional[PartOfSpeechTag]("Score", _.score).addHints(smithy.api.Documentation("<p>The confidence that Amazon Comprehend has that the part of speech was correctly\n      identified.</p>")),
  )(make).withId(id).addHints(hints)
}
