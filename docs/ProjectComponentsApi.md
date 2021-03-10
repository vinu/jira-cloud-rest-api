# ProjectComponentsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComponent**](ProjectComponentsApi.md#createComponent) | **POST** /rest/api/3/component | Create component
[**deleteComponent**](ProjectComponentsApi.md#deleteComponent) | **DELETE** /rest/api/3/component/{id} | Delete component
[**getComponent**](ProjectComponentsApi.md#getComponent) | **GET** /rest/api/3/component/{id} | Get component
[**getComponentRelatedIssues**](ProjectComponentsApi.md#getComponentRelatedIssues) | **GET** /rest/api/3/component/{id}/relatedIssueCounts | Get component issues count
[**getProjectComponents**](ProjectComponentsApi.md#getProjectComponents) | **GET** /rest/api/3/project/{projectIdOrKey}/components | Get project components
[**getProjectComponentsPaginated**](ProjectComponentsApi.md#getProjectComponentsPaginated) | **GET** /rest/api/3/project/{projectIdOrKey}/component | Get project components paginated
[**updateComponent**](ProjectComponentsApi.md#updateComponent) | **PUT** /rest/api/3/component/{id} | Update component

<a name="createComponent"></a>
# **createComponent**
> Component createComponent(body)

Create component

Creates a component. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ProjectComponentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProjectComponentsApi apiInstance = new ProjectComponentsApi();
Component body = new Component(); // Component | 
try {
    Component result = apiInstance.createComponent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectComponentsApi#createComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Component**](Component.md)|  |

### Return type

[**Component**](Component.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteComponent"></a>
# **deleteComponent**
> deleteComponent(id, moveIssuesTo)

Delete component

Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ProjectComponentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProjectComponentsApi apiInstance = new ProjectComponentsApi();
String id = "id_example"; // String | The ID of the component.
String moveIssuesTo = "moveIssuesTo_example"; // String | The ID of the component to replace the deleted component. If this value is null no replacement is made.
try {
    apiInstance.deleteComponent(id, moveIssuesTo);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectComponentsApi#deleteComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the component. |
 **moveIssuesTo** | **String**| The ID of the component to replace the deleted component. If this value is null no replacement is made. | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComponent"></a>
# **getComponent**
> Component getComponent(id)

Get component

Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ProjectComponentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProjectComponentsApi apiInstance = new ProjectComponentsApi();
String id = "id_example"; // String | The ID of the component.
try {
    Component result = apiInstance.getComponent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectComponentsApi#getComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the component. |

### Return type

[**Component**](Component.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComponentRelatedIssues"></a>
# **getComponentRelatedIssues**
> ComponentIssuesCount getComponentRelatedIssues(id)

Get component issues count

Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ProjectComponentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProjectComponentsApi apiInstance = new ProjectComponentsApi();
String id = "id_example"; // String | The ID of the component.
try {
    ComponentIssuesCount result = apiInstance.getComponentRelatedIssues(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectComponentsApi#getComponentRelatedIssues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the component. |

### Return type

[**ComponentIssuesCount**](ComponentIssuesCount.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectComponents"></a>
# **getProjectComponents**
> List&lt;Component&gt; getProjectComponents(projectIdOrKey)

Get project components

Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ProjectComponentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProjectComponentsApi apiInstance = new ProjectComponentsApi();
String projectIdOrKey = "projectIdOrKey_example"; // String | The project ID or project key (case sensitive).
try {
    List<Component> result = apiInstance.getProjectComponents(projectIdOrKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectComponentsApi#getProjectComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **String**| The project ID or project key (case sensitive). |

### Return type

[**List&lt;Component&gt;**](Component.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectComponentsPaginated"></a>
# **getProjectComponentsPaginated**
> PageBeanComponentWithIssueCount getProjectComponentsPaginated(projectIdOrKey, startAt, maxResults, orderBy, query)

Get project components paginated

Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ProjectComponentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProjectComponentsApi apiInstance = new ProjectComponentsApi();
String projectIdOrKey = "projectIdOrKey_example"; // String | The project ID or project key (case sensitive).
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
String orderBy = "orderBy_example"; // String | [Order](#ordering) the results by a field:   *  `description` Sorts by the component description.  *  `issueCount` Sorts by the count of issues associated with the component.  *  `lead` Sorts by the user key of the component's project lead.  *  `name` Sorts by component name.
String query = "query_example"; // String | Filter the results using a literal string. Components with a matching `name` or `description` are returned (case insensitive).
try {
    PageBeanComponentWithIssueCount result = apiInstance.getProjectComponentsPaginated(projectIdOrKey, startAt, maxResults, orderBy, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectComponentsApi#getProjectComponentsPaginated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **String**| The project ID or project key (case sensitive). |
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **orderBy** | **String**| [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by the component description.  *  &#x60;issueCount&#x60; Sorts by the count of issues associated with the component.  *  &#x60;lead&#x60; Sorts by the user key of the component&#x27;s project lead.  *  &#x60;name&#x60; Sorts by component name. | [optional] [enum: description, -description, +description, issueCount, -issueCount, +issueCount, lead, -lead, +lead, name, -name, +name]
 **query** | **String**| Filter the results using a literal string. Components with a matching &#x60;name&#x60; or &#x60;description&#x60; are returned (case insensitive). | [optional]

### Return type

[**PageBeanComponentWithIssueCount**](PageBeanComponentWithIssueCount.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateComponent"></a>
# **updateComponent**
> Component updateComponent(body, id)

Update component

Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ProjectComponentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProjectComponentsApi apiInstance = new ProjectComponentsApi();
Component body = new Component(); // Component | 
String id = "id_example"; // String | The ID of the component.
try {
    Component result = apiInstance.updateComponent(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectComponentsApi#updateComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Component**](Component.md)|  |
 **id** | **String**| The ID of the component. |

### Return type

[**Component**](Component.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

