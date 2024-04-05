package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param PiiEntitiesDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListPiiEntitiesDetectionJobsResponse(piiEntitiesDetectionJobPropertiesList: Option[List[PiiEntitiesDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListPiiEntitiesDetectionJobsResponse extends ShapeTag.Companion[ListPiiEntitiesDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListPiiEntitiesDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(piiEntitiesDetectionJobPropertiesList: Option[List[PiiEntitiesDetectionJobProperties]], nextToken: Option[String]): ListPiiEntitiesDetectionJobsResponse = ListPiiEntitiesDetectionJobsResponse(piiEntitiesDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListPiiEntitiesDetectionJobsResponse] = struct(
    PiiEntitiesDetectionJobPropertiesList.underlyingSchema.optional[ListPiiEntitiesDetectionJobsResponse]("PiiEntitiesDetectionJobPropertiesList", _.piiEntitiesDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListPiiEntitiesDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
