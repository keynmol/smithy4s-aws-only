package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p>The ARN of the flywheel.</p>
  * @param Filter
  *   <p>Filter the flywheel iteration history based on creation time.</p>
  * @param NextToken
  *   <p>Next token</p>
  * @param MaxResults
  *   <p>Maximum number of iteration history results to return</p>
  */
final case class ListFlywheelIterationHistoryRequest(flywheelArn: ComprehendFlywheelArn, filter: Option[FlywheelIterationFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListFlywheelIterationHistoryRequest extends ShapeTag.Companion[ListFlywheelIterationHistoryRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListFlywheelIterationHistoryRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: ComprehendFlywheelArn, filter: Option[FlywheelIterationFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListFlywheelIterationHistoryRequest = ListFlywheelIterationHistoryRequest(flywheelArn, filter, nextToken, maxResults)

  implicit val schema: Schema[ListFlywheelIterationHistoryRequest] = struct(
    ComprehendFlywheelArn.schema.required[ListFlywheelIterationHistoryRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The ARN of the flywheel.</p>")),
    FlywheelIterationFilter.schema.optional[ListFlywheelIterationHistoryRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filter the flywheel iteration history based on creation time.</p>")),
    string.optional[ListFlywheelIterationHistoryRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Next token</p>")),
    MaxResultsInteger.schema.optional[ListFlywheelIterationHistoryRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>Maximum number of iteration history results to return</p>")),
  )(make).withId(id).addHints(hints)
}
