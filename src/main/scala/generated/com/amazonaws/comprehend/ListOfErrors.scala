package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Text extraction encountered one or more page-level errors in the input document.</p>
  *            <p>The <code>ErrorCode</code> contains one of the following values:</p>
  *            <ul>
  *               <li>
  *                  <p>TEXTRACT_BAD_PAGE - Amazon Textract cannot read the page. For more information
  *             about page limits in Amazon Textract, see <a href="https://docs.aws.amazon.com/textract/latest/dg/limits-document.html">
  *               Page Quotas in Amazon Textract</a>.</p>
  *               </li>
  *               <li>
  *                  <p>TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED - The number of requests exceeded your throughput limit.
  *             For more information about throughput quotas in Amazon Textract, see <a href="https://docs.aws.amazon.com/textract/latest/dg/limits-quotas-explained.html">
  *               Default quotas in Amazon Textract</a>.</p>
  *               </li>
  *               <li>
  *                  <p>PAGE_CHARACTERS_EXCEEDED - Too many text characters on the page (10,000 characters maximum).</p>
  *               </li>
  *               <li>
  *                  <p>PAGE_SIZE_EXCEEDED - The maximum page size is 10 MB.</p>
  *               </li>
  *               <li>
  *                  <p>INTERNAL_SERVER_ERROR - The request encountered a service issue. Try the API request again.</p>
  *               </li>
  *            </ul>
  */
object ListOfErrors extends Newtype[List[ErrorsListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfErrors")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[ErrorsListItem]] = list(ErrorsListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfErrors] = bijection(underlyingSchema, asBijection)
}
