package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>The filter used to determine which endpoints are returned. You can filter jobs on their
  *       name, model, status, or the date and time that they were created. You can only set one filter
  *       at a time. </p>
  * @param ModelArn
  *   <p>The Amazon Resource Number (ARN) of the model to which the endpoint is attached.</p>
  * @param Status
  *   <p>Specifies the status of the endpoint being returned. Possible values are: Creating, Ready,
  *         Updating, Deleting, Failed.</p>
  * @param CreationTimeBefore
  *   <p>Specifies a date before which the returned endpoint or endpoints were created.</p>
  * @param CreationTimeAfter
  *   <p>Specifies a date after which the returned endpoint or endpoints were created.</p>
  */
final case class EndpointFilter(modelArn: Option[ComprehendModelArn] = None, status: Option[EndpointStatus] = None, creationTimeBefore: Option[Timestamp] = None, creationTimeAfter: Option[Timestamp] = None)

object EndpointFilter extends ShapeTag.Companion[EndpointFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EndpointFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>The filter used to determine which endpoints are returned. You can filter jobs on their\n      name, model, status, or the date and time that they were created. You can only set one filter\n      at a time. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(modelArn: Option[ComprehendModelArn], status: Option[EndpointStatus], creationTimeBefore: Option[Timestamp], creationTimeAfter: Option[Timestamp]): EndpointFilter = EndpointFilter(modelArn, status, creationTimeBefore, creationTimeAfter)

  implicit val schema: Schema[EndpointFilter] = struct(
    ComprehendModelArn.schema.optional[EndpointFilter]("ModelArn", _.modelArn).addHints(smithy.api.Documentation("<p>The Amazon Resource Number (ARN) of the model to which the endpoint is attached.</p>")),
    EndpointStatus.schema.optional[EndpointFilter]("Status", _.status).addHints(smithy.api.Documentation("<p>Specifies the status of the endpoint being returned. Possible values are: Creating, Ready,\n      Updating, Deleting, Failed.</p>")),
    timestamp.optional[EndpointFilter]("CreationTimeBefore", _.creationTimeBefore).addHints(smithy.api.Documentation("<p>Specifies a date before which the returned endpoint or endpoints were created.</p>")),
    timestamp.optional[EndpointFilter]("CreationTimeAfter", _.creationTimeAfter).addHints(smithy.api.Documentation("<p>Specifies a date after which the returned endpoint or endpoints were created.</p>")),
  )(make).withId(id).addHints(hints)
}
