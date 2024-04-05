package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>A reference to a block. </p>
  * @param BlockId
  *   <p>Unique identifier for the block.</p>
  * @param BeginOffset
  *   <p>Offset of the start of the block within its parent block.</p>
  * @param EndOffset
  *   <p>Offset of the end of the block within its parent block.</p>
  * @param ChildBlocks
  *   <p>List of child blocks within this block.</p>
  */
final case class BlockReference(blockId: Option[String] = None, beginOffset: Option[Int] = None, endOffset: Option[Int] = None, childBlocks: Option[List[ChildBlock]] = None)

object BlockReference extends ShapeTag.Companion[BlockReference] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BlockReference")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>A reference to a block. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(blockId: Option[String], beginOffset: Option[Int], endOffset: Option[Int], childBlocks: Option[List[ChildBlock]]): BlockReference = BlockReference(blockId, beginOffset, endOffset, childBlocks)

  implicit val schema: Schema[BlockReference] = struct(
    string.optional[BlockReference]("BlockId", _.blockId).addHints(smithy.api.Documentation("<p>Unique identifier for the block.</p>")),
    int.optional[BlockReference]("BeginOffset", _.beginOffset).addHints(smithy.api.Documentation("<p>Offset of the start of the block within its parent block.</p>")),
    int.optional[BlockReference]("EndOffset", _.endOffset).addHints(smithy.api.Documentation("<p>Offset of the end of the block within its parent block.</p>")),
    ListOfChildBlocks.underlyingSchema.optional[BlockReference]("ChildBlocks", _.childBlocks).addHints(smithy.api.Documentation("<p>List of child blocks within this block.</p>")),
  )(make).withId(id).addHints(hints)
}
