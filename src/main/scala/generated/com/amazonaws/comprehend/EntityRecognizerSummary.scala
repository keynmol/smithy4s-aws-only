package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p> Describes the information about an entity recognizer and its versions.</p>
  * @param RecognizerName
  *   <p> The name that you assigned the entity recognizer.</p>
  * @param LatestVersionStatus
  *   <p> Provides the status of the latest entity recognizer version.</p>
  * @param NumberOfVersions
  *   <p> The number of versions you created.</p>
  * @param LatestVersionCreatedAt
  *   <p> The time that the latest entity recognizer version was submitted for processing.</p>
  * @param LatestVersionName
  *   <p> The version name you assigned to the latest entity recognizer version.</p>
  */
final case class EntityRecognizerSummary(recognizerName: Option[ComprehendArnName] = None, numberOfVersions: Option[Int] = None, latestVersionCreatedAt: Option[Timestamp] = None, latestVersionName: Option[VersionName] = None, latestVersionStatus: Option[ModelStatus] = None)

object EntityRecognizerSummary extends ShapeTag.Companion[EntityRecognizerSummary] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerSummary")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p> Describes the information about an entity recognizer and its versions.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(recognizerName: Option[ComprehendArnName], numberOfVersions: Option[Int], latestVersionCreatedAt: Option[Timestamp], latestVersionName: Option[VersionName], latestVersionStatus: Option[ModelStatus]): EntityRecognizerSummary = EntityRecognizerSummary(recognizerName, numberOfVersions, latestVersionCreatedAt, latestVersionName, latestVersionStatus)

  implicit val schema: Schema[EntityRecognizerSummary] = struct(
    ComprehendArnName.schema.optional[EntityRecognizerSummary]("RecognizerName", _.recognizerName).addHints(smithy.api.Documentation("<p> The name that you assigned the entity recognizer.</p>")),
    int.optional[EntityRecognizerSummary]("NumberOfVersions", _.numberOfVersions).addHints(smithy.api.Documentation("<p> The number of versions you created.</p>")),
    timestamp.optional[EntityRecognizerSummary]("LatestVersionCreatedAt", _.latestVersionCreatedAt).addHints(smithy.api.Documentation("<p> The time that the latest entity recognizer version was submitted for processing.</p>")),
    VersionName.schema.optional[EntityRecognizerSummary]("LatestVersionName", _.latestVersionName).addHints(smithy.api.Documentation("<p> The version name you assigned to the latest entity recognizer version.</p>")),
    ModelStatus.schema.optional[EntityRecognizerSummary]("LatestVersionStatus", _.latestVersionStatus).addHints(smithy.api.Documentation("<p> Provides the status of the latest entity recognizer version.</p>")),
  )(make).withId(id).addHints(hints)
}
