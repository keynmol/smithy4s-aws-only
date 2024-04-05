package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>Array of the number of characters extracted from each page.</p>
  * @param Page
  *   <p>Page number.</p>
  * @param Count
  *   <p>Number of characters extracted from each page.</p>
  */
final case class ExtractedCharactersListItem(page: Option[Int] = None, count: Option[Int] = None)

object ExtractedCharactersListItem extends ShapeTag.Companion[ExtractedCharactersListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ExtractedCharactersListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Array of the number of characters extracted from each page.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(page: Option[Int], count: Option[Int]): ExtractedCharactersListItem = ExtractedCharactersListItem(page, count)

  implicit val schema: Schema[ExtractedCharactersListItem] = struct(
    int.optional[ExtractedCharactersListItem]("Page", _.page).addHints(smithy.api.Documentation("<p>Page number.</p>")),
    int.optional[ExtractedCharactersListItem]("Count", _.count).addHints(smithy.api.Documentation("<p>Number of characters extracted from each page.</p>")),
  )(make).withId(id).addHints(hints)
}
