package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Specifies information about the specified endpoint.
  *       For information about endpoints, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.</p>
  * @param CurrentInferenceUnits
  *   <p>The number of inference units currently used by the model using this endpoint.</p>
  * @param DesiredInferenceUnits
  *   <p>The desired number of inference units to be used by the model using this endpoint.
  *   
  *         Each inference unit represents of a throughput of 100 characters per second.</p>
  * @param EndpointArn
  *   <p>The Amazon Resource Number (ARN) of the endpoint.</p>
  * @param LastModifiedTime
  *   <p>The date and time that the endpoint was last modified.</p>
  * @param ModelArn
  *   <p>The Amazon Resource Number (ARN) of the model to which the endpoint is attached.</p>
  * @param DesiredModelArn
  *   <p>ARN of the new model to use for updating an existing endpoint. This ARN is going to be
  *         different from the model ARN when the update is in progress</p>
  * @param Message
  *   <p>Specifies a reason for failure in cases of <code>Failed</code> status.</p>
  * @param DesiredDataAccessRoleArn
  *   <p>Data access role ARN to use in case the new model is encrypted with a customer KMS
  *         key.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend read access to trained custom models encrypted with a customer
  *         managed key (ModelKmsKeyId).</p>
  * @param Status
  *   <p>Specifies the status of the endpoint. Because the endpoint updates and creation are
  *         asynchronous, so customers will need to wait for the endpoint to be <code>Ready</code> status
  *         before making inference requests.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel</p>
  * @param CreationTime
  *   <p>The creation date and time of the endpoint.</p>
  */
final case class EndpointProperties(endpointArn: Option[ComprehendEndpointArn] = None, status: Option[EndpointStatus] = None, message: Option[AnyLengthString] = None, modelArn: Option[ComprehendModelArn] = None, desiredModelArn: Option[ComprehendModelArn] = None, desiredInferenceUnits: Option[InferenceUnitsInteger] = None, currentInferenceUnits: Option[InferenceUnitsInteger] = None, creationTime: Option[Timestamp] = None, lastModifiedTime: Option[Timestamp] = None, dataAccessRoleArn: Option[IamRoleArn] = None, desiredDataAccessRoleArn: Option[IamRoleArn] = None, flywheelArn: Option[ComprehendFlywheelArn] = None)

object EndpointProperties extends ShapeTag.Companion[EndpointProperties] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EndpointProperties")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies information about the specified endpoint.\n      For information about endpoints, see <a href=\"https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html\">Managing endpoints</a>.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointArn: Option[ComprehendEndpointArn], status: Option[EndpointStatus], message: Option[AnyLengthString], modelArn: Option[ComprehendModelArn], desiredModelArn: Option[ComprehendModelArn], desiredInferenceUnits: Option[InferenceUnitsInteger], currentInferenceUnits: Option[InferenceUnitsInteger], creationTime: Option[Timestamp], lastModifiedTime: Option[Timestamp], dataAccessRoleArn: Option[IamRoleArn], desiredDataAccessRoleArn: Option[IamRoleArn], flywheelArn: Option[ComprehendFlywheelArn]): EndpointProperties = EndpointProperties(endpointArn, status, message, modelArn, desiredModelArn, desiredInferenceUnits, currentInferenceUnits, creationTime, lastModifiedTime, dataAccessRoleArn, desiredDataAccessRoleArn, flywheelArn)

  implicit val schema: Schema[EndpointProperties] = struct(
    ComprehendEndpointArn.schema.optional[EndpointProperties]("EndpointArn", _.endpointArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the endpoint.</p>")),
    EndpointStatus.schema.optional[EndpointProperties]("Status", _.status).addHints(smithy.api.Documentation("<p>Specifies the status of the endpoint. Because the endpoint updates and creation are\n      asynchronous, so customers will need to wait for the endpoint to be <code>Ready</code> status\n      before making inference requests.</p>")),
    AnyLengthString.schema.optional[EndpointProperties]("Message", _.message).addHints(smithy.api.Documentation("<p>Specifies a reason for failure in cases of <code>Failed</code> status.</p>")),
    ComprehendModelArn.schema.optional[EndpointProperties]("ModelArn", _.modelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the model to which the endpoint is attached.</p>")),
    ComprehendModelArn.schema.optional[EndpointProperties]("DesiredModelArn", _.desiredModelArn).addHints(smithy.api.Documentation("<p>ARN of the new model to use for updating an existing endpoint. This ARN is going to be\n      different from the model ARN when the update is in progress</p>")),
    InferenceUnitsInteger.schema.optional[EndpointProperties]("DesiredInferenceUnits", _.desiredInferenceUnits).addHints(smithy.api.Documentation("<p>The desired number of inference units to be used by the model using this endpoint.\n\n      Each inference unit represents of a throughput of 100 characters per second.</p>")),
    InferenceUnitsInteger.schema.optional[EndpointProperties]("CurrentInferenceUnits", _.currentInferenceUnits).addHints(smithy.api.Documentation("<p>The number of inference units currently used by the model using this endpoint.</p>")),
    timestamp.optional[EndpointProperties]("CreationTime", _.creationTime).addHints(smithy.api.Documentation("<p>The creation date and time of the endpoint.</p>")),
    timestamp.optional[EndpointProperties]("LastModifiedTime", _.lastModifiedTime).addHints(smithy.api.Documentation("<p>The date and time that the endpoint was last modified.</p>")),
    IamRoleArn.schema.optional[EndpointProperties]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend read access to trained custom models encrypted with a customer\n      managed key (ModelKmsKeyId).</p>")),
    IamRoleArn.schema.optional[EndpointProperties]("DesiredDataAccessRoleArn", _.desiredDataAccessRoleArn).addHints(smithy.api.Documentation("<p>Data access role ARN to use in case the new model is encrypted with a customer KMS\n      key.</p>")),
    ComprehendFlywheelArn.schema.optional[EndpointProperties]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel</p>")),
  )(make).withId(id).addHints(hints)
}
