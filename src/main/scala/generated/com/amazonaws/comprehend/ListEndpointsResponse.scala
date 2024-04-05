package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param EndpointPropertiesList
  *   <p>Displays a list of endpoint properties being retrieved by the service in response to the
  *         request.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListEndpointsResponse(endpointPropertiesList: Option[List[EndpointProperties]] = None, nextToken: Option[String] = None)

object ListEndpointsResponse extends ShapeTag.Companion[ListEndpointsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEndpointsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointPropertiesList: Option[List[EndpointProperties]], nextToken: Option[String]): ListEndpointsResponse = ListEndpointsResponse(endpointPropertiesList, nextToken)

  implicit val schema: Schema[ListEndpointsResponse] = struct(
    EndpointPropertiesList.underlyingSchema.optional[ListEndpointsResponse]("EndpointPropertiesList", _.endpointPropertiesList).addHints(smithy.api.Documentation("<p>Displays a list of endpoint properties being retrieved by the service in response to the\n      request.</p>")),
    string.optional[ListEndpointsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
