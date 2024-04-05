package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param SentimentDetectionJobProperties
  *   <p>An object that contains the properties associated with a sentiment detection job.</p>
  */
final case class DescribeSentimentDetectionJobResponse(sentimentDetectionJobProperties: Option[SentimentDetectionJobProperties] = None)

object DescribeSentimentDetectionJobResponse extends ShapeTag.Companion[DescribeSentimentDetectionJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeSentimentDetectionJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(sentimentDetectionJobProperties: Option[SentimentDetectionJobProperties]): DescribeSentimentDetectionJobResponse = DescribeSentimentDetectionJobResponse(sentimentDetectionJobProperties)

  implicit val schema: Schema[DescribeSentimentDetectionJobResponse] = struct(
    SentimentDetectionJobProperties.schema.optional[DescribeSentimentDetectionJobResponse]("SentimentDetectionJobProperties", _.sentimentDetectionJobProperties).addHints(smithy.api.Documentation("<p>An object that contains the properties associated with a sentiment detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
