package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param ResourceArn
  *   <p>The Amazon Resource Name (ARN) of the custom model to attach the policy to.</p>
  * @param ResourcePolicy
  *   <p>The JSON resource-based policy to attach to your custom model. Provide your JSON as a
  *         UTF-8 encoded string without line breaks. To provide valid JSON for your policy, enclose the
  *         attribute names and values in double quotes. If the JSON body is also enclosed in double
  *         quotes, then you must escape the double quotes that are inside the policy:</p>
  *            <p>
  *               <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
  *            </p>
  *            <p>To avoid escaping quotes, you can use single quotes to enclose the policy and double
  *         quotes to enclose the JSON names and values:</p>
  *            <p>
  *               <code>'{"attribute": "value", "attribute": ["value"]}'</code>
  *            </p>
  * @param PolicyRevisionId
  *   <p>The revision ID that Amazon Comprehend assigned to the policy that you are updating. If
  *         you are creating a new policy that has no prior version, don't use this parameter. Amazon
  *         Comprehend creates the revision ID for you.</p>
  */
final case class PutResourcePolicyRequest(resourceArn: ComprehendModelArn, resourcePolicy: Policy, policyRevisionId: Option[PolicyRevisionId] = None)

object PutResourcePolicyRequest extends ShapeTag.Companion[PutResourcePolicyRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PutResourcePolicyRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(resourceArn: ComprehendModelArn, resourcePolicy: Policy, policyRevisionId: Option[PolicyRevisionId]): PutResourcePolicyRequest = PutResourcePolicyRequest(resourceArn, resourcePolicy, policyRevisionId)

  implicit val schema: Schema[PutResourcePolicyRequest] = struct(
    ComprehendModelArn.schema.required[PutResourcePolicyRequest]("ResourceArn", _.resourceArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the custom model to attach the policy to.</p>")),
    Policy.schema.required[PutResourcePolicyRequest]("ResourcePolicy", _.resourcePolicy).addHints(smithy.api.Documentation("<p>The JSON resource-based policy to attach to your custom model. Provide your JSON as a\n      UTF-8 encoded string without line breaks. To provide valid JSON for your policy, enclose the\n      attribute names and values in double quotes. If the JSON body is also enclosed in double\n      quotes, then you must escape the double quotes that are inside the policy:</p>\n         <p>\n            <code>\"{\\\"attribute\\\": \\\"value\\\", \\\"attribute\\\": [\\\"value\\\"]}\"</code>\n         </p>\n         <p>To avoid escaping quotes, you can use single quotes to enclose the policy and double\n      quotes to enclose the JSON names and values:</p>\n         <p>\n            <code>\'{\"attribute\": \"value\", \"attribute\": [\"value\"]}\'</code>\n         </p>")),
    PolicyRevisionId.schema.optional[PutResourcePolicyRequest]("PolicyRevisionId", _.policyRevisionId).addHints(smithy.api.Documentation("<p>The revision ID that Amazon Comprehend assigned to the policy that you are updating. If\n      you are creating a new policy that has no prior version, don\'t use this parameter. Amazon\n      Comprehend creates the revision ID for you.</p>")),
  )(make).withId(id).addHints(hints)
}
