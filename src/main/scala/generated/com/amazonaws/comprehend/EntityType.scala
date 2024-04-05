package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class EntityType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = EntityType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = EntityType
  @inline final def widen: EntityType = this
}
object EntityType extends Enumeration[EntityType] with ShapeTag.Companion[EntityType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object PERSON extends EntityType("PERSON", "PERSON", 0, Hints.empty)
  case object LOCATION extends EntityType("LOCATION", "LOCATION", 1, Hints.empty)
  case object ORGANIZATION extends EntityType("ORGANIZATION", "ORGANIZATION", 2, Hints.empty)
  case object COMMERCIAL_ITEM extends EntityType("COMMERCIAL_ITEM", "COMMERCIAL_ITEM", 3, Hints.empty)
  case object EVENT extends EntityType("EVENT", "EVENT", 4, Hints.empty)
  case object DATE extends EntityType("DATE", "DATE", 5, Hints.empty)
  case object QUANTITY extends EntityType("QUANTITY", "QUANTITY", 6, Hints.empty)
  case object TITLE extends EntityType("TITLE", "TITLE", 7, Hints.empty)
  case object OTHER extends EntityType("OTHER", "OTHER", 8, Hints.empty)
  final case class $Unknown(str: String) extends EntityType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => EntityType = $Unknown(_)

  val values: List[EntityType] = List(
    PERSON,
    LOCATION,
    ORGANIZATION,
    COMMERCIAL_ITEM,
    EVENT,
    DATE,
    QUANTITY,
    TITLE,
    OTHER,
  )
  val tag: EnumTag[EntityType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[EntityType] = enumeration(tag, values).withId(id).addHints(hints)
}
