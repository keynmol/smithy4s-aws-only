package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param EntityRecognizerArn
  *   <p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>
  */
final case class DescribeEntityRecognizerRequest(entityRecognizerArn: EntityRecognizerArn)

object DescribeEntityRecognizerRequest extends ShapeTag.Companion[DescribeEntityRecognizerRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEntityRecognizerRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerArn: EntityRecognizerArn): DescribeEntityRecognizerRequest = DescribeEntityRecognizerRequest(entityRecognizerArn)

  implicit val schema: Schema[DescribeEntityRecognizerRequest] = struct(
    EntityRecognizerArn.schema.required[DescribeEntityRecognizerRequest]("EntityRecognizerArn", _.entityRecognizerArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the entity recognizer.</p>")),
  )(make).withId(id).addHints(hints)
}
