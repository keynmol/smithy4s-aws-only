package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param TextList
  *   <p>A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25
  *         documents. Each document should contain at least 20 characters. The maximum size of each document is 5 KB.</p>
  */
final case class BatchDetectDominantLanguageRequest(textList: List[CustomerInputString])

object BatchDetectDominantLanguageRequest extends ShapeTag.Companion[BatchDetectDominantLanguageRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectDominantLanguageRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(textList: List[CustomerInputString]): BatchDetectDominantLanguageRequest = BatchDetectDominantLanguageRequest(textList)

  implicit val schema: Schema[BatchDetectDominantLanguageRequest] = struct(
    CustomerInputStringList.underlyingSchema.required[BatchDetectDominantLanguageRequest]("TextList", _.textList).addHints(smithy.api.Documentation("<p>A list containing the UTF-8 encoded text of the input documents. The list can contain a maximum of 25\n      documents. Each document should contain at least 20 characters. The maximum size of each document is 5 KB.</p>")),
  )(make).withId(id).addHints(hints)
}
