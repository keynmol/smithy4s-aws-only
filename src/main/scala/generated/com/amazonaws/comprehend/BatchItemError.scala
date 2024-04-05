package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Describes an error that occurred while processing a document in a batch. The operation
  *       returns on <code>BatchItemError</code> object for each document that contained an
  *       error.</p>
  * @param Index
  *   <p>The zero-based index of the document in the input list.</p>
  * @param ErrorCode
  *   <p>The numeric error code of the error.</p>
  * @param ErrorMessage
  *   <p>A text description of the error.</p>
  */
final case class BatchItemError(index: Option[Int] = None, errorCode: Option[String] = None, errorMessage: Option[String] = None)

object BatchItemError extends ShapeTag.Companion[BatchItemError] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchItemError")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes an error that occurred while processing a document in a batch. The operation\n      returns on <code>BatchItemError</code> object for each document that contained an\n      error.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[Int], errorCode: Option[String], errorMessage: Option[String]): BatchItemError = BatchItemError(index, errorCode, errorMessage)

  implicit val schema: Schema[BatchItemError] = struct(
    int.optional[BatchItemError]("Index", _.index).addHints(smithy.api.Documentation("<p>The zero-based index of the document in the input list.</p>")),
    string.optional[BatchItemError]("ErrorCode", _.errorCode).addHints(smithy.api.Documentation("<p>The numeric error code of the error.</p>")),
    string.optional[BatchItemError]("ErrorMessage", _.errorMessage).addHints(smithy.api.Documentation("<p>A text description of the error.</p>")),
  )(make).withId(id).addHints(hints)
}
