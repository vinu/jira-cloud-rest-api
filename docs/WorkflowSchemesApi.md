# WorkflowSchemesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflowScheme**](WorkflowSchemesApi.md#createWorkflowScheme) | **POST** /rest/api/3/workflowscheme | Create workflow scheme
[**deleteDefaultWorkflow**](WorkflowSchemesApi.md#deleteDefaultWorkflow) | **DELETE** /rest/api/3/workflowscheme/{id}/default | Delete default workflow
[**deleteWorkflowMapping**](WorkflowSchemesApi.md#deleteWorkflowMapping) | **DELETE** /rest/api/3/workflowscheme/{id}/workflow | Delete issue types for workflow in workflow scheme
[**deleteWorkflowScheme**](WorkflowSchemesApi.md#deleteWorkflowScheme) | **DELETE** /rest/api/3/workflowscheme/{id} | Delete workflow scheme
[**deleteWorkflowSchemeIssueType**](WorkflowSchemesApi.md#deleteWorkflowSchemeIssueType) | **DELETE** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Delete workflow for issue type in workflow scheme
[**getAllWorkflowSchemes**](WorkflowSchemesApi.md#getAllWorkflowSchemes) | **GET** /rest/api/3/workflowscheme | Get all workflow schemes
[**getDefaultWorkflow**](WorkflowSchemesApi.md#getDefaultWorkflow) | **GET** /rest/api/3/workflowscheme/{id}/default | Get default workflow
[**getWorkflow**](WorkflowSchemesApi.md#getWorkflow) | **GET** /rest/api/3/workflowscheme/{id}/workflow | Get issue types for workflows in workflow scheme
[**getWorkflowScheme**](WorkflowSchemesApi.md#getWorkflowScheme) | **GET** /rest/api/3/workflowscheme/{id} | Get workflow scheme
[**getWorkflowSchemeIssueType**](WorkflowSchemesApi.md#getWorkflowSchemeIssueType) | **GET** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Get workflow for issue type in workflow scheme
[**setWorkflowSchemeIssueType**](WorkflowSchemesApi.md#setWorkflowSchemeIssueType) | **PUT** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Set workflow for issue type in workflow scheme
[**updateDefaultWorkflow**](WorkflowSchemesApi.md#updateDefaultWorkflow) | **PUT** /rest/api/3/workflowscheme/{id}/default | Update default workflow
[**updateWorkflowMapping**](WorkflowSchemesApi.md#updateWorkflowMapping) | **PUT** /rest/api/3/workflowscheme/{id}/workflow | Set issue types for workflow in workflow scheme
[**updateWorkflowScheme**](WorkflowSchemesApi.md#updateWorkflowScheme) | **PUT** /rest/api/3/workflowscheme/{id} | Update workflow scheme

<a name="createWorkflowScheme"></a>
# **createWorkflowScheme**
> WorkflowScheme createWorkflowScheme(body)

Create workflow scheme

Creates a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
WorkflowScheme body = new WorkflowScheme(); // WorkflowScheme | 
try {
    WorkflowScheme result = apiInstance.createWorkflowScheme(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#createWorkflowScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkflowScheme**](WorkflowScheme.md)|  |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDefaultWorkflow"></a>
# **deleteDefaultWorkflow**
> WorkflowScheme deleteDefaultWorkflow(id, updateDraftIfNeeded)

Delete default workflow

Resets the default workflow for a workflow scheme. That is, the default workflow is set to Jira&#x27;s system workflow (the *jira* workflow).  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the default workflow reset. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme.
Boolean updateDraftIfNeeded = true; // Boolean | Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.
try {
    WorkflowScheme result = apiInstance.deleteDefaultWorkflow(id, updateDraftIfNeeded);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#deleteDefaultWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. |
 **updateDraftIfNeeded** | **Boolean**| Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional]

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorkflowMapping"></a>
# **deleteWorkflowMapping**
> deleteWorkflowMapping(id, workflowName, updateDraftIfNeeded)

Delete issue types for workflow in workflow scheme

Deletes the workflow-issue type mapping for a workflow in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the workflow-issue type mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme.
String workflowName = "workflowName_example"; // String | The name of the workflow.
Boolean updateDraftIfNeeded = true; // Boolean | Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.
try {
    apiInstance.deleteWorkflowMapping(id, workflowName, updateDraftIfNeeded);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#deleteWorkflowMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. |
 **workflowName** | **String**| The name of the workflow. |
 **updateDraftIfNeeded** | **Boolean**| Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteWorkflowScheme"></a>
# **deleteWorkflowScheme**
> deleteWorkflowScheme(id)

Delete workflow scheme

Deletes a workflow scheme. Note that a workflow scheme cannot be deleted if it is active (that is, being used by at least one project).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
try {
    apiInstance.deleteWorkflowScheme(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#deleteWorkflowScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteWorkflowSchemeIssueType"></a>
# **deleteWorkflowSchemeIssueType**
> WorkflowScheme deleteWorkflowSchemeIssueType(id, issueType, updateDraftIfNeeded)

Delete workflow for issue type in workflow scheme

Deletes the issue type-workflow mapping for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the issue type-workflow mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme.
String issueType = "issueType_example"; // String | The ID of the issue type.
Boolean updateDraftIfNeeded = true; // Boolean | Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`.
try {
    WorkflowScheme result = apiInstance.deleteWorkflowSchemeIssueType(id, issueType, updateDraftIfNeeded);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#deleteWorkflowSchemeIssueType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. |
 **issueType** | **String**| The ID of the issue type. |
 **updateDraftIfNeeded** | **Boolean**| Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional]

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllWorkflowSchemes"></a>
# **getAllWorkflowSchemes**
> PageBeanWorkflowScheme getAllWorkflowSchemes(startAt, maxResults)

Get all workflow schemes

Returns a [paginated](#pagination) list of all workflow schemes, not including draft workflow schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanWorkflowScheme result = apiInstance.getAllWorkflowSchemes(startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#getAllWorkflowSchemes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanWorkflowScheme**](PageBeanWorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDefaultWorkflow"></a>
# **getDefaultWorkflow**
> DefaultWorkflow getDefaultWorkflow(id, returnDraftIfExists)

Get default workflow

Returns the default workflow for a workflow scheme. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme.
Boolean returnDraftIfExists = false; // Boolean | Set to `true` to return the default workflow for the workflow scheme's draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned.
try {
    DefaultWorkflow result = apiInstance.getDefaultWorkflow(id, returnDraftIfExists);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#getDefaultWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. |
 **returnDraftIfExists** | **Boolean**| Set to &#x60;true&#x60; to return the default workflow for the workflow scheme&#x27;s draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned. | [optional] [default to false]

### Return type

[**DefaultWorkflow**](DefaultWorkflow.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflow"></a>
# **getWorkflow**
> IssueTypesWorkflowMapping getWorkflow(id, workflowName, returnDraftIfExists)

Get issue types for workflows in workflow scheme

Returns the workflow-issue type mappings for a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme.
String workflowName = "workflowName_example"; // String | The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
Boolean returnDraftIfExists = false; // Boolean | Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
try {
    IssueTypesWorkflowMapping result = apiInstance.getWorkflow(id, workflowName, returnDraftIfExists);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#getWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. |
 **workflowName** | **String**| The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. | [optional]
 **returnDraftIfExists** | **Boolean**| Returns the mapping from the workflow scheme&#x27;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. | [optional] [default to false]

### Return type

[**IssueTypesWorkflowMapping**](IssueTypesWorkflowMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowScheme"></a>
# **getWorkflowScheme**
> WorkflowScheme getWorkflowScheme(id, returnDraftIfExists)

Get workflow scheme

Returns a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
Boolean returnDraftIfExists = false; // Boolean | Returns the workflow scheme's draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned.
try {
    WorkflowScheme result = apiInstance.getWorkflowScheme(id, returnDraftIfExists);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#getWorkflowScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. |
 **returnDraftIfExists** | **Boolean**| Returns the workflow scheme&#x27;s draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned. | [optional] [default to false]

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowSchemeIssueType"></a>
# **getWorkflowSchemeIssueType**
> IssueTypeWorkflowMapping getWorkflowSchemeIssueType(id, issueType, returnDraftIfExists)

Get workflow for issue type in workflow scheme

Returns the issue type-workflow mapping for an issue type in a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
Long id = 789L; // Long | The ID of the workflow scheme.
String issueType = "issueType_example"; // String | The ID of the issue type.
Boolean returnDraftIfExists = false; // Boolean | Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
try {
    IssueTypeWorkflowMapping result = apiInstance.getWorkflowSchemeIssueType(id, issueType, returnDraftIfExists);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#getWorkflowSchemeIssueType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the workflow scheme. |
 **issueType** | **String**| The ID of the issue type. |
 **returnDraftIfExists** | **Boolean**| Returns the mapping from the workflow scheme&#x27;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. | [optional] [default to false]

### Return type

[**IssueTypeWorkflowMapping**](IssueTypeWorkflowMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setWorkflowSchemeIssueType"></a>
# **setWorkflowSchemeIssueType**
> WorkflowScheme setWorkflowSchemeIssueType(body, id, issueType)

Set workflow for issue type in workflow scheme

Sets the workflow for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new issue type-workflow mapping. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
IssueTypeWorkflowMapping body = new IssueTypeWorkflowMapping(); // IssueTypeWorkflowMapping | The issue type-project mapping.
Long id = 789L; // Long | The ID of the workflow scheme.
String issueType = "issueType_example"; // String | The ID of the issue type.
try {
    WorkflowScheme result = apiInstance.setWorkflowSchemeIssueType(body, id, issueType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#setWorkflowSchemeIssueType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssueTypeWorkflowMapping**](IssueTypeWorkflowMapping.md)| The issue type-project mapping. |
 **id** | **Long**| The ID of the workflow scheme. |
 **issueType** | **String**| The ID of the issue type. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDefaultWorkflow"></a>
# **updateDefaultWorkflow**
> WorkflowScheme updateDefaultWorkflow(body, id)

Update default workflow

Sets the default workflow for a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request object and a draft workflow scheme is created or updated with the new default workflow. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
DefaultWorkflow body = new DefaultWorkflow(); // DefaultWorkflow | The new default workflow.
Long id = 789L; // Long | The ID of the workflow scheme.
try {
    WorkflowScheme result = apiInstance.updateDefaultWorkflow(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#updateDefaultWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DefaultWorkflow**](DefaultWorkflow.md)| The new default workflow. |
 **id** | **Long**| The ID of the workflow scheme. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorkflowMapping"></a>
# **updateWorkflowMapping**
> WorkflowScheme updateWorkflowMapping(body, workflowName, id)

Set issue types for workflow in workflow scheme

Sets the issue types for a workflow in a workflow scheme. The workflow can also be set as the default workflow for the workflow scheme. Unmapped issues types are mapped to the default workflow.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new workflow-issue types mappings. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
IssueTypesWorkflowMapping body = new IssueTypesWorkflowMapping(); // IssueTypesWorkflowMapping | 
String workflowName = "workflowName_example"; // String | The name of the workflow.
Long id = 789L; // Long | The ID of the workflow scheme.
try {
    WorkflowScheme result = apiInstance.updateWorkflowMapping(body, workflowName, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#updateWorkflowMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssueTypesWorkflowMapping**](IssueTypesWorkflowMapping.md)|  |
 **workflowName** | **String**| The name of the workflow. |
 **id** | **Long**| The ID of the workflow scheme. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorkflowScheme"></a>
# **updateWorkflowScheme**
> WorkflowScheme updateWorkflowScheme(body, id)

Update workflow scheme

Updates a workflow scheme, including the name, default workflow, issue type to project mappings, and more. If the workflow scheme is active (that is, being used by at least one project), then a draft workflow scheme is created or updated instead, provided that &#x60;updateDraftIfNeeded&#x60; is set to &#x60;true&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemesApi apiInstance = new WorkflowSchemesApi();
WorkflowScheme body = new WorkflowScheme(); // WorkflowScheme | 
Long id = 789L; // Long | The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
try {
    WorkflowScheme result = apiInstance.updateWorkflowScheme(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemesApi#updateWorkflowScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkflowScheme**](WorkflowScheme.md)|  |
 **id** | **Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

