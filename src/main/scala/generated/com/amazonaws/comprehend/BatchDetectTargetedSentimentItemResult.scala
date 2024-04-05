package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Analysis results for one of the documents in the batch.</p>
  * @param Index
  *   <p>The zero-based index of this result in the input list.</p>
  * @param Entities
  *   <p>An array of targeted sentiment entities.</p>
  */
final case class BatchDetectTargetedSentimentItemResult(index: Option[Int] = None, entities: Option[List[TargetedSentimentEntity]] = None)

object BatchDetectTargetedSentimentItemResult extends ShapeTag.Companion[BatchDetectTargetedSentimentItemResult] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectTargetedSentimentItemResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Analysis results for one of the documents in the batch.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[Int], entities: Option[List[TargetedSentimentEntity]]): BatchDetectTargetedSentimentItemResult = BatchDetectTargetedSentimentItemResult(index, entities)

  implicit val schema: Schema[BatchDetectTargetedSentimentItemResult] = struct(
    int.optional[BatchDetectTargetedSentimentItemResult]("Index", _.index).addHints(smithy.api.Documentation("<p>The zero-based index of this result in the input list.</p>")),
    ListOfTargetedSentimentEntities.underlyingSchema.optional[BatchDetectTargetedSentimentItemResult]("Entities", _.entities).addHints(smithy.api.Documentation("<p>An array of targeted sentiment entities.</p>")),
  )(make).withId(id).addHints(hints)
}
