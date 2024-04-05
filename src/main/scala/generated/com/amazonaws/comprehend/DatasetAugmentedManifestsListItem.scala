package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>An augmented manifest file that provides training data for your custom model.
  *       An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
  * @param SourceDocumentsS3Uri
  *   <p>The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest
  *         file.</p>
  * @param DocumentType
  *   <p>The type of augmented manifest. If you don't specify, the default is PlainTextDocument. </p>
  *            <p>
  *               <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that
  *         is encoded in UTF-8.</p>
  * @param AnnotationDataS3Uri
  *   <p>The S3 prefix to the annotation files that are referred in the augmented manifest
  *         file.</p>
  * @param S3Uri
  *   <p>The Amazon S3 location of the augmented manifest file.</p>
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
final case class DatasetAugmentedManifestsListItem(attributeNames: List[AttributeNamesListItem], s3Uri: S3Uri, annotationDataS3Uri: Option[S3Uri] = None, sourceDocumentsS3Uri: Option[S3Uri] = None, documentType: Option[AugmentedManifestsDocumentTypeFormat] = None)

object DatasetAugmentedManifestsListItem extends ShapeTag.Companion[DatasetAugmentedManifestsListItem] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetAugmentedManifestsListItem")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>An augmented manifest file that provides training data for your custom model.\n      An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(attributeNames: List[AttributeNamesListItem], s3Uri: S3Uri, annotationDataS3Uri: Option[S3Uri], sourceDocumentsS3Uri: Option[S3Uri], documentType: Option[AugmentedManifestsDocumentTypeFormat]): DatasetAugmentedManifestsListItem = DatasetAugmentedManifestsListItem(attributeNames, s3Uri, annotationDataS3Uri, sourceDocumentsS3Uri, documentType)

  implicit val schema: Schema[DatasetAugmentedManifestsListItem] = struct(
    AttributeNamesList.underlyingSchema.required[DatasetAugmentedManifestsListItem]("AttributeNames", _.attributeNames).addHints(smithy.api.Documentation("<p>The JSON attribute that contains the annotations for your training documents. The number\n      of attribute names that you specify depends on whether your augmented manifest file is the\n      output of a single labeling job or a chained labeling job.</p>\n         <p>If your file is the output of a single labeling job, specify the LabelAttributeName key\n      that was used when the job was created in Ground Truth.</p>\n         <p>If your file is the output of a chained labeling job, specify the LabelAttributeName key\n      for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from\n      an individual job.</p>")),
    S3Uri.schema.required[DatasetAugmentedManifestsListItem]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>The Amazon S3 location of the augmented manifest file.</p>")),
    S3Uri.schema.optional[DatasetAugmentedManifestsListItem]("AnnotationDataS3Uri", _.annotationDataS3Uri).addHints(smithy.api.Documentation("<p>The S3 prefix to the annotation files that are referred in the augmented manifest\n      file.</p>")),
    S3Uri.schema.optional[DatasetAugmentedManifestsListItem]("SourceDocumentsS3Uri", _.sourceDocumentsS3Uri).addHints(smithy.api.Documentation("<p>The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest\n      file.</p>")),
    AugmentedManifestsDocumentTypeFormat.schema.optional[DatasetAugmentedManifestsListItem]("DocumentType", _.documentType).addHints(smithy.api.Documentation("<p>The type of augmented manifest. If you don\'t specify, the default is PlainTextDocument. </p>\n         <p>\n            <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that\n      is encoded in UTF-8.</p>")),
  )(make).withId(id).addHints(hints)
}
