package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Information about the location of items on a document page.</p>
  *          <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Geometry.html">Geometry</a> in the Amazon Textract API reference.</p>
  * @param BoundingBox
  *   <p>An axis-aligned coarse representation of the location of the recognized item on the
  *         document page.</p>
  * @param Polygon
  *   <p>Within the bounding box, a fine-grained polygon around the recognized item.</p>
  */
final case class Geometry(boundingBox: Option[BoundingBox] = None, polygon: Option[List[Point]] = None)

object Geometry extends ShapeTag.Companion[Geometry] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Geometry")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Information about the location of items on a document page.</p>\n         <p>For additional information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/API_Geometry.html\">Geometry</a> in the Amazon Textract API reference.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(boundingBox: Option[BoundingBox], polygon: Option[List[Point]]): Geometry = Geometry(boundingBox, polygon)

  implicit val schema: Schema[Geometry] = struct(
    BoundingBox.schema.optional[Geometry]("BoundingBox", _.boundingBox).addHints(smithy.api.Documentation("<p>An axis-aligned coarse representation of the location of the recognized item on the\n      document page.</p>")),
    Polygon.underlyingSchema.optional[Geometry]("Polygon", _.polygon).addHints(smithy.api.Documentation("<p>Within the bounding box, a fine-grained polygon around the recognized item.</p>")),
  )(make).withId(id).addHints(hints)
}
