package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The specified job was not found. Check the job ID and try again.</p> */
final case class JobNotFoundException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object JobNotFoundException extends ShapeTag.Companion[JobNotFoundException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "JobNotFoundException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The specified job was not found. Check the job ID and try again.</p>"),
    smithy.api.HttpError(404),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): JobNotFoundException = JobNotFoundException(message)

  implicit val schema: Schema[JobNotFoundException] = struct(
    string.optional[JobNotFoundException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
