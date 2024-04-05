package com.amazonaws

package object comprehend {
  type Comprehend[F[_]] = smithy4s.kinds.FunctorAlgebra[ComprehendGen, F]
  val Comprehend = ComprehendGen

  type TagKey = com.amazonaws.comprehend.TagKey.Type
  /** @param member
    *   <p>Analysis results for one of the documents in the batch.</p>
    */
  type ListOfDetectTargetedSentimentResult = com.amazonaws.comprehend.ListOfDetectTargetedSentimentResult.Type
  /** @param member
    *   <p>Properties associated with the dataset.</p>
    */
  type DatasetPropertiesList = com.amazonaws.comprehend.DatasetPropertiesList.Type
  /** @param member
    *   <p>An augmented manifest file that provides training data for your custom model.
    *         An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
    */
  type DatasetAugmentedManifestsList = com.amazonaws.comprehend.DatasetAugmentedManifestsList.Type
  /** @param member
    *   <p>The X and Y coordinates of a point on a document page.</p>
    *            <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Point.html">Point</a> in the Amazon Textract API reference.</p>
    */
  type Polygon = com.amazonaws.comprehend.Polygon.Type
  type EntityRecognizerEndpointArn = com.amazonaws.comprehend.EntityRecognizerEndpointArn.Type
  /** @param member
    *   <p>Returns the code for the dominant language in the input text and the level of
    *         confidence that Amazon Comprehend has in the accuracy of the detection.</p>
    */
  type ListOfDominantLanguages = com.amazonaws.comprehend.ListOfDominantLanguages.Type
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
  type ListOfDocumentReadFeatureTypes = com.amazonaws.comprehend.ListOfDocumentReadFeatureTypes.Type
  type Policy = com.amazonaws.comprehend.Policy.Type
  /** @param member
    *   <p>Specifies information about the specified endpoint.
    *         For information about endpoints, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.</p>
    */
  type EndpointPropertiesList = com.amazonaws.comprehend.EndpointPropertiesList.Type
  /** @param member
    *   <p>The result of calling the  operation.
    *         The operation returns one object for each document that is successfully processed by the
    *         operation.</p>
    */
  type ListOfDetectDominantLanguageResult = com.amazonaws.comprehend.ListOfDetectDominantLanguageResult.Type
  /** @param member
    *   <p>Nested block contained within a block.</p>
    */
  type ListOfChildBlocks = com.amazonaws.comprehend.ListOfChildBlocks.Type
  type ComprehendDatasetArn = com.amazonaws.comprehend.ComprehendDatasetArn.Type
  type VersionName = com.amazonaws.comprehend.VersionName.Type
  type SemiStructuredDocumentBlob = com.amazonaws.comprehend.SemiStructuredDocumentBlob.Type
  /** @param member
    *   <p>Document type for each page in the document.</p>
    */
  type ListOfDocumentType = com.amazonaws.comprehend.ListOfDocumentType.Type
  type Subnets = com.amazonaws.comprehend.Subnets.Type
  /** @param member
    *   <p>Provides information about an events detection job.</p>
    */
  type EventsDetectionJobPropertiesList = com.amazonaws.comprehend.EventsDetectionJobPropertiesList.Type
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
  type ListOfWarnings = com.amazonaws.comprehend.ListOfWarnings.Type
  type S3Uri = com.amazonaws.comprehend.S3Uri.Type
  /** @param member
    *   <p>Provides information about a PII entities detection job.</p>
    */
  type PiiEntitiesDetectionJobPropertiesList = com.amazonaws.comprehend.PiiEntitiesDetectionJobPropertiesList.Type
  type FlywheelS3Uri = com.amazonaws.comprehend.FlywheelS3Uri.Type
  type InferenceUnitsInteger = com.amazonaws.comprehend.InferenceUnitsInteger.Type
  /** @param member
    *   <p>An augmented manifest file that provides training data for your custom model. An augmented
    *         manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
    */
  type DocumentClassifierAugmentedManifestsList = com.amazonaws.comprehend.DocumentClassifierAugmentedManifestsList.Type
  type ClientRequestTokenString = com.amazonaws.comprehend.ClientRequestTokenString.Type
  type AttributeNamesList = com.amazonaws.comprehend.AttributeNamesList.Type
  type KmsKeyId = com.amazonaws.comprehend.KmsKeyId.Type
  /** @param member
    *   <p>Provides information about a document classification job.</p>
    */
  type DocumentClassificationJobPropertiesList = com.amazonaws.comprehend.DocumentClassificationJobPropertiesList.Type
  type JobId = com.amazonaws.comprehend.JobId.Type
  /** @param member
    *   <p>Describes an error that occurred while processing a document in a batch. The operation
    *         returns on <code>BatchItemError</code> object for each document that contained an
    *         error.</p>
    */
  type BatchItemErrorList = com.amazonaws.comprehend.BatchItemErrorList.Type
  /** @param member
    *   <p>Provides information about a targeted sentiment detection job.</p>
    */
  type TargetedSentimentDetectionJobPropertiesList = com.amazonaws.comprehend.TargetedSentimentDetectionJobPropertiesList.Type
  /** @param member
    *   <p>A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For
    *         example, a tag with the key-value pair ‘Department’:’Sales’ might be added to a resource to
    *         indicate its use by a particular department. </p>
    */
  type TagList = com.amazonaws.comprehend.TagList.Type
  type SecurityGroupId = com.amazonaws.comprehend.SecurityGroupId.Type
  type ComprehendEndpointArn = com.amazonaws.comprehend.ComprehendEndpointArn.Type
  type EntityTypeName = com.amazonaws.comprehend.EntityTypeName.Type
  type LabelDelimiter = com.amazonaws.comprehend.LabelDelimiter.Type
  /** @param member
    *   <p>Provides information about a sentiment detection job.</p>
    */
  type SentimentDetectionJobPropertiesList = com.amazonaws.comprehend.SentimentDetectionJobPropertiesList.Type
  /** @param member
    *   <p>An entity type within a labeled training dataset that Amazon Comprehend uses to train a
    *         custom entity recognizer.</p>
    */
  type EntityTypesList = com.amazonaws.comprehend.EntityTypesList.Type
  type DocumentClassifierEndpointArn = com.amazonaws.comprehend.DocumentClassifierEndpointArn.Type
  type TagValue = com.amazonaws.comprehend.TagValue.Type
  /** @param member
    *   <p>Represents a work in the input text that was recognized and assigned a part of speech.
    *         There is one syntax token record for each word in the source text.</p>
    */
  type ListOfSyntaxTokens = com.amazonaws.comprehend.ListOfSyntaxTokens.Type
  /** @param member
    *   <p>Array of the number of characters extracted from each page.</p>
    */
  type ListOfExtractedCharacters = com.amazonaws.comprehend.ListOfExtractedCharacters.Type
  /** @param member
    *   <p>Describes information about a document classifier and its versions.</p>
    */
  type DocumentClassifierSummariesList = com.amazonaws.comprehend.DocumentClassifierSummariesList.Type
  type ComprehendModelArn = com.amazonaws.comprehend.ComprehendModelArn.Type
  /** @param member
    *   <p>An augmented manifest file that provides training data for your custom model. An augmented
    *         manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
    */
  type EntityRecognizerAugmentedManifestsList = com.amazonaws.comprehend.EntityRecognizerAugmentedManifestsList.Type
  /** @param member
    *   <p>Provides information about a key phrases detection job.</p>
    */
  type KeyPhrasesDetectionJobPropertiesList = com.amazonaws.comprehend.KeyPhrasesDetectionJobPropertiesList.Type
  /** @param member
    *   <p>List of child blocks for the current block.</p>
    */
  type ListOfRelationships = com.amazonaws.comprehend.ListOfRelationships.Type
  /** @param member
    *   <p> Describes the information about an entity recognizer and its versions.</p>
    */
  type EntityRecognizerSummariesList = com.amazonaws.comprehend.EntityRecognizerSummariesList.Type
  /** @param member
    *   <p>Information about one mention of an entity. The mention information includes the location of the mention
    *         in the text and the sentiment of the mention.</p>
    *            <p>For more information about targeted sentiment, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.</p>
    */
  type ListOfMentions = com.amazonaws.comprehend.ListOfMentions.Type
  type FlywheelIterationId = com.amazonaws.comprehend.FlywheelIterationId.Type
  type NumberOfDocuments = com.amazonaws.comprehend.NumberOfDocuments.Type
  /** @param member
    *   <p>The configuration properties of a flywheel iteration.</p>
    */
  type FlywheelIterationPropertiesList = com.amazonaws.comprehend.FlywheelIterationPropertiesList.Type
  /** @param member
    *   <p>Specifies the class that categorizes the document being analyzed</p>
    */
  type ListOfClasses = com.amazonaws.comprehend.ListOfClasses.Type
  type ComprehendEndpointName = com.amazonaws.comprehend.ComprehendEndpointName.Type
  /** @param member
    *   <p>The result of calling the  operation. The
    *         operation returns one object for each document that is successfully processed by the
    *         operation.</p>
    */
  type ListOfDetectKeyPhrasesResult = com.amazonaws.comprehend.ListOfDetectKeyPhrasesResult.Type
  /** @param member
    *   <p>Flywheel summary information.</p>
    */
  type FlywheelSummaryList = com.amazonaws.comprehend.FlywheelSummaryList.Type
  /** @param member
    *   <p>Individual item from the list of entity types in the metadata of an entity
    *         recognizer.</p>
    */
  type EntityRecognizerMetadataEntityTypesList = com.amazonaws.comprehend.EntityRecognizerMetadataEntityTypesList.Type
  /** @param member
    *   <p>Provides information about a document classifier.</p>
    */
  type DocumentClassifierPropertiesList = com.amazonaws.comprehend.DocumentClassifierPropertiesList.Type
  type SubnetId = com.amazonaws.comprehend.SubnetId.Type
  type EntityRecognizerArn = com.amazonaws.comprehend.EntityRecognizerArn.Type
  type TargetEventTypes = com.amazonaws.comprehend.TargetEventTypes.Type
  type LabelsList = com.amazonaws.comprehend.LabelsList.Type
  /** @param member
    *   <p>Describes information about an entity recognizer.</p>
    */
  type EntityRecognizerPropertiesList = com.amazonaws.comprehend.EntityRecognizerPropertiesList.Type
  /** @param member
    *   <p>The result of calling the  operation. The
    *         operation returns one object that is successfully processed by the operation.</p>
    */
  type ListOfDetectSyntaxResult = com.amazonaws.comprehend.ListOfDetectSyntaxResult.Type
  type AttributeNamesListItem = com.amazonaws.comprehend.AttributeNamesListItem.Type
  type JobName = com.amazonaws.comprehend.JobName.Type
  type ListOfDescriptiveMentionIndices = com.amazonaws.comprehend.ListOfDescriptiveMentionIndices.Type
  /** @param member
    *   <p>Specifies one of the label or labels that categorize the personally identifiable
    *         information (PII) entity being analyzed.</p>
    */
  type ListOfEntityLabels = com.amazonaws.comprehend.ListOfEntityLabels.Type
  /** @param member
    *   <p>The result of calling the  operation. The
    *         operation returns one object for each document that is successfully processed by the
    *         operation.</p>
    */
  type ListOfDetectEntitiesResult = com.amazonaws.comprehend.ListOfDetectEntitiesResult.Type
  type ComprehendFlywheelArn = com.amazonaws.comprehend.ComprehendFlywheelArn.Type
  type IamRoleArn = com.amazonaws.comprehend.IamRoleArn.Type
  type EventTypeString = com.amazonaws.comprehend.EventTypeString.Type
  type TagKeyList = com.amazonaws.comprehend.TagKeyList.Type
  type ComprehendArn = com.amazonaws.comprehend.ComprehendArn.Type
  type NumberOfTopicsInteger = com.amazonaws.comprehend.NumberOfTopicsInteger.Type
  /** @param member
    *   <p>Text extraction encountered one or more page-level errors in the input document.</p>
    *            <p>The <code>ErrorCode</code> contains one of the following values:</p>
    *            <ul>
    *               <li>
    *                  <p>TEXTRACT_BAD_PAGE - Amazon Textract cannot read the page. For more information
    *             about page limits in Amazon Textract, see <a href="https://docs.aws.amazon.com/textract/latest/dg/limits-document.html">
    *               Page Quotas in Amazon Textract</a>.</p>
    *               </li>
    *               <li>
    *                  <p>TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED - The number of requests exceeded your throughput limit.
    *             For more information about throughput quotas in Amazon Textract, see <a href="https://docs.aws.amazon.com/textract/latest/dg/limits-quotas-explained.html">
    *               Default quotas in Amazon Textract</a>.</p>
    *               </li>
    *               <li>
    *                  <p>PAGE_CHARACTERS_EXCEEDED - Too many text characters on the page (10,000 characters maximum).</p>
    *               </li>
    *               <li>
    *                  <p>PAGE_SIZE_EXCEEDED - The maximum page size is 10 MB.</p>
    *               </li>
    *               <li>
    *                  <p>INTERNAL_SERVER_ERROR - The request encountered a service issue. Try the API request again.</p>
    *               </li>
    *            </ul>
    */
  type ListOfErrors = com.amazonaws.comprehend.ListOfErrors.Type
  type CustomerInputString = com.amazonaws.comprehend.CustomerInputString.Type
  type StringList = com.amazonaws.comprehend.StringList.Type
  /** @param member
    *   <p>Describes a key noun phrase.</p>
    */
  type ListOfKeyPhrases = com.amazonaws.comprehend.ListOfKeyPhrases.Type
  /** @param member
    *   <p>Provides information about a PII entity.</p>
    */
  type ListOfPiiEntities = com.amazonaws.comprehend.ListOfPiiEntities.Type
  type MaskCharacter = com.amazonaws.comprehend.MaskCharacter.Type
  /** @param member
    *   <p>Provides information about an entities detection job.</p>
    */
  type EntitiesDetectionJobPropertiesList = com.amazonaws.comprehend.EntitiesDetectionJobPropertiesList.Type
  type AnyLengthString = com.amazonaws.comprehend.AnyLengthString.Type
  type SecurityGroupIds = com.amazonaws.comprehend.SecurityGroupIds.Type
  /** @param member
    *   <p>Information about each word or line of text in the input document.</p>
    *            <p>For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Block.html">Block</a> in the Amazon Textract API reference.</p>
    */
  type ListOfBlocks = com.amazonaws.comprehend.ListOfBlocks.Type
  /** @param member
    *   <p>Provides information about an entity. </p>
    *            <p> </p>
    */
  type ListOfEntities = com.amazonaws.comprehend.ListOfEntities.Type
  /** @param member
    *   <p>Provides information about a topic detection job.</p>
    */
  type TopicsDetectionJobPropertiesList = com.amazonaws.comprehend.TopicsDetectionJobPropertiesList.Type
  type PolicyRevisionId = com.amazonaws.comprehend.PolicyRevisionId.Type
  /** @param member
    *   <p>The result of calling the  operation. The
    *         operation returns one object for each document that is successfully processed by the
    *         operation.</p>
    */
  type ListOfDetectSentimentResult = com.amazonaws.comprehend.ListOfDetectSentimentResult.Type
  type MaxResultsInteger = com.amazonaws.comprehend.MaxResultsInteger.Type
  type DocumentClassifierArn = com.amazonaws.comprehend.DocumentClassifierArn.Type
  type ComprehendArnName = com.amazonaws.comprehend.ComprehendArnName.Type
  /** @param member
    *   <p>A reference to a block. </p>
    */
  type ListOfBlockReferences = com.amazonaws.comprehend.ListOfBlockReferences.Type
  type LabelListItem = com.amazonaws.comprehend.LabelListItem.Type
  type CustomerInputStringList = com.amazonaws.comprehend.CustomerInputStringList.Type
  type Description = com.amazonaws.comprehend.Description.Type
  /** @param member
    *   <p>Provides information about a dominant language detection job.</p>
    */
  type DominantLanguageDetectionJobPropertiesList = com.amazonaws.comprehend.DominantLanguageDetectionJobPropertiesList.Type
  /** @param member
    *   <p>Specifies one of the label or labels that categorize the document being analyzed.</p>
    */
  type ListOfLabels = com.amazonaws.comprehend.ListOfLabels.Type
  type ListOfPiiEntityTypes = com.amazonaws.comprehend.ListOfPiiEntityTypes.Type
  /** @param member
    *   <p>Information about one of the entities found by targeted sentiment analysis.</p>
    *            <p>For more information about targeted sentiment, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.</p>
    */
  type ListOfTargetedSentimentEntities = com.amazonaws.comprehend.ListOfTargetedSentimentEntities.Type

}