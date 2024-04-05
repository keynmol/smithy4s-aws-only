package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Specifies the format and location of the input data for the dataset.</p>
  * @param AugmentedManifests
  *   <p>A list of augmented manifest files that provide training data for your custom model. An
  *         augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground
  *         Truth. </p>
  * @param DataFormat
  *   <p>
  *               <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the
  *         first column contains labels and the second column contains documents.</p>
  *            <p>
  *               <code>AUGMENTED_MANIFEST</code>: The data format  </p>
  * @param DocumentClassifierInputDataConfig
  *   <p>The input properties for training a document classifier model. </p>
  *            <p>For more information on how the input file is formatted, see  <a href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training data</a>
  *         in the Comprehend Developer Guide. </p>
  * @param EntityRecognizerInputDataConfig
  *   <p>The input properties for training an entity recognizer model.</p>
  */
final case class DatasetInputDataConfig(augmentedManifests: Option[List[DatasetAugmentedManifestsListItem]] = None, dataFormat: Option[DatasetDataFormat] = None, documentClassifierInputDataConfig: Option[DatasetDocumentClassifierInputDataConfig] = None, entityRecognizerInputDataConfig: Option[DatasetEntityRecognizerInputDataConfig] = None)

object DatasetInputDataConfig extends ShapeTag.Companion[DatasetInputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetInputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies the format and location of the input data for the dataset.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(augmentedManifests: Option[List[DatasetAugmentedManifestsListItem]], dataFormat: Option[DatasetDataFormat], documentClassifierInputDataConfig: Option[DatasetDocumentClassifierInputDataConfig], entityRecognizerInputDataConfig: Option[DatasetEntityRecognizerInputDataConfig]): DatasetInputDataConfig = DatasetInputDataConfig(augmentedManifests, dataFormat, documentClassifierInputDataConfig, entityRecognizerInputDataConfig)

  implicit val schema: Schema[DatasetInputDataConfig] = struct(
    DatasetAugmentedManifestsList.underlyingSchema.optional[DatasetInputDataConfig]("AugmentedManifests", _.augmentedManifests).addHints(smithy.api.Documentation("<p>A list of augmented manifest files that provide training data for your custom model. An\n      augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground\n      Truth. </p>")),
    DatasetDataFormat.schema.optional[DatasetInputDataConfig]("DataFormat", _.dataFormat).addHints(smithy.api.Documentation("<p>\n            <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the\n      first column contains labels and the second column contains documents.</p>\n         <p>\n            <code>AUGMENTED_MANIFEST</code>: The data format  </p>")),
    DatasetDocumentClassifierInputDataConfig.schema.optional[DatasetInputDataConfig]("DocumentClassifierInputDataConfig", _.documentClassifierInputDataConfig).addHints(smithy.api.Documentation("<p>The input properties for training a document classifier model. </p>\n         <p>For more information on how the input file is formatted, see  <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html\">Preparing training data</a>\n      in the Comprehend Developer Guide. </p>")),
    DatasetEntityRecognizerInputDataConfig.schema.optional[DatasetInputDataConfig]("EntityRecognizerInputDataConfig", _.entityRecognizerInputDataConfig).addHints(smithy.api.Documentation("<p>The input properties for training an entity recognizer model.</p>")),
  )(make).withId(id).addHints(hints)
}
