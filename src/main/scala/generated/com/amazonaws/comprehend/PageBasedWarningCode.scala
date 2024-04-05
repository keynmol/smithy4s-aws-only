package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class PageBasedWarningCode(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = PageBasedWarningCode
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = PageBasedWarningCode
  @inline final def widen: PageBasedWarningCode = this
}
object PageBasedWarningCode extends Enumeration[PageBasedWarningCode] with ShapeTag.Companion[PageBasedWarningCode] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PageBasedWarningCode")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL extends PageBasedWarningCode("INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL", "INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL", 0, Hints.empty)
  case object INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL extends PageBasedWarningCode("INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL", "INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL", 1, Hints.empty)
  final case class $Unknown(str: String) extends PageBasedWarningCode(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => PageBasedWarningCode = $Unknown(_)

  val values: List[PageBasedWarningCode] = List(
    INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL,
    INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL,
  )
  val tag: EnumTag[PageBasedWarningCode] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[PageBasedWarningCode] = enumeration(tag, values).withId(id).addHints(hints)
}
