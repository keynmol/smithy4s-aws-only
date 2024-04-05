package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.struct

/** <p>The bounding box around the detected page
  *      or around an element on a document page.
  *     The left (x-coordinate) and top (y-coordinate) are coordinates that
  *       represent the top and left sides of the bounding box. Note that the upper-left
  *       corner of the image is the origin (0,0). </p>
  *          <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_BoundingBox.html">BoundingBox</a> in the Amazon Textract API reference.</p>
  * @param Height
  *   <p>The height of the bounding box as a ratio of the overall document page height.</p>
  * @param Left
  *   <p>The left coordinate of the bounding box as a ratio of overall document page width.</p>
  * @param Top
  *   <p>The top coordinate of the bounding box as a ratio of overall document page height.</p>
  * @param Width
  *   <p>The width of the bounding box as a ratio of the overall document page width.</p>
  */
final case class BoundingBox(height: Option[Float] = None, left: Option[Float] = None, top: Option[Float] = None, width: Option[Float] = None)

object BoundingBox extends ShapeTag.Companion[BoundingBox] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "BoundingBox")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The bounding box around the detected page\n     or around an element on a document page.\n    The left (x-coordinate) and top (y-coordinate) are coordinates that\n      represent the top and left sides of the bounding box. Note that the upper-left\n      corner of the image is the origin (0,0). </p>\n         <p>For additional information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/API_BoundingBox.html\">BoundingBox</a> in the Amazon Textract API reference.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(height: Option[Float], left: Option[Float], top: Option[Float], width: Option[Float]): BoundingBox = BoundingBox(height, left, top, width)

  implicit val schema: Schema[BoundingBox] = struct(
    float.optional[BoundingBox]("Height", _.height).addHints(smithy.api.Documentation("<p>The height of the bounding box as a ratio of the overall document page height.</p>")),
    float.optional[BoundingBox]("Left", _.left).addHints(smithy.api.Documentation("<p>The left coordinate of the bounding box as a ratio of overall document page width.</p>")),
    float.optional[BoundingBox]("Top", _.top).addHints(smithy.api.Documentation("<p>The top coordinate of the bounding box as a ratio of overall document page height.</p>")),
    float.optional[BoundingBox]("Width", _.width).addHints(smithy.api.Documentation("<p>The width of the bounding box as a ratio of the overall document page width.</p>")),
  )(make).withId(id).addHints(hints)
}
