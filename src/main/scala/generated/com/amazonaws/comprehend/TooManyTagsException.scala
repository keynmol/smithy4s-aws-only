package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The request contains more tags than can be associated with a resource (50 tags per
  *       resource). The maximum number of tags includes both existing tags and those included in your
  *       current request. </p>
  */
final case class TooManyTagsException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object TooManyTagsException extends ShapeTag.Companion[TooManyTagsException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TooManyTagsException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The request contains more tags than can be associated with a resource (50 tags per\n      resource). The maximum number of tags includes both existing tags and those included in your\n      current request. </p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): TooManyTagsException = TooManyTagsException(message)

  implicit val schema: Schema[TooManyTagsException] = struct(
    string.optional[TooManyTagsException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
