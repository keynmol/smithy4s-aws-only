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
final case class ListPiiEntitiesDetectionJobsRequest(filter: Option[PiiEntitiesDetectionJobFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListPiiEntitiesDetectionJobsRequest extends ShapeTag.Companion[ListPiiEntitiesDetectionJobsRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListPiiEntitiesDetectionJobsRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[PiiEntitiesDetectionJobFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListPiiEntitiesDetectionJobsRequest = ListPiiEntitiesDetectionJobsRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListPiiEntitiesDetectionJobsRequest] = struct(
    PiiEntitiesDetectionJobFilter.schema.optional[ListPiiEntitiesDetectionJobsRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the jobs that are returned. You can filter jobs on their name, status, or the date\n      and time that they were submitted. You can only set one filter at a time.</p>")),
    string.optional[ListPiiEntitiesDetectionJobsRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListPiiEntitiesDetectionJobsRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p>The maximum number of results to return in each page.</p>")),
  )(make).withId(id).addHints(hints)
}
