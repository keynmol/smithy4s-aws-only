package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DocumentClassifierArn
  *   <p>The Amazon Resource Name (ARN) that identifies the document classifier.</p>
  */
final case class CreateDocumentClassifierResponse(documentClassifierArn: Option[DocumentClassifierArn] = None)

object CreateDocumentClassifierResponse extends ShapeTag.Companion[CreateDocumentClassifierResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateDocumentClassifierResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierArn: Option[DocumentClassifierArn]): CreateDocumentClassifierResponse = CreateDocumentClassifierResponse(documentClassifierArn)

  implicit val schema: Schema[CreateDocumentClassifierResponse] = struct(
    DocumentClassifierArn.schema.optional[CreateDocumentClassifierResponse]("DocumentClassifierArn", _.documentClassifierArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the document classifier.</p>")),
  )(make).withId(id).addHints(hints)
}
