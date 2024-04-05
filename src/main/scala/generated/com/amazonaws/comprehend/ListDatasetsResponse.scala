package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param DatasetPropertiesList
  *   <p>The dataset properties list.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListDatasetsResponse(datasetPropertiesList: Option[List[DatasetProperties]] = None, nextToken: Option[String] = None)

object ListDatasetsResponse extends ShapeTag.Companion[ListDatasetsResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListDatasetsResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(datasetPropertiesList: Option[List[DatasetProperties]], nextToken: Option[String]): ListDatasetsResponse = ListDatasetsResponse(datasetPropertiesList, nextToken)

  implicit val schema: Schema[ListDatasetsResponse] = struct(
    DatasetPropertiesList.underlyingSchema.optional[ListDatasetsResponse]("DatasetPropertiesList", _.datasetPropertiesList).addHints(smithy.api.Documentation("<p>The dataset properties list.</p>")),
    string.optional[ListDatasetsResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
