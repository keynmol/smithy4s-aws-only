package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param KeyPhrasesDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListKeyPhrasesDetectionJobsResponse(keyPhrasesDetectionJobPropertiesList: Option[List[KeyPhrasesDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListKeyPhrasesDetectionJobsResponse extends ShapeTag.Companion[ListKeyPhrasesDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListKeyPhrasesDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(keyPhrasesDetectionJobPropertiesList: Option[List[KeyPhrasesDetectionJobProperties]], nextToken: Option[String]): ListKeyPhrasesDetectionJobsResponse = ListKeyPhrasesDetectionJobsResponse(keyPhrasesDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListKeyPhrasesDetectionJobsResponse] = struct(
    KeyPhrasesDetectionJobPropertiesList.underlyingSchema.optional[ListKeyPhrasesDetectionJobsResponse]("KeyPhrasesDetectionJobPropertiesList", _.keyPhrasesDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListKeyPhrasesDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
