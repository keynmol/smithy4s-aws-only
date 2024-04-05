package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param Filter
  *   <p>Filters that jobs that are returned. You can filter jobs on their name, status, or the
  *         date and time that they were submitted. You can only set one filter at a time.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p>The maximum number of results to return in each page. The default is 100.</p>
  */
final case class ListDominantLanguageDetectionJobsRequest(filter: Option[DominantLanguageDetectionJobFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListDominantLanguageDetectionJobsRequest extends ShapeTag.Companion[ListDominantLanguageDetectionJobsRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDominantLanguageDetectionJobsRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[DominantLanguageDetectionJobFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListDominantLanguageDetectionJobsRequest = ListDominantLanguageDetectionJobsRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListDominantLanguageDetectionJobsRequest] = struct(
    DominantLanguageDetectionJobFilter.schema.optional[ListDominantLanguageDetectionJobsRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters that jobs that are returned. You can filter jobs on their name, status, or the\n      date and time that they were submitted. You can only set one filter at a time.</p>")),
    string.optional[ListDominantLanguageDetectionJobsRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListDominantLanguageDetectionJobsRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>The maximum number of results to return in each page. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
