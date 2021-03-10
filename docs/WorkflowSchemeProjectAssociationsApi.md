# WorkflowSchemeProjectAssociationsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associateSchemeWithProject**](WorkflowSchemeProjectAssociationsApi.md#associateSchemeWithProject) | **PUT** /rest/api/3/workflowscheme/project | Assign workflow scheme to project
[**getWorkflowSchemeProjectAssociations**](WorkflowSchemeProjectAssociationsApi.md#getWorkflowSchemeProjectAssociations) | **GET** /rest/api/3/workflowscheme/project | Get workflow scheme project associations

<a name="associateSchemeWithProject"></a>
# **associateSchemeWithProject**
> Object associateSchemeWithProject(body)

Assign workflow scheme to project

Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.  Workflow schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemeProjectAssociationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemeProjectAssociationsApi apiInstance = new WorkflowSchemeProjectAssociationsApi();
WorkflowSchemeProjectAssociation body = new WorkflowSchemeProjectAssociation(); // WorkflowSchemeProjectAssociation | 
try {
    Object result = apiInstance.associateSchemeWithProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemeProjectAssociationsApi#associateSchemeWithProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkflowSchemeProjectAssociation**](WorkflowSchemeProjectAssociation.md)|  |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowSchemeProjectAssociations"></a>
# **getWorkflowSchemeProjectAssociations**
> ContainerOfWorkflowSchemeAssociations getWorkflowSchemeProjectAssociations(projectId)

Get workflow scheme project associations

Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any next-gen or non-existent projects in the request are ignored and no errors are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.WorkflowSchemeProjectAssociationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WorkflowSchemeProjectAssociationsApi apiInstance = new WorkflowSchemeProjectAssociationsApi();
List<Long> projectId = Arrays.asList(56L); // List<Long> | The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, `projectId=10000&projectId=10001`.
try {
    ContainerOfWorkflowSchemeAssociations result = apiInstance.getWorkflowSchemeProjectAssociations(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowSchemeProjectAssociationsApi#getWorkflowSchemeProjectAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**List&lt;Long&gt;**](Long.md)| The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. |

### Return type

[**ContainerOfWorkflowSchemeAssociations**](ContainerOfWorkflowSchemeAssociations.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

