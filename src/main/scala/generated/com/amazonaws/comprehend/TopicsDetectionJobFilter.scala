package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information for filtering topic detection jobs. For more information, see
  *         .</p>
  * @param JobName
  *   <p></p>
  * @param JobStatus
  *   <p>Filters the list of topic detection jobs based on job status. Returns only jobs with
  *         the specified status.</p>
  * @param SubmitTimeBefore
  *   <p>Filters the list of jobs based on the time that the job was submitted for processing.
  *         Only returns jobs submitted before the specified time. Jobs are returned in descending order,
  *         newest to oldest.</p>
  * @param SubmitTimeAfter
  *   <p>Filters the list of jobs based on the time that the job was submitted for processing.
  *         Only returns jobs submitted after the specified time. Jobs are returned in ascending order,
  *         oldest to newest.</p>
  */
final case class TopicsDetectionJobFilter(jobName: Option[JobName] = None, jobStatus: Option[JobStatus] = None, submitTimeBefore: Option[Timestamp] = None, submitTimeAfter: Option[Timestamp] = None)

object TopicsDetectionJobFilter extends ShapeTag.Companion[TopicsDetectionJobFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "TopicsDetectionJobFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information for filtering topic detection jobs. For more information, see\n        .</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobName: Option[JobName], jobStatus: Option[JobStatus], submitTimeBefore: Option[Timestamp], submitTimeAfter: Option[Timestamp]): TopicsDetectionJobFilter = TopicsDetectionJobFilter(jobName, jobStatus, submitTimeBefore, submitTimeAfter)

  implicit val schema: Schema[TopicsDetectionJobFilter] = struct(
    JobName.schema.optional[TopicsDetectionJobFilter]("JobName", _.jobName).addHints(smithy.api.Documentation("<p></p>")),
    JobStatus.schema.optional[TopicsDetectionJobFilter]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>Filters the list of topic detection jobs based on job status. Returns only jobs with\n      the specified status.</p>")),
    timestamp.optional[TopicsDetectionJobFilter]("SubmitTimeBefore", _.submitTimeBefore).addHints(smithy.api.Documentation("<p>Filters the list of jobs based on the time that the job was submitted for processing.\n      Only returns jobs submitted before the specified time. Jobs are returned in descending order,\n      newest to oldest.</p>")),
    timestamp.optional[TopicsDetectionJobFilter]("SubmitTimeAfter", _.submitTimeAfter).addHints(smithy.api.Documentation("<p>Filters the list of jobs based on the time that the job was submitted for processing.\n      Only returns jobs submitted after the specified time. Jobs are returned in ascending order,\n      oldest to newest.</p>")),
  )(make).withId(id).addHints(hints)
}
