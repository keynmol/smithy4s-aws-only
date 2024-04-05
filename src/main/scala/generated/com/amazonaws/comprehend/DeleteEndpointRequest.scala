package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EndpointArn
  *   <p>The Amazon Resource Number (ARN) of the endpoint being deleted.</p>
  */
final case class DeleteEndpointRequest(endpointArn: ComprehendEndpointArn)

object DeleteEndpointRequest extends ShapeTag.Companion[DeleteEndpointRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteEndpointRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointArn: ComprehendEndpointArn): DeleteEndpointRequest = DeleteEndpointRequest(endpointArn)

  implicit val schema: Schema[DeleteEndpointRequest] = struct(
    ComprehendEndpointArn.schema.required[DeleteEndpointRequest]("EndpointArn", _.endpointArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the endpoint being deleted.</p>")),
  )(make).withId(id).addHints(hints)
}
