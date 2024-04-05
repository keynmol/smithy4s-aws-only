package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param DocumentClassificationJobPropertiesList
  *   <p>A list containing the properties of each job returned.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListDocumentClassificationJobsResponse(documentClassificationJobPropertiesList: Option[List[DocumentClassificationJobProperties]] = None, nextToken: Option[String] = None)

object ListDocumentClassificationJobsResponse extends ShapeTag.Companion[ListDocumentClassificationJobsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDocumentClassificationJobsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassificationJobPropertiesList: Option[List[DocumentClassificationJobProperties]], nextToken: Option[String]): ListDocumentClassificationJobsResponse = ListDocumentClassificationJobsResponse(documentClassificationJobPropertiesList, nextToken)

  implicit val schema: Schema[ListDocumentClassificationJobsResponse] = struct(
    DocumentClassificationJobPropertiesList.underlyingSchema.optional[ListDocumentClassificationJobsResponse]("DocumentClassificationJobPropertiesList", _.documentClassificationJobPropertiesList).addHints(smithy.api.Documentation("<p>A list containing the properties of each job returned.</p>")),
    string.optional[ListDocumentClassificationJobsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
