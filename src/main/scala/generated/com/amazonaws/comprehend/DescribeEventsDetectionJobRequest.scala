package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier of the events detection job.</p>
  */
final case class DescribeEventsDetectionJobRequest(jobId: JobId)

object DescribeEventsDetectionJobRequest extends ShapeTag.Companion[DescribeEventsDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEventsDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): DescribeEventsDetectionJobRequest = DescribeEventsDetectionJobRequest(jobId)

  implicit val schema: Schema[DescribeEventsDetectionJobRequest] = struct(
    JobId.schema.required[DescribeEventsDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier of the events detection job.</p>")),
  )(make).withId(id).addHints(hints)
}
