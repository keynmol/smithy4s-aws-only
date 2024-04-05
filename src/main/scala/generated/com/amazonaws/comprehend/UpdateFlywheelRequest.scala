package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p>The Amazon Resource Number (ARN) of the flywheel to update.</p>
  * @param ActiveModelArn
  *   <p>The Amazon Resource Number (ARN) of the active model version.</p>
  * @param DataAccessRoleArn
  *   <p>The Amazon Resource Name (ARN) of the IAM role that
  *         grants Amazon Comprehend permission to access the flywheel data.</p>
  * @param DataSecurityConfig
  *   <p>Flywheel data security configuration.</p>
  */
final case class UpdateFlywheelRequest(flywheelArn: ComprehendFlywheelArn, activeModelArn: Option[ComprehendModelArn] = None, dataAccessRoleArn: Option[IamRoleArn] = None, dataSecurityConfig: Option[UpdateDataSecurityConfig] = None)

object UpdateFlywheelRequest extends ShapeTag.Companion[UpdateFlywheelRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "UpdateFlywheelRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: ComprehendFlywheelArn, activeModelArn: Option[ComprehendModelArn], dataAccessRoleArn: Option[IamRoleArn], dataSecurityConfig: Option[UpdateDataSecurityConfig]): UpdateFlywheelRequest = UpdateFlywheelRequest(flywheelArn, activeModelArn, dataAccessRoleArn, dataSecurityConfig)

  implicit val schema: Schema[UpdateFlywheelRequest] = struct(
    ComprehendFlywheelArn.schema.required[UpdateFlywheelRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the flywheel to update.</p>")),
    ComprehendModelArn.schema.optional[UpdateFlywheelRequest]("ActiveModelArn", _.activeModelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the active model version.</p>")),
    IamRoleArn.schema.optional[UpdateFlywheelRequest]("DataAccessRoleArn", _.dataAccessRoleArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Name (ARN) of the IAM role that\n      grants Amazon Comprehend permission to access the flywheel data.</p>")),
    UpdateDataSecurityConfig.schema.optional[UpdateFlywheelRequest]("DataSecurityConfig", _.dataSecurityConfig).addHints(smithy.api.Documentation("<p>Flywheel data security configuration.</p>")),
  )(make).withId(id).addHints(hints)
}
