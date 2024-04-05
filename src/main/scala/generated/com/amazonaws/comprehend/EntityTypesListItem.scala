package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>An entity type within a labeled training dataset that Amazon Comprehend uses to train a
  *       custom entity recognizer.</p>
  * @param Type
  *   <p>An entity type within a labeled training dataset that Amazon Comprehend uses to train a
  *         custom entity recognizer.</p>
  *            <p>Entity types must not contain the following invalid characters: \n (line break), \\n
  *         (escaped line break, \r (carriage return), \\r (escaped carriage return), \t (tab), \\t
  *         (escaped tab), space, and , (comma).</p>
  */
final case class EntityTypesListItem(_type: EntityTypeName)

object EntityTypesListItem extends ShapeTag.Companion[EntityTypesListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityTypesListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>An entity type within a labeled training dataset that Amazon Comprehend uses to train a\n      custom entity recognizer.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(_type: EntityTypeName): EntityTypesListItem = EntityTypesListItem(_type)

  implicit val schema: Schema[EntityTypesListItem] = struct(
    EntityTypeName.schema.required[EntityTypesListItem]("Type", _._type).addHints(smithy.api.Documentation("<p>An entity type within a labeled training dataset that Amazon Comprehend uses to train a\n      custom entity recognizer.</p>\n         <p>Entity types must not contain the following invalid characters: \\n (line break), \\\\n\n      (escaped line break, \\r (carriage return), \\\\r (escaped carriage return), \\t (tab), \\\\t\n      (escaped tab), space, and , (comma).</p>")),
  )(make).withId(id).addHints(hints)
}
