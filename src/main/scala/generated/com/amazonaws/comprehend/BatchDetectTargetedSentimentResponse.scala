package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResultList
  *   <p>A list of objects containing the results of the operation.
  *         The results are sorted in ascending order by the <code>Index</code> field and match the order of the documents in the input list.
  *         If all of the documents contain an error, the <code>ResultList</code> is empty.</p>
  * @param ErrorList
  *   <p>List of errors that the operation can return.</p>
  */
final case class BatchDetectTargetedSentimentResponse(resultList: List[BatchDetectTargetedSentimentItemResult], errorList: List[BatchItemError])

object BatchDetectTargetedSentimentResponse extends ShapeTag.Companion[BatchDetectTargetedSentimentResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectTargetedSentimentResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resultList: List[BatchDetectTargetedSentimentItemResult], errorList: List[BatchItemError]): BatchDetectTargetedSentimentResponse = BatchDetectTargetedSentimentResponse(resultList, errorList)

  implicit val schema: Schema[BatchDetectTargetedSentimentResponse] = struct(
    ListOfDetectTargetedSentimentResult.underlyingSchema.required[BatchDetectTargetedSentimentResponse]("ResultList", _.resultList).addHints(smithy.api.Documentation("<p>A list of objects containing the results of the operation.\n      The results are sorted in ascending order by the <code>Index</code> field and match the order of the documents in the input list.\n      If all of the documents contain an error, the <code>ResultList</code> is empty.</p>")),
    BatchItemErrorList.underlyingSchema.required[BatchDetectTargetedSentimentResponse]("ErrorList", _.errorList).addHints(smithy.api.Documentation("<p>List of errors that the operation can return.</p>")),
  )(make).withId(id).addHints(hints)
}
