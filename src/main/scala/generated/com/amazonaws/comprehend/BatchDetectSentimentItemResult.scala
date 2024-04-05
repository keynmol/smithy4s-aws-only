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
  * @param Sentiment
  *   <p>The sentiment detected in the document.</p>
  * @param SentimentScore
  *   <p>The level of confidence that Amazon Comprehend has in the accuracy of its sentiment
  *         detection.</p>
  */
final case class BatchDetectSentimentItemResult(index: Option[Int] = None, sentiment: Option[SentimentType] = None, sentimentScore: Option[SentimentScore] = None)

object BatchDetectSentimentItemResult extends ShapeTag.Companion[BatchDetectSentimentItemResult] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectSentimentItemResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The result of calling the  operation. The\n      operation returns one object for each document that is successfully processed by the\n      operation.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[Int], sentiment: Option[SentimentType], sentimentScore: Option[SentimentScore]): BatchDetectSentimentItemResult = BatchDetectSentimentItemResult(index, sentiment, sentimentScore)

  implicit val schema: Schema[BatchDetectSentimentItemResult] = struct(
    int.optional[BatchDetectSentimentItemResult]("Index", _.index).addHints(smithy.api.Documentation("<p>The zero-based index of the document in the input list.</p>")),
    SentimentType.schema.optional[BatchDetectSentimentItemResult]("Sentiment", _.sentiment).addHints(smithy.api.Documentation("<p>The sentiment detected in the document.</p>")),
    SentimentScore.schema.optional[BatchDetectSentimentItemResult]("SentimentScore", _.sentimentScore).addHints(smithy.api.Documentation("<p>The level of confidence that Amazon Comprehend has in the accuracy of its sentiment\n      detection.</p>")),
  )(make).withId(id).addHints(hints)
}
