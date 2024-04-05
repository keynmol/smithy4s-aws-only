package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class BlockType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = BlockType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = BlockType
  @inline final def widen: BlockType = this
}
object BlockType extends Enumeration[BlockType] with ShapeTag.Companion[BlockType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BlockType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object LINE extends BlockType("LINE", "LINE", 0, Hints.empty)
  case object WORD extends BlockType("WORD", "WORD", 1, Hints.empty)
  final case class $Unknown(str: String) extends BlockType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => BlockType = $Unknown(_)

  val values: List[BlockType] = List(
    LINE,
    WORD,
  )
  val tag: EnumTag[BlockType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[BlockType] = enumeration(tag, values).withId(id).addHints(hints)
}
