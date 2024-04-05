package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param EventsDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListEventsDetectionJobsResponse(eventsDetectionJobPropertiesList: Option[List[EventsDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListEventsDetectionJobsResponse extends ShapeTag.Companion[ListEventsDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEventsDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(eventsDetectionJobPropertiesList: Option[List[EventsDetectionJobProperties]], nextToken: Option[String]): ListEventsDetectionJobsResponse = ListEventsDetectionJobsResponse(eventsDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListEventsDetectionJobsResponse] = struct(
    EventsDetectionJobPropertiesList.underlyingSchema.optional[ListEventsDetectionJobsResponse]("EventsDetectionJobPropertiesList", _.eventsDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListEventsDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
