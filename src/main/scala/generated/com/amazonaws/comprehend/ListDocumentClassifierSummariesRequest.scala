package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p>The maximum number of results to return on each page. The default is 100.</p>
  */
final case class ListDocumentClassifierSummariesRequest(nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListDocumentClassifierSummariesRequest extends ShapeTag.Companion[ListDocumentClassifierSummariesRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDocumentClassifierSummariesRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListDocumentClassifierSummariesRequest = ListDocumentClassifierSummariesRequest(nextToken, maxResults)

  implicit val schema: Schema[ListDocumentClassifierSummariesRequest] = struct(
    string.optional[ListDocumentClassifierSummariesRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListDocumentClassifierSummariesRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>The maximum number of results to return on each page. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
