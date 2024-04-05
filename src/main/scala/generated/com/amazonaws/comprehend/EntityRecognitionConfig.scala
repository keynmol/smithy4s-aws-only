package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Configuration required for an entity recognition model.</p>
  * @param EntityTypes
  *   <p>Up to 25 entity types that the model is trained to recognize.</p>
  */
final case class EntityRecognitionConfig(entityTypes: List[EntityTypesListItem])

object EntityRecognitionConfig extends ShapeTag.Companion[EntityRecognitionConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognitionConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Configuration required for an entity recognition model.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(entityTypes: List[EntityTypesListItem]): EntityRecognitionConfig = EntityRecognitionConfig(entityTypes)

  implicit val schema: Schema[EntityRecognitionConfig] = struct(
    EntityTypesList.underlyingSchema.required[EntityRecognitionConfig]("EntityTypes", _.entityTypes).addHints(smithy.api.Documentation("<p>Up to 25 entity types that the model is trained to recognize.</p>")),
  )(make).withId(id).addHints(hints)
}
