package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.string

object EntityRecognizerEndpointArn extends Newtype[String] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerEndpointArn")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[String] = string.withId(id).addHints(hints).validated(smithy.api.Length(min = Some(0L), max = Some(256L))).validated(smithy.api.Pattern(s"^arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*$$"))
  implicit val schema: Schema[EntityRecognizerEndpointArn] = bijection(underlyingSchema, asBijection)
}
