package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Provides information about a PII entity.</p>
  * @param Score
  *   <p>The level of confidence that Amazon Comprehend has in the accuracy of the
  *         detection.</p>
  * @param Type
  *   <p>The entity's type.</p>
  * @param BeginOffset
  *   <p>The zero-based offset from the beginning of the source text to the first character in the
  *         entity.</p>
  * @param EndOffset
  *   <p>The zero-based offset from the beginning of the source text to the last character in the
  *         entity.</p>
  */
final case class PiiEntity(score: Option[Float] = None, _type: Option[PiiEntityType] = None, beginOffset: Option[Int] = None, endOffset: Option[Int] = None)

object PiiEntity extends ShapeTag.Companion[PiiEntity] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PiiEntity")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about a PII entity.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(score: Option[Float], _type: Option[PiiEntityType], beginOffset: Option[Int], endOffset: Option[Int]): PiiEntity = PiiEntity(score, _type, beginOffset, endOffset)

  implicit val schema: Schema[PiiEntity] = struct(
    float.optional[PiiEntity]("Score", _.score).addHints(smithy.api.Documentation("<p>The level of confidence that Amazon Comprehend has in the accuracy of the\n      detection.</p>")),
    PiiEntityType.schema.optional[PiiEntity]("Type", _._type).addHints(smithy.api.Documentation("<p>The entity\'s type.</p>")),
    int.optional[PiiEntity]("BeginOffset", _.beginOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the first character in the\n      entity.</p>")),
    int.optional[PiiEntity]("EndOffset", _.endOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the last character in the\n      entity.</p>")),
  )(make).withId(id).addHints(hints)
}
