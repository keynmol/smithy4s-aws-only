package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>The X and Y coordinates of a point on a document page.</p>
  *            <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Point.html">Point</a> in the Amazon Textract API reference.</p>
  */
object Polygon extends Newtype[List[Point]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Polygon")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[Point]] = list(Point.schema).withId(id).addHints(hints)
  implicit val schema: Schema[Polygon] = bijection(underlyingSchema, asBijection)
}
