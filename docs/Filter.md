# Filter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **String** | The URL of the filter. |  [optional]
**id** | **String** | The unique identifier for the filter. |  [optional]
**name** | **String** | The name of the filter. Must be unique. | 
**description** | **String** | A description of the filter. |  [optional]
**owner** | **AllOfFilterOwner** | The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings. |  [optional]
**jql** | **String** | The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*. |  [optional]
**viewUrl** | **String** | A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*. |  [optional]
**searchUrl** | **String** | A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#x27;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*. |  [optional]
**favourite** | **Boolean** | Whether the filter is selected as a favorite. |  [optional]
**favouritedCount** | **Long** | The count of how many users have selected this filter as a favorite, including the filter owner. |  [optional]
**sharePermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The groups and projects that the filter is shared with. |  [optional]
**sharedUsers** | **AllOfFilterSharedUsers** | A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with. |  [optional]
**subscriptions** | **AllOfFilterSubscriptions** | A paginated list of the users that are subscribed to the filter. |  [optional]
