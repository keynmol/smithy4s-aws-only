package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Nested block contained within a block.</p>
  * @param ChildBlockId
  *   <p>Unique identifier for the child block.</p>
  * @param BeginOffset
  *   <p>Offset of the start of the child block within its parent block.</p>
  * @param EndOffset
  *   <p>Offset of the end of the child block within its parent block.</p>
  */
final case class ChildBlock(childBlockId: Option[String] = None, beginOffset: Option[Int] = None, endOffset: Option[Int] = None)

object ChildBlock extends ShapeTag.Companion[ChildBlock] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ChildBlock")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Nested block contained within a block.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(childBlockId: Option[String], beginOffset: Option[Int], endOffset: Option[Int]): ChildBlock = ChildBlock(childBlockId, beginOffset, endOffset)

  implicit val schema: Schema[ChildBlock] = struct(
    string.optional[ChildBlock]("ChildBlockId", _.childBlockId).addHints(smithy.api.Documentation("<p>Unique identifier for the child block.</p>")),
    int.optional[ChildBlock]("BeginOffset", _.beginOffset).addHints(smithy.api.Documentation("<p>Offset of the start of the child block within its parent block.</p>")),
    int.optional[ChildBlock]("EndOffset", _.endOffset).addHints(smithy.api.Documentation("<p>Offset of the end of the child block within its parent block.</p>")),
  )(make).withId(id).addHints(hints)
}
