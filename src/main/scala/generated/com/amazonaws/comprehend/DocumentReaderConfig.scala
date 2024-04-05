package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Provides configuration parameters to override the default actions for extracting text from PDF documents and image files. </p>
  *          <p> By default, Amazon Comprehend performs the following actions to extract text from files, based on the input file type: </p>
  *          <ul>
  *             <li>
  *                <p>
  *                   <b>Word files</b> - Amazon Comprehend parser extracts the text. </p>
  *             </li>
  *             <li>
  *                <p>
  *                   <b>Digital PDF files</b> - Amazon Comprehend parser extracts the text. </p>
  *             </li>
  *             <li>
  *                <p>
  *                   <b>Image files and scanned PDF files</b> - Amazon Comprehend uses the Amazon Textract <code>DetectDocumentText</code>
  *           API to extract the text. </p>
  *             </li>
  *          </ul>
  *          <p>
  *             <code>DocumentReaderConfig</code> does not apply to plain text files or Word files.</p>
  *          <p>
  *         For image files and PDF documents, you can override these default actions using the fields listed below.
  *         For more information, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-set-textract-options.html">
  *         Setting text extraction options</a> in the Comprehend Developer Guide.
  *     </p>
  * @param DocumentReadAction
  *   <p>This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files and image files.
  *         Enter one of the following values:</p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the <code>DetectDocumentText</code>
  *              API operation. </p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the <code>AnalyzeDocument</code>
  *             API operation. </p>
  *               </li>
  *            </ul>
  * @param DocumentReadMode
  *   <p>Determines the text extraction actions for PDF files. Enter one of the following values:</p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.</p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by
  *             DocumentReadAction for all PDF files, including digital PDF files. </p>
  *               </li>
  *            </ul>
  * @param FeatureTypes
  *   <p>Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code>
  *         as the read action, you must specify one or both of the following values:</p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>TABLES</code> - Returns information about any tables that are detected in the input document. </p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document. </p>
  *               </li>
  *            </ul>
  */
final case class DocumentReaderConfig(documentReadAction: DocumentReadAction, documentReadMode: Option[DocumentReadMode] = None, featureTypes: Option[List[DocumentReadFeatureTypes]] = None)

object DocumentReaderConfig extends ShapeTag.Companion[DocumentReaderConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentReaderConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides configuration parameters to override the default actions for extracting text from PDF documents and image files. </p>\n         <p> By default, Amazon Comprehend performs the following actions to extract text from files, based on the input file type: </p>\n         <ul>\n            <li>\n               <p>\n                  <b>Word files</b> - Amazon Comprehend parser extracts the text. </p>\n            </li>\n            <li>\n               <p>\n                  <b>Digital PDF files</b> - Amazon Comprehend parser extracts the text. </p>\n            </li>\n            <li>\n               <p>\n                  <b>Image files and scanned PDF files</b> - Amazon Comprehend uses the Amazon Textract <code>DetectDocumentText</code>\n          API to extract the text. </p>\n            </li>\n         </ul>\n         <p>\n            <code>DocumentReaderConfig</code> does not apply to plain text files or Word files.</p>\n         <p>\n        For image files and PDF documents, you can override these default actions using the fields listed below.\n        For more information, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/idp-set-textract-options.html\">\n        Setting text extraction options</a> in the Comprehend Developer Guide.\n    </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentReadAction: DocumentReadAction, documentReadMode: Option[DocumentReadMode], featureTypes: Option[List[DocumentReadFeatureTypes]]): DocumentReaderConfig = DocumentReaderConfig(documentReadAction, documentReadMode, featureTypes)

  implicit val schema: Schema[DocumentReaderConfig] = struct(
    DocumentReadAction.schema.required[DocumentReaderConfig]("DocumentReadAction", _.documentReadAction).addHints(smithy.api.Documentation("<p>This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files and image files.\n      Enter one of the following values:</p>\n         <ul>\n            <li>\n               <p>\n                  <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the <code>DetectDocumentText</code>\n           API operation. </p>\n            </li>\n            <li>\n               <p>\n                  <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the <code>AnalyzeDocument</code>\n          API operation. </p>\n            </li>\n         </ul>")),
    DocumentReadMode.schema.optional[DocumentReaderConfig]("DocumentReadMode", _.documentReadMode).addHints(smithy.api.Documentation("<p>Determines the text extraction actions for PDF files. Enter one of the following values:</p>\n         <ul>\n            <li>\n               <p>\n                  <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.</p>\n            </li>\n            <li>\n               <p>\n                  <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by\n          DocumentReadAction for all PDF files, including digital PDF files. </p>\n            </li>\n         </ul>")),
    ListOfDocumentReadFeatureTypes.underlyingSchema.optional[DocumentReaderConfig]("FeatureTypes", _.featureTypes).addHints(smithy.api.Documentation("<p>Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code>\n      as the read action, you must specify one or both of the following values:</p>\n         <ul>\n            <li>\n               <p>\n                  <code>TABLES</code> - Returns information about any tables that are detected in the input document. </p>\n            </li>\n            <li>\n               <p>\n                  <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document. </p>\n            </li>\n         </ul>")),
  )(make).withId(id).addHints(hints)
}
