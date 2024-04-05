package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class FlywheelIterationStatus(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = FlywheelIterationStatus
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = FlywheelIterationStatus
  @inline final def widen: FlywheelIterationStatus = this
}
object FlywheelIterationStatus extends Enumeration[FlywheelIterationStatus] with ShapeTag.Companion[FlywheelIterationStatus] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelIterationStatus")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object TRAINING extends FlywheelIterationStatus("TRAINING", "TRAINING", 0, Hints.empty)
  case object EVALUATING extends FlywheelIterationStatus("EVALUATING", "EVALUATING", 1, Hints.empty)
  case object COMPLETED extends FlywheelIterationStatus("COMPLETED", "COMPLETED", 2, Hints.empty)
  case object FAILED extends FlywheelIterationStatus("FAILED", "FAILED", 3, Hints.empty)
  case object STOP_REQUESTED extends FlywheelIterationStatus("STOP_REQUESTED", "STOP_REQUESTED", 4, Hints.empty)
  case object STOPPED extends FlywheelIterationStatus("STOPPED", "STOPPED", 5, Hints.empty)
  final case class $Unknown(str: String) extends FlywheelIterationStatus(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => FlywheelIterationStatus = $Unknown(_)

  val values: List[FlywheelIterationStatus] = List(
    TRAINING,
    EVALUATING,
    COMPLETED,
    FAILED,
    STOP_REQUESTED,
    STOPPED,
  )
  val tag: EnumTag[FlywheelIterationStatus] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[FlywheelIterationStatus] = enumeration(tag, values).withId(id).addHints(hints)
}
