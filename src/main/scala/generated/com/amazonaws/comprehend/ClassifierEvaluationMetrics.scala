package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.double
import smithy4s.schema.Schema.struct

/** <p>Describes the result metrics for the test data associated with an documentation
  *       classifier.</p>
  * @param MicroRecall
  *   <p>A measure of how complete the classifier results are for the test data. High recall means
  *         that the classifier returned most of the relevant results. Specifically, this indicates how
  *         many of the correct categories in the text that the model can predict. It is a percentage of
  *         correct categories in the text that can found. Instead of averaging the recall scores of all
  *         labels (as with Recall), micro Recall is based on the overall score of all recall scores added
  *         together.</p>
  * @param HammingLoss
  *   <p>Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction
  *         of wrong labels compared to the total number of labels. Scores closer to zero are
  *         better.</p>
  * @param Recall
  *   <p>A measure of how complete the classifier results are for the test data. High recall means
  *         that the classifier returned most of the relevant results. </p>
  * @param Precision
  *   <p>A measure of the usefulness of the classifier results in the test data. High precision
  *         means that the classifier returned substantially more relevant results than irrelevant
  *         ones.</p>
  * @param Accuracy
  *   <p>The fraction of the labels that were correct recognized. It is computed by dividing the
  *         number of labels in the test documents that were correctly recognized by the total number of
  *         labels in the test documents.</p>
  * @param MicroF1Score
  *   <p>A measure of how accurate the classifier results are for the test data. It is a
  *         combination of the <code>Micro Precision</code> and <code>Micro Recall</code> values. The
  *           <code>Micro F1Score</code> is the harmonic mean of the two scores. The highest score is 1,
  *         and the worst score is 0.</p>
  * @param MicroPrecision
  *   <p>A measure of the usefulness of the recognizer results in the test data. High precision
  *         means that the recognizer returned substantially more relevant results than irrelevant ones.
  *         Unlike the Precision metric which comes from averaging the precision of all available labels,
  *         this is based on the overall score of all precision scores added together.</p>
  * @param F1Score
  *   <p>A measure of how accurate the classifier results are for the test data. It is derived from
  *         the <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the
  *         harmonic average of the two scores. The highest score is 1, and the worst score is 0. </p>
  */
final case class ClassifierEvaluationMetrics(accuracy: Option[Double] = None, precision: Option[Double] = None, recall: Option[Double] = None, f1Score: Option[Double] = None, microPrecision: Option[Double] = None, microRecall: Option[Double] = None, microF1Score: Option[Double] = None, hammingLoss: Option[Double] = None)

object ClassifierEvaluationMetrics extends ShapeTag.Companion[ClassifierEvaluationMetrics] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "ClassifierEvaluationMetrics")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p>Describes the result metrics for the test data associated with an documentation\n      classifier.</p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(accuracy: Option[Double], precision: Option[Double], recall: Option[Double], f1Score: Option[Double], microPrecision: Option[Double], microRecall: Option[Double], microF1Score: Option[Double], hammingLoss: Option[Double]): ClassifierEvaluationMetrics = ClassifierEvaluationMetrics(accuracy, precision, recall, f1Score, microPrecision, microRecall, microF1Score, hammingLoss)

  implicit val schema: Schema[ClassifierEvaluationMetrics] = struct(
    double.optional[ClassifierEvaluationMetrics]("Accuracy", _.accuracy).addHints(smithy.api.Documentation("<p>The fraction of the labels that were correct recognized. It is computed by dividing the\n      number of labels in the test documents that were correctly recognized by the total number of\n      labels in the test documents.</p>")),
    double.optional[ClassifierEvaluationMetrics]("Precision", _.precision).addHints(smithy.api.Documentation("<p>A measure of the usefulness of the classifier results in the test data. High precision\n      means that the classifier returned substantially more relevant results than irrelevant\n      ones.</p>")),
    double.optional[ClassifierEvaluationMetrics]("Recall", _.recall).addHints(smithy.api.Documentation("<p>A measure of how complete the classifier results are for the test data. High recall means\n      that the classifier returned most of the relevant results. </p>")),
    double.optional[ClassifierEvaluationMetrics]("F1Score", _.f1Score).addHints(smithy.api.Documentation("<p>A measure of how accurate the classifier results are for the test data. It is derived from\n      the <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the\n      harmonic average of the two scores. The highest score is 1, and the worst score is 0. </p>")),
    double.optional[ClassifierEvaluationMetrics]("MicroPrecision", _.microPrecision).addHints(smithy.api.Documentation("<p>A measure of the usefulness of the recognizer results in the test data. High precision\n      means that the recognizer returned substantially more relevant results than irrelevant ones.\n      Unlike the Precision metric which comes from averaging the precision of all available labels,\n      this is based on the overall score of all precision scores added together.</p>")),
    double.optional[ClassifierEvaluationMetrics]("MicroRecall", _.microRecall).addHints(smithy.api.Documentation("<p>A measure of how complete the classifier results are for the test data. High recall means\n      that the classifier returned most of the relevant results. Specifically, this indicates how\n      many of the correct categories in the text that the model can predict. It is a percentage of\n      correct categories in the text that can found. Instead of averaging the recall scores of all\n      labels (as with Recall), micro Recall is based on the overall score of all recall scores added\n      together.</p>")),
    double.optional[ClassifierEvaluationMetrics]("MicroF1Score", _.microF1Score).addHints(smithy.api.Documentation("<p>A measure of how accurate the classifier results are for the test data. It is a\n      combination of the <code>Micro Precision</code> and <code>Micro Recall</code> values. The\n        <code>Micro F1Score</code> is the harmonic mean of the two scores. The highest score is 1,\n      and the worst score is 0.</p>")),
    double.optional[ClassifierEvaluationMetrics]("HammingLoss", _.hammingLoss).addHints(smithy.api.Documentation("<p>Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction\n      of wrong labels compared to the total number of labels. Scores closer to zero are\n      better.</p>")),
  )(make).withId(id).addHints(hints)
}
