package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResultList
  *   <p>A list of  objects containing the
  *         results of the operation. The results are sorted in ascending order by the <code>Index</code>
  *         field and match the order of the documents in the input list. If all of the documents contain
  *         an error, the <code>ResultList</code> is empty.</p>
  * @param ErrorList
  *   <p>A list containing one  object for each document that
  *         contained an error. The results are sorted in ascending order by the <code>Index</code> field
  *         and match the order of the documents in the input list. If there are no errors in the batch,
  *         the <code>ErrorList</code> is empty.</p>
  */
final case class BatchDetectSyntaxResponse(resultList: List[BatchDetectSyntaxItemResult], errorList: List[BatchItemError])

object BatchDetectSyntaxResponse extends ShapeTag.Companion[BatchDetectSyntaxResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectSyntaxResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resultList: List[BatchDetectSyntaxItemResult], errorList: List[BatchItemError]): BatchDetectSyntaxResponse = BatchDetectSyntaxResponse(resultList, errorList)

  implicit val schema: Schema[BatchDetectSyntaxResponse] = struct(
    ListOfDetectSyntaxResult.underlyingSchema.required[BatchDetectSyntaxResponse]("ResultList", _.resultList).addHints(smithy.api.Documentation("<p>A list of  objects containing the\n      results of the operation. The results are sorted in ascending order by the <code>Index</code>\n      field and match the order of the documents in the input list. If all of the documents contain\n      an error, the <code>ResultList</code> is empty.</p>")),
    BatchItemErrorList.underlyingSchema.required[BatchDetectSyntaxResponse]("ErrorList", _.errorList).addHints(smithy.api.Documentation("<p>A list containing one  object for each document that\n      contained an error. The results are sorted in ascending order by the <code>Index</code> field\n      and match the order of the documents in the input list. If there are no errors in the batch,\n      the <code>ErrorList</code> is empty.</p>")),
  )(make).withId(id).addHints(hints)
}
