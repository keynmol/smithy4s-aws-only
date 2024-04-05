package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DatasetArn
  *   <p>The ARN of the dataset.</p>
  */
final case class DescribeDatasetRequest(datasetArn: ComprehendDatasetArn)

object DescribeDatasetRequest extends ShapeTag.Companion[DescribeDatasetRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDatasetRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(datasetArn: ComprehendDatasetArn): DescribeDatasetRequest = DescribeDatasetRequest(datasetArn)

  implicit val schema: Schema[DescribeDatasetRequest] = struct(
    ComprehendDatasetArn.schema.required[DescribeDatasetRequest]("DatasetArn", _.datasetArn).addHints(smithy.api.Documentation("<p>The ARN of the dataset.</p>")),
  )(make).withId(id).addHints(hints)
}
