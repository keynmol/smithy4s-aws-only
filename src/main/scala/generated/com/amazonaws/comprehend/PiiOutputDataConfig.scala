package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>Provides configuration parameters for the output of PII entity detection jobs.</p>
  * @param S3Uri
  *   <p>When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations,
  *         you specify the Amazon S3 location where you want to write the output data. </p>
  *            <p>
  *         For a PII entity detection job, the output file is plain text, not a compressed archive.
  *         The output file name is the same as the input file, with <code>.out</code> appended at the end.
  *       </p>
  * @param KmsKeyId
  *   <p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the
  *         output results from an analysis job.</p>
  */
final case class PiiOutputDataConfig(s3Uri: S3Uri, kmsKeyId: Option[KmsKeyId] = None)

object PiiOutputDataConfig extends ShapeTag.Companion[PiiOutputDataConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PiiOutputDataConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides configuration parameters for the output of PII entity detection jobs.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(s3Uri: S3Uri, kmsKeyId: Option[KmsKeyId]): PiiOutputDataConfig = PiiOutputDataConfig(s3Uri, kmsKeyId)

  implicit val schema: Schema[PiiOutputDataConfig] = struct(
    S3Uri.schema.required[PiiOutputDataConfig]("S3Uri", _.s3Uri).addHints(smithy.api.Documentation("<p>When you use the <code>PiiOutputDataConfig</code> object with asynchronous operations,\n      you specify the Amazon S3 location where you want to write the output data. </p>\n         <p>\n      For a PII entity detection job, the output file is plain text, not a compressed archive.\n      The output file name is the same as the input file, with <code>.out</code> appended at the end.\n    </p>")),
    KmsKeyId.schema.optional[PiiOutputDataConfig]("KmsKeyId", _.kmsKeyId).addHints(smithy.api.Documentation("<p>ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the\n      output results from an analysis job.</p>")),
  )(make).withId(id).addHints(hints)
}
