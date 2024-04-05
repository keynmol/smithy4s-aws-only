package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EndpointArn
  *   <p>The Amazon Resource Number (ARN) of the endpoint being created.</p>
  * @param ModelArn
  *   <p>The Amazon Resource Number (ARN) of the model to which the endpoint is
  *         attached.</p>
  */
final case class CreateEndpointResponse(endpointArn: Option[ComprehendEndpointArn] = None, modelArn: Option[ComprehendModelArn] = None)

object CreateEndpointResponse extends ShapeTag.Companion[CreateEndpointResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateEndpointResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointArn: Option[ComprehendEndpointArn], modelArn: Option[ComprehendModelArn]): CreateEndpointResponse = CreateEndpointResponse(endpointArn, modelArn)

  implicit val schema: Schema[CreateEndpointResponse] = struct(
    ComprehendEndpointArn.schema.optional[CreateEndpointResponse]("EndpointArn", _.endpointArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the endpoint being created.</p>")),
    ComprehendModelArn.schema.optional[CreateEndpointResponse]("ModelArn", _.modelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the model to which the endpoint is\n      attached.</p>")),
  )(make).withId(id).addHints(hints)
}
