package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>List of child blocks for the current block.</p>
  * @param Ids
  *   <p>Identifers of the child blocks.</p>
  * @param Type
  *   <p>Only supported relationship is a child relationship.</p>
  */
final case class RelationshipsListItem(ids: Option[List[String]] = None, _type: Option[RelationshipType] = None)

object RelationshipsListItem extends ShapeTag.Companion[RelationshipsListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "RelationshipsListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>List of child blocks for the current block.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(ids: Option[List[String]], _type: Option[RelationshipType]): RelationshipsListItem = RelationshipsListItem(ids, _type)

  implicit val schema: Schema[RelationshipsListItem] = struct(
    StringList.underlyingSchema.optional[RelationshipsListItem]("Ids", _.ids).addHints(smithy.api.Documentation("<p>Identifers of the child blocks.</p>")),
    RelationshipType.schema.optional[RelationshipsListItem]("Type", _._type).addHints(smithy.api.Documentation("<p>Only supported relationship is a child relationship.</p>")),
  )(make).withId(id).addHints(hints)
}
