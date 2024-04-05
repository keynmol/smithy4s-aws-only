package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Describes information about a document classifier and its versions.</p>
  * @param LatestVersionStatus
  *   <p>Provides the status of the latest document classifier version.</p>
  * @param NumberOfVersions
  *   <p>The number of versions you created.</p>
  * @param DocumentClassifierName
  *   <p>The name that you assigned the document classifier.</p>
  * @param LatestVersionCreatedAt
  *   <p>The time that the latest document classifier version was submitted for processing.</p>
  * @param LatestVersionName
  *   <p>The version name you assigned to the latest document classifier version.</p>
  */
final case class DocumentClassifierSummary(documentClassifierName: Option[ComprehendArnName] = None, numberOfVersions: Option[Int] = None, latestVersionCreatedAt: Option[Timestamp] = None, latestVersionName: Option[VersionName] = None, latestVersionStatus: Option[ModelStatus] = None)

object DocumentClassifierSummary extends ShapeTag.Companion[DocumentClassifierSummary] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierSummary")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes information about a document classifier and its versions.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierName: Option[ComprehendArnName], numberOfVersions: Option[Int], latestVersionCreatedAt: Option[Timestamp], latestVersionName: Option[VersionName], latestVersionStatus: Option[ModelStatus]): DocumentClassifierSummary = DocumentClassifierSummary(documentClassifierName, numberOfVersions, latestVersionCreatedAt, latestVersionName, latestVersionStatus)

  implicit val schema: Schema[DocumentClassifierSummary] = struct(
    ComprehendArnName.schema.optional[DocumentClassifierSummary]("DocumentClassifierName", _.documentClassifierName).addHints(smithy.api.Documentation("<p>The name that you assigned the document classifier.</p>")),
    int.optional[DocumentClassifierSummary]("NumberOfVersions", _.numberOfVersions).addHints(smithy.api.Documentation("<p>The number of versions you created.</p>")),
    timestamp.optional[DocumentClassifierSummary]("LatestVersionCreatedAt", _.latestVersionCreatedAt).addHints(smithy.api.Documentation("<p>The time that the latest document classifier version was submitted for processing.</p>")),
    VersionName.schema.optional[DocumentClassifierSummary]("LatestVersionName", _.latestVersionName).addHints(smithy.api.Documentation("<p>The version name you assigned to the latest document classifier version.</p>")),
    ModelStatus.schema.optional[DocumentClassifierSummary]("LatestVersionStatus", _.latestVersionStatus).addHints(smithy.api.Documentation("<p>Provides the status of the latest document classifier version.</p>")),
  )(make).withId(id).addHints(hints)
}
