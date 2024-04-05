package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param DesiredInferenceUnits
  *   <p> The desired number of inference units to be used by the model using this endpoint.
  *   
  *         Each inference unit represents of a throughput of 100 characters per second.</p>
  * @param ClientRequestToken
  *   <p>An idempotency token provided by the customer. If this token matches a previous endpoint
  *         creation request, Amazon Comprehend will not return a <code>ResourceInUseException</code>.
  *       </p>
  * @param ModelArn
  *   <p>The Amazon Resource Number (ARN) of the model to which the endpoint will be
  *         attached.</p>
  * @param Tags
  *   <p>Tags to associate with the endpoint. A tag is a key-value pair that adds
  *         metadata to the endpoint. For example, a tag with "Sales" as the key might be added to an
  *         endpoint to indicate its use by the sales department. </p>
  * @param EndpointName
  *   <p>This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for
  *         all subsequent requests to this resource. </p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to trained custom models encrypted with a customer
  *         managed key (ModelKmsKeyId).</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel to which the endpoint will be
  *         attached.</p>
  */
final case class CreateEndpointRequest(endpointName: ComprehendEndpointName, desiredInferenceUnits: InferenceUnitsInteger, modelArn: Option[ComprehendModelArn] = None, clientRequestToken: Option[ClientRequestTokenString] = None, tags: Option[List[Tag]] = None, dataAccessRoleArn: Option[IamRoleArn] = None, flywheelArn: Option[ComprehendFlywheelArn] = None)

object CreateEndpointRequest extends ShapeTag.Companion[CreateEndpointRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "CreateEndpointRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointName: ComprehendEndpointName, modelArn: Option[ComprehendModelArn], desiredInferenceUnits: InferenceUnitsInteger, clientRequestToken: Option[ClientRequestTokenString], tags: Option[List[Tag]], dataAccessRoleArn: Option[IamRoleArn], flywheelArn: Option[ComprehendFlywheelArn]): CreateEndpointRequest = CreateEndpointRequest(endpointName, desiredInferenceUnits, modelArn, clientRequestToken, tags, dataAccessRoleArn, flywheelArn)

  implicit val schema: Schema[CreateEndpointRequest] = struct(
    ComprehendEndpointName.schema.required[CreateEndpointRequest]("EndpointName", _.endpointName).addHints(smithy.api.Documentation("<p>This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for\n      all subsequent requests to this resource. </p>")),
    ComprehendModelArn.schema.optional[CreateEndpointRequest]("ModelArn", _.modelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the model to which the endpoint will be\n      attached.</p>")),
    InferenceUnitsInteger.schema.required[CreateEndpointRequest]("DesiredInferenceUnits", _.desiredInferenceUnits).addHints(smithy.api.Documentation("<p> The desired number of inference units to be used by the model using this endpoint.\n\n      Each inference unit represents of a throughput of 100 characters per second.</p>")),
    ClientRequestTokenString.schema.optional[CreateEndpointRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>An idempotency token provided by the customer. If this token matches a previous endpoint\n      creation request, Amazon Comprehend will not return a <code>ResourceInUseException</code>.\n    </p>"), smithy.api.IdempotencyToken()),
    TagList.underlyingSchema.optional[CreateEndpointRequest]("Tags", _.tags).addHints(smithy.api.Documentation("<p>Tags to associate with the endpoint. A tag is a key-value pair that adds\n      metadata to the endpoint. For example, a tag with \"Sales\" as the key might be added to an\n      endpoint to indicate its use by the sales department. </p>")),
    IamRoleArn.schema.optional[CreateEndpointRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to trained custom models encrypted with a customer\n      managed key (ModelKmsKeyId).</p>")),
    ComprehendFlywheelArn.schema.optional[CreateEndpointRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel to which the endpoint will be\n      attached.</p>")),
  )(make).withId(id).addHints(hints)
}
