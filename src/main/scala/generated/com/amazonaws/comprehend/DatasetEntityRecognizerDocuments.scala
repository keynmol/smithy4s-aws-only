package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Describes the documents submitted with a dataset for an entity recognizer model.</p>
  * @param S3Uri
  *   <p> Specifies the Amazon S3 location where the documents for the dataset
  *         are located.  </p>
  * @param InputFormat
  *   <p> Specifies how the text in an input file should be processed. This is optional, and the
  *         default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document.
  *         Use this option when you are processing large documents, such as newspaper articles or
  *         scientific papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate document.
  *         Use this option when you are processing many short documents, such as text messages.</p>
  */
final case class DatasetEntityRecognizerDocuments(s3Uri: S3Uri, inputFormat: Option[InputFormat] = None)

object DatasetEntityRecognizerDocuments extends ShapeTag.Companion[DatasetEntityRecognizerDocuments] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetEntityRecognizerDocuments")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the documents submitted with a dataset for an entity recognizer model.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, inputFormat: Option[InputFormat]): DatasetEntityRecognizerDocuments = DatasetEntityRecognizerDocuments(s3Uri, inputFormat)

  implicit val schema: Schema[DatasetEntityRecognizerDocuments] = struct(
    S3Uri.schema.required[DatasetEntityRecognizerDocuments]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p> Specifies the Amazon S3 location where the documents for the dataset\n      are located.  </p>")),
    InputFormat.schema.optional[DatasetEntityRecognizerDocuments]("InputFormat", _.inputFormat).addHints(smithy.api.Documentation("<p> Specifies how the text in an input file should be processed. This is optional, and the\n      default is ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document.\n      Use this option when you are processing large documents, such as newspaper articles or\n      scientific papers. ONE_DOC_PER_LINE - Each line in a file is considered a separate document.\n      Use this option when you are processing many short documents, such as text messages.</p>")),
  )(make).withId(id).addHints(hints)
}
