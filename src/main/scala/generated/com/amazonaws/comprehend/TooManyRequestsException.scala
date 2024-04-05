package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The number of requests exceeds the limit. Resubmit your request later.</p> */
final case class TooManyRequestsException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object TooManyRequestsException extends ShapeTag.Companion[TooManyRequestsException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TooManyRequestsException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The number of requests exceeds the limit. Resubmit your request later.</p>"),
    smithy.api.HttpError(429),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): TooManyRequestsException = TooManyRequestsException(message)

  implicit val schema: Schema[TooManyRequestsException] = struct(
    string.optional[TooManyRequestsException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
