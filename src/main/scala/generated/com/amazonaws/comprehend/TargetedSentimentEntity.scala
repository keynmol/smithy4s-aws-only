package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Information about one of the entities found by targeted sentiment analysis.</p>
  *          <p>For more information about targeted sentiment, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.</p>
  * @param DescriptiveMentionIndex
  *   <p>One or more index into the Mentions array that provides the best name for the entity group.</p>
  * @param Mentions
  *   <p>An array of mentions of the entity in the document. The array represents a co-reference group.
  *         See <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values">
  *           Co-reference group</a> for an example. </p>
  */
final case class TargetedSentimentEntity(descriptiveMentionIndex: Option[List[Int]] = None, mentions: Option[List[TargetedSentimentMention]] = None)

object TargetedSentimentEntity extends ShapeTag.Companion[TargetedSentimentEntity] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TargetedSentimentEntity")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Information about one of the entities found by targeted sentiment analysis.</p>\n         <p>For more information about targeted sentiment, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html\">Targeted sentiment</a>.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(descriptiveMentionIndex: Option[List[Int]], mentions: Option[List[TargetedSentimentMention]]): TargetedSentimentEntity = TargetedSentimentEntity(descriptiveMentionIndex, mentions)

  implicit val schema: Schema[TargetedSentimentEntity] = struct(
    ListOfDescriptiveMentionIndices.underlyingSchema.optional[TargetedSentimentEntity]("DescriptiveMentionIndex", _.descriptiveMentionIndex).addHints(smithy.api.Documentation("<p>One or more index into the Mentions array that provides the best name for the entity group.</p>")),
    ListOfMentions.underlyingSchema.optional[TargetedSentimentEntity]("Mentions", _.mentions).addHints(smithy.api.Documentation("<p>An array of mentions of the entity in the document. The array represents a co-reference group.\n      See <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values\">\n        Co-reference group</a> for an example. </p>")),
  )(make).withId(id).addHints(hints)
}
