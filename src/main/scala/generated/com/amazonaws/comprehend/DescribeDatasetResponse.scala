package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DatasetProperties
  *   <p>The dataset properties.</p>
  */
final case class DescribeDatasetResponse(datasetProperties: Option[DatasetProperties] = None)

object DescribeDatasetResponse extends ShapeTag.Companion[DescribeDatasetResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDatasetResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(datasetProperties: Option[DatasetProperties]): DescribeDatasetResponse = DescribeDatasetResponse(datasetProperties)

  implicit val schema: Schema[DescribeDatasetResponse] = struct(
    DatasetProperties.schema.optional[DescribeDatasetResponse]("DatasetProperties", _.datasetProperties).addHints(smithy.api.Documentation("<p>The dataset properties.</p>")),
  )(make).withId(id).addHints(hints)
}
