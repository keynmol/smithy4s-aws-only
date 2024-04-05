package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EventsDetectionJobProperties
  *   <p>An object that contains the properties associated with an event detection job.</p>
  */
final case class DescribeEventsDetectionJobResponse(eventsDetectionJobProperties: Option[EventsDetectionJobProperties] = None)

object DescribeEventsDetectionJobResponse extends ShapeTag.Companion[DescribeEventsDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEventsDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(eventsDetectionJobProperties: Option[EventsDetectionJobProperties]): DescribeEventsDetectionJobResponse = DescribeEventsDetectionJobResponse(eventsDetectionJobProperties)

  implicit val schema: Schema[DescribeEventsDetectionJobResponse] = struct(
    EventsDetectionJobProperties.schema.optional[DescribeEventsDetectionJobResponse]("EventsDetectionJobProperties", _.eventsDetectionJobProperties).addHints(smithy.api.Documentation("<p>An object that contains the properties associated with an event detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
