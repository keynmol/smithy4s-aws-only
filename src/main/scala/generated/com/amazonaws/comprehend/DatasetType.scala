package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DatasetType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DatasetType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DatasetType
  @inline final def widen: DatasetType = this
}
object DatasetType extends Enumeration[DatasetType] with ShapeTag.Companion[DatasetType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object TRAIN extends DatasetType("TRAIN", "TRAIN", 0, Hints.empty)
  case object TEST extends DatasetType("TEST", "TEST", 1, Hints.empty)
  final case class $Unknown(str: String) extends DatasetType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DatasetType = $Unknown(_)

  val values: List[DatasetType] = List(
    TRAIN,
    TEST,
  )
  val tag: EnumTag[DatasetType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DatasetType] = enumeration(tag, values).withId(id).addHints(hints)
}
