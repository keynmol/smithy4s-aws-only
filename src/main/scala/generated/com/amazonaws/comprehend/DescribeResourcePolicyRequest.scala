package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResourceArn
  *   <p>The Amazon Resource Name (ARN) of the custom model version that has the resource policy.</p>
  */
final case class DescribeResourcePolicyRequest(resourceArn: ComprehendModelArn)

object DescribeResourcePolicyRequest extends ShapeTag.Companion[DescribeResourcePolicyRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeResourcePolicyRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourceArn: ComprehendModelArn): DescribeResourcePolicyRequest = DescribeResourcePolicyRequest(resourceArn)

  implicit val schema: Schema[DescribeResourcePolicyRequest] = struct(
    ComprehendModelArn.schema.required[DescribeResourcePolicyRequest]("ResourceArn", _.resourceArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the custom model version that has the resource policy.</p>")),
  )(make).withId(id).addHints(hints)
}
