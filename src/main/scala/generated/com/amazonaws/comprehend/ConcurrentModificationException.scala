package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Concurrent modification of the tags associated with an Amazon Comprehend resource is not
  *       supported. </p>
  */
final case class ConcurrentModificationException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object ConcurrentModificationException extends ShapeTag.Companion[ConcurrentModificationException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ConcurrentModificationException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>Concurrent modification of the tags associated with an Amazon Comprehend resource is not\n      supported. </p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): ConcurrentModificationException = ConcurrentModificationException(message)

  implicit val schema: Schema[ConcurrentModificationException] = struct(
    string.optional[ConcurrentModificationException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
