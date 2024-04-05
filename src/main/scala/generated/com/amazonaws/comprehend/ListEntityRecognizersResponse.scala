package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param EntityRecognizerPropertiesList
  *   <p>The list of properties of an entity recognizer.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListEntityRecognizersResponse(entityRecognizerPropertiesList: Option[List[EntityRecognizerProperties]] = None, nextToken: Option[String] = None)

object ListEntityRecognizersResponse extends ShapeTag.Companion[ListEntityRecognizersResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEntityRecognizersResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerPropertiesList: Option[List[EntityRecognizerProperties]], nextToken: Option[String]): ListEntityRecognizersResponse = ListEntityRecognizersResponse(entityRecognizerPropertiesList, nextToken)

  implicit val schema: Schema[ListEntityRecognizersResponse] = struct(
    EntityRecognizerPropertiesList.underlyingSchema.optional[ListEntityRecognizersResponse]("EntityRecognizerPropertiesList", _.entityRecognizerPropertiesList).addHints(smithy.api.Documentation("<p>The list of properties of an entity recognizer.</p>")),
    string.optional[ListEntityRecognizersResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
