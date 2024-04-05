package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Data security configuration.</p>
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
  * @param VolumeKmsKeyId
  *   <p>ID for the KMS key that Amazon Comprehend uses to encrypt the volume.</p>
  * @param DataLakeKmsKeyId
  *   <p>ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.</p>
  * @param VpcConfig
  *   <p> Configuration parameters for an optional private Virtual Private Cloud (VPC) containing
  *         the resources you are using for the job. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *           VPC</a>. </p>
  */
final case class DataSecurityConfig(modelKmsKeyId: Option[KmsKeyId] = None, volumeKmsKeyId: Option[KmsKeyId] = None, dataLakeKmsKeyId: Option[KmsKeyId] = None, vpcConfig: Option[VpcConfig] = None)

object DataSecurityConfig extends ShapeTag.Companion[DataSecurityConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DataSecurityConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Data security configuration.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(modelKmsKeyId: Option[KmsKeyId], volumeKmsKeyId: Option[KmsKeyId], dataLakeKmsKeyId: Option[KmsKeyId], vpcConfig: Option[VpcConfig]): DataSecurityConfig = DataSecurityConfig(modelKmsKeyId, volumeKmsKeyId, dataLakeKmsKeyId, vpcConfig)

  implicit val schema: Schema[DataSecurityConfig] = struct(
    KmsKeyId.schema.optional[DataSecurityConfig]("ModelKmsKeyId", _.modelKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt\n      trained custom models. The ModelKmsKeyId can be either of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n         </ul>")),
    KmsKeyId.schema.optional[DataSecurityConfig]("VolumeKmsKeyId", _.volumeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt the volume.</p>")),
    KmsKeyId.schema.optional[DataSecurityConfig]("DataLakeKmsKeyId", _.dataLakeKmsKeyId).addHints(smithy.api.Documentation("<p>ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.</p>")),
    VpcConfig.schema.optional[DataSecurityConfig]("VpcConfig", _.vpcConfig),
  )(make).withId(id).addHints(hints)
}
