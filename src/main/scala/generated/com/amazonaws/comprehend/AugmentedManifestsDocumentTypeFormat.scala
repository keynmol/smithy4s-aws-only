package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class AugmentedManifestsDocumentTypeFormat(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = AugmentedManifestsDocumentTypeFormat
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = AugmentedManifestsDocumentTypeFormat
  @inline final def widen: AugmentedManifestsDocumentTypeFormat = this
}
object AugmentedManifestsDocumentTypeFormat extends Enumeration[AugmentedManifestsDocumentTypeFormat] with ShapeTag.Companion[AugmentedManifestsDocumentTypeFormat] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "AugmentedManifestsDocumentTypeFormat")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object PLAIN_TEXT_DOCUMENT extends AugmentedManifestsDocumentTypeFormat("PLAIN_TEXT_DOCUMENT", "PLAIN_TEXT_DOCUMENT", 0, Hints.empty)
  case object SEMI_STRUCTURED_DOCUMENT extends AugmentedManifestsDocumentTypeFormat("SEMI_STRUCTURED_DOCUMENT", "SEMI_STRUCTURED_DOCUMENT", 1, Hints.empty)
  final case class $Unknown(str: String) extends AugmentedManifestsDocumentTypeFormat(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => AugmentedManifestsDocumentTypeFormat = $Unknown(_)

  val values: List[AugmentedManifestsDocumentTypeFormat] = List(
    PLAIN_TEXT_DOCUMENT,
    SEMI_STRUCTURED_DOCUMENT,
  )
  val tag: EnumTag[AugmentedManifestsDocumentTypeFormat] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[AugmentedManifestsDocumentTypeFormat] = enumeration(tag, values).withId(id).addHints(hints)
}
