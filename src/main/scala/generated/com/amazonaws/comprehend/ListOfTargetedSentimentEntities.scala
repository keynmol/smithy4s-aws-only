package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Information about one of the entities found by targeted sentiment analysis.</p>
  *            <p>For more information about targeted sentiment, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.</p>
  */
object ListOfTargetedSentimentEntities extends Newtype[List[TargetedSentimentEntity]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfTargetedSentimentEntities")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[TargetedSentimentEntity]] = list(TargetedSentimentEntity.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfTargetedSentimentEntities] = bijection(underlyingSchema, asBijection)
}
