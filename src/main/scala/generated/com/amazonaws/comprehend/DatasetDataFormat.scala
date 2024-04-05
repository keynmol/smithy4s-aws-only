package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class DatasetDataFormat(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DatasetDataFormat
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DatasetDataFormat
  @inline final def widen: DatasetDataFormat = this
}
object DatasetDataFormat extends Enumeration[DatasetDataFormat] with ShapeTag.Companion[DatasetDataFormat] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetDataFormat")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object COMPREHEND_CSV extends DatasetDataFormat("COMPREHEND_CSV", "COMPREHEND_CSV", 0, Hints.empty)
  case object AUGMENTED_MANIFEST extends DatasetDataFormat("AUGMENTED_MANIFEST", "AUGMENTED_MANIFEST", 1, Hints.empty)
  final case class $Unknown(str: String) extends DatasetDataFormat(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DatasetDataFormat = $Unknown(_)

  val values: List[DatasetDataFormat] = List(
    COMPREHEND_CSV,
    AUGMENTED_MANIFEST,
  )
  val tag: EnumTag[DatasetDataFormat] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DatasetDataFormat] = enumeration(tag, values).withId(id).addHints(hints)
}
