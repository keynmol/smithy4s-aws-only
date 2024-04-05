package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResourceArn
  *   <p>The Amazon Resource Name (ARN) of the given Amazon Comprehend resource to which you want
  *         to associate the tags. </p>
  * @param Tags
  *   <p>Tags being associated with a specific Amazon Comprehend resource. There can be a maximum
  *         of 50 tags (both existing and pending) associated with a specific resource. </p>
  */
final case class TagResourceRequest(resourceArn: ComprehendArn, tags: List[Tag])

object TagResourceRequest extends ShapeTag.Companion[TagResourceRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TagResourceRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourceArn: ComprehendArn, tags: List[Tag]): TagResourceRequest = TagResourceRequest(resourceArn, tags)

  implicit val schema: Schema[TagResourceRequest] = struct(
    ComprehendArn.schema.required[TagResourceRequest]("ResourceArn", _.resourceArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the given Amazon Comprehend resource to which you want\n      to associate the tags. </p>")),
    TagList.underlyingSchema.required[TagResourceRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags being associated with a specific Amazon Comprehend resource. There can be a maximum\n      of 50 tags (both existing and pending) associated with a specific resource. </p>")),
  )(make).withId(id).addHints(hints)
}
