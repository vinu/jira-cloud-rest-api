# IssueTypeCreateBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The unique name for the issue type. The maximum length is 60 characters. | 
**description** | **String** | The description of the issue type. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Whether the issue type is &#x60;subtype&#x60; or &#x60;standard&#x60;. Defaults to &#x60;standard&#x60;. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SUBTASK | &quot;subtask&quot;
STANDARD | &quot;standard&quot;
