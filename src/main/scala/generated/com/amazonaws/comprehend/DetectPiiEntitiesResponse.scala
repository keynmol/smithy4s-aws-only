package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Entities
  *   <p>A collection of PII entities identified in the input text. For each entity, the response
  *         provides the entity type, where the entity text begins and ends, and the level of confidence
  *         that Amazon Comprehend has in the detection.</p>
  */
final case class DetectPiiEntitiesResponse(entities: Option[List[PiiEntity]] = None)

object DetectPiiEntitiesResponse extends ShapeTag.Companion[DetectPiiEntitiesResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectPiiEntitiesResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entities: Option[List[PiiEntity]]): DetectPiiEntitiesResponse = DetectPiiEntitiesResponse(entities)

  implicit val schema: Schema[DetectPiiEntitiesResponse] = struct(
    ListOfPiiEntities.underlyingSchema.optional[DetectPiiEntitiesResponse]("Entities", _.entities).addHints(smithy.api.Documentation("<p>A collection of PII entities identified in the input text. For each entity, the response\n      provides the entity type, where the entity text begins and ends, and the level of confidence\n      that Amazon Comprehend has in the detection.</p>")),
  )(make).withId(id).addHints(hints)
}
