package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DocumentReadMode(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DocumentReadMode
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DocumentReadMode
  @inline final def widen: DocumentReadMode = this
}
object DocumentReadMode extends Enumeration[DocumentReadMode] with ShapeTag.Companion[DocumentReadMode] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentReadMode")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object SERVICE_DEFAULT extends DocumentReadMode("SERVICE_DEFAULT", "SERVICE_DEFAULT", 0, Hints.empty)
  case object FORCE_DOCUMENT_READ_ACTION extends DocumentReadMode("FORCE_DOCUMENT_READ_ACTION", "FORCE_DOCUMENT_READ_ACTION", 1, Hints.empty)
  final case class $Unknown(str: String) extends DocumentReadMode(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DocumentReadMode = $Unknown(_)

  val values: List[DocumentReadMode] = List(
    SERVICE_DEFAULT,
    FORCE_DOCUMENT_READ_ACTION,
  )
  val tag: EnumTag[DocumentReadMode] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DocumentReadMode] = enumeration(tag, values).withId(id).addHints(hints)
}
