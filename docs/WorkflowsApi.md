# WorkflowsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllWorkflows**](WorkflowsApi.md#getAllWorkflows) | **GET** /rest/api/3/workflow | Get all workflows
[**getWorkflowsPaginated**](WorkflowsApi.md#getWorkflowsPaginated) | **GET** /rest/api/3/workflow/search | Get workflows paginated

<a name="getAllWorkflows"></a>
# **getAllWorkflows**
> List&lt;DeprecatedWorkflow&gt; getAllWorkflows(workflowName)

Get all workflows

Returns all workflows in Jira or a workflow. Deprecated, use [Get workflows paginated](#api-rest-api-3-workflow-search-get).  If the &#x60;workflowName&#x60; parameter is specified, the workflow is returned as an object (not in an array). Otherwise, an array of workflow objects is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowsApi apiInstance = new WorkflowsApi();
String workflowName = "workflowName_example"; // String | The name of the workflow to be returned. Only one workflow can be specified.
try {
    List<DeprecatedWorkflow> result = apiInstance.getAllWorkflows(workflowName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowsApi#getAllWorkflows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **String**| The name of the workflow to be returned. Only one workflow can be specified. | [optional]

### Return type

[**List&lt;DeprecatedWorkflow&gt;**](DeprecatedWorkflow.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowsPaginated"></a>
# **getWorkflowsPaginated**
> PageBeanWorkflow getWorkflowsPaginated(startAt, maxResults, workflowName, expand)

Get workflows paginated

Returns a [paginated](#pagination) list of published classic workflows. When workflow names are specified, details of those workflows are returned. Otherwise, all published classic workflows are returned.  This operation does not return next-gen workflows.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowsApi apiInstance = new WorkflowsApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
List<String> workflowName = Arrays.asList("workflowName_example"); // List<String> | The name of a workflow to return.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `transitions` For each workflow, returns information about the transitions inside the workflow.  *  `transitions.rules` For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.  *  `statuses` For each workflow, returns information about the statuses inside the workflow.  *  `statuses.properties` For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested.
try {
    PageBeanWorkflow result = apiInstance.getWorkflowsPaginated(startAt, maxResults, workflowName, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowsApi#getWorkflowsPaginated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **workflowName** | [**List&lt;String&gt;**](String.md)| The name of a workflow to return. | [optional]
 **expand** | **String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;transitions&#x60; For each workflow, returns information about the transitions inside the workflow.  *  &#x60;transitions.rules&#x60; For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.  *  &#x60;statuses&#x60; For each workflow, returns information about the statuses inside the workflow.  *  &#x60;statuses.properties&#x60; For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested. | [optional]

### Return type

[**PageBeanWorkflow**](PageBeanWorkflow.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

