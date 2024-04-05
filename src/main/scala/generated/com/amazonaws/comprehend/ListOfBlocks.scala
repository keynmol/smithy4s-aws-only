package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Information about each word or line of text in the input document.</p>
  *            <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Block.html">Block</a> in the Amazon Textract API reference.</p>
  */
object ListOfBlocks extends Newtype[List[Block]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfBlocks")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[Block]] = list(Block.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfBlocks] = bijection(underlyingSchema, asBijection)
}
