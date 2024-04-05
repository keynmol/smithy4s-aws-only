package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>An augmented manifest file that provides training data for your custom model. An augmented
  *       manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
  * @param SourceDocumentsS3Uri
  *   <p>The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest
  *         file.</p>
  * @param DocumentType
  *   <p>The type of augmented manifest. PlainTextDocument or SemiStructuredDocument. If you don't
  *         specify, the default is PlainTextDocument. </p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that
  *             is encoded in UTF-8.</p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and structural
  *             context, like a PDF. For training with Amazon Comprehend, only PDFs are supported. For
  *             inference, Amazon Comprehend support PDFs, DOCX and TXT.</p>
  *               </li>
  *            </ul>
  * @param AnnotationDataS3Uri
  *   <p>The S3 prefix to the annotation files that are referred in the augmented manifest
  *         file.</p>
  * @param S3Uri
  *   <p>The Amazon S3 location of the augmented manifest file.</p>
  * @param Split
  *   <p>The purpose of the data you've provided in the augmented manifest. You can either train or
  *         test this data. If you don't specify, the default is train.</p>
  *            <p>TRAIN - all of the documents in the manifest will be used for training. If no test
  *         documents are provided, Amazon Comprehend will automatically reserve a portion of the training
  *         documents for testing.</p>
  *            <p> TEST - all of the documents in the manifest will be used for testing.</p>
  * @param AttributeNames
  *   <p>The JSON attribute that contains the annotations for your training documents. The number
  *         of attribute names that you specify depends on whether your augmented manifest file is the
  *         output of a single labeling job or a chained labeling job.</p>
  *            <p>If your file is the output of a single labeling job, specify the LabelAttributeName key
  *         that was used when the job was created in Ground Truth.</p>
  *            <p>If your file is the output of a chained labeling job, specify the LabelAttributeName key
  *         for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from
  *         an individual job.</p>
  */
final case class AugmentedManifestsListItem(s3Uri: S3Uri, attributeNames: List[AttributeNamesListItem], split: Option[Split] = None, annotationDataS3Uri: Option[S3Uri] = None, sourceDocumentsS3Uri: Option[S3Uri] = None, documentType: Option[AugmentedManifestsDocumentTypeFormat] = None)

object AugmentedManifestsListItem extends ShapeTag.Companion[AugmentedManifestsListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "AugmentedManifestsListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>An augmented manifest file that provides training data for your custom model. An augmented\n      manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, split: Option[Split], attributeNames: List[AttributeNamesListItem], annotationDataS3Uri: Option[S3Uri], sourceDocumentsS3Uri: Option[S3Uri], documentType: Option[AugmentedManifestsDocumentTypeFormat]): AugmentedManifestsListItem = AugmentedManifestsListItem(s3Uri, attributeNames, split, annotationDataS3Uri, sourceDocumentsS3Uri, documentType)

  implicit val schema: Schema[AugmentedManifestsListItem] = struct(
    S3Uri.schema.required[AugmentedManifestsListItem]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>The Amazon S3 location of the augmented manifest file.</p>")),
    Split.schema.optional[AugmentedManifestsListItem]("Split", _.split).addHints(smithy.api.Documentation("<p>The purpose of the data you\'ve provided in the augmented manifest. You can either train or\n      test this data. If you don\'t specify, the default is train.</p>\n         <p>TRAIN - all of the documents in the manifest will be used for training. If no test\n      documents are provided, Amazon Comprehend will automatically reserve a portion of the training\n      documents for testing.</p>\n         <p> TEST - all of the documents in the manifest will be used for testing.</p>")),
    AttributeNamesList.underlyingSchema.required[AugmentedManifestsListItem]("AttributeNames", _.attributeNames).addHints(smithy.api.Documentation("<p>The JSON attribute that contains the annotations for your training documents. The number\n      of attribute names that you specify depends on whether your augmented manifest file is the\n      output of a single labeling job or a chained labeling job.</p>\n         <p>If your file is the output of a single labeling job, specify the LabelAttributeName key\n      that was used when the job was created in Ground Truth.</p>\n         <p>If your file is the output of a chained labeling job, specify the LabelAttributeName key\n      for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from\n      an individual job.</p>")),
    S3Uri.schema.optional[AugmentedManifestsListItem]("AnnotationDataS3Uri", _.annotationDataS3Uri).addHints(smithy.api.Documentation("<p>The S3 prefix to the annotation files that are referred in the augmented manifest\n      file.</p>")),
    S3Uri.schema.optional[AugmentedManifestsListItem]("SourceDocumentsS3Uri", _.sourceDocumentsS3Uri).addHints(smithy.api.Documentation("<p>The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest\n      file.</p>")),
    AugmentedManifestsDocumentTypeFormat.schema.optional[AugmentedManifestsListItem]("DocumentType", _.documentType).addHints(smithy.api.Documentation("<p>The type of augmented manifest. PlainTextDocument or SemiStructuredDocument. If you don\'t\n      specify, the default is PlainTextDocument. </p>\n         <ul>\n            <li>\n               <p>\n                  <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that\n          is encoded in UTF-8.</p>\n            </li>\n            <li>\n               <p>\n                  <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and structural\n          context, like a PDF. For training with Amazon Comprehend, only PDFs are supported. For\n          inference, Amazon Comprehend support PDFs, DOCX and TXT.</p>\n            </li>\n         </ul>")),
  )(make).withId(id).addHints(hints)
}
