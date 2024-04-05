package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class EndpointStatus(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = EndpointStatus
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = EndpointStatus
  @inline final def widen: EndpointStatus = this
}
object EndpointStatus extends Enumeration[EndpointStatus] with ShapeTag.Companion[EndpointStatus] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EndpointStatus")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object CREATING extends EndpointStatus("CREATING", "CREATING", 0, Hints.empty)
  case object DELETING extends EndpointStatus("DELETING", "DELETING", 1, Hints.empty)
  case object FAILED extends EndpointStatus("FAILED", "FAILED", 2, Hints.empty)
  case object IN_SERVICE extends EndpointStatus("IN_SERVICE", "IN_SERVICE", 3, Hints.empty)
  case object UPDATING extends EndpointStatus("UPDATING", "UPDATING", 4, Hints.empty)
  final case class $Unknown(str: String) extends EndpointStatus(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => EndpointStatus = $Unknown(_)

  val values: List[EndpointStatus] = List(
    CREATING,
    DELETING,
    FAILED,
    IN_SERVICE,
    UPDATING,
  )
  val tag: EnumTag[EndpointStatus] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[EndpointStatus] = enumeration(tag, values).withId(id).addHints(hints)
}
