package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Text extraction encountered one or more page-level errors in the input document.</p>
  *          <p>The <code>ErrorCode</code> contains one of the following values:</p>
  *          <ul>
  *             <li>
  *                <p>TEXTRACT_BAD_PAGE - Amazon Textract cannot read the page. For more information
  *           about page limits in Amazon Textract, see <a href="https://docs.aws.amazon.com/textract/latest/dg/limits-document.html">
  *             Page Quotas in Amazon Textract</a>.</p>
  *             </li>
  *             <li>
  *                <p>TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED - The number of requests exceeded your throughput limit.
  *           For more information about throughput quotas in Amazon Textract, see <a href="https://docs.aws.amazon.com/textract/latest/dg/limits-quotas-explained.html">
  *             Default quotas in Amazon Textract</a>.</p>
  *             </li>
  *             <li>
  *                <p>PAGE_CHARACTERS_EXCEEDED - Too many text characters on the page (10,000 characters maximum).</p>
  *             </li>
  *             <li>
  *                <p>PAGE_SIZE_EXCEEDED - The maximum page size is 10 MB.</p>
  *             </li>
  *             <li>
  *                <p>INTERNAL_SERVER_ERROR - The request encountered a service issue. Try the API request again.</p>
  *             </li>
  *          </ul>
  * @param Page
  *   <p>Page number where the error occurred.</p>
  * @param ErrorCode
  *   <p>Error code for the cause of the error.</p>
  * @param ErrorMessage
  *   <p>Text message explaining the reason for the error.</p>
  */
final case class ErrorsListItem(page: Option[Int] = None, errorCode: Option[PageBasedErrorCode] = None, errorMessage: Option[String] = None)

object ErrorsListItem extends ShapeTag.Companion[ErrorsListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ErrorsListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Text extraction encountered one or more page-level errors in the input document.</p>\n         <p>The <code>ErrorCode</code> contains one of the following values:</p>\n         <ul>\n            <li>\n               <p>TEXTRACT_BAD_PAGE - Amazon Textract cannot read the page. For more information\n          about page limits in Amazon Textract, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/limits-document.html\">\n            Page Quotas in Amazon Textract</a>.</p>\n            </li>\n            <li>\n               <p>TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED - The number of requests exceeded your throughput limit.\n          For more information about throughput quotas in Amazon Textract, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/limits-quotas-explained.html\">\n            Default quotas in Amazon Textract</a>.</p>\n            </li>\n            <li>\n               <p>PAGE_CHARACTERS_EXCEEDED - Too many text characters on the page (10,000 characters maximum).</p>\n            </li>\n            <li>\n               <p>PAGE_SIZE_EXCEEDED - The maximum page size is 10 MB.</p>\n            </li>\n            <li>\n               <p>INTERNAL_SERVER_ERROR - The request encountered a service issue. Try the API request again.</p>\n            </li>\n         </ul>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(page: Option[Int], errorCode: Option[PageBasedErrorCode], errorMessage: Option[String]): ErrorsListItem = ErrorsListItem(page, errorCode, errorMessage)

  implicit val schema: Schema[ErrorsListItem] = struct(
    int.optional[ErrorsListItem]("Page", _.page).addHints(smithy.api.Documentation("<p>Page number where the error occurred.</p>")),
    PageBasedErrorCode.schema.optional[ErrorsListItem]("ErrorCode", _.errorCode).addHints(smithy.api.Documentation("<p>Error code for the cause of the error.</p>")),
    string.optional[ErrorsListItem]("ErrorMessage", _.errorMessage).addHints(smithy.api.Documentation("<p>Text message explaining the reason for the error.</p>")),
  )(make).withId(id).addHints(hints)
}
