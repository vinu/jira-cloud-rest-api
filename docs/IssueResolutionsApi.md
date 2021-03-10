# IssueResolutionsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResolution**](IssueResolutionsApi.md#getResolution) | **GET** /rest/api/3/resolution/{id} | Get resolution
[**getResolutions**](IssueResolutionsApi.md#getResolutions) | **GET** /rest/api/3/resolution | Get resolutions

<a name="getResolution"></a>
# **getResolution**
> Resolution getResolution(id)

Get resolution

Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueResolutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueResolutionsApi apiInstance = new IssueResolutionsApi();
String id = "id_example"; // String | The ID of the issue resolution value.
try {
    Resolution result = apiInstance.getResolution(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueResolutionsApi#getResolution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the issue resolution value. |

### Return type

[**Resolution**](Resolution.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResolutions"></a>
# **getResolutions**
> List&lt;Resolution&gt; getResolutions()

Get resolutions

Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueResolutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueResolutionsApi apiInstance = new IssueResolutionsApi();
try {
    List<Resolution> result = apiInstance.getResolutions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueResolutionsApi#getResolutions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Resolution&gt;**](Resolution.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

