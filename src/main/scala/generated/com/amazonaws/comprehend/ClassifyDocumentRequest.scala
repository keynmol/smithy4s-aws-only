package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Text
  *   <p>The document text to be analyzed. If you enter text using this parameter,
  *         do not use the <code>Bytes</code> parameter.</p>
  * @param EndpointArn
  *   <p>The Amazon Resource Number (ARN) of the endpoint. For information about endpoints, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.</p>
  * @param Bytes
  *   <p>Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file.
  *         You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code>
  *         or <code>AnalyzeDocument</code> output file.</p>
  *            <p>Provide the input document as a sequence of base64-encoded bytes.
  *         If your code uses an Amazon Web Services SDK to classify documents, the SDK may encode
  *         the document file bytes for you. </p>
  *            <p>The maximum length of this field depends on the input document type. For details, see
  *         <a href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html">
  *           Inputs for real-time custom analysis</a> in the Comprehend Developer Guide. </p>
  *            <p>If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.</p>
  * @param DocumentReaderConfig
  *   <p>Provides configuration parameters to override the default actions for extracting text
  *         from PDF documents and image files.</p>
  */
final case class ClassifyDocumentRequest(endpointArn: DocumentClassifierEndpointArn, text: Option[CustomerInputString] = None, bytes: Option[SemiStructuredDocumentBlob] = None, documentReaderConfig: Option[DocumentReaderConfig] = None)

object ClassifyDocumentRequest extends ShapeTag.Companion[ClassifyDocumentRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ClassifyDocumentRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: Option[CustomerInputString], endpointArn: DocumentClassifierEndpointArn, bytes: Option[SemiStructuredDocumentBlob], documentReaderConfig: Option[DocumentReaderConfig]): ClassifyDocumentRequest = ClassifyDocumentRequest(endpointArn, text, bytes, documentReaderConfig)

  implicit val schema: Schema[ClassifyDocumentRequest] = struct(
    CustomerInputString.schema.optional[ClassifyDocumentRequest]("Text", _.text).addHints(smithy.api.Documentation("<p>The document text to be analyzed. If you enter text using this parameter,\n      do not use the <code>Bytes</code> parameter.</p>")),
    DocumentClassifierEndpointArn.schema.required[ClassifyDocumentRequest]("EndpointArn", _.endpointArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the endpoint. For information about endpoints, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html\">Managing endpoints</a>.</p>")),
    SemiStructuredDocumentBlob.schema.optional[ClassifyDocumentRequest]("Bytes", _.bytes).addHints(smithy.api.Documentation("<p>Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file.\n      You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code>\n      or <code>AnalyzeDocument</code> output file.</p>\n         <p>Provide the input document as a sequence of base64-encoded bytes.\n      If your code uses an Amazon Web Services SDK to classify documents, the SDK may encode\n      the document file bytes for you. </p>\n         <p>The maximum length of this field depends on the input document type. For details, see\n      <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html\">\n        Inputs for real-time custom analysis</a> in the Comprehend Developer Guide. </p>\n         <p>If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.</p>")),
    DocumentReaderConfig.schema.optional[ClassifyDocumentRequest]("DocumentReaderConfig", _.documentReaderConfig).addHints(smithy.api.Documentation("<p>Provides configuration parameters to override the default actions for extracting text\n      from PDF documents and image files.</p>")),
  )(make).withId(id).addHints(hints)
}
