package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Contains the sentiment and sentiment score for one mention of an entity.</p>
  *          <p>For more information about targeted sentiment, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.</p>
  * @param Sentiment
  *   <p>The sentiment of the mention. </p>
  * @param SentimentScore
  *   <p>Describes the level of confidence that Amazon Comprehend has in the accuracy of its
  *         detection of sentiments.</p>
  */
final case class MentionSentiment(sentiment: Option[SentimentType] = None, sentimentScore: Option[SentimentScore] = None)

object MentionSentiment extends ShapeTag.Companion[MentionSentiment] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "MentionSentiment")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Contains the sentiment and sentiment score for one mention of an entity.</p>\n         <p>For more information about targeted sentiment, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html\">Targeted sentiment</a>.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(sentiment: Option[SentimentType], sentimentScore: Option[SentimentScore]): MentionSentiment = MentionSentiment(sentiment, sentimentScore)

  implicit val schema: Schema[MentionSentiment] = struct(
    SentimentType.schema.optional[MentionSentiment]("Sentiment", _.sentiment).addHints(smithy.api.Documentation("<p>The sentiment of the mention. </p>")),
    SentimentScore.schema.optional[MentionSentiment]("SentimentScore", _.sentimentScore),
  )(make).withId(id).addHints(hints)
}
