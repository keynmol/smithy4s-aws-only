package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param Filter
  *   <p>Filters the endpoints that are returned. You can filter endpoints on their name, model,
  *         status, or the date and time that they were created. You can only set one filter at a time.
  *       </p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p>The maximum number of results to return in each page. The default is 100.</p>
  */
final case class ListEndpointsRequest(filter: Option[EndpointFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListEndpointsRequest extends ShapeTag.Companion[ListEndpointsRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEndpointsRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[EndpointFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListEndpointsRequest = ListEndpointsRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListEndpointsRequest] = struct(
    EndpointFilter.schema.optional[ListEndpointsRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the endpoints that are returned. You can filter endpoints on their name, model,\n      status, or the date and time that they were created. You can only set one filter at a time.\n    </p>")),
    string.optional[ListEndpointsRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListEndpointsRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>The maximum number of results to return in each page. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
