# JiraExpressionAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** | The analysed expression. | 
**errors** | [**List&lt;JiraExpressionValidationError&gt;**](JiraExpressionValidationError.md) | A list of validation errors. Not included if the expression is valid. |  [optional]
**valid** | **Boolean** | Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations). | 
**type** | **String** | EXPERIMENTAL. The inferred type of the expression. |  [optional]
**complexity** | [**JiraExpressionComplexity**](JiraExpressionComplexity.md) |  |  [optional]
