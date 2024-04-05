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
  * @param VersionName
  *   <p>The version name given to the newly created classifier. Version names can have a maximum
  *         of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The
  *         version name must be unique among all models with the same classifier name in the Amazon Web Services account/Amazon Web Services Region.</p>
  * @param ModelPolicy
  *   <p>The resource-based policy to attach to your custom document classifier model. You can use
  *         this policy to allow another Amazon Web Services account to import your custom model.</p>
  *            <p>Provide your policy as a JSON body that you enter as a UTF-8 encoded string without line
  *         breaks. To provide valid JSON, enclose the attribute names and values in double quotes. If the
  *         JSON body is also enclosed in double quotes, then you must escape the double quotes that are
  *         inside the policy:</p>
  *            <p>
  *               <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
  *            </p>
  *            <p>To avoid escaping quotes, you can use single quotes to enclose the policy and double
  *         quotes to enclose the JSON names and values:</p>
  *            <p>
  *               <code>'{"attribute": "value", "attribute": ["value"]}'</code>
  *            </p>
  * @param Mode
  *   <p>Indicates the mode in which the classifier will be trained. The classifier can be trained
  *         in multi-class mode, which identifies one and only one class for each document, or multi-label
  *         mode, which identifies one or more labels for each document. In multi-label mode, multiple
  *         labels for an individual document are separated by a delimiter. The default delimiter between
  *         labels is a pipe (|).</p>
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you don't set the client request token, Amazon
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
  *         the resources you are using for your custom classifier. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  * @param Tags
  *   <p>Tags to associate with the document classifier. A tag is a key-value
  *         pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with
  *         "Sales" as the key might be added to a resource to indicate its use by the sales department.
  *       </p>
  * @param DocumentClassifierName
  *   <p>The name of the document classifier.</p>
  * @param LanguageCode
  *   <p>The language of the input documents. You can specify any of the languages
  *         supported by Amazon Comprehend. All documents must be in the same language.</p>
  * @param InputDataConfig
  *   <p>Specifies the format and location of the input data for the job.</p>
  * @param OutputDataConfig
  *   <p>Specifies the location for the output files from a custom classifier job.
  *       This parameter is required for a request that creates a native classifier model.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to your input data.</p>
  */
final case class CreateDocumentClassifierRequest(documentClassifierName: ComprehendArnName, dataAccessRoleArn: IamRoleArn, inputDataConfig: DocumentClassifierInputDataConfig, languageCode: LanguageCode, versionName: Option[VersionName] = None, tags: Option[List[Tag]] = None, outputDataConfig: Option[DocumentClassifierOutputDataConfig] = None, clientRequestToken: Option[ClientRequestTokenString] = None, volumeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None, mode: Option[DocumentClassifierMode] = None, modelKmsKeyId: Option[KmsKeyId] = None, modelPolicy: Option[Policy] = None)

object CreateDocumentClassifierRequest extends ShapeTag.Companion[CreateDocumentClassifierRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateDocumentClassifierRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(documentClassifierName: ComprehendArnName, versionName: Option[VersionName], dataAccessRoleArn: IamRoleArn, tags: Option[List[Tag]], inputDataConfig: DocumentClassifierInputDataConfig, outputDataConfig: Option[DocumentClassifierOutputDataConfig], clientRequestToken: Option[ClientRequestTokenString], languageCode: LanguageCode, volumeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig], mode: Option[DocumentClassifierMode], modelKmsKeyId: Option[KmsKeyId], modelPolicy: Option[Policy]): CreateDocumentClassifierRequest = CreateDocumentClassifierRequest(documentClassifierName, dataAccessRoleArn, inputDataConfig, languageCode, versionName, tags, outputDataConfig, clientRequestToken, volumeKmsKeyId, vpcConfig, mode, modelKmsKeyId, modelPolicy)

  implicit val schema: Schema[CreateDocumentClassifierRequest] = struct(
    ComprehendArnName.schema.required[CreateDocumentClassifierRequest]("DocumentClassifierName", _.documentClassifierName).addHints(smithy.api.Documentation("<p>The name of the document classifier.</p>")),
    VersionName.schema.optional[CreateDocumentClassifierRequest]("VersionName", _.versionName).addHints(smithy.api.Documentation("<p>The version name given to the newly created classifier. Version names can have a maximum\n      of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The\n      version name must be unique among all models with the same classifier name in the Amazon Web Services account/Amazon Web Services Region.</p>")),
    IamRoleArn.schema.required[CreateDocumentClassifierRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to your input data.</p>")),
    TagList.underlyingSchema.optional[CreateDocumentClassifierRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the document classifier. A tag is a key-value\n      pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with\n      \"Sales\" as the key might be added to a resource to indicate its use by the sales department.\n    </p>")),
    DocumentClassifierInputDataConfig.schema.required[CreateDocumentClassifierRequest]("InputDataConfig", _.inputDataConfig).addHints(smithy.api.Documentation("<p>Specifies the format and location of the input data for the job.</p>")),
    DocumentClassifierOutputDataConfig.schema.optional[CreateDocumentClassifierRequest]("OutputDataConfig", _.outputDataConfig).addHints(smithy.api.Documentation("<p>Specifies the location for the output files from a custom classifier job.\n    This parameter is required for a request that creates a native classifier model.</p>")),
    ClientRequestTokenString.schema.optional[CreateDocumentClassifierRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>"), smithy.api.IdempotencyToken()),
    LanguageCode.schema.required[CreateDocumentClassifierRequest]("LanguageCode", _.languageCode).addHints(smithy.api.Documentation("<p>The language of the input documents. You can specify any of the languages\n      supported by Amazon Comprehend. All documents must be in the same language.</p>")),
    KmsKeyId.schema.optional[CreateDocumentClassifierRequest]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt\n      data on the storage volume attached to the ML compute instance(s) that process the analysis\n      job. The VolumeKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    VpcConfig.schema.optional[CreateDocumentClassifierRequest]("VpcConfig", _.vpcConfig).addHints(smithy.api.Documentation("<p>Configuration parameters for an optional private Virtual Private Cloud (VPC) containing\n      the resources you are using for your custom classifier. For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>")),
    DocumentClassifierMode.schema.optional[CreateDocumentClassifierRequest]("Mode", _.mode).addHints(smithy.api.Documentation("<p>Indicates the mode in which the classifier will be trained. The classifier can be trained\n      in multi-class mode, which identifies one and only one class for each document, or multi-label\n      mode, which identifies one or more labels for each document. In multi-label mode, multiple\n      labels for an individual document are separated by a delimiter. The default delimiter between\n      labels is a pipe (|).</p>")),
    KmsKeyId.schema.optional[CreateDocumentClassifierRequest]("ModelKmsKeyId", _.modelKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt\n      trained custom models. The ModelKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    Policy.schema.optional[CreateDocumentClassifierRequest]("ModelPolicy", _.modelPolicy).addHints(smithy.api.Documentation("<p>The resource-based policy to attach to your custom document classifier model. You can use\n      this policy to allow another Amazon Web Services account to import your custom model.</p>\n         <p>Provide your policy as a JSON body that you enter as a UTF-8 encoded string without line\n      breaks. To provide valid JSON, enclose the attribute names and values in double quotes. If the\n      JSON body is also enclosed in double quotes, then you must escape the double quotes that are\n      inside the policy:</p>\n         <p>\n            <code>\"{\\\"attribute\\\": \\\"value\\\", \\\"attribute\\\": [\\\"value\\\"]}\"</code>\n         </p>\n         <p>To avoid escaping quotes, you can use single quotes to enclose the policy and double\n      quotes to enclose the JSON names and values:</p>\n         <p>\n            <code>\'{\"attribute\": \"value\", \"attribute\": [\"value\"]}\'</code>\n         </p>")),
  )(make).withId(id).addHints(hints)
}
