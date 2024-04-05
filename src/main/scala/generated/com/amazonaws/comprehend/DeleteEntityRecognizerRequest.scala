package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EntityRecognizerArn
  *   <p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>
  */
final case class DeleteEntityRecognizerRequest(entityRecognizerArn: EntityRecognizerArn)

object DeleteEntityRecognizerRequest extends ShapeTag.Companion[DeleteEntityRecognizerRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteEntityRecognizerRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerArn: EntityRecognizerArn): DeleteEntityRecognizerRequest = DeleteEntityRecognizerRequest(entityRecognizerArn)

  implicit val schema: Schema[DeleteEntityRecognizerRequest] = struct(
    EntityRecognizerArn.schema.required[DeleteEntityRecognizerRequest]("EntityRecognizerArn", _.entityRecognizerArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>")),
  )(make).withId(id).addHints(hints)
}
