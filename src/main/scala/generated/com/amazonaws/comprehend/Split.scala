package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class Split(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = Split
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = Split
  @inline final def widen: Split = this
}
object Split extends Enumeration[Split] with ShapeTag.Companion[Split] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Split")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object TRAIN extends Split("TRAIN", "TRAIN", 0, Hints.empty)
  case object TEST extends Split("TEST", "TEST", 1, Hints.empty)
  final case class $Unknown(str: String) extends Split(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => Split = $Unknown(_)

  val values: List[Split] = List(
    TRAIN,
    TEST,
  )
  val tag: EnumTag[Split] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[Split] = enumeration(tag, values).withId(id).addHints(hints)
}
