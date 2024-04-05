package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>The input properties for training a document classifier. </p>
  *          <p>For more information on how the input file is formatted, see
  *       <a href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training data</a> in the Comprehend Developer Guide.
  *     </p>
  * @param LabelDelimiter
  *   <p>Indicates the delimiter used to separate each label for training a multi-label classifier.
  *         The default delimiter between labels is a pipe (|). You can use a different character as a
  *         delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the
  *         training documents use a delimiter other than the default or the delimiter you specify, the
  *         labels on that line will be combined to make a single unique label, such as
  *         LABELLABELLABEL.</p>
  * @param AugmentedManifests
  *   <p>A list of augmented manifest files that provide training data for your custom model. An
  *         augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
  *         Truth.</p>
  *            <p>This parameter is required if you set <code>DataFormat</code> to
  *           <code>AUGMENTED_MANIFEST</code>.</p>
  * @param DataFormat
  *   <p>The format of your training data:</p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the
  *             first column, and documents are provided in the second. If you use this value, you must
  *             provide the <code>S3Uri</code> parameter in your request.</p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon
  *             SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON
  *             object that contains a training document and its associated labels. </p>
  *                  <p>If you use this value, you must provide the <code>AugmentedManifests</code> parameter
  *             in your request.</p>
  *               </li>
  *            </ul>
  *            <p>If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the
  *         default.</p>
  * @param TestS3Uri
  *   <p>This specifies the Amazon S3 location where the test annotations for an entity recognizer
  *         are located. The URI must be in the same Amazon Web Services Region as the API endpoint that you are
  *         calling. </p>
  * @param DocumentType
  *   <p>The type of input documents for training the model. Provide plain-text documents to create a plain-text model, and
  *       provide semi-structured documents to create a native model.</p>
  * @param S3Uri
  *   <p>The Amazon S3 URI for the input data. The S3 bucket must be in the same Region as the API
  *         endpoint that you are calling. The URI can point to a single input file or it can provide the
  *         prefix for a collection of input files.</p>
  *            <p>For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a
  *         single file, Amazon Comprehend uses that file as input. If more than one file begins with the
  *         prefix, Amazon Comprehend uses all of them as input.</p>
  *            <p>This parameter is required if you set <code>DataFormat</code> to
  *           <code>COMPREHEND_CSV</code>.</p>
  * @param DocumentReaderConfig
  *   <p>Provides configuration parameters to override the default actions for extracting text from PDF documents and image files. </p>
  *            <p> By default, Amazon Comprehend performs the following actions to extract text from files, based on the input file type: </p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <b>Word files</b> - Amazon Comprehend parser extracts the text. </p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <b>Digital PDF files</b> - Amazon Comprehend parser extracts the text. </p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <b>Image files and scanned PDF files</b> - Amazon Comprehend uses the Amazon Textract <code>DetectDocumentText</code>
  *             API to extract the text. </p>
  *               </li>
  *            </ul>
  *            <p>
  *               <code>DocumentReaderConfig</code> does not apply to plain text files or Word files.</p>
  *            <p>
  *           For image files and PDF documents, you can override these default actions using the fields listed below.
  *           For more information, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-set-textract-options.html">
  *           Setting text extraction options</a> in the Comprehend Developer Guide.
  *       </p>
  * @param Documents
  *   <p>The S3 location of the training documents.
  *         This parameter is required in a request to create a native classifier model.</p>
  */
final case class DocumentClassifierInputDataConfig(dataFormat: Option[DocumentClassifierDataFormat] = None, s3Uri: Option[S3Uri] = None, testS3Uri: Option[S3Uri] = None, labelDelimiter: Option[LabelDelimiter] = None, augmentedManifests: Option[List[AugmentedManifestsListItem]] = None, documentType: Option[DocumentClassifierDocumentTypeFormat] = None, documents: Option[DocumentClassifierDocuments] = None, documentReaderConfig: Option[DocumentReaderConfig] = None)

object DocumentClassifierInputDataConfig extends ShapeTag.Companion[DocumentClassifierInputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierInputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The input properties for training a document classifier. </p>\n         <p>For more information on how the input file is formatted, see\n      <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html\">Preparing training data</a> in the Comprehend Developer Guide.\n    </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(dataFormat: Option[DocumentClassifierDataFormat], s3Uri: Option[S3Uri], testS3Uri: Option[S3Uri], labelDelimiter: Option[LabelDelimiter], augmentedManifests: Option[List[AugmentedManifestsListItem]], documentType: Option[DocumentClassifierDocumentTypeFormat], documents: Option[DocumentClassifierDocuments], documentReaderConfig: Option[DocumentReaderConfig]): DocumentClassifierInputDataConfig = DocumentClassifierInputDataConfig(dataFormat, s3Uri, testS3Uri, labelDelimiter, augmentedManifests, documentType, documents, documentReaderConfig)

  implicit val schema: Schema[DocumentClassifierInputDataConfig] = struct(
    DocumentClassifierDataFormat.schema.optional[DocumentClassifierInputDataConfig]("DataFormat", _.dataFormat).addHints(smithy.api.Documentation("<p>The format of your training data:</p>\n         <ul>\n            <li>\n               <p>\n                  <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the\n          first column, and documents are provided in the second. If you use this value, you must\n          provide the <code>S3Uri</code> parameter in your request.</p>\n            </li>\n            <li>\n               <p>\n                  <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon\n          SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON\n          object that contains a training document and its associated labels. </p>\n               <p>If you use this value, you must provide the <code>AugmentedManifests</code> parameter\n          in your request.</p>\n            </li>\n         </ul>\n         <p>If you don\'t specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the\n      default.</p>")),
    S3Uri.schema.optional[DocumentClassifierInputDataConfig]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>The Amazon S3 URI for the input data. The S3 bucket must be in the same Region as the API\n      endpoint that you are calling. The URI can point to a single input file or it can provide the\n      prefix for a collection of input files.</p>\n         <p>For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a\n      single file, Amazon Comprehend uses that file as input. If more than one file begins with the\n      prefix, Amazon Comprehend uses all of them as input.</p>\n         <p>This parameter is required if you set <code>DataFormat</code> to\n        <code>COMPREHEND_CSV</code>.</p>")),
    S3Uri.schema.optional[DocumentClassifierInputDataConfig]("TestS3Uri", _.testS3Uri).addHints(smithy.api.Documentation("<p>This specifies the Amazon S3 location where the test annotations for an entity recognizer\n      are located. The URI must be in the same Amazon Web Services Region as the API endpoint that you are\n      calling. </p>")),
    LabelDelimiter.schema.optional[DocumentClassifierInputDataConfig]("LabelDelimiter", _.labelDelimiter).addHints(smithy.api.Documentation("<p>Indicates the delimiter used to separate each label for training a multi-label classifier.\n      The default delimiter between labels is a pipe (|). You can use a different character as a\n      delimiter (if it\'s an allowed character) by specifying it under Delimiter for labels. If the\n      training documents use a delimiter other than the default or the delimiter you specify, the\n      labels on that line will be combined to make a single unique label, such as\n      LABELLABELLABEL.</p>")),
    DocumentClassifierAugmentedManifestsList.underlyingSchema.optional[DocumentClassifierInputDataConfig]("AugmentedManifests", _.augmentedManifests).addHints(smithy.api.Documentation("<p>A list of augmented manifest files that provide training data for your custom model. An\n      augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground\n      Truth.</p>\n         <p>This parameter is required if you set <code>DataFormat</code> to\n        <code>AUGMENTED_MANIFEST</code>.</p>")),
    DocumentClassifierDocumentTypeFormat.schema.optional[DocumentClassifierInputDataConfig]("DocumentType", _.documentType).addHints(smithy.api.Documentation("<p>The type of input documents for training the model. Provide plain-text documents to create a plain-text model, and\n    provide semi-structured documents to create a native model.</p>")),
    DocumentClassifierDocuments.schema.optional[DocumentClassifierInputDataConfig]("Documents", _.documents).addHints(smithy.api.Documentation("<p>The S3 location of the training documents.\n      This parameter is required in a request to create a native classifier model.</p>")),
    DocumentReaderConfig.schema.optional[DocumentClassifierInputDataConfig]("DocumentReaderConfig", _.documentReaderConfig),
  )(make).withId(id).addHints(hints)
}
