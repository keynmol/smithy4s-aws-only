package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class ModelStatus(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = ModelStatus
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = ModelStatus
  @inline final def widen: ModelStatus = this
}
object ModelStatus extends Enumeration[ModelStatus] with ShapeTag.Companion[ModelStatus] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ModelStatus")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object SUBMITTED extends ModelStatus("SUBMITTED", "SUBMITTED", 0, Hints.empty)
  case object TRAINING extends ModelStatus("TRAINING", "TRAINING", 1, Hints.empty)
  case object DELETING extends ModelStatus("DELETING", "DELETING", 2, Hints.empty)
  case object STOP_REQUESTED extends ModelStatus("STOP_REQUESTED", "STOP_REQUESTED", 3, Hints.empty)
  case object STOPPED extends ModelStatus("STOPPED", "STOPPED", 4, Hints.empty)
  case object IN_ERROR extends ModelStatus("IN_ERROR", "IN_ERROR", 5, Hints.empty)
  case object TRAINED extends ModelStatus("TRAINED", "TRAINED", 6, Hints.empty)
  case object TRAINED_WITH_WARNING extends ModelStatus("TRAINED_WITH_WARNING", "TRAINED_WITH_WARNING", 7, Hints.empty)
  final case class $Unknown(str: String) extends ModelStatus(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => ModelStatus = $Unknown(_)

  val values: List[ModelStatus] = List(
    SUBMITTED,
    TRAINING,
    DELETING,
    STOP_REQUESTED,
    STOPPED,
    IN_ERROR,
    TRAINED,
    TRAINED_WITH_WARNING,
  )
  val tag: EnumTag[ModelStatus] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[ModelStatus] = enumeration(tag, values).withId(id).addHints(hints)
}
