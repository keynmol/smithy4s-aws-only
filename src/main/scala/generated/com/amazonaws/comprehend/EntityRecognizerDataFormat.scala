package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class EntityRecognizerDataFormat(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = EntityRecognizerDataFormat
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = EntityRecognizerDataFormat
  @inline final def widen: EntityRecognizerDataFormat = this
}
object EntityRecognizerDataFormat extends Enumeration[EntityRecognizerDataFormat] with ShapeTag.Companion[EntityRecognizerDataFormat] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerDataFormat")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object COMPREHEND_CSV extends EntityRecognizerDataFormat("COMPREHEND_CSV", "COMPREHEND_CSV", 0, Hints.empty)
  case object AUGMENTED_MANIFEST extends EntityRecognizerDataFormat("AUGMENTED_MANIFEST", "AUGMENTED_MANIFEST", 1, Hints.empty)
  final case class $Unknown(str: String) extends EntityRecognizerDataFormat(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => EntityRecognizerDataFormat = $Unknown(_)

  val values: List[EntityRecognizerDataFormat] = List(
    COMPREHEND_CSV,
    AUGMENTED_MANIFEST,
  )
  val tag: EnumTag[EntityRecognizerDataFormat] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[EntityRecognizerDataFormat] = enumeration(tag, values).withId(id).addHints(hints)
}
