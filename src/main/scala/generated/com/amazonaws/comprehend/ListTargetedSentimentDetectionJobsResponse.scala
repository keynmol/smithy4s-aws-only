package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param TargetedSentimentDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListTargetedSentimentDetectionJobsResponse(targetedSentimentDetectionJobPropertiesList: Option[List[TargetedSentimentDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListTargetedSentimentDetectionJobsResponse extends ShapeTag.Companion[ListTargetedSentimentDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListTargetedSentimentDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(targetedSentimentDetectionJobPropertiesList: Option[List[TargetedSentimentDetectionJobProperties]], nextToken: Option[String]): ListTargetedSentimentDetectionJobsResponse = ListTargetedSentimentDetectionJobsResponse(targetedSentimentDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListTargetedSentimentDetectionJobsResponse] = struct(
    TargetedSentimentDetectionJobPropertiesList.underlyingSchema.optional[ListTargetedSentimentDetectionJobsResponse]("TargetedSentimentDetectionJobPropertiesList", _.targetedSentimentDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListTargetedSentimentDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
