package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Smithy4sThrowable
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The KMS customer managed key (CMK) entered cannot be validated. Verify the key and
  *       re-enter it.</p>
  */
final case class KmsKeyValidationException(message: Option[String] = None) extends Smithy4sThrowable {
  override def getMessage(): String = message.orNull
}

object KmsKeyValidationException extends ShapeTag.Companion[KmsKeyValidationException] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "KmsKeyValidationException")

  val hints: Hints = Hints(
    smithy.api.Error.CLIENT.widen,
    smithy.api.Documentation("<p>The KMS customer managed key (CMK) entered cannot be validated. Verify the key and\n      re-enter it.</p>"),
    smithy.api.HttpError(400),
  ).lazily

  // constructor using the original order from the spec
  private def make(message: Option[String]): KmsKeyValidationException = KmsKeyValidationException(message)

  implicit val schema: Schema[KmsKeyValidationException] = struct(
    string.optional[KmsKeyValidationException]("Message", _.message),
  )(make).withId(id).addHints(hints)
}
