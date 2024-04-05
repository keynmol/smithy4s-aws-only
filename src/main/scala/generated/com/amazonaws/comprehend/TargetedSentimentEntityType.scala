package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class TargetedSentimentEntityType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = TargetedSentimentEntityType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = TargetedSentimentEntityType
  @inline final def widen: TargetedSentimentEntityType = this
}
object TargetedSentimentEntityType extends Enumeration[TargetedSentimentEntityType] with ShapeTag.Companion[TargetedSentimentEntityType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TargetedSentimentEntityType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object PERSON extends TargetedSentimentEntityType("PERSON", "PERSON", 0, Hints.empty)
  case object LOCATION extends TargetedSentimentEntityType("LOCATION", "LOCATION", 1, Hints.empty)
  case object ORGANIZATION extends TargetedSentimentEntityType("ORGANIZATION", "ORGANIZATION", 2, Hints.empty)
  case object FACILITY extends TargetedSentimentEntityType("FACILITY", "FACILITY", 3, Hints.empty)
  case object BRAND extends TargetedSentimentEntityType("BRAND", "BRAND", 4, Hints.empty)
  case object COMMERCIAL_ITEM extends TargetedSentimentEntityType("COMMERCIAL_ITEM", "COMMERCIAL_ITEM", 5, Hints.empty)
  case object MOVIE extends TargetedSentimentEntityType("MOVIE", "MOVIE", 6, Hints.empty)
  case object MUSIC extends TargetedSentimentEntityType("MUSIC", "MUSIC", 7, Hints.empty)
  case object BOOK extends TargetedSentimentEntityType("BOOK", "BOOK", 8, Hints.empty)
  case object SOFTWARE extends TargetedSentimentEntityType("SOFTWARE", "SOFTWARE", 9, Hints.empty)
  case object GAME extends TargetedSentimentEntityType("GAME", "GAME", 10, Hints.empty)
  case object PERSONAL_TITLE extends TargetedSentimentEntityType("PERSONAL_TITLE", "PERSONAL_TITLE", 11, Hints.empty)
  case object EVENT extends TargetedSentimentEntityType("EVENT", "EVENT", 12, Hints.empty)
  case object DATE extends TargetedSentimentEntityType("DATE", "DATE", 13, Hints.empty)
  case object QUANTITY extends TargetedSentimentEntityType("QUANTITY", "QUANTITY", 14, Hints.empty)
  case object ATTRIBUTE extends TargetedSentimentEntityType("ATTRIBUTE", "ATTRIBUTE", 15, Hints.empty)
  case object OTHER extends TargetedSentimentEntityType("OTHER", "OTHER", 16, Hints.empty)
  final case class $Unknown(str: String) extends TargetedSentimentEntityType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => TargetedSentimentEntityType = $Unknown(_)

  val values: List[TargetedSentimentEntityType] = List(
    PERSON,
    LOCATION,
    ORGANIZATION,
    FACILITY,
    BRAND,
    COMMERCIAL_ITEM,
    MOVIE,
    MUSIC,
    BOOK,
    SOFTWARE,
    GAME,
    PERSONAL_TITLE,
    EVENT,
    DATE,
    QUANTITY,
    ATTRIBUTE,
    OTHER,
  )
  val tag: EnumTag[TargetedSentimentEntityType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[TargetedSentimentEntityType] = enumeration(tag, values).withId(id).addHints(hints)
}
