package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The maximum number of resources per account has been exceeded. Review the resources, and
  *       then try your request again.</p>
  */
final case class ResourceLimitExceededException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object ResourceLimitExceededException extends ShapeTag.Companion[ResourceLimitExceededException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ResourceLimitExceededException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The maximum number of resources per account has been exceeded. Review the resources, and\n      then try your request again.</p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): ResourceLimitExceededException = ResourceLimitExceededException(message)

  implicit val schema: Schema[ResourceLimitExceededException] = struct(
    string.optional[ResourceLimitExceededException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
