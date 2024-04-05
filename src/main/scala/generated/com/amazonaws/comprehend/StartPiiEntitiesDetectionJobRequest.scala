package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobName
  *   <p>The identifier of the job.</p>
  * @param RedactionConfig
  *   <p>Provides configuration parameters for PII entity redaction.</p>
  *            <p>This parameter is required if you set the <code>Mode</code> parameter to
  *           <code>ONLY_REDACTION</code>. In that case, you must provide a <code>RedactionConfig</code>
  *         definition that includes the <code>PiiEntityTypes</code> parameter.</p>
  * @param Mode
  *   <p>Specifies whether the output provides the locations (offsets) of PII entities or a file in
  *         which PII entities are redacted.</p>
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param Tags
  *   <p>Tags to associate with the PII entities detection job. A tag is a key-value pair that
  *         adds metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the
  *         key might be added to a resource to indicate its use by the sales department.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. Currently, English is the only valid language.</p>
  * @param InputDataConfig
  *   <p>The input properties for a PII entities detection job.</p>
  * @param OutputDataConfig
  *   <p>Provides conﬁguration parameters for the output of PII entity detection jobs.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  */
final case class StartPiiEntitiesDetectionJobRequest(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, mode: PiiEntitiesDetectionMode, dataAccessRoleArn: IamRoleArn, languageCode: LanguageCode, redactionConfig: Option[RedactionConfig] = None, jobName: Option[JobName] = None, clientRequestToken: Option[ClientRequestTokenString] = None, tags: Option[List[Tag]] = None)

object StartPiiEntitiesDetectionJobRequest extends ShapeTag.Companion[StartPiiEntitiesDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartPiiEntitiesDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(inputDataConfig: InputDataConfig, outputDataConfig: OutputDataConfig, mode: PiiEntitiesDetectionMode, redactionConfig: Option[RedactionConfig], dataAccessRoleArn: IamRoleArn, jobName: Option[JobName], languageCode: LanguageCode, clientRequestToken: Option[ClientRequestTokenString], tags: Option[List[Tag]]): StartPiiEntitiesDetectionJobRequest = StartPiiEntitiesDetectionJobRequest(inputDataConfig, outputDataConfig, mode, dataAccessRoleArn, languageCode, redactionConfig, jobName, clientRequestToken, tags)

  implicit val schema: Schema[StartPiiEntitiesDetectionJobRequest] = struct(
    InputDataConfig.schema.required[StartPiiEntitiesDetectionJobRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>The input properties for a PII entities detection job.</p>")),
    OutputDataConfig.schema.required[StartPiiEntitiesDetectionJobRequest]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>Provides conﬁguration parameters for the output of PII entity detection jobs.</p>")),
    PiiEntitiesDetectionMode.schema.required[StartPiiEntitiesDetectionJobRequest]("Mode", _.mode).addHints(smithy.api.Documentation("<p>Specifies whether the output provides the locations (offsets) of PII entities or a file in\n      which PII entities are redacted.</p>")),
    RedactionConfig.schema.optional[StartPiiEntitiesDetectionJobRequest]("RedactionConfig", _.redactionConfig).addHints(smithy.api.Documentation("<p>Provides configuration parameters for PII entity redaction.</p>\n         <p>This parameter is required if you set the <code>Mode</code> parameter to\n        <code>ONLY_REDACTION</code>. In that case, you must provide a <code>RedactionConfig</code>\n      definition that includes the <code>PiiEntityTypes</code> parameter.</p>")),
    IamRoleArn.schema.required[StartPiiEntitiesDetectionJobRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    JobName.schema.optional[StartPiiEntitiesDetectionJobRequest]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>The identifier of the job.</p>")),
    LanguageCode.schema.required[StartPiiEntitiesDetectionJobRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. Currently, English is the only valid language.</p>")),
    ClientRequestTokenString.schema.optional[StartPiiEntitiesDetectionJobRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    TagList.underlyingSchema.optional[StartPiiEntitiesDetectionJobRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the PII entities detection job. A tag is a key-value pair that\n      adds metadata to a resource used by Amazon Comprehend. For example, a tag with \"Sales\" as the\n      key might be added to a resource to indicate its use by the sales department.</p>")),
  )(make).withId(id).addHints(hints)
}
