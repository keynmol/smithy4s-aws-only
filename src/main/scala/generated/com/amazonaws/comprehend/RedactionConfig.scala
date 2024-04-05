package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Provides configuration parameters for PII entity redaction.</p>
  * @param PiiEntityTypes
  *   <p>An array of the types of PII entities that Amazon Comprehend detects in the input text for
  *         your request.</p>
  * @param MaskMode
  *   <p>Specifies whether the PII entity is redacted with the mask character or the entity
  *         type.</p>
  * @param MaskCharacter
  *   <p>A character that replaces each character in the redacted PII entity.</p>
  */
final case class RedactionConfig(piiEntityTypes: Option[List[PiiEntityType]] = None, maskMode: Option[PiiEntitiesDetectionMaskMode] = None, maskCharacter: Option[MaskCharacter] = None)

object RedactionConfig extends ShapeTag.Companion[RedactionConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "RedactionConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides configuration parameters for PII entity redaction.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(piiEntityTypes: Option[List[PiiEntityType]], maskMode: Option[PiiEntitiesDetectionMaskMode], maskCharacter: Option[MaskCharacter]): RedactionConfig = RedactionConfig(piiEntityTypes, maskMode, maskCharacter)

  implicit val schema: Schema[RedactionConfig] = struct(
    ListOfPiiEntityTypes.underlyingSchema.optional[RedactionConfig]("PiiEntityTypes", _.piiEntityTypes).addHints(smithy.api.Documentation("<p>An array of the types of PII entities that Amazon Comprehend detects in the input text for\n      your request.</p>")),
    PiiEntitiesDetectionMaskMode.schema.optional[RedactionConfig]("MaskMode", _.maskMode).addHints(smithy.api.Documentation("<p>Specifies whether the PII entity is redacted with the mask character or the entity\n      type.</p>")),
    MaskCharacter.schema.optional[RedactionConfig]("MaskCharacter", _.maskCharacter).addHints(smithy.api.Documentation("<p>A character that replaces each character in the redacted PII entity.</p>")),
  )(make).withId(id).addHints(hints)
}
