# IssueBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **String** | Expand options that include additional issue details in the response. |  [optional]
**id** | **String** | The ID of the issue. |  [optional]
**self** | **String** | The URL of the issue details. |  [optional]
**key** | **String** | The key of the issue. |  [optional]
**renderedFields** | **Map&lt;String, Object&gt;** | The rendered value of each field present on the issue. |  [optional]
**properties** | **Map&lt;String, Object&gt;** | Details of the issue properties identified in the request. |  [optional]
**names** | **Map&lt;String, String&gt;** | The ID and name of each field present on the issue. |  [optional]
**schema** | [**Map&lt;String, JsonTypeBean&gt;**](JsonTypeBean.md) | The schema describing each field present on the issue. |  [optional]
**transitions** | [**List&lt;IssueTransition&gt;**](IssueTransition.md) | The transitions that can be performed on the issue. |  [optional]
**operations** | **AllOfIssueBeanOperations** | The operations that can be performed on the issue. |  [optional]
**editmeta** | **AllOfIssueBeanEditmeta** | The metadata for the fields on the issue that can be amended. |  [optional]
**changelog** | **AllOfIssueBeanChangelog** | Details of changelogs associated with the issue. |  [optional]
**versionedRepresentations** | [**Map&lt;String, Map&lt;String, Object&gt;&gt;**](Map.md) | The versions of each field on the issue. |  [optional]
**fieldsToInclude** | [**IncludedFields**](IncludedFields.md) |  |  [optional]
**fields** | **Map&lt;String, Object&gt;** |  |  [optional]
