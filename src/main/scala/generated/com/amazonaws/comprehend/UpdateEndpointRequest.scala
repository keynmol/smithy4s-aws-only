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
  * @param EndpointArn
  *   <p>The Amazon Resource Number (ARN) of the endpoint being updated.</p>
  * @param DesiredModelArn
  *   <p>The ARN of the new model to use when updating an existing endpoint.</p>
  * @param DesiredDataAccessRoleArn
  *   <p>Data access role ARN to use in case the new model is encrypted with a customer CMK.</p>
  * @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel</p>
  */
final case class UpdateEndpointRequest(endpointArn: ComprehendEndpointArn, desiredModelArn: Option[ComprehendModelArn] = None, desiredInferenceUnits: Option[InferenceUnitsInteger] = None, desiredDataAccessRoleArn: Option[IamRoleArn] = None, flywheelArn: Option[ComprehendFlywheelArn] = None)

object UpdateEndpointRequest extends ShapeTag.Companion[UpdateEndpointRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "UpdateEndpointRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(endpointArn: ComprehendEndpointArn, desiredModelArn: Option[ComprehendModelArn], desiredInferenceUnits: Option[InferenceUnitsInteger], desiredDataAccessRoleArn: Option[IamRoleArn], flywheelArn: Option[ComprehendFlywheelArn]): UpdateEndpointRequest = UpdateEndpointRequest(endpointArn, desiredModelArn, desiredInferenceUnits, desiredDataAccessRoleArn, flywheelArn)

  implicit val schema: Schema[UpdateEndpointRequest] = struct(
    ComprehendEndpointArn.schema.required[UpdateEndpointRequest]("EndpointArn", _.endpointArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the endpoint being updated.</p>")),
    ComprehendModelArn.schema.optional[UpdateEndpointRequest]("DesiredModelArn", _.desiredModelArn).addHints(smithy.api.Documentation("<p>The ARN of the new model to use when updating an existing endpoint.</p>")),
    InferenceUnitsInteger.schema.optional[UpdateEndpointRequest]("DesiredInferenceUnits", _.desiredInferenceUnits).addHints(smithy.api.Documentation("<p> The desired number of inference units to be used by the model using this endpoint.\n\n      Each inference unit represents of a throughput of 100 characters per second.</p>")),
    IamRoleArn.schema.optional[UpdateEndpointRequest]("DesiredDataAccessRoleArn", _.desiredDataAccessRoleArn).addHints(smithy.api.Documentation("<p>Data access role ARN to use in case the new model is encrypted with a customer CMK.</p>")),
    ComprehendFlywheelArn.schema.optional[UpdateEndpointRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel</p>")),
  )(make).withId(id).addHints(hints)
}
