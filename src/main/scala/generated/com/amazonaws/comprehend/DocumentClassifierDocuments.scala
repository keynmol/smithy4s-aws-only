package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>The location of the training documents. This parameter is required in a request to create a native classifier model.</p>
  * @param S3Uri
  *   <p>The S3 URI location of the training documents specified in the S3Uri CSV file.</p>
  * @param TestS3Uri
  *   <p>The S3 URI location of the test documents included in the TestS3Uri CSV file.
  *         This field is not required if you do not specify a test CSV file.</p>
  */
final case class DocumentClassifierDocuments(s3Uri: S3Uri, testS3Uri: Option[S3Uri] = None)

object DocumentClassifierDocuments extends ShapeTag.Companion[DocumentClassifierDocuments] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierDocuments")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The location of the training documents. This parameter is required in a request to create a native classifier model.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, testS3Uri: Option[S3Uri]): DocumentClassifierDocuments = DocumentClassifierDocuments(s3Uri, testS3Uri)

  implicit val schema: Schema[DocumentClassifierDocuments] = struct(
    S3Uri.schema.required[DocumentClassifierDocuments]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>The S3 URI location of the training documents specified in the S3Uri CSV file.</p>")),
    S3Uri.schema.optional[DocumentClassifierDocuments]("TestS3Uri", _.testS3Uri).addHints(smithy.api.Documentation("<p>The S3 URI location of the test documents included in the TestS3Uri CSV file.\n      This field is not required if you do not specify a test CSV file.</p>")),
  )(make).withId(id).addHints(hints)
}
