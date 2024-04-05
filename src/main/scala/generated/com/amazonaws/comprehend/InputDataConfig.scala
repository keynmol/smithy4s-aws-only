package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>The input properties for an inference job. The document reader config field applies
  *       only to non-text inputs for custom analysis.</p>
  * @param S3Uri
  *   <p>The Amazon S3 URI for the input data. The URI must be in same Region as the API
  *         endpoint that you are calling. The URI can point to a single input file or it can provide the
  *         prefix for a collection of data files. </p>
  *            <p>For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a
  *         single file, Amazon Comprehend uses that file as input. If more than one file begins with the
  *         prefix, Amazon Comprehend uses all of them as input.</p>
  * @param InputFormat
  *   <p>Specifies how the text in an input file should be processed:</p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>ONE_DOC_PER_FILE</code> - Each file is considered a separate document. Use
  *             this option when you are processing large documents, such as newspaper articles or
  *             scientific papers.</p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>ONE_DOC_PER_LINE</code> - Each line in a file is considered a separate
  *             document. Use this option when you are processing many short documents, such as text
  *             messages.</p>
  *               </li>
  *            </ul>
  * @param DocumentReaderConfig
  *   <p>Provides configuration parameters to override the default actions for extracting text
  *         from PDF documents and image files.</p>
  */
final case class InputDataConfig(s3Uri: S3Uri, inputFormat: Option[InputFormat] = None, documentReaderConfig: Option[DocumentReaderConfig] = None)

object InputDataConfig extends ShapeTag.Companion[InputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "InputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The input properties for an inference job. The document reader config field applies\n      only to non-text inputs for custom analysis.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, inputFormat: Option[InputFormat], documentReaderConfig: Option[DocumentReaderConfig]): InputDataConfig = InputDataConfig(s3Uri, inputFormat, documentReaderConfig)

  implicit val schema: Schema[InputDataConfig] = struct(
    S3Uri.schema.required[InputDataConfig]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>The Amazon S3 URI for the input data. The URI must be in same Region as the API\n      endpoint that you are calling. The URI can point to a single input file or it can provide the\n      prefix for a collection of data files. </p>\n         <p>For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a\n      single file, Amazon Comprehend uses that file as input. If more than one file begins with the\n      prefix, Amazon Comprehend uses all of them as input.</p>")),
    InputFormat.schema.optional[InputDataConfig]("InputFormat", _.inputFormat).addHints(smithy.api.Documentation("<p>Specifies how the text in an input file should be processed:</p>\n         <ul>\n            <li>\n               <p>\n                  <code>ONE_DOC_PER_FILE</code> - Each file is considered a separate document. Use\n          this option when you are processing large documents, such as newspaper articles or\n          scientific papers.</p>\n            </li>\n            <li>\n               <p>\n                  <code>ONE_DOC_PER_LINE</code> - Each line in a file is considered a separate\n          document. Use this option when you are processing many short documents, such as text\n          messages.</p>\n            </li>\n         </ul>")),
    DocumentReaderConfig.schema.optional[InputDataConfig]("DocumentReaderConfig", _.documentReaderConfig).addHints(smithy.api.Documentation("<p>Provides configuration parameters to override the default actions for extracting text\n      from PDF documents and image files.</p>")),
  )(make).withId(id).addHints(hints)
}
