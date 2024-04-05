package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Describes the dataset entity list for an entity recognizer model.</p>
  *          <p>For more information on how the input file is formatted, see  <a href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-training-data-cer.html">Preparing training data</a>
  *       in the Comprehend Developer Guide. </p>
  * @param S3Uri
  *   <p>Specifies the Amazon S3 location where the entity list is located.</p>
  */
final case class DatasetEntityRecognizerEntityList(s3Uri: S3Uri)

object DatasetEntityRecognizerEntityList extends ShapeTag.Companion[DatasetEntityRecognizerEntityList] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetEntityRecognizerEntityList")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the dataset entity list for an entity recognizer model.</p>\n         <p>For more information on how the input file is formatted, see  <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/prep-training-data-cer.html\">Preparing training data</a>\n      in the Comprehend Developer Guide. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri): DatasetEntityRecognizerEntityList = DatasetEntityRecognizerEntityList(s3Uri)

  implicit val schema: Schema[DatasetEntityRecognizerEntityList] = struct(
    S3Uri.schema.required[DatasetEntityRecognizerEntityList]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>Specifies the Amazon S3 location where the entity list is located.</p>")),
  )(make).withId(id).addHints(hints)
}
