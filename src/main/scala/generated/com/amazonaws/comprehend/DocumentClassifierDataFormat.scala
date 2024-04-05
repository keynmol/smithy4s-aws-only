package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DocumentClassifierDataFormat(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DocumentClassifierDataFormat
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DocumentClassifierDataFormat
  @inline final def widen: DocumentClassifierDataFormat = this
}
object DocumentClassifierDataFormat extends Enumeration[DocumentClassifierDataFormat] with ShapeTag.Companion[DocumentClassifierDataFormat] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierDataFormat")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object COMPREHEND_CSV extends DocumentClassifierDataFormat("COMPREHEND_CSV", "COMPREHEND_CSV", 0, Hints.empty)
  case object AUGMENTED_MANIFEST extends DocumentClassifierDataFormat("AUGMENTED_MANIFEST", "AUGMENTED_MANIFEST", 1, Hints.empty)
  final case class $Unknown(str: String) extends DocumentClassifierDataFormat(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DocumentClassifierDataFormat = $Unknown(_)

  val values: List[DocumentClassifierDataFormat] = List(
    COMPREHEND_CSV,
    AUGMENTED_MANIFEST,
  )
  val tag: EnumTag[DocumentClassifierDataFormat] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DocumentClassifierDataFormat] = enumeration(tag, values).withId(id).addHints(hints)
}
