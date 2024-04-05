package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The request contains more tag keys than can be associated with a resource (50 tag keys per
  *       resource).</p>
  */
final case class TooManyTagKeysException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object TooManyTagKeysException extends ShapeTag.Companion[TooManyTagKeysException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TooManyTagKeysException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The request contains more tag keys than can be associated with a resource (50 tag keys per\n      resource).</p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): TooManyTagKeysException = TooManyTagKeysException(message)

  implicit val schema: Schema[TooManyTagKeysException] = struct(
    string.optional[TooManyTagKeysException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
