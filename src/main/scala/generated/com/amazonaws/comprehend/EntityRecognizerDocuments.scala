package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Describes the training documents submitted with an entity recognizer.</p>
  * @param S3Uri
  *   <p> Specifies the Amazon S3 location where the training documents for an entity recognizer
  *         are located. The URI must be in the same Region as the API endpoint that you are
  *         calling.</p>
  * @param TestS3Uri
  *   <p> Specifies the Amazon S3 location where the test documents for an entity recognizer are
  *         located. The URI must be in the same Amazon Web Services Region as the API endpoint that you are
  *         calling.</p>
  * @param InputFormat
  *   <p> Specifies how the text in an input file should be processed. This is optional, and the
  *         default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document.
  *         Use this option when you are processing large documents, such as newspaper articles or
  *         scientific papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate document.
  *         Use this option when you are processing many short documents, such as text messages.</p>
  */
final case class EntityRecognizerDocuments(s3Uri: S3Uri, testS3Uri: Option[S3Uri] = None, inputFormat: Option[InputFormat] = None)

object EntityRecognizerDocuments extends ShapeTag.Companion[EntityRecognizerDocuments] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerDocuments")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the training documents submitted with an entity recognizer.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, testS3Uri: Option[S3Uri], inputFormat: Option[InputFormat]): EntityRecognizerDocuments = EntityRecognizerDocuments(s3Uri, testS3Uri, inputFormat)

  implicit val schema: Schema[EntityRecognizerDocuments] = struct(
    S3Uri.schema.required[EntityRecognizerDocuments]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p> Specifies the Amazon S3 location where the training documents for an entity recognizer\n      are located. The URI must be in the same Region as the API endpoint that you are\n      calling.</p>")),
    S3Uri.schema.optional[EntityRecognizerDocuments]("TestS3Uri", _.testS3Uri).addHints(smithy.api.Documentation("<p> Specifies the Amazon S3 location where the test documents for an entity recognizer are\n      located. The URI must be in the same Amazon Web Services Region as the API endpoint that you are\n      calling.</p>")),
    InputFormat.schema.optional[EntityRecognizerDocuments]("InputFormat", _.inputFormat).addHints(smithy.api.Documentation("<p> Specifies how the text in an input file should be processed. This is optional, and the\n      default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document.\n      Use this option when you are processing large documents, such as newspaper articles or\n      scientific papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate document.\n      Use this option when you are processing many short documents, such as text messages.</p>")),
  )(make).withId(id).addHints(hints)
}
