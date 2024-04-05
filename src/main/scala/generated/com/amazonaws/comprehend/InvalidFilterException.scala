package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The filter specified for the operation is invalid. Specify a different
  *       filter.</p>
  */
final case class InvalidFilterException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object InvalidFilterException extends ShapeTag.Companion[InvalidFilterException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "InvalidFilterException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The filter specified for the operation is invalid. Specify a different\n      filter.</p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): InvalidFilterException = InvalidFilterException(message)

  implicit val schema: Schema[InvalidFilterException] = struct(
    string.optional[InvalidFilterException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
