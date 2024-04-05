package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResourceArn
  *   <p> The Amazon Resource Name (ARN) of the given Amazon Comprehend resource from which you
  *         want to remove the tags. </p>
  * @param TagKeys
  *   <p>The initial part of a key-value pair that forms a tag being removed from a given resource.
  *         For example, a tag with "Sales" as the key might be added to a resource to indicate its use by
  *         the sales department. Keys must be unique and cannot be duplicated for a particular resource.
  *       </p>
  */
final case class UntagResourceRequest(resourceArn: ComprehendArn, tagKeys: List[TagKey])

object UntagResourceRequest extends ShapeTag.Companion[UntagResourceRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "UntagResourceRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourceArn: ComprehendArn, tagKeys: List[TagKey]): UntagResourceRequest = UntagResourceRequest(resourceArn, tagKeys)

  implicit val schema: Schema[UntagResourceRequest] = struct(
    ComprehendArn.schema.required[UntagResourceRequest]("ResourceArn", _.resourceArn).addHints(smithy.api.Documentation("<p> The Amazon Resource Name (ARN) of the given Amazon Comprehend resource from which you\n      want to remove the tags. </p>")),
    TagKeyList.underlyingSchema.required[UntagResourceRequest]("TagKeys", _.tagKeys).addHints(smithy.api.Documentation("<p>The initial part of a key-value pair that forms a tag being removed from a given resource.\n      For example, a tag with \"Sales\" as the key might be added to a resource to indicate its use by\n      the sales department. Keys must be unique and cannot be duplicated for a particular resource.\n    </p>")),
  )(make).withId(id).addHints(hints)
}
