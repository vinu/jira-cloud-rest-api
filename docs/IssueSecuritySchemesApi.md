# IssueSecuritySchemesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssueSecurityScheme**](IssueSecuritySchemesApi.md#getIssueSecurityScheme) | **GET** /rest/api/3/issuesecurityschemes/{id} | Get issue security scheme
[**getIssueSecuritySchemes**](IssueSecuritySchemesApi.md#getIssueSecuritySchemes) | **GET** /rest/api/3/issuesecurityschemes | Get issue security schemes

<a name="getIssueSecurityScheme"></a>
# **getIssueSecurityScheme**
> SecurityScheme getIssueSecurityScheme(id)

Get issue security scheme

Returns an issue security scheme along with its security levels.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueSecuritySchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueSecuritySchemesApi apiInstance = new IssueSecuritySchemesApi();
Long id = 789L; // Long | The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
try {
    SecurityScheme result = apiInstance.getIssueSecurityScheme(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSecuritySchemesApi#getIssueSecurityScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs. |

### Return type

[**SecurityScheme**](SecurityScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIssueSecuritySchemes"></a>
# **getIssueSecuritySchemes**
> SecuritySchemes getIssueSecuritySchemes()

Get issue security schemes

Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueSecuritySchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueSecuritySchemesApi apiInstance = new IssueSecuritySchemesApi();
try {
    SecuritySchemes result = apiInstance.getIssueSecuritySchemes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSecuritySchemesApi#getIssueSecuritySchemes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecuritySchemes**](SecuritySchemes.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

