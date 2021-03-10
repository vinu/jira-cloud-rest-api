# Transition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the transition. | 
**name** | **String** | The name of the transition. | 
**description** | **String** | The description of the transition. | 
**from** | **List&lt;String&gt;** | The statuses the transition can start from. | 
**to** | **String** | The status the transition goes to. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the transition. | 
**screen** | [**ScreenID**](ScreenID.md) |  |  [optional]
**rules** | [**WorkflowRules**](WorkflowRules.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GLOBAL | &quot;global&quot;
INITIAL | &quot;initial&quot;
DIRECTED | &quot;directed&quot;
