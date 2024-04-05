package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Provide the location for output data from a custom classifier job. This field is mandatory
  *     if you are training a native classifier model.</p>
  * @param S3Uri
  *   <p>When you use the <code>OutputDataConfig</code> object while creating a custom
  *         classifier, you specify the Amazon S3 location where you want to write the confusion matrix
  *         and other output files.
  *         The URI must be in the same Region as the API endpoint that you are calling. The location is
  *         used as the prefix for the actual location of this output file.</p>
  *            <p>When the custom classifier job is finished, the service creates the output file in a
  *         directory specific to the job. The <code>S3Uri</code> field contains the location of the
  *         output file, called <code>output.tar.gz</code>. It is a compressed archive that contains the
  *         confusion matrix.</p>
  * @param KmsKeyId
  *   <p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the
  *         output results from an analysis job. The KmsKeyId can be one of the following formats:</p>
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
  *               <li>
  *                  <p>KMS Key Alias: <code>"alias/ExampleAlias"</code>
  *                  </p>
  *               </li>
  *               <li>
  *                  <p>ARN of a KMS Key Alias:
  *               <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
  *                  </p>
  *               </li>
  *            </ul>
  * @param FlywheelStatsS3Prefix
  *   <p>The Amazon S3 prefix for the data lake location of the flywheel statistics.</p>
  */
final case class DocumentClassifierOutputDataConfig(s3Uri: Option[S3Uri] = None, kmsKeyId: Option[KmsKeyId] = None, flywheelStatsS3Prefix: Option[S3Uri] = None)

object DocumentClassifierOutputDataConfig extends ShapeTag.Companion[DocumentClassifierOutputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierOutputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provide the location for output data from a custom classifier job. This field is mandatory\n    if you are training a native classifier model.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: Option[S3Uri], kmsKeyId: Option[KmsKeyId], flywheelStatsS3Prefix: Option[S3Uri]): DocumentClassifierOutputDataConfig = DocumentClassifierOutputDataConfig(s3Uri, kmsKeyId, flywheelStatsS3Prefix)

  implicit val schema: Schema[DocumentClassifierOutputDataConfig] = struct(
    S3Uri.schema.optional[DocumentClassifierOutputDataConfig]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>When you use the <code>OutputDataConfig</code> object while creating a custom\n      classifier, you specify the Amazon S3 location where you want to write the confusion matrix\n      and other output files.\n      The URI must be in the same Region as the API endpoint that you are calling. The location is\n      used as the prefix for the actual location of this output file.</p>\n         <p>When the custom classifier job is finished, the service creates the output file in a\n      directory specific to the job. The <code>S3Uri</code> field contains the location of the\n      output file, called <code>output.tar.gz</code>. It is a compressed archive that contains the\n      confusion matrix.</p>")),
    KmsKeyId.schema.optional[DocumentClassifierOutputDataConfig]("KmsKeyId", _.kmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the\n      output results from an analysis job. The KmsKeyId can be one of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>KMS Key Alias: <code>\"alias/ExampleAlias\"</code>\n               </p>\n            </li>\n            <li>\n               <p>ARN of a KMS Key Alias:\n            <code>\"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias\"</code>\n               </p>\n            </li>\n         </ul>")),
    S3Uri.schema.optional[DocumentClassifierOutputDataConfig]("FlywheelStatsS3Prefix", _.flywheelStatsS3Prefix).addHints(smithy.api.Documentation("<p>The Amazon S3 prefix for the data lake location of the flywheel statistics.</p>")),
  )(make).withId(id).addHints(hints)
}
