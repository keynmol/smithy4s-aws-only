package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Describes the annotations associated with a entity recognizer.</p>
  * @param S3Uri
  *   <p> Specifies the Amazon S3 location where the training documents for an entity recognizer
  *         are located. The URI must be in the same Region as the API endpoint that you are
  *         calling.</p>
  */
final case class DatasetEntityRecognizerAnnotations(s3Uri: S3Uri)

object DatasetEntityRecognizerAnnotations extends ShapeTag.Companion[DatasetEntityRecognizerAnnotations] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetEntityRecognizerAnnotations")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the annotations associated with a entity recognizer.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri): DatasetEntityRecognizerAnnotations = DatasetEntityRecognizerAnnotations(s3Uri)

  implicit val schema: Schema[DatasetEntityRecognizerAnnotations] = struct(
    S3Uri.schema.required[DatasetEntityRecognizerAnnotations]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p> Specifies the Amazon S3 location where the training documents for an entity recognizer\n      are located. The URI must be in the same Region as the API endpoint that you are\n      calling.</p>")),
  )(make).withId(id).addHints(hints)
}
