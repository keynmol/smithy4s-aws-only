package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Describes the dataset input data configuration for a document classifier model.</p>
  *          <p>For more information on how the input file is formatted, see  <a href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training data</a>
  *       in the Comprehend Developer Guide. </p>
  * @param S3Uri
  *   <p>The Amazon S3 URI for the input data. The S3 bucket must be in the same Region as the API
  *         endpoint that you are calling. The URI can point to a single input file or it can provide the
  *         prefix for a collection of input files.</p>
  *            <p>For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a
  *         single file, Amazon Comprehend uses that file as input. If more than one file begins with the
  *         prefix, Amazon Comprehend uses all of them as input.</p>
  *            <p>This parameter is required if you set <code>DataFormat</code> to
  *         <code>COMPREHEND_CSV</code>.</p>
  * @param LabelDelimiter
  *   <p>Indicates the delimiter used to separate each label for training a multi-label classifier.
  *         The default delimiter between labels is a pipe (|). You can use a different character as a
  *         delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the
  *         training documents use a delimiter other than the default or the delimiter you specify, the
  *         labels on that line will be combined to make a single unique label, such as
  *         LABELLABELLABEL.</p>
  */
final case class DatasetDocumentClassifierInputDataConfig(s3Uri: S3Uri, labelDelimiter: Option[LabelDelimiter] = None)

object DatasetDocumentClassifierInputDataConfig extends ShapeTag.Companion[DatasetDocumentClassifierInputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetDocumentClassifierInputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the dataset input data configuration for a document classifier model.</p>\n         <p>For more information on how the input file is formatted, see  <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html\">Preparing training data</a>\n      in the Comprehend Developer Guide. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, labelDelimiter: Option[LabelDelimiter]): DatasetDocumentClassifierInputDataConfig = DatasetDocumentClassifierInputDataConfig(s3Uri, labelDelimiter)

  implicit val schema: Schema[DatasetDocumentClassifierInputDataConfig] = struct(
    S3Uri.schema.required[DatasetDocumentClassifierInputDataConfig]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>The Amazon S3 URI for the input data. The S3 bucket must be in the same Region as the API\n      endpoint that you are calling. The URI can point to a single input file or it can provide the\n      prefix for a collection of input files.</p>\n         <p>For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a\n      single file, Amazon Comprehend uses that file as input. If more than one file begins with the\n      prefix, Amazon Comprehend uses all of them as input.</p>\n         <p>This parameter is required if you set <code>DataFormat</code> to\n      <code>COMPREHEND_CSV</code>.</p>")),
    LabelDelimiter.schema.optional[DatasetDocumentClassifierInputDataConfig]("LabelDelimiter", _.labelDelimiter).addHints(smithy.api.Documentation("<p>Indicates the delimiter used to separate each label for training a multi-label classifier.\n      The default delimiter between labels is a pipe (|). You can use a different character as a\n      delimiter (if it\'s an allowed character) by specifying it under Delimiter for labels. If the\n      training documents use a delimiter other than the default or the delimiter you specify, the\n      labels on that line will be combined to make a single unique label, such as\n      LABELLABELLABEL.</p>")),
  )(make).withId(id).addHints(hints)
}
