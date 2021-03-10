# IssuePrioritiesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPriorities**](IssuePrioritiesApi.md#getPriorities) | **GET** /rest/api/3/priority | Get priorities
[**getPriority**](IssuePrioritiesApi.md#getPriority) | **GET** /rest/api/3/priority/{id} | Get priority

<a name="getPriorities"></a>
# **getPriorities**
> List&lt;Priority&gt; getPriorities()

Get priorities

Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuePrioritiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuePrioritiesApi apiInstance = new IssuePrioritiesApi();
try {
    List<Priority> result = apiInstance.getPriorities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuePrioritiesApi#getPriorities");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Priority&gt;**](Priority.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPriority"></a>
# **getPriority**
> Priority getPriority(id)

Get priority

Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssuePrioritiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssuePrioritiesApi apiInstance = new IssuePrioritiesApi();
String id = "id_example"; // String | The ID of the issue priority.
try {
    Priority result = apiInstance.getPriority(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssuePrioritiesApi#getPriority");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the issue priority. |

### Return type

[**Priority**](Priority.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

