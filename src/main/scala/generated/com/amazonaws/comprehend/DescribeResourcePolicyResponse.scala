package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** @param ResourcePolicy
  *   <p>The JSON body of the resource-based policy.</p>
  * @param CreationTime
  *   <p>The time at which the policy was created.</p>
  * @param LastModifiedTime
  *   <p>The time at which the policy was last modified.</p>
  * @param PolicyRevisionId
  *   <p>The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a
  *         new revision ID, and it deletes the prior version of the policy.</p>
  */
final case class DescribeResourcePolicyResponse(resourcePolicy: Option[Policy] = None, creationTime: Option[Timestamp] = None, lastModifiedTime: Option[Timestamp] = None, policyRevisionId: Option[PolicyRevisionId] = None)

object DescribeResourcePolicyResponse extends ShapeTag.Companion[DescribeResourcePolicyResponse] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeResourcePolicyResponse")

  val hints: Hints = Hints(
    smithy.api.Output(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourcePolicy: Option[Policy], creationTime: Option[Timestamp], lastModifiedTime: Option[Timestamp], policyRevisionId: Option[PolicyRevisionId]): DescribeResourcePolicyResponse = DescribeResourcePolicyResponse(resourcePolicy, creationTime, lastModifiedTime, policyRevisionId)

  implicit val schema: Schema[DescribeResourcePolicyResponse] = struct(
    Policy.schema.optional[DescribeResourcePolicyResponse]("ResourcePolicy", _.resourcePolicy).addHints(smithy.api.Documentation("<p>The JSON body of the resource-based policy.</p>")),
    timestamp.optional[DescribeResourcePolicyResponse]("CreationTime", _.creationTime).addHints(smithy.api.Documentation("<p>The time at which the policy was created.</p>")),
    timestamp.optional[DescribeResourcePolicyResponse]("LastModifiedTime", _.lastModifiedTime).addHints(smithy.api.Documentation("<p>The time at which the policy was last modified.</p>")),
    PolicyRevisionId.schema.optional[DescribeResourcePolicyResponse]("PolicyRevisionId", _.policyRevisionId).addHints(smithy.api.Documentation("<p>The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a\n      new revision ID, and it deletes the prior version of the policy.</p>")),
  )(make).withId(id).addHints(hints)
}
