package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DocumentType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DocumentType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DocumentType
  @inline final def widen: DocumentType = this
}
object DocumentType extends Enumeration[DocumentType] with ShapeTag.Companion[DocumentType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object NATIVE_PDF extends DocumentType("NATIVE_PDF", "NATIVE_PDF", 0, Hints.empty)
  case object SCANNED_PDF extends DocumentType("SCANNED_PDF", "SCANNED_PDF", 1, Hints.empty)
  case object MS_WORD extends DocumentType("MS_WORD", "MS_WORD", 2, Hints.empty)
  case object IMAGE extends DocumentType("IMAGE", "IMAGE", 3, Hints.empty)
  case object PLAIN_TEXT extends DocumentType("PLAIN_TEXT", "PLAIN_TEXT", 4, Hints.empty)
  case object TEXTRACT_DETECT_DOCUMENT_TEXT_JSON extends DocumentType("TEXTRACT_DETECT_DOCUMENT_TEXT_JSON", "TEXTRACT_DETECT_DOCUMENT_TEXT_JSON", 5, Hints.empty)
  case object TEXTRACT_ANALYZE_DOCUMENT_JSON extends DocumentType("TEXTRACT_ANALYZE_DOCUMENT_JSON", "TEXTRACT_ANALYZE_DOCUMENT_JSON", 6, Hints.empty)
  final case class $Unknown(str: String) extends DocumentType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DocumentType = $Unknown(_)

  val values: List[DocumentType] = List(
    NATIVE_PDF,
    SCANNED_PDF,
    MS_WORD,
    IMAGE,
    PLAIN_TEXT,
    TEXTRACT_DETECT_DOCUMENT_TEXT_JSON,
    TEXTRACT_ANALYZE_DOCUMENT_JSON,
  )
  val tag: EnumTag[DocumentType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DocumentType] = enumeration(tag, values).withId(id).addHints(hints)
}
