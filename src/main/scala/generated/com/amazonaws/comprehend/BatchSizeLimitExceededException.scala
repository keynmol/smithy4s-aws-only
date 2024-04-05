package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The number of documents in the request exceeds the limit of 25. Try your request again
  *       with fewer documents.</p>
  */
final case class BatchSizeLimitExceededException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object BatchSizeLimitExceededException extends ShapeTag.Companion[BatchSizeLimitExceededException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchSizeLimitExceededException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The number of documents in the request exceeds the limit of 25. Try your request again\n      with fewer documents.</p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): BatchSizeLimitExceededException = BatchSizeLimitExceededException(message)

  implicit val schema: Schema[BatchSizeLimitExceededException] = struct(
    string.optional[BatchSizeLimitExceededException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
