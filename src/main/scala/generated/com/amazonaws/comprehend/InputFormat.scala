package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class InputFormat(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = InputFormat
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = InputFormat
  @inline final def widen: InputFormat = this
}
object InputFormat extends Enumeration[InputFormat] with ShapeTag.Companion[InputFormat] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "InputFormat")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object ONE_DOC_PER_FILE extends InputFormat("ONE_DOC_PER_FILE", "ONE_DOC_PER_FILE", 0, Hints.empty)
  case object ONE_DOC_PER_LINE extends InputFormat("ONE_DOC_PER_LINE", "ONE_DOC_PER_LINE", 1, Hints.empty)
  final case class $Unknown(str: String) extends InputFormat(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => InputFormat = $Unknown(_)

  val values: List[InputFormat] = List(
    ONE_DOC_PER_FILE,
    ONE_DOC_PER_LINE,
  )
  val tag: EnumTag[InputFormat] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[InputFormat] = enumeration(tag, values).withId(id).addHints(hints)
}
