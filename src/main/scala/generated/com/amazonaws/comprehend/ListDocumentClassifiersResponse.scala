package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param DocumentClassifierPropertiesList
  *   <p>A list containing the properties of each job returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListDocumentClassifiersResponse(documentClassifierPropertiesList: Option[List[DocumentClassifierProperties]] = None, nextToken: Option[String] = None)

object ListDocumentClassifiersResponse extends ShapeTag.Companion[ListDocumentClassifiersResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDocumentClassifiersResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierPropertiesList: Option[List[DocumentClassifierProperties]], nextToken: Option[String]): ListDocumentClassifiersResponse = ListDocumentClassifiersResponse(documentClassifierPropertiesList, nextToken)

  implicit val schema: Schema[ListDocumentClassifiersResponse] = struct(
    DocumentClassifierPropertiesList.underlyingSchema.optional[ListDocumentClassifiersResponse]("DocumentClassifierPropertiesList", _.documentClassifierPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job returned.</p>")),
    string.optional[ListDocumentClassifiersResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
