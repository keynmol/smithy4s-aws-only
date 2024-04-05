package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param PiiEntitiesDetectionJobProperties
  *   <p>Provides information about a PII entities detection job.</p>
  */
final case class DescribePiiEntitiesDetectionJobResponse(piiEntitiesDetectionJobProperties: Option[PiiEntitiesDetectionJobProperties] = None)

object DescribePiiEntitiesDetectionJobResponse extends ShapeTag.Companion[DescribePiiEntitiesDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribePiiEntitiesDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(piiEntitiesDetectionJobProperties: Option[PiiEntitiesDetectionJobProperties]): DescribePiiEntitiesDetectionJobResponse = DescribePiiEntitiesDetectionJobResponse(piiEntitiesDetectionJobProperties)

  implicit val schema: Schema[DescribePiiEntitiesDetectionJobResponse] = struct(
    PiiEntitiesDetectionJobProperties.schema.optional[DescribePiiEntitiesDetectionJobResponse]("PiiEntitiesDetectionJobProperties", _.piiEntitiesDetectionJobProperties),
  )(make).withId(id).addHints(hints)
}
