package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>The system identified one of the following warnings while processing the input document:</p>
  *            <ul>
  *               <li>
  *                  <p>The document to classify is plain text, but the classifier is a native model.</p>
  *               </li>
  *               <li>
  *                  <p>The document to classify is semi-structured, but the classifier is a plain-text model.</p>
  *               </li>
  *            </ul>
  */
object ListOfWarnings extends Newtype[List[WarningsListItem]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfWarnings")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[WarningsListItem]] = list(WarningsListItem.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfWarnings] = bijection(underlyingSchema, asBijection)
}
