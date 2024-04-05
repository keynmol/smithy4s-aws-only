package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Filter the flywheels based on creation time or flywheel status.</p>
  * @param Status
  *   <p>Filter the flywheels based on the flywheel status.</p>
  * @param CreationTimeAfter
  *   <p>Filter the flywheels to include flywheels created after the specified time.</p>
  * @param CreationTimeBefore
  *   <p>Filter the flywheels to include flywheels created before the specified time.</p>
  */
final case class FlywheelFilter(status: Option[FlywheelStatus] = None, creationTimeAfter: Option[Timestamp] = None, creationTimeBefore: Option[Timestamp] = None)

object FlywheelFilter extends ShapeTag.Companion[FlywheelFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Filter the flywheels based on creation time or flywheel status.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(status: Option[FlywheelStatus], creationTimeAfter: Option[Timestamp], creationTimeBefore: Option[Timestamp]): FlywheelFilter = FlywheelFilter(status, creationTimeAfter, creationTimeBefore)

  implicit val schema: Schema[FlywheelFilter] = struct(
    FlywheelStatus.schema.optional[FlywheelFilter]("Status", _.status).addHints(smithy.api.Documentation("<p>Filter the flywheels based on the flywheel status.</p>")),
    timestamp.optional[FlywheelFilter]("CreationTimeAfter", _.creationTimeAfter).addHints(smithy.api.Documentation("<p>Filter the flywheels to include flywheels created after the specified time.</p>")),
    timestamp.optional[FlywheelFilter]("CreationTimeBefore", _.creationTimeBefore).addHints(smithy.api.Documentation("<p>Filter the flywheels to include flywheels created before the specified time.</p>")),
  )(make).withId(id).addHints(hints)
}
