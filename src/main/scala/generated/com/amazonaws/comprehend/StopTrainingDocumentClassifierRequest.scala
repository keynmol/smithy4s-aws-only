package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DocumentClassifierArn
  *   <p>The Amazon Resource Name (ARN) that identifies the document classifier currently being
  *         trained.</p>
  */
final case class StopTrainingDocumentClassifierRequest(documentClassifierArn: DocumentClassifierArn)

object StopTrainingDocumentClassifierRequest extends ShapeTag.Companion[StopTrainingDocumentClassifierRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StopTrainingDocumentClassifierRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierArn: DocumentClassifierArn): StopTrainingDocumentClassifierRequest = StopTrainingDocumentClassifierRequest(documentClassifierArn)

  implicit val schema: Schema[StopTrainingDocumentClassifierRequest] = struct(
    DocumentClassifierArn.schema.required[StopTrainingDocumentClassifierRequest]("DocumentClassifierArn", _.documentClassifierArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) that identifies the document classifier currently being\n      trained.</p>")),
  )(make).withId(id).addHints(hints)
}
