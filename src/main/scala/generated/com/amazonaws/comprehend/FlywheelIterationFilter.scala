package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Filter the flywheel iterations based on creation time.</p>
  * @param CreationTimeAfter
  *   <p>Filter the flywheel iterations to include iterations created after the specified time.</p>
  * @param CreationTimeBefore
  *   <p>Filter the flywheel iterations to include iterations created before the specified time.</p>
  */
final case class FlywheelIterationFilter(creationTimeAfter: Option[Timestamp] = None, creationTimeBefore: Option[Timestamp] = None)

object FlywheelIterationFilter extends ShapeTag.Companion[FlywheelIterationFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelIterationFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Filter the flywheel iterations based on creation time.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(creationTimeAfter: Option[Timestamp], creationTimeBefore: Option[Timestamp]): FlywheelIterationFilter = FlywheelIterationFilter(creationTimeAfter, creationTimeBefore)

  implicit val schema: Schema[FlywheelIterationFilter] = struct(
    timestamp.optional[FlywheelIterationFilter]("CreationTimeAfter", _.creationTimeAfter).addHints(smithy.api.Documentation("<p>Filter the flywheel iterations to include iterations created after the specified time.</p>")),
    timestamp.optional[FlywheelIterationFilter]("CreationTimeBefore", _.creationTimeBefore).addHints(smithy.api.Documentation("<p>Filter the flywheel iterations to include iterations created before the specified time.</p>")),
  )(make).withId(id).addHints(hints)
}
