package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param SentimentDetectionJobPropertiesList
  *   <p>A list containing the properties of each job that is returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListSentimentDetectionJobsResponse(sentimentDetectionJobPropertiesList: Option[List[SentimentDetectionJobProperties]] = None, nextToken: Option[String] = None)

object ListSentimentDetectionJobsResponse extends ShapeTag.Companion[ListSentimentDetectionJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListSentimentDetectionJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(sentimentDetectionJobPropertiesList: Option[List[SentimentDetectionJobProperties]], nextToken: Option[String]): ListSentimentDetectionJobsResponse = ListSentimentDetectionJobsResponse(sentimentDetectionJobPropertiesList, nextToken)

  implicit val schema: Schema[ListSentimentDetectionJobsResponse] = struct(
    SentimentDetectionJobPropertiesList.underlyingSchema.optional[ListSentimentDetectionJobsResponse]("SentimentDetectionJobPropertiesList", _.sentimentDetectionJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job that is returned.</p>")),
    string.optional[ListSentimentDetectionJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
