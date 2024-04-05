package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param DocumentClassifierSummariesList
  *   <p>The list of summaries of document classifiers.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListDocumentClassifierSummariesResponse(documentClassifierSummariesList: Option[List[DocumentClassifierSummary]] = None, nextToken: Option[String] = None)

object ListDocumentClassifierSummariesResponse extends ShapeTag.Companion[ListDocumentClassifierSummariesResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDocumentClassifierSummariesResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierSummariesList: Option[List[DocumentClassifierSummary]], nextToken: Option[String]): ListDocumentClassifierSummariesResponse = ListDocumentClassifierSummariesResponse(documentClassifierSummariesList, nextToken)

  implicit val schema: Schema[ListDocumentClassifierSummariesResponse] = struct(
    DocumentClassifierSummariesList.underlyingSchema.optional[ListDocumentClassifierSummariesResponse]("DocumentClassifierSummariesList", _.documentClassifierSummariesList).addHints(smithy.api.Documentation("<p>The list of summaries of document classifiers.</p>")),
    string.optional[ListDocumentClassifierSummariesResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
