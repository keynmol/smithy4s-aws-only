package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class PiiEntitiesDetectionMode(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = PiiEntitiesDetectionMode
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = PiiEntitiesDetectionMode
  @inline final def widen: PiiEntitiesDetectionMode = this
}
object PiiEntitiesDetectionMode extends Enumeration[PiiEntitiesDetectionMode] with ShapeTag.Companion[PiiEntitiesDetectionMode] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PiiEntitiesDetectionMode")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object ONLY_REDACTION extends PiiEntitiesDetectionMode("ONLY_REDACTION", "ONLY_REDACTION", 0, Hints.empty)
  case object ONLY_OFFSETS extends PiiEntitiesDetectionMode("ONLY_OFFSETS", "ONLY_OFFSETS", 1, Hints.empty)
  final case class $Unknown(str: String) extends PiiEntitiesDetectionMode(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => PiiEntitiesDetectionMode = $Unknown(_)

  val values: List[PiiEntitiesDetectionMode] = List(
    ONLY_REDACTION,
    ONLY_OFFSETS,
  )
  val tag: EnumTag[PiiEntitiesDetectionMode] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[PiiEntitiesDetectionMode] = enumeration(tag, values).withId(id).addHints(hints)
}
