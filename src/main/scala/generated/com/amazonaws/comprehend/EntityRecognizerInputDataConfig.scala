package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Specifies the format and location of the input data.</p>
  * @param AugmentedManifests
  *   <p>A list of augmented manifest files that provide training data for your custom model. An
  *         augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
  *         Truth.</p>
  *            <p>This parameter is required if you set <code>DataFormat</code> to
  *           <code>AUGMENTED_MANIFEST</code>.</p>
  * @param EntityTypes
  *   <p>The entity types in the labeled training data that Amazon Comprehend uses to train the
  *         custom entity recognizer. Any entity types that you don't specify are ignored.</p>
  *            <p>A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity
  *         types must not contain the following invalid characters: \n (line break), \\n (escaped line
  *         break), \r (carriage return), \\r (escaped carriage return), \t (tab), \\t (escaped tab),
  *         space, and , (comma). </p>
  * @param DataFormat
  *   <p>The format of your training data:</p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The
  *             CSV file contains information about the custom entities that your trained model will
  *             detect. The required format of the file depends on whether you are providing annotations
  *             or an entity list.</p>
  *                  <p>If you use this value, you must provide your CSV file by using either the
  *               <code>Annotations</code> or <code>EntityList</code> parameters. You must provide your
  *             training documents by using the <code>Documents</code> parameter.</p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon
  *             SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON
  *             object that contains a training document and its labels. Each label annotates a named
  *             entity in the training document. </p>
  *                  <p>If you use this value, you must provide the <code>AugmentedManifests</code> parameter
  *             in your request.</p>
  *               </li>
  *            </ul>
  *            <p>If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the
  *         default.</p>
  * @param EntityList
  *   <p>The S3 location of the CSV file that has the entity list for your custom entity
  *         recognizer.</p>
  * @param Annotations
  *   <p>The S3 location of the CSV file that annotates your training documents.</p>
  * @param Documents
  *   <p>The S3 location of the folder that contains the training documents for your custom entity
  *         recognizer.</p>
  *            <p>This parameter is required if you set <code>DataFormat</code> to
  *           <code>COMPREHEND_CSV</code>.</p>
  */
final case class EntityRecognizerInputDataConfig(entityTypes: List[EntityTypesListItem], dataFormat: Option[EntityRecognizerDataFormat] = None, documents: Option[EntityRecognizerDocuments] = None, annotations: Option[EntityRecognizerAnnotations] = None, entityList: Option[EntityRecognizerEntityList] = None, augmentedManifests: Option[List[AugmentedManifestsListItem]] = None)

object EntityRecognizerInputDataConfig extends ShapeTag.Companion[EntityRecognizerInputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerInputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies the format and location of the input data.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(dataFormat: Option[EntityRecognizerDataFormat], entityTypes: List[EntityTypesListItem], documents: Option[EntityRecognizerDocuments], annotations: Option[EntityRecognizerAnnotations], entityList: Option[EntityRecognizerEntityList], augmentedManifests: Option[List[AugmentedManifestsListItem]]): EntityRecognizerInputDataConfig = EntityRecognizerInputDataConfig(entityTypes, dataFormat, documents, annotations, entityList, augmentedManifests)

  implicit val schema: Schema[EntityRecognizerInputDataConfig] = struct(
    EntityRecognizerDataFormat.schema.optional[EntityRecognizerInputDataConfig]("DataFormat", _.dataFormat).addHints(smithy.api.Documentation("<p>The format of your training data:</p>\n         <ul>\n            <li>\n               <p>\n                  <code>COMPREHEND_CSV</code>: A CSV file that supplements your training documents. The\n          CSV file contains information about the custom entities that your trained model will\n          detect. The required format of the file depends on whether you are providing annotations\n          or an entity list.</p>\n               <p>If you use this value, you must provide your CSV file by using either the\n            <code>Annotations</code> or <code>EntityList</code> parameters. You must provide your\n          training documents by using the <code>Documents</code> parameter.</p>\n            </li>\n            <li>\n               <p>\n                  <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon\n          SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON\n          object that contains a training document and its labels. Each label annotates a named\n          entity in the training document. </p>\n               <p>If you use this value, you must provide the <code>AugmentedManifests</code> parameter\n          in your request.</p>\n            </li>\n         </ul>\n         <p>If you don\'t specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the\n      default.</p>")),
    EntityTypesList.underlyingSchema.required[EntityRecognizerInputDataConfig]("EntityTypes", _.entityTypes).addHints(smithy.api.Documentation("<p>The entity types in the labeled training data that Amazon Comprehend uses to train the\n      custom entity recognizer. Any entity types that you don\'t specify are ignored.</p>\n         <p>A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity\n      types must not contain the following invalid characters: \\n (line break), \\\\n (escaped line\n      break), \\r (carriage return), \\\\r (escaped carriage return), \\t (tab), \\\\t (escaped tab),\n      space, and , (comma). </p>")),
    EntityRecognizerDocuments.schema.optional[EntityRecognizerInputDataConfig]("Documents", _.documents).addHints(smithy.api.Documentation("<p>The S3 location of the folder that contains the training documents for your custom entity\n      recognizer.</p>\n         <p>This parameter is required if you set <code>DataFormat</code> to\n        <code>COMPREHEND_CSV</code>.</p>")),
    EntityRecognizerAnnotations.schema.optional[EntityRecognizerInputDataConfig]("Annotations", _.annotations).addHints(smithy.api.Documentation("<p>The S3 location of the CSV file that annotates your training documents.</p>")),
    EntityRecognizerEntityList.schema.optional[EntityRecognizerInputDataConfig]("EntityList", _.entityList).addHints(smithy.api.Documentation("<p>The S3 location of the CSV file that has the entity list for your custom entity\n      recognizer.</p>")),
    EntityRecognizerAugmentedManifestsList.underlyingSchema.optional[EntityRecognizerInputDataConfig]("AugmentedManifests", _.augmentedManifests).addHints(smithy.api.Documentation("<p>A list of augmented manifest files that provide training data for your custom model. An\n      augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground\n      Truth.</p>\n         <p>This parameter is required if you set <code>DataFormat</code> to\n        <code>AUGMENTED_MANIFEST</code>.</p>")),
  )(make).withId(id).addHints(hints)
}
