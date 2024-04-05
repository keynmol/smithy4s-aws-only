package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.string

object FlywheelS3Uri extends Newtype[String] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "FlywheelS3Uri")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[String] = string.withId(id).addHints(hints).validated(smithy.api.Length(min = Some(0L), max = Some(512L))).validated(smithy.api.Pattern(s"^s3://[a-z0-9][\\.\\-a-z0-9]{1,61}[a-z0-9](/.*)?$$"))
  implicit val schema: Schema[FlywheelS3Uri] = bijection(underlyingSchema, asBijection)
}
