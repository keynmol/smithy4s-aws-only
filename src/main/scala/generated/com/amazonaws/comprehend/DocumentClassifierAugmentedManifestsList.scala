package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>An augmented manifest file that provides training data for your custom model. An augmented
  *         manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
  */
object DocumentClassifierAugmentedManifestsList extends Newtype[List[AugmentedManifestsListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentClassifierAugmentedManifestsList")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[AugmentedManifestsListItem]] = list(AugmentedManifestsListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[DocumentClassifierAugmentedManifestsList] = bijection(underlyingSchema, asBijection)
}
