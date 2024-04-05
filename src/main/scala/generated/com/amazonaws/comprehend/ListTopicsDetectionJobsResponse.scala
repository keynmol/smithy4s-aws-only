package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param TopicsDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListTopicsDetectionJobsResponse(topicsDetectionJobPropertiesList: Option[List[TopicsDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListTopicsDetectionJobsResponse extends ShapeTag.Companion[ListTopicsDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListTopicsDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(topicsDetectionJobPropertiesList: Option[List[TopicsDetectionJobProperties]], nextToken: Option[String]): ListTopicsDetectionJobsResponse = ListTopicsDetectionJobsResponse(topicsDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListTopicsDetectionJobsResponse] = struct(
    TopicsDetectionJobPropertiesList.underlyingSchema.optional[ListTopicsDetectionJobsResponse]("TopicsDetectionJobPropertiesList", _.topicsDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListTopicsDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
