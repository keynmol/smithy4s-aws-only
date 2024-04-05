package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Information about one mention of an entity. The mention information includes the location of the mention
  *         in the text and the sentiment of the mention.</p>
  *            <p>For more information about targeted sentiment, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.</p>
  */
object ListOfMentions extends Newtype[List[TargetedSentimentMention]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfMentions")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[TargetedSentimentMention]] = list(TargetedSentimentMention.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfMentions] = bijection(underlyingSchema, asBijection)
}
