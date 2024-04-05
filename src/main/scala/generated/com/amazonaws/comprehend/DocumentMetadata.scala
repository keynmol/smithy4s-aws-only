package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Information about the document, discovered during text extraction.</p>
  * @param Pages
  *   <p>Number of pages in the document.</p>
  * @param ExtractedCharacters
  *   <p>List of pages in the document, with the number of characters extracted from each page.</p>
  */
final case class DocumentMetadata(pages: Option[Int] = None, extractedCharacters: Option[List[ExtractedCharactersListItem]] = None)

object DocumentMetadata extends ShapeTag.Companion[DocumentMetadata] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentMetadata")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Information about the document, discovered during text extraction.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(pages: Option[Int], extractedCharacters: Option[List[ExtractedCharactersListItem]]): DocumentMetadata = DocumentMetadata(pages, extractedCharacters)

  implicit val schema: Schema[DocumentMetadata] = struct(
    int.optional[DocumentMetadata]("Pages", _.pages).addHints(smithy.api.Documentation("<p>Number of pages in the document.</p>")),
    ListOfExtractedCharacters.underlyingSchema.optional[DocumentMetadata]("ExtractedCharacters", _.extractedCharacters).addHints(smithy.api.Documentation("<p>List of pages in the document, with the number of characters extracted from each page.</p>")),
  )(make).withId(id).addHints(hints)
}
