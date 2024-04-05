package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class PageBasedErrorCode(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = PageBasedErrorCode
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = PageBasedErrorCode
  @inline final def widen: PageBasedErrorCode = this
}
object PageBasedErrorCode extends Enumeration[PageBasedErrorCode] with ShapeTag.Companion[PageBasedErrorCode] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PageBasedErrorCode")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object TEXTRACT_BAD_PAGE extends PageBasedErrorCode("TEXTRACT_BAD_PAGE", "TEXTRACT_BAD_PAGE", 0, Hints.empty)
  case object TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED extends PageBasedErrorCode("TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED", "TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED", 1, Hints.empty)
  case object PAGE_CHARACTERS_EXCEEDED extends PageBasedErrorCode("PAGE_CHARACTERS_EXCEEDED", "PAGE_CHARACTERS_EXCEEDED", 2, Hints.empty)
  case object PAGE_SIZE_EXCEEDED extends PageBasedErrorCode("PAGE_SIZE_EXCEEDED", "PAGE_SIZE_EXCEEDED", 3, Hints.empty)
  case object INTERNAL_SERVER_ERROR extends PageBasedErrorCode("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR", 4, Hints.empty)
  final case class $Unknown(str: String) extends PageBasedErrorCode(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => PageBasedErrorCode = $Unknown(_)

  val values: List[PageBasedErrorCode] = List(
    TEXTRACT_BAD_PAGE,
    TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED,
    PAGE_CHARACTERS_EXCEEDED,
    PAGE_SIZE_EXCEEDED,
    INTERNAL_SERVER_ERROR,
  )
  val tag: EnumTag[PageBasedErrorCode] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[PageBasedErrorCode] = enumeration(tag, values).withId(id).addHints(hints)
}
