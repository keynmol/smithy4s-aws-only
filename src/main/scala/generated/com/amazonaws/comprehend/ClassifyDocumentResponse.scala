package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Classes
  *   <p>The classes used by the document being analyzed. These are used for multi-class trained
  *         models. Individual classes are mutually exclusive and each document is expected to have only a
  *         single class assigned to it. For example, an animal can be a dog or a cat, but not both at the
  *         same time. </p>
  * @param Errors
  *   <p>Page-level errors that the system detected while processing the input document.
  *         The field is empty if the system encountered no errors.</p>
  * @param DocumentType
  *   <p>The document type for each page in the input document. This field is present
  *         in the response only if your request includes the <code>Byte</code> parameter. </p>
  * @param DocumentMetadata
  *   <p>Extraction information about the document. This field is present
  *         in the response only if your request includes the <code>Byte</code> parameter. </p>
  * @param Labels
  *   <p>The labels used the document being analyzed. These are used for multi-label trained
  *         models. Individual labels represent different categories that are related in some manner and
  *         are not mutually exclusive. For example, a movie can be just an action movie, or it can be an
  *         action movie, a science fiction movie, and a comedy, all at the same time. </p>
  * @param Warnings
  *   <p>Warnings detected while processing the input document.
  *         The response includes a warning if there is a mismatch between the input document type
  *         and the model type associated with the endpoint that you specified. The response can also include
  *          warnings for individual pages that have a mismatch. </p>
  *            <p>The field is empty if the system generated no warnings.</p>
  */
final case class ClassifyDocumentResponse(classes: Option[List[DocumentClass]] = None, labels: Option[List[DocumentLabel]] = None, documentMetadata: Option[DocumentMetadata] = None, documentType: Option[List[DocumentTypeListItem]] = None, errors: Option[List[ErrorsListItem]] = None, warnings: Option[List[WarningsListItem]] = None)

object ClassifyDocumentResponse extends ShapeTag.Companion[ClassifyDocumentResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ClassifyDocumentResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(classes: Option[List[DocumentClass]], labels: Option[List[DocumentLabel]], documentMetadata: Option[DocumentMetadata], documentType: Option[List[DocumentTypeListItem]], errors: Option[List[ErrorsListItem]], warnings: Option[List[WarningsListItem]]): ClassifyDocumentResponse = ClassifyDocumentResponse(classes, labels, documentMetadata, documentType, errors, warnings)

  implicit val schema: Schema[ClassifyDocumentResponse] = struct(
    ListOfClasses.underlyingSchema.optional[ClassifyDocumentResponse]("Classes", _.classes).addHints(smithy.api.Documentation("<p>The classes used by the document being analyzed. These are used for multi-class trained\n      models. Individual classes are mutually exclusive and each document is expected to have only a\n      single class assigned to it. For example, an animal can be a dog or a cat, but not both at the\n      same time. </p>")),
    ListOfLabels.underlyingSchema.optional[ClassifyDocumentResponse]("Labels", _.labels).addHints(smithy.api.Documentation("<p>The labels used the document being analyzed. These are used for multi-label trained\n      models. Individual labels represent different categories that are related in some manner and\n      are not mutually exclusive. For example, a movie can be just an action movie, or it can be an\n      action movie, a science fiction movie, and a comedy, all at the same time. </p>")),
    DocumentMetadata.schema.optional[ClassifyDocumentResponse]("DocumentMetadata", _.documentMetadata).addHints(smithy.api.Documentation("<p>Extraction information about the document. This field is present\n      in the response only if your request includes the <code>Byte</code> parameter. </p>")),
    ListOfDocumentType.underlyingSchema.optional[ClassifyDocumentResponse]("DocumentType", _.documentType).addHints(smithy.api.Documentation("<p>The document type for each page in the input document. This field is present\n      in the response only if your request includes the <code>Byte</code> parameter. </p>")),
    ListOfErrors.underlyingSchema.optional[ClassifyDocumentResponse]("Errors", _.errors).addHints(smithy.api.Documentation("<p>Page-level errors that the system detected while processing the input document.\n      The field is empty if the system encountered no errors.</p>")),
    ListOfWarnings.underlyingSchema.optional[ClassifyDocumentResponse]("Warnings", _.warnings).addHints(smithy.api.Documentation("<p>Warnings detected while processing the input document.\n      The response includes a warning if there is a mismatch between the input document type\n      and the model type associated with the endpoint that you specified. The response can also include\n       warnings for individual pages that have a mismatch. </p>\n         <p>The field is empty if the system generated no warnings.</p>")),
  )(make).withId(id).addHints(hints)
}
