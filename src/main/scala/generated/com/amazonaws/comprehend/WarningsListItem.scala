package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>The system identified one of the following warnings while processing the input document:</p>
  *          <ul>
  *             <li>
  *                <p>The document to classify is plain text, but the classifier is a native model.</p>
  *             </li>
  *             <li>
  *                <p>The document to classify is semi-structured, but the classifier is a plain-text model.</p>
  *             </li>
  *          </ul>
  * @param Page
  *   <p>Page number in the input document.</p>
  * @param WarnCode
  *   <p>The type of warning.</p>
  * @param WarnMessage
  *   <p>Text message associated with the warning.</p>
  */
final case class WarningsListItem(page: Option[Int] = None, warnCode: Option[PageBasedWarningCode] = None, warnMessage: Option[String] = None)

object WarningsListItem extends ShapeTag.Companion[WarningsListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "WarningsListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The system identified one of the following warnings while processing the input document:</p>\n         <ul>\n            <li>\n               <p>The document to classify is plain text, but the classifier is a native model.</p>\n            </li>\n            <li>\n               <p>The document to classify is semi-structured, but the classifier is a plain-text model.</p>\n            </li>\n         </ul>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(page: Option[Int], warnCode: Option[PageBasedWarningCode], warnMessage: Option[String]): WarningsListItem = WarningsListItem(page, warnCode, warnMessage)

  implicit val schema: Schema[WarningsListItem] = struct(
    int.optional[WarningsListItem]("Page", _.page).addHints(smithy.api.Documentation("<p>Page number in the input document.</p>")),
    PageBasedWarningCode.schema.optional[WarningsListItem]("WarnCode", _.warnCode).addHints(smithy.api.Documentation("<p>The type of warning.</p>")),
    string.optional[WarningsListItem]("WarnMessage", _.warnMessage).addHints(smithy.api.Documentation("<p>Text message associated with the warning.</p>")),
  )(make).withId(id).addHints(hints)
}
