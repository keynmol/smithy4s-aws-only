package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResourceArn
  *   <p>The Amazon Resource Name (ARN) of the given Amazon Comprehend resource you are
  *         querying.</p>
  * @param Tags
  *   <p>Tags associated with the Amazon Comprehend resource being queried. A tag is a key-value
  *         pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with
  *         "Sales" as the key might be added to a resource to indicate its use by the sales department.
  *       </p>
  */
final case class ListTagsForResourceResponse(resourceArn: Option[ComprehendArn] = None, tags: Option[List[Tag]] = None)

object ListTagsForResourceResponse extends ShapeTag.Companion[ListTagsForResourceResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListTagsForResourceResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourceArn: Option[ComprehendArn], tags: Option[List[Tag]]): ListTagsForResourceResponse = ListTagsForResourceResponse(resourceArn, tags)

  implicit val schema: Schema[ListTagsForResourceResponse] = struct(
    ComprehendArn.schema.optional[ListTagsForResourceResponse]("ResourceArn", _.resourceArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the given Amazon Comprehend resource you are\n      querying.</p>")),
    TagList.underlyingSchema.optional[ListTagsForResourceResponse]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags associated with the Amazon Comprehend resource being queried. A tag is a key-value\n      pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with\n      \"Sales\" as the key might be added to a resource to indicate its use by the sales department.\n    </p>")),
  )(make).withId(id).addHints(hints)
}
