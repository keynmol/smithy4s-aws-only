package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ModelName
  *   <p>The name to assign to the custom model that is created in Amazon Comprehend by this
  *         import.</p>
  * @param VersionName
  *   <p>The version name given to the custom model that is created by this import. Version names
  *         can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_)
  *         are allowed. The version name must be unique among all models with the same classifier name in
  *         the account/Region.</p>
  * @param SourceModelArn
  *   <p>The Amazon Resource Name (ARN) of the custom model to import.</p>
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
  * @param Tags
  *   <p>Tags to associate with the custom model that is created by this import. A tag is a
  *         key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a
  *         tag with "Sales" as the key might be added to a resource to indicate its use by the sales
  *         department.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend permission to use Amazon Key Management Service (KMS) to encrypt or decrypt the custom
  *         model.</p>
  */
final case class ImportModelRequest(sourceModelArn: ComprehendModelArn, modelName: Option[ComprehendArnName] = None, versionName: Option[VersionName] = None, modelKmsKeyId: Option[KmsKeyId] = None, dataAccessRoleArn: Option[IamRoleArn] = None, tags: Option[List[Tag]] = None)

object ImportModelRequest extends ShapeTag.Companion[ImportModelRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ImportModelRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(sourceModelArn: ComprehendModelArn, modelName: Option[ComprehendArnName], versionName: Option[VersionName], modelKmsKeyId: Option[KmsKeyId], dataAccessRoleArn: Option[IamRoleArn], tags: Option[List[Tag]]): ImportModelRequest = ImportModelRequest(sourceModelArn, modelName, versionName, modelKmsKeyId, dataAccessRoleArn, tags)

  implicit val schema: Schema[ImportModelRequest] = struct(
    ComprehendModelArn.schema.required[ImportModelRequest]("SourceModelArn", _.sourceModelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the custom model to import.</p>")),
    ComprehendArnName.schema.optional[ImportModelRequest]("ModelName", _.modelName).addHints(smithy.api.Documentation("<p>The name to assign to the custom model that is created in Amazon Comprehend by this\n      import.</p>")),
    VersionName.schema.optional[ImportModelRequest]("VersionName", _.versionName).addHints(smithy.api.Documentation("<p>The version name given to the custom model that is created by this import. Version names\n      can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_)\n      are allowed. The version name must be unique among all models with the same classifier name in\n      the account/Region.</p>")),
    KmsKeyId.schema.optional[ImportModelRequest]("ModelKmsKeyId", _.modelKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt\n      trained custom models. The ModelKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    IamRoleArn.schema.optional[ImportModelRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend permission to use Amazon Key Management Service (KMS) to encrypt or decrypt the custom\n      model.</p>")),
    TagList.underlyingSchema.optional[ImportModelRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the custom model that is created by this import. A tag is a\n      key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a\n      tag with \"Sales\" as the key might be added to a resource to indicate its use by the sales\n      department.</p>")),
  )(make).withId(id).addHints(hints)
}
