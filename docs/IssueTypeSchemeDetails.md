# IssueTypeSchemeDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the issue type scheme. The name must be unique. The maximum length is 255 characters. | 
**description** | **String** | The description of the issue type scheme. The maximum length is 4000 characters. |  [optional]
**defaultIssueTypeId** | **String** | The ID of the default issue type of the issue type scheme. This ID must be included in &#x60;issueTypeIds&#x60;. |  [optional]
**issueTypeIds** | **List&lt;String&gt;** | The list of issue types IDs of the issue type scheme. At least one standard issue type ID is required. | 
