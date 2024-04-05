package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Provides information for filtering a list of dominant language detection jobs. For more
  *       information, see the  operation.</p>
  * @param JobName
  *   <p>Filters on the name of the job.</p>
  * @param JobStatus
  *   <p>Filters the list of jobs based on job status. Returns only jobs with the specified
  *         status.</p>
  * @param SubmitTimeBefore
  *   <p>Filters the list of jobs based on the time that the job was submitted for processing.
  *         Returns only jobs submitted before the specified time. Jobs are returned in ascending order,
  *         oldest to newest.</p>
  * @param SubmitTimeAfter
  *   <p>Filters the list of jobs based on the time that the job was submitted for processing.
  *         Returns only jobs submitted after the specified time. Jobs are returned in descending order,
  *         newest to oldest.</p>
  */
final case class SentimentDetectionJobFilter(jobName: Option[JobName] = None, jobStatus: Option[JobStatus] = None, submitTimeBefore: Option[Timestamp] = None, submitTimeAfter: Option[Timestamp] = None)

object SentimentDetectionJobFilter extends ShapeTag.Companion[SentimentDetectionJobFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "SentimentDetectionJobFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Provides information for filtering a list of dominant language detection jobs. For more\n      information, see the  operation.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(jobName: Option[JobName], jobStatus: Option[JobStatus], submitTimeBefore: Option[Timestamp], submitTimeAfter: Option[Timestamp]): SentimentDetectionJobFilter = SentimentDetectionJobFilter(jobName, jobStatus, submitTimeBefore, submitTimeAfter)

  implicit val schema: Schema[SentimentDetectionJobFilter] = struct(
    JobName.schema.optional[SentimentDetectionJobFilter]("JobName", _.jobName).addHints(smithy.api.Documentation("<p>Filters on the name of the job.</p>")),
    JobStatus.schema.optional[SentimentDetectionJobFilter]("JobStatus", _.jobStatus).addHints(smithy.api.Documentation("<p>Filters the list of jobs based on job status. Returns only jobs with the specified\n      status.</p>")),
    timestamp.optional[SentimentDetectionJobFilter]("SubmitTimeBefore", _.submitTimeBefore).addHints(smithy.api.Documentation("<p>Filters the list of jobs based on the time that the job was submitted for processing.\n      Returns only jobs submitted before the specified time. Jobs are returned in ascending order,\n      oldest to newest.</p>")),
    timestamp.optional[SentimentDetectionJobFilter]("SubmitTimeAfter", _.submitTimeAfter).addHints(smithy.api.Documentation("<p>Filters the list of jobs based on the time that the job was submitted for processing.\n      Returns only jobs submitted after the specified time. Jobs are returned in descending order,\n      newest to oldest.</p>")),
  )(make).withId(id).addHints(hints)
}
