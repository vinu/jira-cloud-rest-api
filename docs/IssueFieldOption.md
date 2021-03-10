# IssueFieldOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The unique identifier for the option. This is only unique within the select field&#x27;s set of options. | 
**value** | **String** | The option&#x27;s name, which is displayed in Jira. | 
**properties** | **Map&lt;String, Object&gt;** | The properties of the object, as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see [Issue Field Option Property Index](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/)) are defined in the descriptor for the issue field module. |  [optional]
**config** | [**IssueFieldOptionConfiguration**](IssueFieldOptionConfiguration.md) |  |  [optional]
