package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** @param FlywheelIterationPropertiesList
  *   <p>List of flywheel iteration properties</p>
  * @param NextToken
  *   <p>Next token</p>
  */
final case class ListFlywheelIterationHistoryResponse(flywheelIterationPropertiesList: Option[List[FlywheelIterationProperties]] = None, nextToken: Option[String] = None)

object ListFlywheelIterationHistoryResponse extends ShapeTag.Companion[ListFlywheelIterationHistoryResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListFlywheelIterationHistoryResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelIterationPropertiesList: Option[List[FlywheelIterationProperties]], nextToken: Option[String]): ListFlywheelIterationHistoryResponse = ListFlywheelIterationHistoryResponse(flywheelIterationPropertiesList, nextToken)

  implicit val schema: Schema[ListFlywheelIterationHistoryResponse] = struct(
    FlywheelIterationPropertiesList.underlyingSchema.optional[ListFlywheelIterationHistoryResponse]("FlywheelIterationPropertiesList", _.flywheelIterationPropertiesList).addHints(smithy.api.Documentation("<p>List of flywheel iteration properties</p>")),
    string.optional[ListFlywheelIterationHistoryResponse]("NextToken", _.nextToken).addHints(smithy.api.Documentation("<p>Next token</p>")),
  )(make).withId(id).addHints(hints)
}
