package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Describes the entity list submitted with an entity recognizer.</p>
  * @param S3Uri
  *   <p>Specifies the Amazon S3 location where the entity list is located. The URI must be in the
  *         same Region as the API endpoint that you are calling.</p>
  */
final case class EntityRecognizerEntityList(s3Uri: S3Uri)

object EntityRecognizerEntityList extends ShapeTag.Companion[EntityRecognizerEntityList] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EntityRecognizerEntityList")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the entity list submitted with an entity recognizer.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri): EntityRecognizerEntityList = EntityRecognizerEntityList(s3Uri)

  implicit val schema: Schema[EntityRecognizerEntityList] = struct(
    S3Uri.schema.required[EntityRecognizerEntityList]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>Specifies the Amazon S3 location where the entity list is located. The URI must be in the\n      same Region as the API endpoint that you are calling.</p>")),
  )(make).withId(id).addHints(hints)
}
