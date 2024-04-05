package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Configuration required for a custom classification model.</p>
  * @param Mode
  *   <p>Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.</p>
  * @param Labels
  *   <p>One or more labels to associate with the custom classifier.</p>
  */
final case class DocumentClassificationConfig(mode: DocumentClassifierMode, labels: Option[List[LabelListItem]] = None)

object DocumentClassificationConfig extends ShapeTag.Companion[DocumentClassificationConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassificationConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Configuration required for a custom classification model.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(mode: DocumentClassifierMode, labels: Option[List[LabelListItem]]): DocumentClassificationConfig = DocumentClassificationConfig(mode, labels)

  implicit val schema: Schema[DocumentClassificationConfig] = struct(
    DocumentClassifierMode.schema.required[DocumentClassificationConfig]("Mode", _.mode).addHints(smithy.api.Documentation("<p>Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.</p>")),
    LabelsList.underlyingSchema.optional[DocumentClassificationConfig]("Labels", _.labels).addHints(smithy.api.Documentation("<p>One or more labels to associate with the custom classifier.</p>")),
  )(make).withId(id).addHints(hints)
}
