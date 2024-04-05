package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>The result of calling the  operation. The
  *       operation returns one object for each document that is successfully processed by the
  *       operation.</p>
  * @param Index
  *   <p>The zero-based index of the document in the input list.</p>
  * @param KeyPhrases
  *   <p>One or more <a>KeyPhrase</a> objects, one for each key phrase detected in
  *         the document.</p>
  */
final case class BatchDetectKeyPhrasesItemResult(index: Option[Int] = None, keyPhrases: Option[List[KeyPhrase]] = None)

object BatchDetectKeyPhrasesItemResult extends ShapeTag.Companion[BatchDetectKeyPhrasesItemResult] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectKeyPhrasesItemResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The result of calling the  operation. The\n      operation returns one object for each document that is successfully processed by the\n      operation.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[Int], keyPhrases: Option[List[KeyPhrase]]): BatchDetectKeyPhrasesItemResult = BatchDetectKeyPhrasesItemResult(index, keyPhrases)

  implicit val schema: Schema[BatchDetectKeyPhrasesItemResult] = struct(
    int.optional[BatchDetectKeyPhrasesItemResult]("Index", _.index).addHints(smithy.api.Documentation("<p>The zero-based index of the document in the input list.</p>")),
    ListOfKeyPhrases.underlyingSchema.optional[BatchDetectKeyPhrasesItemResult]("KeyPhrases", _.keyPhrases).addHints(smithy.api.Documentation("<p>One or more <a>KeyPhrase</a> objects, one for each key phrase detected in\n      the document.</p>")),
  )(make).withId(id).addHints(hints)
}
