package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DocumentClassifierDocumentTypeFormat(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DocumentClassifierDocumentTypeFormat
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DocumentClassifierDocumentTypeFormat
  @inline final def widen: DocumentClassifierDocumentTypeFormat = this
}
object DocumentClassifierDocumentTypeFormat extends Enumeration[DocumentClassifierDocumentTypeFormat] with ShapeTag.Companion[DocumentClassifierDocumentTypeFormat] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierDocumentTypeFormat")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object PLAIN_TEXT_DOCUMENT extends DocumentClassifierDocumentTypeFormat("PLAIN_TEXT_DOCUMENT", "PLAIN_TEXT_DOCUMENT", 0, Hints.empty)
  case object SEMI_STRUCTURED_DOCUMENT extends DocumentClassifierDocumentTypeFormat("SEMI_STRUCTURED_DOCUMENT", "SEMI_STRUCTURED_DOCUMENT", 1, Hints.empty)
  final case class $Unknown(str: String) extends DocumentClassifierDocumentTypeFormat(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DocumentClassifierDocumentTypeFormat = $Unknown(_)

  val values: List[DocumentClassifierDocumentTypeFormat] = List(
    PLAIN_TEXT_DOCUMENT,
    SEMI_STRUCTURED_DOCUMENT,
  )
  val tag: EnumTag[DocumentClassifierDocumentTypeFormat] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DocumentClassifierDocumentTypeFormat] = enumeration(tag, values).withId(id).addHints(hints)
}
