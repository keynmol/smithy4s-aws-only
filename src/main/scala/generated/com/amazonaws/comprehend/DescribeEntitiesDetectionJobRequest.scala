package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** @param JobId
  *   <p>The identifier that Amazon Comprehend generated for the job. The
  *           <code>StartEntitiesDetectionJob</code> operation returns this identifier in its response.</p>
  */
final case class DescribeEntitiesDetectionJobRequest(jobId: JobId)

object DescribeEntitiesDetectionJobRequest extends ShapeTag.Companion[DescribeEntitiesDetectionJobRequest] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DescribeEntitiesDetectionJobRequest")

  val hints: Hints = Hints(
    smithy.api.Input(),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobId: JobId): DescribeEntitiesDetectionJobRequest = DescribeEntitiesDetectionJobRequest(jobId)

  implicit val schema: Schema[DescribeEntitiesDetectionJobRequest] = struct(
    JobId.schema.required[DescribeEntitiesDetectionJobRequest]("JobId", _.jobId).addHints(smithy.api.Documentation("<p>The identifier that Amazon Comprehend generated for the job. The\n        <code>StartEntitiesDetectionJob</code> operation returns this identifier in its response.</p>")),
  )(make).withId(id).addHints(hints)
}
