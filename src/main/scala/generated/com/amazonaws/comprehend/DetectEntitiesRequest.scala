package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Bytes
  *   <p>This field applies only when you use a custom entity recognition model that
  *         was trained with PDF annotations. For other cases,
  *         enter your text input in the <code>Text</code> field.</p>
  *            <p>
  *         Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file.
  *         Using a plain-text file in the <code>Bytes</code> parameter is equivelent to using the
  *         <code>Text</code> parameter (the <code>Entities</code> field in the response is identical).</p>
  *            <p>You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code>
  *         or <code>AnalyzeDocument</code> output file.</p>
  *            <p>Provide the input document as a sequence of base64-encoded bytes.
  *         If your code uses an Amazon Web Services SDK to detect entities, the SDK may encode
  *         the document file bytes for you. </p>
  *            <p>The maximum length of this field depends on the input document type. For details, see
  *         <a href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html">
  *           Inputs for real-time custom analysis</a> in the Comprehend Developer Guide. </p>
  *            <p>If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.</p>
  * @param EndpointArn
  *   <p>The Amazon Resource Name of an endpoint that is associated with a custom entity
  *         recognition model. Provide an endpoint if you want to detect entities by using your own custom
  *         model instead of the default model that is used by Amazon Comprehend.</p>
  *            <p>If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and
  *         it ignores any language code that you provide in your request.</p>
  *            <p>For information about endpoints, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.</p>
  * @param Text
  *   <p>A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter,
  *       do not use the <code>Bytes</code> parameter.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. You can specify any of the primary languages
  *         supported by Amazon Comprehend. If your request includes the endpoint for a custom entity recognition model, Amazon
  *         Comprehend uses the language of your custom model, and it ignores any language code that you
  *         specify here.</p>
  *            <p>All input documents must be in the same language.</p>
  * @param DocumentReaderConfig
  *   <p>Provides configuration parameters to override the default actions for extracting text
  *         from PDF documents and image files.</p>
  */
final case class DetectEntitiesRequest(text: Option[CustomerInputString] = None, languageCode: Option[LanguageCode] = None, endpointArn: Option[EntityRecognizerEndpointArn] = None, bytes: Option[SemiStructuredDocumentBlob] = None, documentReaderConfig: Option[DocumentReaderConfig] = None)

object DetectEntitiesRequest extends ShapeTag.Companion[DetectEntitiesRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectEntitiesRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(text: Option[CustomerInputString], languageCode: Option[LanguageCode], endpointArn: Option[EntityRecognizerEndpointArn], bytes: Option[SemiStructuredDocumentBlob], documentReaderConfig: Option[DocumentReaderConfig]): DetectEntitiesRequest = DetectEntitiesRequest(text, languageCode, endpointArn, bytes, documentReaderConfig)

  implicit val schema: Schema[DetectEntitiesRequest] = struct(
    CustomerInputString.schema.optional[DetectEntitiesRequest]("Text", _.text).addHints(smithy.api.Documentation("<p>A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter,\n    do not use the <code>Bytes</code> parameter.</p>")),
    LanguageCode.schema.optional[DetectEntitiesRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. You can specify any of the primary languages\n      supported by Amazon Comprehend. If your request includes the endpoint for a custom entity recognition model, Amazon\n      Comprehend uses the language of your custom model, and it ignores any language code that you\n      specify here.</p>\n         <p>All input documents must be in the same language.</p>")),
    EntityRecognizerEndpointArn.schema.optional[DetectEntitiesRequest]("EndpointArn", _.endpointArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name of an endpoint that is associated with a custom entity\n      recognition model. Provide an endpoint if you want to detect entities by using your own custom\n      model instead of the default model that is used by Amazon Comprehend.</p>\n         <p>If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and\n      it ignores any language code that you provide in your request.</p>\n         <p>For information about endpoints, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html\">Managing endpoints</a>.</p>")),
    SemiStructuredDocumentBlob.schema.optional[DetectEntitiesRequest]("Bytes", _.bytes).addHints(smithy.api.Documentation("<p>This field applies only when you use a custom entity recognition model that\n      was trained with PDF annotations. For other cases,\n      enter your text input in the <code>Text</code> field.</p>\n         <p>\n      Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file.\n      Using a plain-text file in the <code>Bytes</code> parameter is equivelent to using the\n      <code>Text</code> parameter (the <code>Entities</code> field in the response is identical).</p>\n         <p>You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code>\n      or <code>AnalyzeDocument</code> output file.</p>\n         <p>Provide the input document as a sequence of base64-encoded bytes.\n      If your code uses an Amazon Web Services SDK to detect entities, the SDK may encode\n      the document file bytes for you. </p>\n         <p>The maximum length of this field depends on the input document type. For details, see\n      <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html\">\n        Inputs for real-time custom analysis</a> in the Comprehend Developer Guide. </p>\n         <p>If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.</p>")),
    DocumentReaderConfig.schema.optional[DetectEntitiesRequest]("DocumentReaderConfig", _.documentReaderConfig).addHints(smithy.api.Documentation("<p>Provides configuration parameters to override the default actions for extracting text\n      from PDF documents and image files.</p>")),
  )(make).withId(id).addHints(hints)
}
