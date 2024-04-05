package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EntitiesDetectionJobProperties
  *   <p>An object that contains the properties associated with an entities detection job.</p>
  */
final case class DescribeEntitiesDetectionJobResponse(entitiesDetectionJobProperties: Option[EntitiesDetectionJobProperties] = None)

object DescribeEntitiesDetectionJobResponse extends ShapeTag.Companion[DescribeEntitiesDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEntitiesDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entitiesDetectionJobProperties: Option[EntitiesDetectionJobProperties]): DescribeEntitiesDetectionJobResponse = DescribeEntitiesDetectionJobResponse(entitiesDetectionJobProperties)

  implicit val schema: Schema[DescribeEntitiesDetectionJobResponse] = struct(
    EntitiesDetectionJobProperties.schema.optional[DescribeEntitiesDetectionJobResponse]("EntitiesDetectionJobProperties", _.entitiesDetectionJobProperties).addHints(smithy.api.Documentation("<p>An object that contains the properties associated with an entities detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
