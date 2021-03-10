# HierarchyLevel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**aboveLevelId** | **Long** |  |  [optional]
**belowLevelId** | **Long** |  |  [optional]
**projectConfigurationId** | **Long** |  |  [optional]
**level** | **Integer** |  |  [optional]
**issueTypeIds** | **List&lt;Long&gt;** |  |  [optional]
**externalUuid** | [**UUID**](UUID.md) |  |  [optional]
**globalHierarchyLevel** | [**GlobalHierarchyLevelEnum**](#GlobalHierarchyLevelEnum) |  |  [optional]

<a name="GlobalHierarchyLevelEnum"></a>
## Enum: GlobalHierarchyLevelEnum
Name | Value
---- | -----
SUBTASK | &quot;SUBTASK&quot;
BASE | &quot;BASE&quot;
EPIC | &quot;EPIC&quot;
