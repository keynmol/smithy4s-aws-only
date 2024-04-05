package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The specified resource name is already in use. Use a different name and try your request
  *       again.</p>
  */
final case class ResourceInUseException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object ResourceInUseException extends ShapeTag.Companion[ResourceInUseException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ResourceInUseException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The specified resource name is already in use. Use a different name and try your request\n      again.</p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): ResourceInUseException = ResourceInUseException(message)

  implicit val schema: Schema[ResourceInUseException] = struct(
    string.optional[ResourceInUseException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
