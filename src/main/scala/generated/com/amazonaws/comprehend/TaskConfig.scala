package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Configuration about the custom classifier associated with the flywheel.</p>
  * @param LanguageCode
  *   <p>Language code for the language that the model supports.</p>
  * @param DocumentClassificationConfig
  *   <p>Configuration required for a classification model.</p>
  * @param EntityRecognitionConfig
  *   <p>Configuration required for an entity recognition model.</p>
  */
final case class TaskConfig(languageCode: LanguageCode, documentClassificationConfig: Option[DocumentClassificationConfig] = None, entityRecognitionConfig: Option[EntityRecognitionConfig] = None)

object TaskConfig extends ShapeTag.Companion[TaskConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TaskConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Configuration about the custom classifier associated with the flywheel.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(languageCode: LanguageCode, documentClassificationConfig: Option[DocumentClassificationConfig], entityRecognitionConfig: Option[EntityRecognitionConfig]): TaskConfig = TaskConfig(languageCode, documentClassificationConfig, entityRecognitionConfig)

  implicit val schema: Schema[TaskConfig] = struct(
    LanguageCode.schema.required[TaskConfig]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>Language code for the language that the model supports.</p>")),
    DocumentClassificationConfig.schema.optional[TaskConfig]("DocumentClassificationConfig", _.documentClassificationConfig).addHints(smithy.api.Documentation("<p>Configuration required for a classification model.</p>")),
    EntityRecognitionConfig.schema.optional[TaskConfig]("EntityRecognitionConfig", _.entityRecognitionConfig).addHints(smithy.api.Documentation("<p>Configuration required for an entity recognition model.</p>")),
  )(make).withId(id).addHints(hints)
}
