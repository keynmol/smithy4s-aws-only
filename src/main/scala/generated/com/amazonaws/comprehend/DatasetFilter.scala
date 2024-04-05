package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.Timestamp
import smithy4s.schema.Schema.struct
import smithy4s.schema.Schema.timestamp

/** <p>Filter the datasets based on creation time or dataset status.</p>
  * @param Status
  *   <p>Filter the datasets based on the dataset status.</p>
  * @param DatasetType
  *   <p>Filter the datasets based on the dataset type.</p>
  * @param CreationTimeAfter
  *   <p>Filter the datasets to include datasets created after the specified time.</p>
  * @param CreationTimeBefore
  *   <p>Filter the datasets to include datasets created before the specified time.</p>
  */
final case class DatasetFilter(status: Option[DatasetStatus] = None, datasetType: Option[DatasetType] = None, creationTimeAfter: Option[Timestamp] = None, creationTimeBefore: Option[Timestamp] = None)

object DatasetFilter extends ShapeTag.Companion[DatasetFilter] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DatasetFilter")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Filter the datasets based on creation time or dataset status.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(status: Option[DatasetStatus], datasetType: Option[DatasetType], creationTimeAfter: Option[Timestamp], creationTimeBefore: Option[Timestamp]): DatasetFilter = DatasetFilter(status, datasetType, creationTimeAfter, creationTimeBefore)

  implicit val schema: Schema[DatasetFilter] = struct(
    DatasetStatus.schema.optional[DatasetFilter]("Status", _.status).addHints(smithy.api.Documentation("<p>Filter the datasets based on the dataset status.</p>")),
    DatasetType.schema.optional[DatasetFilter]("DatasetType", _.datasetType).addHints(smithy.api.Documentation("<p>Filter the datasets based on the dataset type.</p>")),
    timestamp.optional[DatasetFilter]("CreationTimeAfter", _.creationTimeAfter).addHints(smithy.api.Documentation("<p>Filter the datasets to include datasets created after the specified time.</p>")),
    timestamp.optional[DatasetFilter]("CreationTimeBefore", _.creationTimeBefore).addHints(smithy.api.Documentation("<p>Filter the datasets to include datasets created before the specified time.</p>")),
  )(make).withId(id).addHints(hints)
}
