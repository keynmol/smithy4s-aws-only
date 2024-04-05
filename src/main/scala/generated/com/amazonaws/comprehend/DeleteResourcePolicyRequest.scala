package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResourceArn
  *   <p>The Amazon Resource Name (ARN) of the custom model version that has the policy to delete.</p>
  * @param PolicyRevisionId
  *   <p>The revision ID of the policy to delete.</p>
  */
final case class DeleteResourcePolicyRequest(resourceArn: ComprehendModelArn, policyRevisionId: Option[PolicyRevisionId] = None)

object DeleteResourcePolicyRequest extends ShapeTag.Companion[DeleteResourcePolicyRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DeleteResourcePolicyRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourceArn: ComprehendModelArn, policyRevisionId: Option[PolicyRevisionId]): DeleteResourcePolicyRequest = DeleteResourcePolicyRequest(resourceArn, policyRevisionId)

  implicit val schema: Schema[DeleteResourcePolicyRequest] = struct(
    ComprehendModelArn.schema.required[DeleteResourcePolicyRequest]("ResourceArn", _.resourceArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the custom model version that has the policy to delete.</p>")),
    PolicyRevisionId.schema.optional[DeleteResourcePolicyRequest]("PolicyRevisionId", _.policyRevisionId).addHints(smithy.api.Documentation("<p>The revision ID of the policy to delete.</p>")),
  )(make).withId(id).addHints(hints)
}
