package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class SyntaxLanguageCode(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = SyntaxLanguageCode
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = SyntaxLanguageCode
  @inline final def widen: SyntaxLanguageCode = this
}
object SyntaxLanguageCode extends Enumeration[SyntaxLanguageCode] with ShapeTag.Companion[SyntaxLanguageCode] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "SyntaxLanguageCode")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object EN extends SyntaxLanguageCode("en", "EN", 0, Hints.empty)
  case object ES extends SyntaxLanguageCode("es", "ES", 1, Hints.empty)
  case object FR extends SyntaxLanguageCode("fr", "FR", 2, Hints.empty)
  case object DE extends SyntaxLanguageCode("de", "DE", 3, Hints.empty)
  case object IT extends SyntaxLanguageCode("it", "IT", 4, Hints.empty)
  case object PT extends SyntaxLanguageCode("pt", "PT", 5, Hints.empty)
  final case class $Unknown(str: String) extends SyntaxLanguageCode(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => SyntaxLanguageCode = $Unknown(_)

  val values: List[SyntaxLanguageCode] = List(
    EN,
    ES,
    FR,
    DE,
    IT,
    PT,
  )
  val tag: EnumTag[SyntaxLanguageCode] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[SyntaxLanguageCode] = enumeration(tag, values).withId(id).addHints(hints)
}
