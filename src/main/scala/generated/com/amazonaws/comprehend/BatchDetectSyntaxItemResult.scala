package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>The result of calling the  operation. The
  *       operation returns one object that is successfully processed by the operation.</p>
  * @param Index
  *   <p>The zero-based index of the document in the input list.</p>
  * @param SyntaxTokens
  *   <p>The syntax tokens for the words in the document, one token for each word.</p>
  */
final case class BatchDetectSyntaxItemResult(index: Option[Int] = None, syntaxTokens: Option[List[SyntaxToken]] = None)

object BatchDetectSyntaxItemResult extends ShapeTag.Companion[BatchDetectSyntaxItemResult] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectSyntaxItemResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The result of calling the  operation. The\n      operation returns one object that is successfully processed by the operation.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[Int], syntaxTokens: Option[List[SyntaxToken]]): BatchDetectSyntaxItemResult = BatchDetectSyntaxItemResult(index, syntaxTokens)

  implicit val schema: Schema[BatchDetectSyntaxItemResult] = struct(
    int.optional[BatchDetectSyntaxItemResult]("Index", _.index).addHints(smithy.api.Documentation("<p>The zero-based index of the document in the input list.</p>")),
    ListOfSyntaxTokens.underlyingSchema.optional[BatchDetectSyntaxItemResult]("SyntaxTokens", _.syntaxTokens).addHints(smithy.api.Documentation("<p>The syntax tokens for the words in the document, one token for each word.</p>")),
  )(make).withId(id).addHints(hints)
}
