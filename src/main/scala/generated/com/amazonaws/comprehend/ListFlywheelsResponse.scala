package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param FlywheelSummaryList
  *   <p>A list of flywheel properties retrieved by the service in response to the request.
  *          </p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListFlywheelsResponse(flywheelSummaryList: Option[List[FlywheelSummary]] = None, nextToken: Option[String] = None)

object ListFlywheelsResponse extends ShapeTag.Companion[ListFlywheelsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListFlywheelsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelSummaryList: Option[List[FlywheelSummary]], nextToken: Option[String]): ListFlywheelsResponse = ListFlywheelsResponse(flywheelSummaryList, nextToken)

  implicit val schema: Schema[ListFlywheelsResponse] = struct(
    FlywheelSummaryList.underlyingSchema.optional[ListFlywheelsResponse]("FlywheelSummaryList", _.flywheelSummaryList).addHints(smithy.api.Documentation("<p>A list of flywheel properties retrieved by the service in response to the request.\n       </p>")),
    string.optional[ListFlywheelsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
