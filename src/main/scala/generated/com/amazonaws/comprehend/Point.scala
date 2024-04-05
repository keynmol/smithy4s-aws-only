package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.struct

/** <p>The X and Y coordinates of a point on a document page.</p>
  *          <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Point.html">Point</a> in the Amazon Textract API reference.</p>
  * @param X
  *   <p>The value of the X coordinate for a point on a polygon</p>
  * @param Y
  *   <p>The value of the Y coordinate for a point on a polygon</p>
  */
final case class Point(x: Option[Float] = None, y: Option[Float] = None)

object Point extends ShapeTag.Companion[Point] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Point")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The X and Y coordinates of a point on a document page.</p>\n         <p>For additional information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/API_Point.html\">Point</a> in the Amazon Textract API reference.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(x: Option[Float], y: Option[Float]): Point = Point(x, y)

  implicit val schema: Schema[Point] = struct(
    float.optional[Point]("X", _.x).addHints(smithy.api.Documentation("<p>The value of the X coordinate for a point on a polygon</p>")),
    float.optional[Point]("Y", _.y).addHints(smithy.api.Documentation("<p>The value of the Y coordinate for a point on a polygon</p>")),
  )(make).withId(id).addHints(hints)
}
