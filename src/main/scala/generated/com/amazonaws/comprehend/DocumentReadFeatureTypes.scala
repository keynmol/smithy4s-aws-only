package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

/** <p>Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code>
  *       as the read action, you must specify one or both of the following values:</p>
  *          <ul>
  *             <li>
  *                <p>
  *                   <code>TABLES</code> - Returns additional information about any tables that are detected in the input document. </p>
  *             </li>
  *             <li>
  *                <p>
  *                   <code>FORMS</code> - Returns additional information about any forms that are detected in the input document. </p>
  *             </li>
  *          </ul>
  */
sealed abstract class DocumentReadFeatureTypes(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = DocumentReadFeatureTypes
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = DocumentReadFeatureTypes
  @inline final def widen: DocumentReadFeatureTypes = this
}
object DocumentReadFeatureTypes extends Enumeration[DocumentReadFeatureTypes] with ShapeTag.Companion[DocumentReadFeatureTypes] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "DocumentReadFeatureTypes")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code>\n      as the read action, you must specify one or both of the following values:</p>\n         <ul>\n            <li>\n               <p>\n                  <code>TABLES</code> - Returns additional information about any tables that are detected in the input document. </p>\n            </li>\n            <li>\n               <p>\n                  <code>FORMS</code> - Returns additional information about any forms that are detected in the input document. </p>\n            </li>\n         </ul>"),
    alloy.OpenEnum(),
  ).lazily

  case object TABLES extends DocumentReadFeatureTypes("TABLES", "TABLES", 0, Hints.empty)
  case object FORMS extends DocumentReadFeatureTypes("FORMS", "FORMS", 1, Hints.empty)
  final case class $Unknown(str: String) extends DocumentReadFeatureTypes(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => DocumentReadFeatureTypes = $Unknown(_)

  val values: List[DocumentReadFeatureTypes] = List(
    TABLES,
    FORMS,
  )
  val tag: EnumTag[DocumentReadFeatureTypes] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[DocumentReadFeatureTypes] = enumeration(tag, values).withId(id).addHints(hints)
}
