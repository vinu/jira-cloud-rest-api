# IssuesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignIssue**](IssuesApi.md#assignIssue) | **PUT** /rest/api/3/issue/{issueIdOrKey}/assignee | Assign issue
[**createIssue**](IssuesApi.md#createIssue) | **POST** /rest/api/3/issue | Create issue
[**createIssues**](IssuesApi.md#createIssues) | **POST** /rest/api/3/issue/bulk | Bulk create issue
[**deleteIssue**](IssuesApi.md#deleteIssue) | **DELETE** /rest/api/3/issue/{issueIdOrKey} | Delete issue
[**doTransition**](IssuesApi.md#doTransition) | **POST** /rest/api/3/issue/{issueIdOrKey}/transitions | Transition issue
[**editIssue**](IssuesApi.md#editIssue) | **PUT** /rest/api/3/issue/{issueIdOrKey} | Edit issue
[**getChangeLogs**](IssuesApi.md#getChangeLogs) | **GET** /rest/api/3/issue/{issueIdOrKey}/changelog | Get change logs
[**getCreateIssueMeta**](IssuesApi.md#getCreateIssueMeta) | **GET** /rest/api/3/issue/createmeta | Get create issue metadata
[**getEditIssueMeta**](IssuesApi.md#getEditIssueMeta) | **GET** /rest/api/3/issue/{issueIdOrKey}/editmeta | Get edit issue metadata
[**getIssue**](IssuesApi.md#getIssue) | **GET** /rest/api/3/issue/{issueIdOrKey} | Get issue
[**getTransitions**](IssuesApi.md#getTransitions) | **GET** /rest/api/3/issue/{issueIdOrKey}/transitions | Get transitions
[**notify**](IssuesApi.md#notify) | **POST** /rest/api/3/issue/{issueIdOrKey}/notify | Send notification for issue

<a name="assignIssue"></a>
# **assignIssue**
> Object assignIssue(body, issueIdOrKey)

Assign issue

Assigns an issue to a user. Use this operation when the calling user does not have the *Edit Issues* permission but has the *Assign issue* permission for the project that the issue is in.  If &#x60;name&#x60; or &#x60;accountId&#x60; is set to:   *  &#x60;\&quot;-1\&quot;&#x60;, the issue is assigned to the default assignee for the project.  *  &#x60;null&#x60;, the issue is set to unassigned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse Projects* and *Assign Issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
User body = new User(); // User | The request object with the user that the issue is assigned to.
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue to be assigned.
try {
    Object result = apiInstance.assignIssue(body, issueIdOrKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#assignIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| The request object with the user that the issue is assigned to. |
 **issueIdOrKey** | **String**| The ID or key of the issue to be assigned. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIssue"></a>
# **createIssue**
> CreatedIssue createIssue(body, updateHistory)

Create issue

Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.  The content of the issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get). These are the same fields that appear on the issue&#x27;s create screen. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#x27;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get) to find subtask issue types).  *  &#x60;parent&#x60; must contain the ID or key of the parent issue.  In a next-gen project any issue may be made a child providing that the parent and child are members of the same project. In a classic project the parent field is only valid for subtasks.  **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue or subtask is created.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
Map<String, Object> body = new Map(); // Map<String, Object> | 
Boolean updateHistory = false; // Boolean | Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira.
try {
    CreatedIssue result = apiInstance.createIssue(body, updateHistory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#createIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  |
 **updateHistory** | **Boolean**| Whether the project in which the issue is created is added to the user&#x27;s **Recently viewed** project list, as shown under **Projects** in Jira. | [optional] [default to false]

### Return type

[**CreatedIssue**](CreatedIssue.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIssues"></a>
# **createIssues**
> CreatedIssues createIssues(body)

Bulk create issue

Creates issues and, where the option to create subtasks is enabled in Jira, subtasks. Transitions may be applied, to move the issues or subtasks to a workflow step other than the default start step, and issue properties set.  The content of each issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get). These are the same fields that appear on the issues&#x27; create screens. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#x27;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get) to find subtask issue types).  *  &#x60;parent&#x60; the must contain the ID or key of the parent issue.  **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which each issue or subtask is created.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    CreatedIssues result = apiInstance.createIssues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#createIssues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  |

### Return type

[**CreatedIssues**](CreatedIssues.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIssue"></a>
# **deleteIssue**
> deleteIssue(issueIdOrKey, deleteSubtasks)

Delete issue

Deletes an issue.  An issue cannot be deleted if it has one or more subtasks. To delete an issue with subtasks, set &#x60;deleteSubtasks&#x60;. This causes the issue&#x27;s subtasks to be deleted with the issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Delete issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue.
String deleteSubtasks = "false"; // String | Whether the issue's subtasks are deleted when the issue is deleted.
try {
    apiInstance.deleteIssue(issueIdOrKey, deleteSubtasks);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#deleteIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **String**| The ID or key of the issue. |
 **deleteSubtasks** | **String**| Whether the issue&#x27;s subtasks are deleted when the issue is deleted. | [optional] [default to false] [enum: true, false]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="doTransition"></a>
# **doTransition**
> Object doTransition(body, issueIdOrKey)

Transition issue

Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.  sortByCategory To update the fields on the transition screen, specify the fields in the &#x60;fields&#x60; or &#x60;update&#x60; parameters in the request body. Get details about the fields using [ Get transitions](#api-rest-api-3-issue-issueIdOrKey-transitions-get) with the &#x60;transitions.fields&#x60; expand.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Transition issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
Map<String, Object> body = new Map(); // Map<String, Object> | 
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue.
try {
    Object result = apiInstance.doTransition(body, issueIdOrKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#doTransition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  |
 **issueIdOrKey** | **String**| The ID or key of the issue. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editIssue"></a>
# **editIssue**
> Object editIssue(body, issueIdOrKey, notifyUsers, overrideScreenSecurity, overrideEditableFlag)

Edit issue

Edits an issue. A transition may be applied and issue properties updated as part of the edit.  The edits to the issue&#x27;s fields are defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be edited are determined using [ Get edit issue metadata](#api-rest-api-3-issue-issueIdOrKey-editmeta-get).  The parent field may be set by key or ID. For standard issue types, the parent may be removed by setting &#x60;update.parent.set.none&#x60; to *true*. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#x27;t handle Atlassian Document Format content.  Connect app users with admin permissions (from user permissions and app scopes) can override the screen security configuration using &#x60;overrideScreenSecurity&#x60; and &#x60;overrideEditableFlag&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
Map<String, Object> body = new Map(); // Map<String, Object> | 
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue.
Boolean notifyUsers = true; // Boolean | Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn't have the necessary permission the request is ignored.
Boolean overrideScreenSecurity = false; // Boolean | Whether screen security should be overridden to enable hidden fields to be edited. Available to Connect app users with admin permissions.
Boolean overrideEditableFlag = false; // Boolean | Whether screen security should be overridden to enable uneditable fields to be edited. Available to Connect app users with admin permissions.
try {
    Object result = apiInstance.editIssue(body, issueIdOrKey, notifyUsers, overrideScreenSecurity, overrideEditableFlag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#editIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  |
 **issueIdOrKey** | **String**| The ID or key of the issue. |
 **notifyUsers** | **Boolean**| Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn&#x27;t have the necessary permission the request is ignored. | [optional] [default to true]
 **overrideScreenSecurity** | **Boolean**| Whether screen security should be overridden to enable hidden fields to be edited. Available to Connect app users with admin permissions. | [optional] [default to false]
 **overrideEditableFlag** | **Boolean**| Whether screen security should be overridden to enable uneditable fields to be edited. Available to Connect app users with admin permissions. | [optional] [default to false]

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChangeLogs"></a>
# **getChangeLogs**
> PageBeanChangelog getChangeLogs(issueIdOrKey, startAt, maxResults)

Get change logs

Returns a [paginated](#pagination) list of all changelogs for an issue sorted by date, starting from the oldest.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue.
Integer startAt = 0; // Integer | The index of the first item to return in a page of results (page offset).
Integer maxResults = 100; // Integer | The maximum number of items to return per page.
try {
    PageBeanChangelog result = apiInstance.getChangeLogs(issueIdOrKey, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#getChangeLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **String**| The ID or key of the issue. |
 **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanChangelog**](PageBeanChangelog.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreateIssueMeta"></a>
# **getCreateIssueMeta**
> IssueCreateMetadata getCreateIssueMeta(projectIds, projectKeys, issuetypeIds, issuetypeNames, expand)

Get create issue metadata

Returns details of projects, issue types within projects, and, when requested, the create screen fields for each issue type for the user. Use the information to populate the requests in [ Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post).  The request can be restricted to specific projects or issue types using the query parameters. The response will contain information for the valid projects, issue types, or project and issue type combinations requested. Note that invalid project, issue type, or project and issue type combinations do not generate errors.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
List<String> projectIds = Arrays.asList("projectIds_example"); // List<String> | List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, `projectIds=10000,10001&projectIds=10020,10021`. This parameter may be provided with `projectKeys`.
List<String> projectKeys = Arrays.asList("projectKeys_example"); // List<String> | List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, `projectKeys=proj1,proj2&projectKeys=proj3`. This parameter may be provided with `projectIds`.
List<String> issuetypeIds = Arrays.asList("issuetypeIds_example"); // List<String> | List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, `issuetypeIds=10000,10001&issuetypeIds=10020,10021`. This parameter may be provided with `issuetypeNames`.
List<String> issuetypeNames = Arrays.asList("issuetypeNames_example"); // List<String> | List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, `issuetypeNames=name1,name2&issuetypeNames=name3`. This parameter may be provided with `issuetypeIds`.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts `projects.issuetypes.fields`, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the `fields` and `update` fields in [Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post).
try {
    IssueCreateMetadata result = apiInstance.getCreateIssueMeta(projectIds, projectKeys, issuetypeIds, issuetypeNames, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#getCreateIssueMeta");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIds** | [**List&lt;String&gt;**](String.md)| List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, &#x60;projectIds&#x3D;10000,10001&amp;projectIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;projectKeys&#x60;. | [optional]
 **projectKeys** | [**List&lt;String&gt;**](String.md)| List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, &#x60;projectKeys&#x3D;proj1,proj2&amp;projectKeys&#x3D;proj3&#x60;. This parameter may be provided with &#x60;projectIds&#x60;. | [optional]
 **issuetypeIds** | [**List&lt;String&gt;**](String.md)| List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, &#x60;issuetypeIds&#x3D;10000,10001&amp;issuetypeIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;issuetypeNames&#x60;. | [optional]
 **issuetypeNames** | [**List&lt;String&gt;**](String.md)| List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, &#x60;issuetypeNames&#x3D;name1,name2&amp;issuetypeNames&#x3D;name3&#x60;. This parameter may be provided with &#x60;issuetypeIds&#x60;. | [optional]
 **expand** | **String**| Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts &#x60;projects.issuetypes.fields&#x60;, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post). | [optional]

### Return type

[**IssueCreateMetadata**](IssueCreateMetadata.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEditIssueMeta"></a>
# **getEditIssueMeta**
> IssueUpdateMetadata getEditIssueMeta(issueIdOrKey, overrideScreenSecurity, overrideEditableFlag)

Get edit issue metadata

Returns the edit screen fields for an issue that are visible to and editable by the user. Use the information to populate the requests in [Edit issue](#api-rest-api-3-issue-issueIdOrKey-put).  Connect app users with admin permissions (from user permissions and app scopes) can return additional details using:   *  &#x60;overrideScreenSecurity&#x60; Returns hidden fields.  *  &#x60;overrideEditableFlag&#x60; Returns uneditable fields. For example, where an issue has a workflow status of closed none of its fields are editable.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  Note: For any fields to be editable the user must have the *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue.
Boolean overrideScreenSecurity = false; // Boolean | Whether hidden fields should be returned. Available to connect app users with admin permissions.
Boolean overrideEditableFlag = false; // Boolean | Whether non-editable fields should be returned. Available to connect app users with admin permissions.
try {
    IssueUpdateMetadata result = apiInstance.getEditIssueMeta(issueIdOrKey, overrideScreenSecurity, overrideEditableFlag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#getEditIssueMeta");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **String**| The ID or key of the issue. |
 **overrideScreenSecurity** | **Boolean**| Whether hidden fields should be returned. Available to connect app users with admin permissions. | [optional] [default to false]
 **overrideEditableFlag** | **Boolean**| Whether non-editable fields should be returned. Available to connect app users with admin permissions. | [optional] [default to false]

### Return type

[**IssueUpdateMetadata**](IssueUpdateMetadata.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIssue"></a>
# **getIssue**
> IssueBean getIssue(issueIdOrKey, fields, fieldsByKeys, expand, properties, updateHistory)

Get issue

Returns the details for an issue.  The issue is identified by its ID or key, however, if the identifier doesn&#x27;t match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is **not** returned. The issue key returned in the response is the key of the issue found.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  `summary,comment` Returns only the summary and comments fields.  *  `-description` Returns all (default) fields except description.  *  `*navigable,-comment` Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, `fields=field1,field2& fields=field3`.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-3-search-get) and [Search for issues using JQL (POST)](#api-rest-api-3-search-post) where the default is all navigable fields.
Boolean fieldsByKeys = false; // Boolean | Whether fields in `fields` are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Returns a JSON array for each version of a field's value, with the highest number representing the most recent version. Note: When included in the request, the `fields` parameter is ignored.
List<String> properties = Arrays.asList("properties_example"); // List<String> | A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  `*all` Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  `*all` Returns all properties.  *  `*all,-prop1` Returns all properties except `prop1`.  *  `prop1,prop2` Returns `prop1` and `prop2` properties.  This parameter may be specified multiple times. For example, `properties=prop1,prop2& properties=prop3`.
Boolean updateHistory = false; // Boolean | Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-3-search-get) `lastViewed` field.
try {
    IssueBean result = apiInstance.getIssue(issueIdOrKey, fields, fieldsByKeys, expand, properties, updateHistory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#getIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **String**| The ID or key of the issue. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all (default) fields except description.  *  &#x60;*navigable,-comment&#x60; Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp; fields&#x3D;field3&#x60;.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-3-search-get) and [Search for issues using JQL (POST)](#api-rest-api-3-search-post) where the default is all navigable fields. | [optional]
 **fieldsByKeys** | **Boolean**| Whether fields in &#x60;fields&#x60; are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field&#x27;s key may differ from its ID. | [optional] [default to false]
 **expand** | **String**| Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Returns a JSON array for each version of a field&#x27;s value, with the highest number representing the most recent version. Note: When included in the request, the &#x60;fields&#x60; parameter is ignored. | [optional]
 **properties** | [**List&lt;String&gt;**](String.md)| A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  &#x60;*all&#x60; Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  &#x60;*all&#x60; Returns all properties.  *  &#x60;*all,-prop1&#x60; Returns all properties except &#x60;prop1&#x60;.  *  &#x60;prop1,prop2&#x60; Returns &#x60;prop1&#x60; and &#x60;prop2&#x60; properties.  This parameter may be specified multiple times. For example, &#x60;properties&#x3D;prop1,prop2&amp; properties&#x3D;prop3&#x60;. | [optional]
 **updateHistory** | **Boolean**| Whether the project in which the issue is created is added to the user&#x27;s **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-3-search-get) &#x60;lastViewed&#x60; field. | [optional] [default to false]

### Return type

[**IssueBean**](IssueBean.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransitions"></a>
# **getTransitions**
> Transitions getTransitions(issueIdOrKey, expand, transitionId, skipRemoteOnlyCondition, includeUnavailableTransitions, sortByOpsBarAndStatus)

Get transitions

Returns either all transitions or a transition that can be performed by the user on an issue, based on the issue&#x27;s status.  Note, if a request is made for a transition that does not exist or cannot be performed on the issue, given its status, the response will return any empty transitions list.  This operation can be accessed anonymously.  **[Permissions](#permissions) required: A list or transition is returned only when the user has:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  However, if the user does not have the *Transition issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) the response will not list any transitions.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts `transitions.fields`, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the `fields` and `update` fields in [Transition issue](#api-rest-api-3-issue-issueIdOrKey-transitions-post).
String transitionId = "transitionId_example"; // String | The ID of the transition.
Boolean skipRemoteOnlyCondition = false; // Boolean | Whether transitions with the condition *Hide From User Condition* are included in the response.
Boolean includeUnavailableTransitions = false; // Boolean | Whether details of transitions that fail a condition are included in the response
Boolean sortByOpsBarAndStatus = false; // Boolean | Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value.
try {
    Transitions result = apiInstance.getTransitions(issueIdOrKey, expand, transitionId, skipRemoteOnlyCondition, includeUnavailableTransitions, sortByOpsBarAndStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#getTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **String**| The ID or key of the issue. |
 **expand** | **String**| Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts &#x60;transitions.fields&#x60;, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Transition issue](#api-rest-api-3-issue-issueIdOrKey-transitions-post). | [optional]
 **transitionId** | **String**| The ID of the transition. | [optional]
 **skipRemoteOnlyCondition** | **Boolean**| Whether transitions with the condition *Hide From User Condition* are included in the response. | [optional] [default to false]
 **includeUnavailableTransitions** | **Boolean**| Whether details of transitions that fail a condition are included in the response | [optional] [default to false]
 **sortByOpsBarAndStatus** | **Boolean**| Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value. | [optional] [default to false]

### Return type

[**Transitions**](Transitions.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notify"></a>
# **notify**
> Object notify(body, issueIdOrKey)

Send notification for issue

Creates an email notification for an issue and adds it to the mail queue.  **[Permissions](#permissions) required:**   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuesApi apiInstance = new IssuesApi();
Map<String, Object> body = new Map(); // Map<String, Object> | The request object for the notification and recipients.
String issueIdOrKey = "issueIdOrKey_example"; // String | ID or key of the issue that the notification is sent for.
try {
    Object result = apiInstance.notify(body, issueIdOrKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuesApi#notify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)| The request object for the notification and recipients. |
 **issueIdOrKey** | **String**| ID or key of the issue that the notification is sent for. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

