package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Provides information about an entity. </p>
  *          <p> </p>
  * @param BlockReferences
  *   <p>A reference to each block for this entity. This field is empty for plain-text input.</p>
  * @param BeginOffset
  *   <p>The zero-based offset from the beginning of the source text to the first character in the
  *         entity.</p>
  *            <p>This field is empty for non-text input.</p>
  * @param EndOffset
  *   <p>The zero-based offset from the beginning of the source text to the last character in the
  *         entity.</p>
  *            <p>This field is empty for non-text input.</p>
  * @param Text
  *   <p>The text of the entity.</p>
  * @param Score
  *   <p>The level of confidence that Amazon Comprehend has in the accuracy of the
  *         detection.</p>
  * @param Type
  *   <p>The entity type. For entity detection using the built-in model, this field contains one of the
  *         standard entity types listed below.</p>
  *            <p>For custom entity detection, this field contains one of the
  *         entity types that you specified when you trained your custom model.</p>
  */
final case class Entity(score: Option[Float] = None, _type: Option[EntityType] = None, text: Option[String] = None, beginOffset: Option[Int] = None, endOffset: Option[Int] = None, blockReferences: Option[List[BlockReference]] = None)

object Entity extends ShapeTag.Companion[Entity] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Entity")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information about an entity. </p>\n         <p> </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(score: Option[Float], _type: Option[EntityType], text: Option[String], beginOffset: Option[Int], endOffset: Option[Int], blockReferences: Option[List[BlockReference]]): Entity = Entity(score, _type, text, beginOffset, endOffset, blockReferences)

  implicit val schema: Schema[Entity] = struct(
    float.optional[Entity]("Score", _.score).addHints(smithy.api.Documentation("<p>The level of confidence that Amazon Comprehend has in the accuracy of the\n      detection.</p>")),
    EntityType.schema.optional[Entity]("Type", _._type).addHints(smithy.api.Documentation("<p>The entity type. For entity detection using the built-in model, this field contains one of the\n      standard entity types listed below.</p>\n         <p>For custom entity detection, this field contains one of the\n      entity types that you specified when you trained your custom model.</p>")),
    string.optional[Entity]("Text", _.text).addHints(smithy.api.Documentation("<p>The text of the entity.</p>")),
    int.optional[Entity]("BeginOffset", _.beginOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the first character in the\n      entity.</p>\n         <p>This field is empty for non-text input.</p>")),
    int.optional[Entity]("EndOffset", _.endOffset).addHints(smithy.api.Documentation("<p>The zero-based offset from the beginning of the source text to the last character in the\n      entity.</p>\n         <p>This field is empty for non-text input.</p>")),
    ListOfBlockReferences.underlyingSchema.optional[Entity]("BlockReferences", _.blockReferences).addHints(smithy.api.Documentation("<p>A reference to each block for this entity. This field is empty for plain-text input.</p>")),
  )(make).withId(id).addHints(hints)
}
