package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DocumentClassifierMode(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DocumentClassifierMode
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DocumentClassifierMode
  @inline final def widen: DocumentClassifierMode = this
}
object DocumentClassifierMode extends Enumeration[DocumentClassifierMode] with ShapeTag.Companion[DocumentClassifierMode] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierMode")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object MULTI_CLASS extends DocumentClassifierMode("MULTI_CLASS", "MULTI_CLASS", 0, Hints.empty)
  case object MULTI_LABEL extends DocumentClassifierMode("MULTI_LABEL", "MULTI_LABEL", 1, Hints.empty)
  final case class $Unknown(str: String) extends DocumentClassifierMode(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DocumentClassifierMode = $Unknown(_)

  val values: List[DocumentClassifierMode] = List(
    MULTI_CLASS,
    MULTI_LABEL,
  )
  val tag: EnumTag[DocumentClassifierMode] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DocumentClassifierMode] = enumeration(tag, values).withId(id).addHints(hints)
}
