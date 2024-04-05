package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Provides configuration parameters for the output of inference jobs.</p>
  *          <p></p>
  * @param S3Uri
  *   <p>When you use the <code>OutputDataConfig</code> object with asynchronous operations, you
  *         specify the Amazon S3 location where you want to write the output data. The URI must be in the
  *         same Region as the API endpoint that you are calling. The location is used as the prefix for
  *         the actual location of the output file.</p>
  *            <p>When the topic detection job is finished, the service creates an output file in a
  *         directory specific to the job. The <code>S3Uri</code> field contains the location of the
  *         output file, called <code>output.tar.gz</code>. It is a compressed archive that contains the
  *         ouput of the operation.</p>
  *            <p>
  *         For a PII entity detection job, the output file is plain text, not a compressed archive.
  *         The output file name is the same as the input file, with <code>.out</code> appended at the end.
  *       </p>
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
  */
final case class OutputDataConfig(s3Uri: S3Uri, kmsKeyId: Option[KmsKeyId] = None)

object OutputDataConfig extends ShapeTag.Companion[OutputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "OutputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides configuration parameters for the output of inference jobs.</p>\n         <p></p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, kmsKeyId: Option[KmsKeyId]): OutputDataConfig = OutputDataConfig(s3Uri, kmsKeyId)

  implicit val schema: Schema[OutputDataConfig] = struct(
    S3Uri.schema.required[OutputDataConfig]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>When you use the <code>OutputDataConfig</code> object with asynchronous operations, you\n      specify the Amazon S3 location where you want to write the output data. The URI must be in the\n      same Region as the API endpoint that you are calling. The location is used as the prefix for\n      the actual location of the output file.</p>\n         <p>When the topic detection job is finished, the service creates an output file in a\n      directory specific to the job. The <code>S3Uri</code> field contains the location of the\n      output file, called <code>output.tar.gz</code>. It is a compressed archive that contains the\n      ouput of the operation.</p>\n         <p>\n      For a PII entity detection job, the output file is plain text, not a compressed archive.\n      The output file name is the same as the input file, with <code>.out</code> appended at the end.\n    </p>")),
    KmsKeyId.schema.optional[OutputDataConfig]("KmsKeyId", _.kmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the\n      output results from an analysis job. The KmsKeyId can be one of the following formats:</p>\n         <ul>\n            <li>\n               <p>KMS Key ID: <code>\"1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>Amazon Resource Name (ARN) of a KMS Key:\n            <code>\"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab\"</code>\n               </p>\n            </li>\n            <li>\n               <p>KMS Key Alias: <code>\"alias/ExampleAlias\"</code>\n               </p>\n            </li>\n            <li>\n               <p>ARN of a KMS Key Alias:\n            <code>\"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias\"</code>\n               </p>\n            </li>\n         </ul>")),
  )(make).withId(id).addHints(hints)
}
