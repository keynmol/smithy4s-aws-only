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
  *   <p>The maximum number of results to return in each page.</p>
  */
final case class ListEventsDetectionJobsRequest(filter: Option[EventsDetectionJobFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListEventsDetectionJobsRequest extends ShapeTag.Companion[ListEventsDetectionJobsRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEventsDetectionJobsRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[EventsDetectionJobFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListEventsDetectionJobsRequest = ListEventsDetectionJobsRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListEventsDetectionJobsRequest] = struct(
    EventsDetectionJobFilter.schema.optional[ListEventsDetectionJobsRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the jobs that are returned. You can filter jobs on their name, status, or the date\n      and time that they were submitted. You can only set one filter at a time.</p>")),
    string.optional[ListEventsDetectionJobsRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListEventsDetectionJobsRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>The maximum number of results to return in each page.</p>")),
  )(make).withId(id).addHints(hints)
}
