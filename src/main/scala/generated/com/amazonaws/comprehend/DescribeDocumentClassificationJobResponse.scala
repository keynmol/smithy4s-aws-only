package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DocumentClassificationJobProperties
  *   <p>An object that describes the properties associated with the document classification
  *         job.</p>
  */
final case class DescribeDocumentClassificationJobResponse(documentClassificationJobProperties: Option[DocumentClassificationJobProperties] = None)

object DescribeDocumentClassificationJobResponse extends ShapeTag.Companion[DescribeDocumentClassificationJobResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeDocumentClassificationJobResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassificationJobProperties: Option[DocumentClassificationJobProperties]): DescribeDocumentClassificationJobResponse = DescribeDocumentClassificationJobResponse(documentClassificationJobProperties)

  implicit val schema: Schema[DescribeDocumentClassificationJobResponse] = struct(
    DocumentClassificationJobProperties.schema.optional[DescribeDocumentClassificationJobResponse]("DocumentClassificationJobProperties", _.documentClassificationJobProperties).addHints(smithy.api.Documentation("<p>An object that describes the properties associated with the document classification\n      job.</p>")),
  )(make).withId(id).addHints(hints)
}
