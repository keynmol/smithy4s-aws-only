package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param PolicyRevisionId
  *   <p>The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a
  *         new revision ID, and it deletes the prior version of the policy.</p>
  */
final case class PutResourcePolicyResponse(policyRevisionId: Option[PolicyRevisionId] = None)

object PutResourcePolicyResponse extends ShapeTag.Companion[PutResourcePolicyResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PutResourcePolicyResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(policyRevisionId: Option[PolicyRevisionId]): PutResourcePolicyResponse = PutResourcePolicyResponse(policyRevisionId)

  implicit val schema: Schema[PutResourcePolicyResponse] = struct(
    PolicyRevisionId.schema.optional[PutResourcePolicyResponse]("PolicyRevisionId", _.policyRevisionId).addHints(smithy.api.Documentation("<p>The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a\n      new revision ID, and it deletes the prior version of the policy.</p>")),
  )(make).withId(id).addHints(hints)
}
