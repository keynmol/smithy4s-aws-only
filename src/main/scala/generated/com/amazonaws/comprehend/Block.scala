package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Information about each word or line of text in the input document.</p>
  *          <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Block.html">Block</a> in the Amazon Textract API reference.</p>
  * @param Id
  *   <p>Unique identifier for the block.</p>
  * @param Geometry
  *   <p>Co-ordinates of the rectangle or polygon that contains the text.</p>
  * @param Page
  *   <p>Page number where the block appears.</p>
  * @param Text
  *   <p>The word or line of text extracted from the block.</p>
  * @param Relationships
  *   <p>A list of child blocks of the current block.
  *         For example, a LINE object has child blocks for each WORD block that's part of the line of text. </p>
  * @param BlockType
  *   <p>The block represents a line of text or one word of text.</p>
  *            <ul>
  *               <li>
  *                  <p>WORD - A word that's detected on a document page.
  *           A word is one or more ISO basic Latin script characters that aren't separated by spaces.</p>
  *               </li>
  *               <li>
  *                  <p>LINE - A string of tab-delimited, contiguous words
  *           that are detected on a document page</p>
  *               </li>
  *            </ul>
  */
final case class Block(id: Option[String] = None, blockType: Option[BlockType] = None, text: Option[String] = None, page: Option[Int] = None, geometry: Option[Geometry] = None, relationships: Option[List[RelationshipsListItem]] = None)

object Block extends ShapeTag.Companion[Block] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Block")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Information about each word or line of text in the input document.</p>\n         <p>For additional information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/API_Block.html\">Block</a> in the Amazon Textract API reference.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(id: Option[String], blockType: Option[BlockType], text: Option[String], page: Option[Int], geometry: Option[Geometry], relationships: Option[List[RelationshipsListItem]]): Block = Block(id, blockType, text, page, geometry, relationships)

  implicit val schema: Schema[Block] = struct(
    string.optional[Block]("Id", _.id).addHints(smithy.api.Documentation("<p>Unique identifier for the block.</p>")),
    BlockType.schema.optional[Block]("BlockType", _.blockType).addHints(smithy.api.Documentation("<p>The block represents a line of text or one word of text.</p>\n         <ul>\n            <li>\n               <p>WORD - A word that\'s detected on a document page.\n        A word is one or more ISO basic Latin script characters that aren\'t separated by spaces.</p>\n            </li>\n            <li>\n               <p>LINE - A string of tab-delimited, contiguous words\n        that are detected on a document page</p>\n            </li>\n         </ul>")),
    string.optional[Block]("Text", _.text).addHints(smithy.api.Documentation("<p>The word or line of text extracted from the block.</p>")),
    int.optional[Block]("Page", _.page).addHints(smithy.api.Documentation("<p>Page number where the block appears.</p>")),
    Geometry.schema.optional[Block]("Geometry", _.geometry).addHints(smithy.api.Documentation("<p>Co-ordinates of the rectangle or polygon that contains the text.</p>")),
    ListOfRelationships.underlyingSchema.optional[Block]("Relationships", _.relationships).addHints(smithy.api.Documentation("<p>A list of child blocks of the current block.\n      For example, a LINE object has child blocks for each WORD block that\'s part of the line of text. </p>")),
  )(make).withId(id).addHints(hints)
}
