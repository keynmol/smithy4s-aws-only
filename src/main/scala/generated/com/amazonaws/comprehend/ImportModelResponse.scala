package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ModelArn
  *   <p>The Amazon Resource Name (ARN) of the custom model being imported.</p>
  */
final case class ImportModelResponse(modelArn: Option[ComprehendModelArn] = None)

object ImportModelResponse extends ShapeTag.Companion[ImportModelResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ImportModelResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(modelArn: Option[ComprehendModelArn]): ImportModelResponse = ImportModelResponse(modelArn)

  implicit val schema: Schema[ImportModelResponse] = struct(
    ComprehendModelArn.schema.optional[ImportModelResponse]("ModelArn", _.modelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the custom model being imported.</p>")),
  )(make).withId(id).addHints(hints)
}
