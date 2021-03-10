# ScreenSchemesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScreenScheme**](ScreenSchemesApi.md#createScreenScheme) | **POST** /rest/api/3/screenscheme | Create screen scheme
[**deleteScreenScheme**](ScreenSchemesApi.md#deleteScreenScheme) | **DELETE** /rest/api/3/screenscheme/{screenSchemeId} | Delete screen scheme
[**getScreenSchemes**](ScreenSchemesApi.md#getScreenSchemes) | **GET** /rest/api/3/screenscheme | Get screen schemes
[**updateScreenScheme**](ScreenSchemesApi.md#updateScreenScheme) | **PUT** /rest/api/3/screenscheme/{screenSchemeId} | Update screen scheme

<a name="createScreenScheme"></a>
# **createScreenScheme**
> ScreenSchemeId createScreenScheme(body)

Create screen scheme

Creates a screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenSchemesApi apiInstance = new ScreenSchemesApi();
ScreenSchemeDetails body = new ScreenSchemeDetails(); // ScreenSchemeDetails | 
try {
    ScreenSchemeId result = apiInstance.createScreenScheme(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenSchemesApi#createScreenScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScreenSchemeDetails**](ScreenSchemeDetails.md)|  |

### Return type

[**ScreenSchemeId**](ScreenSchemeId.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScreenScheme"></a>
# **deleteScreenScheme**
> deleteScreenScheme(screenSchemeId)

Delete screen scheme

Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.  Only screens schemes used in classic projects can be deleted.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenSchemesApi apiInstance = new ScreenSchemesApi();
String screenSchemeId = "screenSchemeId_example"; // String | The ID of the screen scheme.
try {
    apiInstance.deleteScreenScheme(screenSchemeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenSchemesApi#deleteScreenScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenSchemeId** | **String**| The ID of the screen scheme. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScreenSchemes"></a>
# **getScreenSchemes**
> PageBeanScreenScheme getScreenSchemes(startAt, maxResults, id)

Get screen schemes

Returns a [paginated](#pagination) list of screen schemes.  Only screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenSchemesApi apiInstance = new ScreenSchemesApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 25; // Integer | The maximum number of items to return per page.
List<Long> id = Arrays.asList(56L); // List<Long> | The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`.
try {
    PageBeanScreenScheme result = apiInstance.getScreenSchemes(startAt, maxResults, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenSchemesApi#getScreenSchemes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 25]
 **id** | [**List&lt;Long&gt;**](Long.md)| The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional]

### Return type

[**PageBeanScreenScheme**](PageBeanScreenScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScreenScheme"></a>
# **updateScreenScheme**
> Object updateScreenScheme(body, screenSchemeId)

Update screen scheme

Updates a screen scheme. Only screen schemes used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenSchemesApi apiInstance = new ScreenSchemesApi();
UpdateScreenSchemeDetails body = new UpdateScreenSchemeDetails(); // UpdateScreenSchemeDetails | The screen scheme update details.
String screenSchemeId = "screenSchemeId_example"; // String | The ID of the screen scheme.
try {
    Object result = apiInstance.updateScreenScheme(body, screenSchemeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenSchemesApi#updateScreenScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateScreenSchemeDetails**](UpdateScreenSchemeDetails.md)| The screen scheme update details. |
 **screenSchemeId** | **String**| The ID of the screen scheme. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

