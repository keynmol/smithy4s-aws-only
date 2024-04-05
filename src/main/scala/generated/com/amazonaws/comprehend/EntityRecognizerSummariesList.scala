package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p> Describes the information about an entity recognizer and its versions.</p>
  */
object EntityRecognizerSummariesList extends Newtype[List[EntityRecognizerSummary]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerSummariesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EntityRecognizerSummary]] = list(EntityRecognizerSummary.schema).withId(id).addHints(hints)
  implicit val schema: Schema[EntityRecognizerSummariesList] = bijection(underlyingSchema, asBijection)
}
