package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param Filter
  *   <p>Filters the jobs that are returned. You can filter jobs on their names, status, or the
  *         date and time that they were submitted. You can only set one filter at a time.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p>The maximum number of results to return in each page. The default is 100.</p>
  */
final case class ListDocumentClassificationJobsRequest(filter: Option[DocumentClassificationJobFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListDocumentClassificationJobsRequest extends ShapeTag.Companion[ListDocumentClassificationJobsRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDocumentClassificationJobsRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[DocumentClassificationJobFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListDocumentClassificationJobsRequest = ListDocumentClassificationJobsRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListDocumentClassificationJobsRequest] = struct(
    DocumentClassificationJobFilter.schema.optional[ListDocumentClassificationJobsRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the jobs that are returned. You can filter jobs on their names, status, or the\n      date and time that they were submitted. You can only set one filter at a time.</p>")),
    string.optional[ListDocumentClassificationJobsRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListDocumentClassificationJobsRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>The maximum number of results to return in each page. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
