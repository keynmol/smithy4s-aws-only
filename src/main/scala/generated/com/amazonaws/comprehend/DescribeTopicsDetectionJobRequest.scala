package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier assigned by the user to the detection job.</p>
  */
final case class DescribeTopicsDetectionJobRequest(jobId: JobId)

object DescribeTopicsDetectionJobRequest extends ShapeTag.Companion[DescribeTopicsDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeTopicsDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): DescribeTopicsDetectionJobRequest = DescribeTopicsDetectionJobRequest(jobId)

  implicit val schema: Schema[DescribeTopicsDetectionJobRequest] = struct(
    JobId.schema.required[DescribeTopicsDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier assigned by the user to the detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
