# TaskProgressBeanRemoveOptionFromIssuesResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **String** | The URL of the task. | 
**id** | **String** | The ID of the task. | 
**description** | **String** | The description of the task. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the task. | 
**message** | **String** | Information about the progress of the task. |  [optional]
**result** | **AllOfTaskProgressBeanRemoveOptionFromIssuesResultResult** | The result of the task execution. |  [optional]
**submittedBy** | **Long** | The ID of the user who submitted the task. | 
**progress** | **Long** | The progress of the task, as a percentage complete. | 
**elapsedRuntime** | **Long** | The execution time of the task, in milliseconds. | 
**submitted** | **Long** | A timestamp recording when the task was submitted. | 
**started** | **Long** | A timestamp recording when the task was started. |  [optional]
**finished** | **Long** | A timestamp recording when the task was finished. |  [optional]
**lastUpdate** | **Long** | A timestamp recording when the task progress was last updated. | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ENQUEUED | &quot;ENQUEUED&quot;
RUNNING | &quot;RUNNING&quot;
COMPLETE | &quot;COMPLETE&quot;
FAILED | &quot;FAILED&quot;
CANCEL_REQUESTED | &quot;CANCEL_REQUESTED&quot;
CANCELLED | &quot;CANCELLED&quot;
DEAD | &quot;DEAD&quot;
