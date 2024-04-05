package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DesiredModelArn
  *   <p>The Amazon Resource Number (ARN) of the new model.</p>
  */
final case class UpdateEndpointResponse(desiredModelArn: Option[ComprehendModelArn] = None)

object UpdateEndpointResponse extends ShapeTag.Companion[UpdateEndpointResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "UpdateEndpointResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(desiredModelArn: Option[ComprehendModelArn]): UpdateEndpointResponse = UpdateEndpointResponse(desiredModelArn)

  implicit val schema: Schema[UpdateEndpointResponse] = struct(
    ComprehendModelArn.schema.optional[UpdateEndpointResponse]("DesiredModelArn", _.desiredModelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the new model.</p>")),
  )(make).withId(id).addHints(hints)
}
