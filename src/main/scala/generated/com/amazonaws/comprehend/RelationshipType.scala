package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class RelationshipType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = RelationshipType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = RelationshipType
  @inline final def widen: RelationshipType = this
}
object RelationshipType extends Enumeration[RelationshipType] with ShapeTag.Companion[RelationshipType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "RelationshipType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object CHILD extends RelationshipType("CHILD", "CHILD", 0, Hints.empty)
  final case class $Unknown(str: String) extends RelationshipType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => RelationshipType = $Unknown(_)

  val values: List[RelationshipType] = List(
    CHILD,
  )
  val tag: EnumTag[RelationshipType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[RelationshipType] = enumeration(tag, values).withId(id).addHints(hints)
}
