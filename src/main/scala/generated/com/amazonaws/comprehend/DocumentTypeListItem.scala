package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Document type for each page in the document.</p>
  * @param Page
  *   <p>Page number.</p>
  * @param Type
  *   <p>Document type.</p>
  */
final case class DocumentTypeListItem(page: Option[Int] = None, _type: Option[DocumentType] = None)

object DocumentTypeListItem extends ShapeTag.Companion[DocumentTypeListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentTypeListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Document type for each page in the document.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(page: Option[Int], _type: Option[DocumentType]): DocumentTypeListItem = DocumentTypeListItem(page, _type)

  implicit val schema: Schema[DocumentTypeListItem] = struct(
    int.optional[DocumentTypeListItem]("Page", _.page).addHints(smithy.api.Documentation("<p>Page number.</p>")),
    DocumentType.schema.optional[DocumentTypeListItem]("Type", _._type).addHints(smithy.api.Documentation("<p>Document type.</p>")),
  )(make).withId(id).addHints(hints)
}
