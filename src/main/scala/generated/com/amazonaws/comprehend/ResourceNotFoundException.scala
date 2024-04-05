package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The specified resource ARN was not found. Check the ARN and try your request again.</p> */
final case class ResourceNotFoundException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object ResourceNotFoundException extends ShapeTag.Companion[ResourceNotFoundException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ResourceNotFoundException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The specified resource ARN was not found. Check the ARN and try your request again.</p>"),
    smithy.api.HttpError(404),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): ResourceNotFoundException = ResourceNotFoundException(message)

  implicit val schema: Schema[ResourceNotFoundException] = struct(
    string.optional[ResourceNotFoundException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
