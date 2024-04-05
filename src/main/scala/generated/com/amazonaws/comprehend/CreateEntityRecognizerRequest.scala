package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param VolumeKmsKeyId
  *   <p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt
  *         data on the storage volume attached to the ML compute instance(s) that process the analysis
  *         job. The VolumeKmsKeyId can be either of the following formats:</p>
  *            <ul>
  *               <li>
  *                  <p>KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *               <li>
  *                  <p>Amazon Resource Name (ARN) of a KMS Key:
  *               <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *            </ul>
  * @param RecognizerName
  *   <p>The name given to the newly created recognizer. Recognizer names can be a maximum of 256
  *         characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The name
  *         must be unique in the account/Region.</p>
  * @param VersionName
  *   <p>The version name given to the newly created recognizer. Version names can be a maximum of
  *         256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The
  *         version name must be unique among all models with the same recognizer name in the account/Region.</p>
  * @param ModelPolicy
  *   <p>The JSON resource-based policy to attach to your custom entity recognizer model. You can
  *         use this policy to allow another Amazon Web Services account to import your custom model.</p>
  *            <p>Provide your JSON as a UTF-8 encoded string without line breaks. To provide valid JSON for
  *         your policy, enclose the attribute names and values in double quotes. If the JSON body is also
  *         enclosed in double quotes, then you must escape the double quotes that are inside the
  *         policy:</p>
  *            <p>
  *               <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
  *            </p>
  *            <p>To avoid escaping quotes, you can use single quotes to enclose the policy and double
  *         quotes to enclose the JSON names and values:</p>
  *            <p>
  *               <code>'{"attribute": "value", "attribute": ["value"]}'</code>
  *            </p>
  * @param ClientRequestToken
  *   <p> A unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  * @param ModelKmsKeyId
  *   <p>ID for the KMS key that Amazon Comprehend uses to encrypt
  *         trained custom models. The ModelKmsKeyId can be either of the following formats:</p>
  *            <ul>
  *               <li>
  *                  <p>KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *               <li>
  *                  <p>Amazon Resource Name (ARN) of a KMS Key:
  *               <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
  *                  </p>
  *               </li>
  *            </ul>
  * @param VpcConfig
  *   <p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing
  *         the resources you are using for your custom entity recognizer. For more information, see
  *         <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Tags
  *   <p>Tags to associate with the entity recognizer. A tag is a key-value pair
  *         that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with
  *         "Sales" as the key might be added to a resource to indicate its use by the sales department.
  *       </p>
  * @param LanguageCode
  *   <p> You can specify any of the following languages: English
  *         ("en"), Spanish ("es"), French ("fr"), Italian ("it"), German ("de"), or Portuguese ("pt").
  *         If you plan to use this entity recognizer with PDF, Word, or image input files, you must
  *         specify English as the language.
  *         All training documents must be in the same language.</p>
  * @param InputDataConfig
  *   <p>Specifies the format and location of the input data. The S3 bucket containing the input
  *         data must be located in the same Region as the entity recognizer being created. </p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  */
final case class CreateEntityRecognizerRequest(recognizerName: ComprehendArnName, dataAccessRoleArn: IamRoleArn, inputDataConfig: EntityRecognizerInputDataConfig, languageCode: LanguageCode, versionName: Option[VersionName] = None, tags: Option[List[Tag]] = None, clientRequestToken: Option[ClientRequestTokenString] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, modelKmsKeyId: Option[KmsKeyId] = None, modelPolicy: Option[Policy] = None)

object CreateEntityRecognizerRequest extends ShapeTag.Companion[CreateEntityRecognizerRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateEntityRecognizerRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(recognizerName: ComprehendArnName, versionName: Option[VersionName], dataAccessRoleArn: IamRoleArn, tags: Option[List[Tag]], inputDataConfig: EntityRecognizerInputDataConfig, clientRequestToken: Option[ClientRequestTokenString], languageCode: LanguageCode, volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], modelKmsKeyId: Option[KmsKeyId], modelPolicy: Option[Policy]): CreateEntityRecognizerRequest = CreateEntityRecognizerRequest(recognizerName, dataAccessRoleArn, inputDataConfig, languageCode, versionName, tags, clientRequestToken, volumeKmsKeyId, vpcConfig, modelKmsKeyId, modelPolicy)

  implicit val schema: Schema[CreateEntityRecognizerRequest] = struct(
    ComprehendArnName.schema.required[CreateEntityRecognizerRequest]("RecognizerName", _.recognizerName).addHints(smithy.api.Documentation("<p>The name given to the newly created recognizer. Recognizer names can be a maximum of 256\n      characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The name\n      must be unique in the account/Region.</p>")),
    VersionName.schema.optional[CreateEntityRecognizerRequest]("VersionName", _.versionName).addHints(smithy.api.Documentation("<p>The version name given to the newly created recognizer. Version names can be a maximum of\n      256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The\n      version name must be unique among all models with the same recognizer name in the account/Region.</p>")),
    IamRoleArn.schema.required[CreateEntityRecognizerRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    TagList.underlyingSchema.optional[CreateEntityRecognizerRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the entity recognizer. A tag is a key-value pair\n      that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with\n      \"Sales\" as the key might be added to a resource to indicate its use by the sales department.\n    </p>")),
    EntityRecognizerInputDataConfig.schema.required[CreateEntityRecognizerRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>Specifies the format and location of the input data. The S3 bucket containing the input\n      data must be located in the same Region as the entity recognizer being created. </p>")),
    ClientRequestTokenString.schema.optional[CreateEntityRecognizerRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p> A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    LanguageCode.schema.required[CreateEntityRecognizerRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p> You can specify any of the following languages: English\n      (\"en\"), Spanish (\"es\"), French (\"fr\"), Italian (\"it\"), German (\"de\"), or Portuguese (\"pt\").\n      If you plan to use this entity recognizer with PDF, Word, or image input files, you must\n      specify English as the language.\n      All training documents must be in the same language.</p>")),
    KmsKeyId.schema.optional[CreateEntityRecognizerRequest]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[CreateEntityRecognizerRequest]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing\n      the resources you are using for your custom entity recognizer. For more information, see\n      <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    KmsKeyId.schema.optional[CreateEntityRecognizerRequest]("ModelKmsKeyId", _.modelKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt\n      trained custom models. The ModelKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    Policy.schema.optional[CreateEntityRecognizerRequest]("ModelPolicy", _.modelPolicy).addHints(smithy.api.Documentation("<p>The JSON resource-based policy to attach to your custom entity recognizer model. You can\n      use this policy to allow another Amazon Web Services account to import your custom model.</p>\n         <p>Provide your JSON as a UTF-8 encoded string without line breaks. To provide valid JSON for\n      your policy, enclose the attribute names and values in double quotes. If the JSON body is also\n      enclosed in double quotes, then you must escape the double quotes that are inside the\n      policy:</p>\n         <p>\n            <code>\"{\\\"attribute\\\": \\\"value\\\", \\\"attribute\\\": [\\\"value\\\"]}\"</code>\n         </p>\n         <p>To avoid escaping quotes, you can use single quotes to enclose the policy and double\n      quotes to enclose the JSON names and values:</p>\n         <p>\n            <code>\'{\"attribute\": \"value\", \"attribute\": [\"value\"]}\'</code>\n         </p>")),
  )(make).withId(id).addHints(hints)
}
