package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DatasetStatus(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DatasetStatus
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DatasetStatus
  @inline final def widen: DatasetStatus = this
}
object DatasetStatus extends Enumeration[DatasetStatus] with ShapeTag.Companion[DatasetStatus] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetStatus")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object CREATING extends DatasetStatus("CREATING", "CREATING", 0, Hints.empty)
  case object COMPLETED extends DatasetStatus("COMPLETED", "COMPLETED", 1, Hints.empty)
  case object FAILED extends DatasetStatus("FAILED", "FAILED", 2, Hints.empty)
  final case class $Unknown(str: String) extends DatasetStatus(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DatasetStatus = $Unknown(_)

  val values: List[DatasetStatus] = List(
    CREATING,
    COMPLETED,
    FAILED,
  )
  val tag: EnumTag[DatasetStatus] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DatasetStatus] = enumeration(tag, values).withId(id).addHints(hints)
}
