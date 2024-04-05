package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DocumentClassifierArn
  *   <p>The Amazon Resource Name (ARN) that identifies the document classifier. </p>
  */
final case class DeleteDocumentClassifierRequest(documentClassifierArn: DocumentClassifierArn)

object DeleteDocumentClassifierRequest extends ShapeTag.Companion[DeleteDocumentClassifierRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteDocumentClassifierRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierArn: DocumentClassifierArn): DeleteDocumentClassifierRequest = DeleteDocumentClassifierRequest(documentClassifierArn)

  implicit val schema: Schema[DeleteDocumentClassifierRequest] = struct(
    DocumentClassifierArn.schema.required[DeleteDocumentClassifierRequest]("DocumentClassifierArn", _.documentClassifierArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the document classifier. </p>")),
  )(make).withId(id).addHints(hints)
}
