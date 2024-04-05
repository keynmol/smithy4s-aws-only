package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.struct

/** <p>The result of calling the  operation. The
  *       operation returns one object for each document that is successfully processed by the
  *       operation.</p>
  * @param Index
  *   <p>The zero-based index of the document in the input list.</p>
  * @param Entities
  *   <p>One or more <a>Entity</a> objects, one for each entity detected in the
  *         document.</p>
  */
final case class BatchDetectEntitiesItemResult(index: Option[Int] = None, entities: Option[List[Entity]] = None)

object BatchDetectEntitiesItemResult extends ShapeTag.Companion[BatchDetectEntitiesItemResult] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BatchDetectEntitiesItemResult")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The result of calling the  operation. The\n      operation returns one object for each document that is successfully processed by the\n      operation.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(index: Option[Int], entities: Option[List[Entity]]): BatchDetectEntitiesItemResult = BatchDetectEntitiesItemResult(index, entities)

  implicit val schema: Schema[BatchDetectEntitiesItemResult] = struct(
    int.optional[BatchDetectEntitiesItemResult]("Index", _.index).addHints(smithy.api.Documentation("<p>The zero-based index of the document in the input list.</p>")),
    ListOfEntities.underlyingSchema.optional[BatchDetectEntitiesItemResult]("Entities", _.entities).addHints(smithy.api.Documentation("<p>One or more <a>Entity</a> objects, one for each entity detected in the\n      document.</p>")),
  )(make).withId(id).addHints(hints)
}
