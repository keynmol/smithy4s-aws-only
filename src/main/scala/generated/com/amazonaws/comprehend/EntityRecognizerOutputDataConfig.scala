package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Output data configuration.</p>
  * @param FlywheelStatsS3Prefix
  *   <p>The Amazon S3 prefix for the data lake location of the flywheel statistics.</p>
  */
final case class EntityRecognizerOutputDataConfig(flywheelStatsS3Prefix: Option[S3Uri] = None)

object EntityRecognizerOutputDataConfig extends ShapeTag.Companion[EntityRecognizerOutputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerOutputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Output data configuration.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelStatsS3Prefix: Option[S3Uri]): EntityRecognizerOutputDataConfig = EntityRecognizerOutputDataConfig(flywheelStatsS3Prefix)

  implicit val schema: Schema[EntityRecognizerOutputDataConfig] = struct(
    S3Uri.schema.optional[EntityRecognizerOutputDataConfig]("FlywheelStatsS3Prefix", _.flywheelStatsS3Prefix).addHints(smithy.api.Documentation("<p>The Amazon S3 prefix for the data lake location of the flywheel statistics.</p>")),
  )(make).withId(id).addHints(hints)
}
