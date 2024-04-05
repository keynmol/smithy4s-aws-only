package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Entities
  *   <p>Targeted sentiment analysis for each of the entities identified in the input text.</p>
  */
final case class DetectTargetedSentimentResponse(entities: Option[List[TargetedSentimentEntity]] = None)

object DetectTargetedSentimentResponse extends ShapeTag.Companion[DetectTargetedSentimentResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectTargetedSentimentResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entities: Option[List[TargetedSentimentEntity]]): DetectTargetedSentimentResponse = DetectTargetedSentimentResponse(entities)

  implicit val schema: Schema[DetectTargetedSentimentResponse] = struct(
    ListOfTargetedSentimentEntities.underlyingSchema.optional[DetectTargetedSentimentResponse]("Entities", _.entities).addHints(smithy.api.Documentation("<p>Targeted sentiment analysis for each of the entities identified in the input text.</p>")),
  )(make).withId(id).addHints(hints)
}
