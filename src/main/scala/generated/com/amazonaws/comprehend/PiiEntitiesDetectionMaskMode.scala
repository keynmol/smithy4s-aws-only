package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class PiiEntitiesDetectionMaskMode(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = PiiEntitiesDetectionMaskMode
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = PiiEntitiesDetectionMaskMode
  @inline final def widen: PiiEntitiesDetectionMaskMode = this
}
object PiiEntitiesDetectionMaskMode extends Enumeration[PiiEntitiesDetectionMaskMode] with ShapeTag.Companion[PiiEntitiesDetectionMaskMode] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PiiEntitiesDetectionMaskMode")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object MASK extends PiiEntitiesDetectionMaskMode("MASK", "MASK", 0, Hints.empty)
  case object REPLACE_WITH_PII_ENTITY_TYPE extends PiiEntitiesDetectionMaskMode("REPLACE_WITH_PII_ENTITY_TYPE", "REPLACE_WITH_PII_ENTITY_TYPE", 1, Hints.empty)
  final case class $Unknown(str: String) extends PiiEntitiesDetectionMaskMode(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => PiiEntitiesDetectionMaskMode = $Unknown(_)

  val values: List[PiiEntitiesDetectionMaskMode] = List(
    MASK,
    REPLACE_WITH_PII_ENTITY_TYPE,
  )
  val tag: EnumTag[PiiEntitiesDetectionMaskMode] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[PiiEntitiesDetectionMaskMode] = enumeration(tag, values).withId(id).addHints(hints)
}
