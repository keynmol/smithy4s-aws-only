package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.float
import smithy4s.schema.Schema.int
import smithy4s.schema.Schema.string
import smithy4s.schema.Schema.struct

/** <p>Specifies one of the label or labels that categorize the document being analyzed.</p>
  * @param Name
  *   <p>The name of the label.</p>
  * @param Score
  *   <p>The confidence score that Amazon Comprehend has this label correctly attributed.</p>
  * @param Page
  *   <p>Page number where the label occurs. This field is present
  *         in the response only if your request includes the <code>Byte</code> parameter. </p>
  */
final case class DocumentLabel(name: Option[String] = None, score: Option[Float] = None, page: Option[Int] = None)

object DocumentLabel extends ShapeTag.Companion[DocumentLabel] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentLabel")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies one of the label or labels that categorize the document being analyzed.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(name: Option[String], score: Option[Float], page: Option[Int]): DocumentLabel = DocumentLabel(name, score, page)

  implicit val schema: Schema[DocumentLabel] = struct(
    string.optional[DocumentLabel]("Name", _.name).addHints(smithy.api.Documentation("<p>The name of the label.</p>")),
    float.optional[DocumentLabel]("Score", _.score).addHints(smithy.api.Documentation("<p>The confidence score that Amazon Comprehend has this label correctly attributed.</p>")),
    int.optional[DocumentLabel]("Page", _.page).addHints(smithy.api.Documentation("<p>Page number where the label occurs. This field is present\n      in the response only if your request includes the <code>Byte</code> parameter. </p>")),
  )(make).withId(id).addHints(hints)
}
