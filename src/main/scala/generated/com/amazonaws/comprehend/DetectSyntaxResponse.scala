package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param SyntaxTokens
  *   <p>A collection of syntax tokens describing the text. For each token, the response provides
  *         the text, the token type, where the text begins and ends, and the level of confidence that
  *         Amazon Comprehend has that the token is correct. For a list of token types, see
  *         <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html">Syntax</a> in the Comprehend Developer Guide.
  *       </p>
  */
final case class DetectSyntaxResponse(syntaxTokens: Option[List[SyntaxToken]] = None)

object DetectSyntaxResponse extends ShapeTag.Companion[DetectSyntaxResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectSyntaxResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(syntaxTokens: Option[List[SyntaxToken]]): DetectSyntaxResponse = DetectSyntaxResponse(syntaxTokens)

  implicit val schema: Schema[DetectSyntaxResponse] = struct(
    ListOfSyntaxTokens.underlyingSchema.optional[DetectSyntaxResponse]("SyntaxTokens", _.syntaxTokens).addHints(smithy.api.Documentation("<p>A collection of syntax tokens describing the text. For each token, the response provides\n      the text, the token type, where the text begins and ends, and the level of confidence that\n      Amazon Comprehend has that the token is correct. For a list of token types, see\n      <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html\">Syntax</a> in the Comprehend Developer Guide.\n    </p>")),
  )(make).withId(id).addHints(hints)
}
