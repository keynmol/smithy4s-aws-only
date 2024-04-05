package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EntityRecognizerArn
  *   <p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>
  */
final case class CreateEntityRecognizerResponse(entityRecognizerArn: Option[EntityRecognizerArn] = None)

object CreateEntityRecognizerResponse extends ShapeTag.Companion[CreateEntityRecognizerResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateEntityRecognizerResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerArn: Option[EntityRecognizerArn]): CreateEntityRecognizerResponse = CreateEntityRecognizerResponse(entityRecognizerArn)

  implicit val schema: Schema[CreateEntityRecognizerResponse] = struct(
    EntityRecognizerArn.schema.optional[CreateEntityRecognizerResponse]("EntityRecognizerArn", _.entityRecognizerArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>")),
  )(make).withId(id).addHints(hints)
}
