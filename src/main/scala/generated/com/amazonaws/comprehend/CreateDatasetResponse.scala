package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DatasetArn
  *   <p>The ARN of the dataset.</p>
  */
final case class CreateDatasetResponse(datasetArn: Option[ComprehendDatasetArn] = None)

object CreateDatasetResponse extends ShapeTag.Companion[CreateDatasetResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateDatasetResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(datasetArn: Option[ComprehendDatasetArn]): CreateDatasetResponse = CreateDatasetResponse(datasetArn)

  implicit val schema: Schema[CreateDatasetResponse] = struct(
    ComprehendDatasetArn.schema.optional[CreateDatasetResponse]("DatasetArn", _.datasetArn).addHints(smithy.api.Documentation("<p>The ARN of the dataset.</p>")),
  )(make).withId(id).addHints(hints)
}
