package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param Entities
  *   <p>A collection of entities identified in the input text. For each entity, the response
  *         provides the entity text, entity type, where the entity text begins and ends, and the level of
  *         confidence that Amazon Comprehend has in the detection. </p>
  *            <p>If your request uses a custom entity recognition model, Amazon Comprehend detects the
  *         entities that the model is trained to recognize. Otherwise, it detects the default entity
  *         types. For a list of default entity types, see
  *         <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html">Entities</a> in the Comprehend Developer Guide.
  *       </p>
  * @param Errors
  *   <p>Page-level errors that the system detected while processing the input document.
  *         The field is empty if the system encountered no errors.</p>
  * @param DocumentType
  *   <p>The document type for each page in the input document. This field is present
  *         in the response only if your request used the <code>Byte</code> parameter. </p>
  * @param DocumentMetadata
  *   <p>Information about the document, discovered during text extraction. This field is present
  *         in the response only if your request used the <code>Byte</code> parameter. </p>
  * @param Blocks
  *   <p>Information about each block of text in the input document.
  *         Blocks are nested. A page block contains a block for each line of text,
  *         which contains a block for each word. </p>
  *            <p>The <code>Block</code> content for a Word input document does not include a <code>Geometry</code> field.</p>
  *            <p>The <code>Block</code> field is not present in the response for plain-text inputs.</p>
  */
final case class DetectEntitiesResponse(entities: Option[List[Entity]] = None, documentMetadata: Option[DocumentMetadata] = None, documentType: Option[List[DocumentTypeListItem]] = None, blocks: Option[List[Block]] = None, errors: Option[List[ErrorsListItem]] = None)

object DetectEntitiesResponse extends ShapeTag.Companion[DetectEntitiesResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DetectEntitiesResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
    smithy.api.Sensitive(),
  ).lazily

  // constructor using the original order from the spec
  private def make(entities: Option[List[Entity]], documentMetadata: Option[DocumentMetadata], documentType: Option[List[DocumentTypeListItem]], blocks: Option[List[Block]], errors: Option[List[ErrorsListItem]]): DetectEntitiesResponse = DetectEntitiesResponse(entities, documentMetadata, documentType, blocks, errors)

  implicit val schema: Schema[DetectEntitiesResponse] = struct(
    ListOfEntities.underlyingSchema.optional[DetectEntitiesResponse]("Entities", _.entities).addHints(smithy.api.Documentation("<p>A collection of entities identified in the input text. For each entity, the response\n      provides the entity text, entity type, where the entity text begins and ends, and the level of\n      confidence that Amazon Comprehend has in the detection. </p>\n         <p>If your request uses a custom entity recognition model, Amazon Comprehend detects the\n      entities that the model is trained to recognize. Otherwise, it detects the default entity\n      types. For a list of default entity types, see\n      <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html\">Entities</a> in the Comprehend Developer Guide.\n    </p>")),
    DocumentMetadata.schema.optional[DetectEntitiesResponse]("DocumentMetadata", _.documentMetadata).addHints(smithy.api.Documentation("<p>Information about the document, discovered during text extraction. This field is present\n      in the response only if your request used the <code>Byte</code> parameter. </p>")),
    ListOfDocumentType.underlyingSchema.optional[DetectEntitiesResponse]("DocumentType", _.documentType).addHints(smithy.api.Documentation("<p>The document type for each page in the input document. This field is present\n      in the response only if your request used the <code>Byte</code> parameter. </p>")),
    ListOfBlocks.underlyingSchema.optional[DetectEntitiesResponse]("Blocks", _.blocks).addHints(smithy.api.Documentation("<p>Information about each block of text in the input document.\n      Blocks are nested. A page block contains a block for each line of text,\n      which contains a block for each word. </p>\n         <p>The <code>Block</code> content for a Word input document does not include a <code>Geometry</code> field.</p>\n         <p>The <code>Block</code> field is not present in the response for plain-text inputs.</p>")),
    ListOfErrors.underlyingSchema.optional[DetectEntitiesResponse]("Errors", _.errors).addHints(smithy.api.Documentation("<p>Page-level errors that the system detected while processing the input document.\n      The field is empty if the system encountered no errors.</p>")),
  )(make).withId(id).addHints(hints)
}
