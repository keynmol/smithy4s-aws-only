package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param DominantLanguageDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListDominantLanguageDetectionJobsResponse(dominantLanguageDetectionJobPropertiesList: Option[List[DominantLanguageDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListDominantLanguageDetectionJobsResponse extends ShapeTag.Companion[ListDominantLanguageDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDominantLanguageDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(dominantLanguageDetectionJobPropertiesList: Option[List[DominantLanguageDetectionJobProperties]], nextToken: Option[String]): ListDominantLanguageDetectionJobsResponse = ListDominantLanguageDetectionJobsResponse(dominantLanguageDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListDominantLanguageDetectionJobsResponse] = struct(
    DominantLanguageDetectionJobPropertiesList.underlyingSchema.optional[ListDominantLanguageDetectionJobsResponse]("DominantLanguageDetectionJobPropertiesList", _.dominantLanguageDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListDominantLanguageDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
