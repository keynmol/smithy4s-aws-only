package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param EntitiesDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListEntitiesDetectionJobsResponse(entitiesDetectionJobPropertiesList: Option[List[EntitiesDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListEntitiesDetectionJobsResponse extends ShapeTag.Companion[ListEntitiesDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEntitiesDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entitiesDetectionJobPropertiesList: Option[List[EntitiesDetectionJobProperties]], nextToken: Option[String]): ListEntitiesDetectionJobsResponse = ListEntitiesDetectionJobsResponse(entitiesDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListEntitiesDetectionJobsResponse] = struct(
    EntitiesDetectionJobPropertiesList.underlyingSchema.optional[ListEntitiesDetectionJobsResponse]("EntitiesDetectionJobPropertiesList", _.entitiesDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListEntitiesDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
