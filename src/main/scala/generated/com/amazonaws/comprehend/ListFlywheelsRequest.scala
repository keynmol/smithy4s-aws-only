package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param Filter
  *   <p>Filters the flywheels that are returned. You can filter flywheels on their status,
  *         or the date and time that they were submitted. You can only set one filter at a time.
  *       </p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p>Maximum number of results to return in a response. The default is 100.</p>
  */
final case class ListFlywheelsRequest(filter: Option[FlywheelFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListFlywheelsRequest extends ShapeTag.Companion[ListFlywheelsRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListFlywheelsRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[FlywheelFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListFlywheelsRequest = ListFlywheelsRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListFlywheelsRequest] = struct(
    FlywheelFilter.schema.optional[ListFlywheelsRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the flywheels that are returned. You can filter flywheels on their status,\n      or the date and time that they were submitted. You can only set one filter at a time.\n    </p>")),
    string.optional[ListFlywheelsRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListFlywheelsRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>Maximum number of results to return in a response. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
