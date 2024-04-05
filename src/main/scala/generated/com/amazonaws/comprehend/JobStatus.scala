package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class JobStatus(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = JobStatus
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = JobStatus
  @inline final def widen: JobStatus = this
}
object JobStatus extends Enumeration[JobStatus] with ShapeTag.Companion[JobStatus] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "JobStatus")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object SUBMITTED extends JobStatus("SUBMITTED", "SUBMITTED", 0, Hints.empty)
  case object IN_PROGRESS extends JobStatus("IN_PROGRESS", "IN_PROGRESS", 1, Hints.empty)
  case object COMPLETED extends JobStatus("COMPLETED", "COMPLETED", 2, Hints.empty)
  case object FAILED extends JobStatus("FAILED", "FAILED", 3, Hints.empty)
  case object STOP_REQUESTED extends JobStatus("STOP_REQUESTED", "STOP_REQUESTED", 4, Hints.empty)
  case object STOPPED extends JobStatus("STOPPED", "STOPPED", 5, Hints.empty)
  final case class $Unknown(str: String) extends JobStatus(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => JobStatus = $Unknown(_)

  val values: List[JobStatus] = List(
    SUBMITTED,
    IN_PROGRESS,
    COMPLETED,
    FAILED,
    STOP_REQUESTED,
    STOPPED,
  )
  val tag: EnumTag[JobStatus] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[JobStatus] = enumeration(tag, values).withId(id).addHints(hints)
}
