package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.struct

/** <p>Specifies one of the label or labels that categorize the personally identifiable
  *       information (PII) entity being analyzed.</p>
  * @param Name
  *   <p>The name of the label.</p>
  * @param Score
  *   <p>The level of confidence that Amazon Comprehend has in the accuracy of the
  *         detection.</p>
  */
final case class EntityLabel(name: Option[PiiEntityType] = None, score: Option[Float] = None)

object EntityLabel extends ShapeTag.Companion[EntityLabel] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityLabel")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies one of the label or labels that categorize the personally identifiable\n      information (PII) entity being analyzed.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[PiiEntityType], score: Option[Float]): EntityLabel = EntityLabel(name, score)

  implicit val schema: Schema[EntityLabel] = struct(
    PiiEntityType.schema.optional[EntityLabel]("Name", _.name).addHints(smithy.api.Documentation("<p>The name of the label.</p>")),
    float.optional[EntityLabel]("Score", _.score).addHints(smithy.api.Documentation("<p>The level of confidence that Amazon Comprehend has in the accuracy of the\n      detection.</p>")),
  )(make).withId(id).addHints(hints)
}
