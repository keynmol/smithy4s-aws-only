package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class PartOfSpeechTagType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = PartOfSpeechTagType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = PartOfSpeechTagType
  @inline final def widen: PartOfSpeechTagType = this
}
object PartOfSpeechTagType extends Enumeration[PartOfSpeechTagType] with ShapeTag.Companion[PartOfSpeechTagType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PartOfSpeechTagType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object ADJ extends PartOfSpeechTagType("ADJ", "ADJ", 0, Hints.empty)
  case object ADP extends PartOfSpeechTagType("ADP", "ADP", 1, Hints.empty)
  case object ADV extends PartOfSpeechTagType("ADV", "ADV", 2, Hints.empty)
  case object AUX extends PartOfSpeechTagType("AUX", "AUX", 3, Hints.empty)
  case object CONJ extends PartOfSpeechTagType("CONJ", "CONJ", 4, Hints.empty)
  case object CCONJ extends PartOfSpeechTagType("CCONJ", "CCONJ", 5, Hints.empty)
  case object DET extends PartOfSpeechTagType("DET", "DET", 6, Hints.empty)
  case object INTJ extends PartOfSpeechTagType("INTJ", "INTJ", 7, Hints.empty)
  case object NOUN extends PartOfSpeechTagType("NOUN", "NOUN", 8, Hints.empty)
  case object NUM extends PartOfSpeechTagType("NUM", "NUM", 9, Hints.empty)
  case object O extends PartOfSpeechTagType("O", "O", 10, Hints.empty)
  case object PART extends PartOfSpeechTagType("PART", "PART", 11, Hints.empty)
  case object PRON extends PartOfSpeechTagType("PRON", "PRON", 12, Hints.empty)
  case object PROPN extends PartOfSpeechTagType("PROPN", "PROPN", 13, Hints.empty)
  case object PUNCT extends PartOfSpeechTagType("PUNCT", "PUNCT", 14, Hints.empty)
  case object SCONJ extends PartOfSpeechTagType("SCONJ", "SCONJ", 15, Hints.empty)
  case object SYM extends PartOfSpeechTagType("SYM", "SYM", 16, Hints.empty)
  case object VERB extends PartOfSpeechTagType("VERB", "VERB", 17, Hints.empty)
  final case class $Unknown(str: String) extends PartOfSpeechTagType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => PartOfSpeechTagType = $Unknown(_)

  val values: List[PartOfSpeechTagType] = List(
    ADJ,
    ADP,
    ADV,
    AUX,
    CONJ,
    CCONJ,
    DET,
    INTJ,
    NOUN,
    NUM,
    O,
    PART,
    PRON,
    PROPN,
    PUNCT,
    SCONJ,
    SYM,
    VERB,
  )
  val tag: EnumTag[PartOfSpeechTagType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[PartOfSpeechTagType] = enumeration(tag, values).withId(id).addHints(hints)
}
