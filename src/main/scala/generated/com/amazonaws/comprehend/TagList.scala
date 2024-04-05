package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For
  *         example, a tag with the key-value pair ‘Department’:’Sales’ might be added to a resource to
  *         indicate its use by a particular department. </p>
  */
object TagList extends Newtype[List[Tag]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TagList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[Tag]] = list(Tag.schema).withId(id).addHints(hints)
  implicit val schema: Schema[TagList] = bijection(underlyingSchema, asBijection)
}
