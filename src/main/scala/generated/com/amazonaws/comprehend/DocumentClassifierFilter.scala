package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information for filtering a list of document classifiers. You can only specify
  *       one filtering parameter in a request. For more information, see the
  *         <code>ListDocumentClassifiers</code> operation.</p>
  * @param Status
  *   <p>Filters the list of classifiers based on status.</p>
  * @param DocumentClassifierName
  *   <p>The name that you assigned to the document classifier</p>
  * @param SubmitTimeBefore
  *   <p>Filters the list of classifiers based on the time that the classifier was submitted for
  *         processing. Returns only classifiers submitted before the specified time. Classifiers are
  *         returned in ascending order, oldest to newest.</p>
  * @param SubmitTimeAfter
  *   <p>Filters the list of classifiers based on the time that the classifier was submitted for
  *         processing. Returns only classifiers submitted after the specified time. Classifiers are
  *         returned in descending order, newest to oldest.</p>
  */
final case class DocumentClassifierFilter(status: Option[ModelStatus] = None, documentClassifierName: Option[ComprehendArnName] = None, submitTimeBefore: Option[Timestamp] = None, submitTimeAfter: Option[Timestamp] = None)

object DocumentClassifierFilter extends ShapeTag.Companion[DocumentClassifierFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information for filtering a list of document classifiers. You can only specify\n      one filtering parameter in a request. For more information, see the\n        <code>ListDocumentClassifiers</code> operation.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(status: Option[ModelStatus], documentClassifierName: Option[ComprehendArnName], submitTimeBefore: Option[Timestamp], submitTimeAfter: Option[Timestamp]): DocumentClassifierFilter = DocumentClassifierFilter(status, documentClassifierName, submitTimeBefore, submitTimeAfter)

  implicit val schema: Schema[DocumentClassifierFilter] = struct(
    ModelStatus.schema.optional[DocumentClassifierFilter]("Status", _.status).addHints(smithy.api.Documentation("<p>Filters the list of classifiers based on status.</p>")),
    ComprehendArnName.schema.optional[DocumentClassifierFilter]("DocumentClassifierName", _.documentClassifierName).addHints(smithy.api.Documentation("<p>The name that you assigned to the document classifier</p>")),
    timestamp.optional[DocumentClassifierFilter]("SubmitTimeBefore", _.submitTimeBefore).addHints(smithy.api.Documentation("<p>Filters the list of classifiers based on the time that the classifier was submitted for\n      processing. Returns only classifiers submitted before the specified time. Classifiers are\n      returned in ascending order, oldest to newest.</p>")),
    timestamp.optional[DocumentClassifierFilter]("SubmitTimeAfter", _.submitTimeAfter).addHints(smithy.api.Documentation("<p>Filters the list of classifiers based on the time that the classifier was submitted for\n      processing. Returns only classifiers submitted after the specified time. Classifiers are\n      returned in descending order, newest to oldest.</p>")),
  )(make).withId(id).addHints(hints)
}
