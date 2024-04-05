package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DocumentClassifierArn
  *   <p>The Amazon Resource Name (ARN) that identifies the document classifier. The
  *         <code>CreateDocumentClassifier</code> operation returns this identifier in its response.</p>
  */
final case class DescribeDocumentClassifierRequest(documentClassifierArn: DocumentClassifierArn)

object DescribeDocumentClassifierRequest extends ShapeTag.Companion[DescribeDocumentClassifierRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDocumentClassifierRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierArn: DocumentClassifierArn): DescribeDocumentClassifierRequest = DescribeDocumentClassifierRequest(documentClassifierArn)

  implicit val schema: Schema[DescribeDocumentClassifierRequest] = struct(
    DocumentClassifierArn.schema.required[DescribeDocumentClassifierRequest]("DocumentClassifierArn", _.documentClassifierArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the document classifier. The\n      <code>CreateDocumentClassifier</code> operation returns this identifier in its response.</p>")),
  )(make).withId(id).addHints(hints)
}
