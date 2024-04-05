package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResourceArn
  *   <p>The Amazon Resource Name (ARN) of the given Amazon Comprehend resource you are querying.
  *       </p>
  */
final case class ListTagsForResourceRequest(resourceArn: ComprehendArn)

object ListTagsForResourceRequest extends ShapeTag.Companion[ListTagsForResourceRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListTagsForResourceRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourceArn: ComprehendArn): ListTagsForResourceRequest = ListTagsForResourceRequest(resourceArn)

  implicit val schema: Schema[ListTagsForResourceRequest] = struct(
    ComprehendArn.schema.required[ListTagsForResourceRequest]("ResourceArn", _.resourceArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the given Amazon Comprehend resource you are querying.\n    </p>")),
  )(make).withId(id).addHints(hints)
}
