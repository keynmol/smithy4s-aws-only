package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EntityRecognizerProperties
  *   <p>Describes information associated with an entity recognizer.</p>
  */
final case class DescribeEntityRecognizerResponse(entityRecognizerProperties: Option[EntityRecognizerProperties] = None)

object DescribeEntityRecognizerResponse extends ShapeTag.Companion[DescribeEntityRecognizerResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEntityRecognizerResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerProperties: Option[EntityRecognizerProperties]): DescribeEntityRecognizerResponse = DescribeEntityRecognizerResponse(entityRecognizerProperties)

  implicit val schema: Schema[DescribeEntityRecognizerResponse] = struct(
    EntityRecognizerProperties.schema.optional[DescribeEntityRecognizerResponse]("EntityRecognizerProperties", _.entityRecognizerProperties).addHints(smithy.api.Documentation("<p>Describes information associated with an entity recognizer.</p>")),
  )(make).withId(id).addHints(hints)
}
