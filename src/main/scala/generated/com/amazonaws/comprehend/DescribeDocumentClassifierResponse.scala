package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DocumentClassifierProperties
  *   <p>An object that contains the properties associated with a document classifier.</p>
  */
final case class DescribeDocumentClassifierResponse(documentClassifierProperties: Option[DocumentClassifierProperties] = None)

object DescribeDocumentClassifierResponse extends ShapeTag.Companion[DescribeDocumentClassifierResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDocumentClassifierResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierProperties: Option[DocumentClassifierProperties]): DescribeDocumentClassifierResponse = DescribeDocumentClassifierResponse(documentClassifierProperties)

  implicit val schema: Schema[DescribeDocumentClassifierResponse] = struct(
    DocumentClassifierProperties.schema.optional[DescribeDocumentClassifierResponse]("DocumentClassifierProperties", _.documentClassifierProperties).addHints(smithy.api.Documentation("<p>An object that contains the properties associated with a document classifier.</p>")),
  )(make).withId(id).addHints(hints)
}
