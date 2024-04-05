package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param EntityRecognizerSummariesList
  *   <p>The list entity recognizer summaries.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  */
final case class ListEntityRecognizerSummariesResponse(entityRecognizerSummariesList: Option[List[EntityRecognizerSummary]] = None, nextToken: Option[String] = None)

object ListEntityRecognizerSummariesResponse extends ShapeTag.Companion[ListEntityRecognizerSummariesResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEntityRecognizerSummariesResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityRecognizerSummariesList: Option[List[EntityRecognizerSummary]], nextToken: Option[String]): ListEntityRecognizerSummariesResponse = ListEntityRecognizerSummariesResponse(entityRecognizerSummariesList, nextToken)

  implicit val schema: Schema[ListEntityRecognizerSummariesResponse] = struct(
    EntityRecognizerSummariesList.underlyingSchema.optional[ListEntityRecognizerSummariesResponse]("EntityRecognizerSummariesList", _.entityRecognizerSummariesList).addHints(smithy.api.Documentation("<p>The list entity recognizer summaries.</p>")),
    string.optional[ListEntityRecognizerSummariesResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
  )(make).withId(id).addHints(hints)
}
