package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param FlywheelArn
  *   <p>The ARN of the flywheel.</p>
  * @param ClientRequestToken
  *   <p>A unique identifier for the request. If you don't set the client request token, Amazon
  *         Comprehend generates one.</p>
  */
final case class StartFlywheelIterationRequest(flywheelArn: ComprehendFlywheelArn, clientRequestToken: Option[ClientRequestTokenString] = None)

object StartFlywheelIterationRequest extends ShapeTag.Companion[StartFlywheelIterationRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "StartFlywheelIterationRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(flywheelArn: ComprehendFlywheelArn, clientRequestToken: Option[ClientRequestTokenString]): StartFlywheelIterationRequest = StartFlywheelIterationRequest(flywheelArn, clientRequestToken)

  implicit val schema: Schema[StartFlywheelIterationRequest] = struct(
    ComprehendFlywheelArn.schema.required[StartFlywheelIterationRequest]("FlywheelArn", _.flywheelArn).addHints(smithy.api.Documentation("<p>The ARN of the flywheel.</p>")),
    ClientRequestTokenString.schema.optional[StartFlywheelIterationRequest]("ClientRequestToken", _.clientRequestToken).addHints(smithy.api.Documentation("<p>A unique identifier for the request. If you don\'t set the client request token, Amazon\n      Comprehend generates one.</p>")),
  )(make).withId(id).addHints(hints)
}
