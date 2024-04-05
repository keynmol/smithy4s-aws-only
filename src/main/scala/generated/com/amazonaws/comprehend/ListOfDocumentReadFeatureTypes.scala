package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Newtype
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.schema.Schema.bijection
import smithy4s.schema.Schema.list

/** @param member
  *   <p>Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code>
  *         as the read action, you must specify one or both of the following values:</p>
  *            <ul>
  *               <li>
  *                  <p>
  *                     <code>TABLES</code> - Returns additional information about any tables that are detected in the input document. </p>
  *               </li>
  *               <li>
  *                  <p>
  *                     <code>FORMS</code> - Returns additional information about any forms that are detected in the input document. </p>
  *               </li>
  *            </ul>
  */
object ListOfDocumentReadFeatureTypes extends Newtype[List[DocumentReadFeatureTypes]] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ListOfDocumentReadFeatureTypes")
  val hints: Hints = Hints.empty
  val underlyingSchema: Schema[List[DocumentReadFeatureTypes]] = list(DocumentReadFeatureTypes.schema).withId(id).addHints(hints)
  implicit val schema: Schema[ListOfDocumentReadFeatureTypes] = bijection(underlyingSchema, asBijection)
}
