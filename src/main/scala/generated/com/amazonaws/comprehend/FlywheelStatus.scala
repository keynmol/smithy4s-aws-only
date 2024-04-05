package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class FlywheelStatus(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = FlywheelStatus
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = FlywheelStatus
  @inline final def widen: FlywheelStatus = this
}
object FlywheelStatus extends Enumeration[FlywheelStatus] with ShapeTag.Companion[FlywheelStatus] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelStatus")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object CREATING extends FlywheelStatus("CREATING", "CREATING", 0, Hints.empty)
  case object ACTIVE extends FlywheelStatus("ACTIVE", "ACTIVE", 1, Hints.empty)
  case object UPDATING extends FlywheelStatus("UPDATING", "UPDATING", 2, Hints.empty)
  case object DELETING extends FlywheelStatus("DELETING", "DELETING", 3, Hints.empty)
  case object FAILED extends FlywheelStatus("FAILED", "FAILED", 4, Hints.empty)
  final case class $Unknown(str: String) extends FlywheelStatus(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => FlywheelStatus = $Unknown(_)

  val values: List[FlywheelStatus] = List(
    CREATING,
    ACTIVE,
    UPDATING,
    DELETING,
    FAILED,
  )
  val tag: EnumTag[FlywheelStatus] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[FlywheelStatus] = enumeration(tag, values).withId(id).addHints(hints)
}
