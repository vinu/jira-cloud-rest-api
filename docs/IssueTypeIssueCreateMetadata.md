# IssueTypeIssueCreateMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **String** | The URL of these issue type details. |  [optional]
**id** | **String** | The ID of the issue type. |  [optional]
**description** | **String** | The description of the issue type. |  [optional]
**iconUrl** | **String** | The URL of the issue type&#x27;s avatar. |  [optional]
**name** | **String** | The name of the issue type. |  [optional]
**subtask** | **Boolean** | Whether this issue type is used to create subtasks. |  [optional]
**avatarId** | **Long** | The ID of the issue type&#x27;s avatar. |  [optional]
**entityId** | [**UUID**](UUID.md) | Unique ID for next-gen projects. |  [optional]
**hierarchyLevel** | **Integer** | Hierarchy level of the issue type. |  [optional]
**scope** | **AllOfIssueTypeIssueCreateMetadataScope** | Details of the next-gen projects the issue type is available in. |  [optional]
**expand** | **String** | Expand options that include additional issue type metadata details in the response. |  [optional]
**fields** | [**Map&lt;String, FieldMetadata&gt;**](FieldMetadata.md) | List of the fields available when creating an issue for the issue type. |  [optional]
