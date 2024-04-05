package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Specifies information about the specified endpoint.
  *         For information about endpoints, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.</p>
  */
object EndpointPropertiesList extends Newtype[List[EndpointProperties]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "EndpointPropertiesList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[EndpointProperties]] = list(EndpointProperties.schema).withId(id).addHints(hints)
  implicit val schema: Schema[EndpointPropertiesList] = bijection(underlyingSchema, asBijection)
}
