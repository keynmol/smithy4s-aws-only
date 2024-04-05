package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class ModelType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = ModelType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = ModelType
  @inline final def widen: ModelType = this
}
object ModelType extends Enumeration[ModelType] with ShapeTag.Companion[ModelType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ModelType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object DOCUMENT_CLASSIFIER extends ModelType("DOCUMENT_CLASSIFIER", "DOCUMENT_CLASSIFIER", 0, Hints.empty)
  case object ENTITY_RECOGNIZER extends ModelType("ENTITY_RECOGNIZER", "ENTITY_RECOGNIZER", 1, Hints.empty)
  final case class $Unknown(str: String) extends ModelType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => ModelType = $Unknown(_)

  val values: List[ModelType] = List(
    DOCUMENT_CLASSIFIER,
    ENTITY_RECOGNIZER,
  )
  val tag: EnumTag[ModelType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[ModelType] = enumeration(tag, values).withId(id).addHints(hints)
}
