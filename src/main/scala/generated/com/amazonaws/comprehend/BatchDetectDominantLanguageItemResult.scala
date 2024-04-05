package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>The result of calling the  operation.
  *       The operation returns one object for each document that is successfully processed by the
  *       operation.</p>
  * @param Index
  *   <p>The zero-based index of the document in the input list.</p>
  * @param Languages
  *   <p>One or more <a>DominantLanguage</a> objects describing the dominant
  *         languages in the document.</p>
  */
final case class BatchDetectDominantLanguageItemResult(index: Option[Int] = None, languages: Option[List[DominantLanguage]] = None)

object BatchDetectDominantLanguageItemResult extends ShapeTag.Companion[BatchDetectDominantLanguageItemResult] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectDominantLanguageItemResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The result of calling the  operation.\n      The operation returns one object for each document that is successfully processed by the\n      operation.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[Int], languages: Option[List[DominantLanguage]]): BatchDetectDominantLanguageItemResult = BatchDetectDominantLanguageItemResult(index, languages)

  implicit val schema: Schema[BatchDetectDominantLanguageItemResult] = struct(
    int.optional[BatchDetectDominantLanguageItemResult]("Index", _.index).addHints(smithy.api.Documentation("<p>The zero-based index of the document in the input list.</p>")),
    ListOfDominantLanguages.underlyingSchema.optional[BatchDetectDominantLanguageItemResult]("Languages", _.languages).addHints(smithy.api.Documentation("<p>One or more <a>DominantLanguage</a> objects describing the dominant\n      languages in the document.</p>")),
  )(make).withId(id).addHints(hints)
}
