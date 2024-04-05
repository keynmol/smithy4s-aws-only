package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobName
  *   <p>The identifier of the events detection job.</p>
  * @param TargetEventTypes
  *   <p>The types of events to detect in the input documents.</p>
  * @param ClientRequestToken
  *   <p>An unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param Tags
  *   <p>Tags to associate with the events detection job. A tag is a key-value pair that adds
  *         metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key
  *         might be added to a resource to indicate its use by the sales department.</p>
  * @param LanguageCode
  *   <p>The language code of the input documents.</p>
  * @param InputDataConfig
  *   <p>Specifies the format and location of the input data for the job.</p>
  * @param OutputDataConfig
  *   <p>Specifies where to send the output files.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  */
final case class StartEventsDetectionJobRequest(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, languageCode: LanguageCode, targetEventTypes: List[EventTypeString], jobName: Option[JobName] = None, clientRequestToken: Option[ClientRequestTokenString] = None, tags: Option[List[Tag]] = None)

object StartEventsDetectionJobRequest extends ShapeTag.Companion[StartEventsDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartEventsDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, dataAccessRoleArn: IamRoleArn, jobName: Option[JobName], languageCode: LanguageCode, clientRequestToken: Option[ClientRequestTokenString], targetEventTypes: List[EventTypeString], tags: Option[List[Tag]]): StartEventsDetectionJobRequest = StartEventsDetectionJobRequest(inputDataConfig, outputDataConfig, dataAccessRoleArn, languageCode, targetEventTypes, jobName, clientRequestToken, tags)

  implicit val schema: Schema[StartEventsDetectionJobRequest] = struct(
    InputDataConfig.schema.required[StartEventsDetectionJobRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>Specifies the format and location of the input data for the job.</p>")),
    OutputDataConfig.schema.required[StartEventsDetectionJobRequest]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>Specifies where to send the output files.</p>")),
    IamRoleArn.schema.required[StartEventsDetectionJobRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    JobName.schema.optional[StartEventsDetectionJobRequest]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The identifier of the events detection job.</p>")),
    LanguageCode.schema.required[StartEventsDetectionJobRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language code of the input documents.</p>")),
    ClientRequestTokenString.schema.optional[StartEventsDetectionJobRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>An unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    TargetEventTypes.underlyingSchema.required[StartEventsDetectionJobRequest]("TargetEventTypes", _.targetEventTypes).addHints(smithy.api.Documentation("<p>The types of events to detect in the input documents.</p>")),
    TagList.underlyingSchema.optional[StartEventsDetectionJobRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the events detection job. A tag is a key-value pair that adds\n      metadata to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the key\n      might be added to a resource to indicate its use by the sales department.</p>")),
  )(make).withId(id).addHints(hints)
}
