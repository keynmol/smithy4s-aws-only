package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EndpointProperties
  *   <p>Describes information associated with the specific endpoint.</p>
  */
final case class DescribeEndpointResponse(endpointProperties: Option[EndpointProperties] = None)

object DescribeEndpointResponse extends ShapeTag.Companion[DescribeEndpointResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEndpointResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointProperties: Option[EndpointProperties]): DescribeEndpointResponse = DescribeEndpointResponse(endpointProperties)

  implicit val schema: Schema[DescribeEndpointResponse] = struct(
    EndpointProperties.schema.optional[DescribeEndpointResponse]("EndpointProperties", _.endpointProperties).addHints(smithy.api.Documentation("<p>Describes information associated with the specific endpoint.</p>")),
  )(make).withId(id).addHints(hints)
}
