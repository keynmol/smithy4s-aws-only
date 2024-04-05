package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Describes the annotations associated with a entity recognizer.</p>
  * @param S3Uri
  *   <p> Specifies the Amazon S3 location where the annotations for an entity recognizer are
  *         located. The URI must be in the same Region as the API endpoint that you are calling.</p>
  * @param TestS3Uri
  *   <p> Specifies the Amazon S3 location where the test annotations for an entity recognizer are
  *         located. The URI must be in the same Region as the API endpoint that you are calling.</p>
  */
final case class EntityRecognizerAnnotations(s3Uri: S3Uri, testS3Uri: Option[S3Uri] = None)

object EntityRecognizerAnnotations extends ShapeTag.Companion[EntityRecognizerAnnotations] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerAnnotations")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the annotations associated with a entity recognizer.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, testS3Uri: Option[S3Uri]): EntityRecognizerAnnotations = EntityRecognizerAnnotations(s3Uri, testS3Uri)

  implicit val schema: Schema[EntityRecognizerAnnotations] = struct(
    S3Uri.schema.required[EntityRecognizerAnnotations]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p> Specifies the Amazon S3 location where the annotations for an entity recognizer are\n      located. The URI must be in the same Region as the API endpoint that you are calling.</p>")),
    S3Uri.schema.optional[EntityRecognizerAnnotations]("TestS3Uri", _.testS3Uri).addHints(smithy.api.Documentation("<p> Specifies the Amazon S3 location where the test annotations for an entity recognizer are\n      located. The URI must be in the same Region as the API endpoint that you are calling.</p>")),
  )(make).withId(id).addHints(hints)
}
