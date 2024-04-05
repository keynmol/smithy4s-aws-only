package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DocumentReadAction(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DocumentReadAction
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DocumentReadAction
  @inline final def widen: DocumentReadAction = this
}
object DocumentReadAction extends Enumeration[DocumentReadAction] with ShapeTag.Companion[DocumentReadAction] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentReadAction")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object TEXTRACT_DETECT_DOCUMENT_TEXT extends DocumentReadAction("TEXTRACT_DETECT_DOCUMENT_TEXT", "TEXTRACT_DETECT_DOCUMENT_TEXT", 0, Hints.empty)
  case object TEXTRACT_ANALYZE_DOCUMENT extends DocumentReadAction("TEXTRACT_ANALYZE_DOCUMENT", "TEXTRACT_ANALYZE_DOCUMENT", 1, Hints.empty)
  final case class $Unknown(str: String) extends DocumentReadAction(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DocumentReadAction = $Unknown(_)

  val values: List[DocumentReadAction] = List(
    TEXTRACT_DETECT_DOCUMENT_TEXT,
    TEXTRACT_ANALYZE_DOCUMENT,
  )
  val tag: EnumTag[DocumentReadAction] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DocumentReadAction] = enumeration(tag, values).withId(id).addHints(hints)
}
