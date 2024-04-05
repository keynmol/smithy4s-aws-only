package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EntityRecognizerArn
  *   <p>The Amazon Resource Name (ARN) that identifies the entity recognizer currently being
  *         trained.</p>
  */
final case class StopTrainingEntityRecognizerRequest(entityRecognizerArn: EntityRecognizerArn)

object StopTrainingEntityRecognizerRequest extends ShapeTag.Companion[StopTrainingEntityRecognizerRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopTrainingEntityRecognizerRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerArn: EntityRecognizerArn): StopTrainingEntityRecognizerRequest = StopTrainingEntityRecognizerRequest(entityRecognizerArn)

  implicit val schema: Schema[StopTrainingEntityRecognizerRequest] = struct(
    EntityRecognizerArn.schema.required[StopTrainingEntityRecognizerRequest]("EntityRecognizerArn", _.entityRecognizerArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the entity recognizer currently being\n      trained.</p>")),
  )(make).withId(id).addHints(hints)
}
