package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p></p>
  * @param FlywheelIterationId
  *   <p></p>
  */
final case class StartFlywheelIterationResponse(flywheelArn: Option[ComprehendFlywheelArn] = None, flywheelIterationId: Option[FlywheelIterationId] = None)

object StartFlywheelIterationResponse extends ShapeTag.Companion[StartFlywheelIterationResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartFlywheelIterationResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: Option[ComprehendFlywheelArn], flywheelIterationId: Option[FlywheelIterationId]): StartFlywheelIterationResponse = StartFlywheelIterationResponse(flywheelArn, flywheelIterationId)

  implicit val schema: Schema[StartFlywheelIterationResponse] = struct(
    ComprehendFlywheelArn.schema.optional[StartFlywheelIterationResponse]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p></p>")),
    FlywheelIterationId.schema.optional[StartFlywheelIterationResponse]("FlywheelIterationId", _.flywheelIterationId).addHints(smithy.api.Documentation("<p></p>")),
  )(make).withId(id).addHints(hints)
}
