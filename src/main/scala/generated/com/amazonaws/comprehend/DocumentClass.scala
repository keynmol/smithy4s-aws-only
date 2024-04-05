package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Specifies the class that categorizes the document being analyzed</p>
  * @param Name
  *   <p>The name of the class.</p>
  * @param Score
  *   <p>The confidence score that Amazon Comprehend has this class correctly attributed.</p>
  * @param Page
  *   <p>Page number in the input document. This field is present
  *         in the response only if your request includes the <code>Byte</code> parameter. </p>
  */
final case class DocumentClass(name: Option[String] = None, score: Option[Float] = None, page: Option[Int] = None)

object DocumentClass extends ShapeTag.Companion[DocumentClass] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClass")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies the class that categorizes the document being analyzed</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[String], score: Option[Float], page: Option[Int]): DocumentClass = DocumentClass(name, score, page)

  implicit val schema: Schema[DocumentClass] = struct(
    string.optional[DocumentClass]("Name", _.name).addHints(smithy.api.Documentation("<p>The name of the class.</p>")),
    float.optional[DocumentClass]("Score", _.score).addHints(smithy.api.Documentation("<p>The confidence score that Amazon Comprehend has this class correctly attributed.</p>")),
    int.optional[DocumentClass]("Page", _.page).addHints(smithy.api.Documentation("<p>Page number in the input document. This field is present\n      in the response only if your request includes the <code>Byte</code> parameter. </p>")),
  )(make).withId(id).addHints(hints)
}
