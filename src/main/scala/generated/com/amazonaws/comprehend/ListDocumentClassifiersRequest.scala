package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param Filter
  *   <p>Filters the jobs that are returned. You can filter jobs on their name, status, or the date
  *         and time that they were submitted. You can only set one filter at a time.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p>The maximum number of results to return in each page. The default is 100.</p>
  */
final case class ListDocumentClassifiersRequest(filter: Option[DocumentClassifierFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListDocumentClassifiersRequest extends ShapeTag.Companion[ListDocumentClassifiersRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDocumentClassifiersRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[DocumentClassifierFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListDocumentClassifiersRequest = ListDocumentClassifiersRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListDocumentClassifiersRequest] = struct(
    DocumentClassifierFilter.schema.optional[ListDocumentClassifiersRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the jobs that are returned. You can filter jobs on their name, status, or the date\n      and time that they were submitted. You can only set one filter at a time.</p>")),
    string.optional[ListDocumentClassifiersRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListDocumentClassifiersRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>The maximum number of results to return in each page. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
