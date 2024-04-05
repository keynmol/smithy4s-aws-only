package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Labels
  *   <p>The labels used in the document being analyzed. Individual labels represent personally
  *         identifiable information (PII) entity types.</p>
  */
final case class ContainsPiiEntitiesResponse(labels: Option[List[EntityLabel]] = None)

object ContainsPiiEntitiesResponse extends ShapeTag.Companion[ContainsPiiEntitiesResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ContainsPiiEntitiesResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(labels: Option[List[EntityLabel]]): ContainsPiiEntitiesResponse = ContainsPiiEntitiesResponse(labels)

  implicit val schema: Schema[ContainsPiiEntitiesResponse] = struct(
    ListOfEntityLabels.underlyingSchema.optional[ContainsPiiEntitiesResponse]("Labels", _.labels).addHints(smithy.api.Documentation("<p>The labels used in the document being analyzed. Individual labels represent personally\n      identifiable information (PII) entity types.</p>")),
  )(make).withId(id).addHints(hints)
}
