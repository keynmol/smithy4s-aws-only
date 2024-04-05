package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Information about one mention of an entity. The mention information includes the location of the mention
  *       in the text and the sentiment of the mention.</p>
  *          <p>For more information about targeted sentiment, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.</p>
  * @param MentionSentiment
  *   <p>Contains the sentiment and sentiment score for the mention.</p>
  * @param BeginOffset
  *   <p>The offset into the document text where the mention begins.</p>
  * @param EndOffset
  *   <p>The offset into the document text where the mention ends.</p>
  * @param Text
  *   <p>The text in the document that identifies the entity.</p>
  * @param Score
  *   <p>Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.</p>
  * @param GroupScore
  *   <p>The confidence that all the entities mentioned in the group relate to the same entity.</p>
  * @param Type
  *   <p>The type of the entity. Amazon Comprehend supports a variety of <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities">entity types</a>.</p>
  */
final case class TargetedSentimentMention(score: Option[Float] = None, groupScore: Option[Float] = None, text: Option[String] = None, _type: Option[TargetedSentimentEntityType] = None, mentionSentiment: Option[MentionSentiment] = None, beginOffset: Option[Int] = None, endOffset: Option[Int] = None)

object TargetedSentimentMention extends ShapeTag.Companion[TargetedSentimentMention] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TargetedSentimentMention")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Information about one mention of an entity. The mention information includes the location of the mention\n      in the text and the sentiment of the mention.</p>\n         <p>For more information about targeted sentiment, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html\">Targeted sentiment</a>.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(score: Option[Float], groupScore: Option[Float], text: Option[String], _type: Option[TargetedSentimentEntityType], mentionSentiment: Option[MentionSentiment], beginOffset: Option[Int], endOffset: Option[Int]): TargetedSentimentMention = TargetedSentimentMention(score, groupScore, text, _type, mentionSentiment, beginOffset, endOffset)

  implicit val schema: Schema[TargetedSentimentMention] = struct(
    float.optional[TargetedSentimentMention]("Score", _.score).addHints(smithy.api.Documentation("<p>Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.</p>")),
    float.optional[TargetedSentimentMention]("GroupScore", _.groupScore).addHints(smithy.api.Documentation("<p>The confidence that all the entities mentioned in the group relate to the same entity.</p>")),
    string.optional[TargetedSentimentMention]("Text", _.text).addHints(smithy.api.Documentation("<p>The text in the document that identifies the entity.</p>")),
    TargetedSentimentEntityType.schema.optional[TargetedSentimentMention]("Type", _._type).addHints(smithy.api.Documentation("<p>The type of the entity. Amazon Comprehend supports a variety of <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities\">entity types</a>.</p>")),
    MentionSentiment.schema.optional[TargetedSentimentMention]("MentionSentiment", _.mentionSentiment).addHints(smithy.api.Documentation("<p>Contains the sentiment and sentiment score for the mention.</p>")),
    int.optional[TargetedSentimentMention]("BeginOffset", _.beginOffset).addHints(smithy.api.Documentation("<p>The offset into the document text where the mention begins.</p>")),
    int.optional[TargetedSentimentMention]("EndOffset", _.endOffset).addHints(smithy.api.Documentation("<p>The offset into the document text where the mention ends.</p>")),
  )(make).withId(id).addHints(hints)
}
