package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel.</p>
  * @param Filter
  *   <p>Filters the datasets to be returned in the response.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p>Maximum number of results to return in a response. The default is 100.</p>
  */
final case class ListDatasetsRequest(flywheelArn: Option[ComprehendFlywheelArn] = None, filter: Option[DatasetFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListDatasetsRequest extends ShapeTag.Companion[ListDatasetsRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDatasetsRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: Option[ComprehendFlywheelArn], filter: Option[DatasetFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListDatasetsRequest = ListDatasetsRequest(flywheelArn, filter, nextToken, maxResults)

  implicit val schema: Schema[ListDatasetsRequest] = struct(
    ComprehendFlywheelArn.schema.optional[ListDatasetsRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel.</p>")),
    DatasetFilter.schema.optional[ListDatasetsRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the datasets to be returned in the response.</p>")),
    string.optional[ListDatasetsRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListDatasetsRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>Maximum number of results to return in a response. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
