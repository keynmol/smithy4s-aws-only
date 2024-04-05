package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p>A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For
  *       example, a tag with the key-value pair ‘Department’:’Sales’ might be added to a resource to
  *       indicate its use by a particular department. </p>
  * @param Key
  *   <p>The initial part of a key-value pair that forms a tag associated with a given resource.
  *         For instance, if you want to show which resources are used by which departments, you might use
  *         “Department” as the key portion of the pair, with multiple possible values such as “sales,”
  *         “legal,” and “administration.” </p>
  * @param Value
  *   <p> The second part of a key-value pair that forms a tag associated with a given resource.
  *         For instance, if you want to show which resources are used by which departments, you might use
  *         “Department” as the initial (key) portion of the pair, with a value of “sales” to indicate the
  *         sales department. </p>
  */
final case class Tag(key: TagKey, value: Option[TagValue] = None)

object Tag extends ShapeTag.Companion[Tag] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "Tag")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For\n      example, a tag with the key-value pair ‘Department’:’Sales’ might be added to a resource to\n      indicate its use by a particular department. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(key: TagKey, value: Option[TagValue]): Tag = Tag(key, value)

  implicit val schema: Schema[Tag] = struct(
    TagKey.schema.required[Tag]("Key", _.key).addHints(smithy.api.Documentation("<p>The initial part of a key-value pair that forms a tag associated with a given resource.\n      For instance, if you want to show which resources are used by which departments, you might use\n      “Department” as the key portion of the pair, with multiple possible values such as “sales,”\n      “legal,” and “administration.” </p>")),
    TagValue.schema.optional[Tag]("Value", _.value).addHints(smithy.api.Documentation("<p> The second part of a key-value pair that forms a tag associated with a given resource.\n      For instance, if you want to show which resources are used by which departments, you might use\n      “Department” as the initial (key) portion of the pair, with a value of “sales” to indicate the\n      sales department. </p>")),
  )(make).withId(id).addHints(hints)
}
