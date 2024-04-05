package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Specifies the format and location of the input data. You must provide either the
  *       <code>Annotations</code> parameter or the <code>EntityList</code> parameter.</p>
  * @param Annotations
  *   <p>The S3 location of the annotation documents for your custom entity recognizer.</p>
  * @param Documents
  *   <p>The format and location of the training documents for your custom entity
  *         recognizer.</p>
  * @param EntityList
  *   <p>The S3 location of the entity list for your custom entity recognizer.</p>
  */
final case class DatasetEntityRecognizerInputDataConfig(documents: DatasetEntityRecognizerDocuments, annotations: Option[DatasetEntityRecognizerAnnotations] = None, entityList: Option[DatasetEntityRecognizerEntityList] = None)

object DatasetEntityRecognizerInputDataConfig extends ShapeTag.Companion[DatasetEntityRecognizerInputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetEntityRecognizerInputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies the format and location of the input data. You must provide either the\n      <code>Annotations</code> parameter or the <code>EntityList</code> parameter.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(annotations: Option[DatasetEntityRecognizerAnnotations], documents: DatasetEntityRecognizerDocuments, entityList: Option[DatasetEntityRecognizerEntityList]): DatasetEntityRecognizerInputDataConfig = DatasetEntityRecognizerInputDataConfig(documents, annotations, entityList)

  implicit val schema: Schema[DatasetEntityRecognizerInputDataConfig] = struct(
    DatasetEntityRecognizerAnnotations.schema.optional[DatasetEntityRecognizerInputDataConfig]("Annotations", _.annotations).addHints(smithy.api.Documentation("<p>The S3 location of the annotation documents for your custom entity recognizer.</p>")),
    DatasetEntityRecognizerDocuments.schema.required[DatasetEntityRecognizerInputDataConfig]("Documents", _.documents).addHints(smithy.api.Documentation("<p>The format and location of the training documents for your custom entity\n      recognizer.</p>")),
    DatasetEntityRecognizerEntityList.schema.optional[DatasetEntityRecognizerInputDataConfig]("EntityList", _.entityList).addHints(smithy.api.Documentation("<p>The S3 location of the entity list for your custom entity recognizer.</p>")),
  )(make).withId(id).addHints(hints)
}
