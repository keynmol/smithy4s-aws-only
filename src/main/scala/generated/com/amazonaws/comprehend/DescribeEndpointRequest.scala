package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EndpointArn
  *   <p>The Amazon Resource Number (ARN) of the endpoint being described.</p>
  */
final case class DescribeEndpointRequest(endpointArn: ComprehendEndpointArn)

object DescribeEndpointRequest extends ShapeTag.Companion[DescribeEndpointRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEndpointRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointArn: ComprehendEndpointArn): DescribeEndpointRequest = DescribeEndpointRequest(endpointArn)

  implicit val schema: Schema[DescribeEndpointRequest] = struct(
    ComprehendEndpointArn.schema.required[DescribeEndpointRequest]("EndpointArn", _.endpointArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the endpoint being described.</p>")),
  )(make).withId(id).addHints(hints)
}
