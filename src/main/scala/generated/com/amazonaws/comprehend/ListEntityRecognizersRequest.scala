package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param Filter
  *   <p>Filters the list of entities returned. You can filter on <code>Status</code>,
  *           <code>SubmitTimeBefore</code>, or <code>SubmitTimeAfter</code>. You can only set one filter
  *         at a time.</p>
  * @param NextToken
  *   <p>Identifies the next page of results to return.</p>
  * @param MaxResults
  *   <p> The maximum number of results to return on each page. The default is 100.</p>
  */
final case class ListEntityRecognizersRequest(filter: Option[EntityRecognizerFilter] = None, nextToken: Option[String] = None, maxResults: Option[MaxResultsInteger] = None)

object ListEntityRecognizersRequest extends ShapeTag.Companion[ListEntityRecognizersRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListEntityRecognizersRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(filter: Option[EntityRecognizerFilter], nextToken: Option[String], maxResults: Option[MaxResultsInteger]): ListEntityRecognizersRequest = ListEntityRecognizersRequest(filter, nextToken, maxResults)

  implicit val schema: Schema[ListEntityRecognizersRequest] = struct(
    EntityRecognizerFilter.schema.optional[ListEntityRecognizersRequest]("Filter", _.filter).addHints(smithy.api.Documentation("<p>Filters the list of entities returned. You can filter on <code>Status</code>,\n        <code>SubmitTimeBefore</code>, or <code>SubmitTimeAfter</code>. You can only set one filter\n      at a time.</p>")),
    string.optional[ListEntityRecognizersRequest]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Identifies the next page of results to return.</p>")),
    MaxResultsInteger.schema.optional[ListEntityRecognizersRequest]("MaxResults", _.maxResults).addHints(smithy.api.Documentation("<p> The maximum number of results to return on each page. The default is 100.</p>")),
  )(make).withId(id).addHints(hints)
}
