# ScreenTabsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addScreenTab**](ScreenTabsApi.md#addScreenTab) | **POST** /rest/api/3/screens/{screenId}/tabs | Create screen tab
[**deleteScreenTab**](ScreenTabsApi.md#deleteScreenTab) | **DELETE** /rest/api/3/screens/{screenId}/tabs/{tabId} | Delete screen tab
[**getAllScreenTabs**](ScreenTabsApi.md#getAllScreenTabs) | **GET** /rest/api/3/screens/{screenId}/tabs | Get all screen tabs
[**moveScreenTab**](ScreenTabsApi.md#moveScreenTab) | **POST** /rest/api/3/screens/{screenId}/tabs/{tabId}/move/{pos} | Move screen tab
[**renameScreenTab**](ScreenTabsApi.md#renameScreenTab) | **PUT** /rest/api/3/screens/{screenId}/tabs/{tabId} | Update screen tab

<a name="addScreenTab"></a>
# **addScreenTab**
> ScreenableTab addScreenTab(body, screenId)

Create screen tab

Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenTabsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenTabsApi apiInstance = new ScreenTabsApi();
ScreenableTab body = new ScreenableTab(); // ScreenableTab | 
Long screenId = 789L; // Long | The ID of the screen.
try {
    ScreenableTab result = apiInstance.addScreenTab(body, screenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenTabsApi#addScreenTab");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScreenableTab**](ScreenableTab.md)|  |
 **screenId** | **Long**| The ID of the screen. |

### Return type

[**ScreenableTab**](ScreenableTab.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScreenTab"></a>
# **deleteScreenTab**
> deleteScreenTab(screenId, tabId)

Delete screen tab

Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenTabsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenTabsApi apiInstance = new ScreenTabsApi();
Long screenId = 789L; // Long | The ID of the screen.
Long tabId = 789L; // Long | The ID of the screen tab.
try {
    apiInstance.deleteScreenTab(screenId, tabId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenTabsApi#deleteScreenTab");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **Long**| The ID of the screen. |
 **tabId** | **Long**| The ID of the screen tab. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllScreenTabs"></a>
# **getAllScreenTabs**
> List&lt;ScreenableTab&gt; getAllScreenTabs(screenId, projectKey)

Get all screen tabs

Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenTabsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenTabsApi apiInstance = new ScreenTabsApi();
Long screenId = 789L; // Long | The ID of the screen.
String projectKey = "projectKey_example"; // String | The key of the project.
try {
    List<ScreenableTab> result = apiInstance.getAllScreenTabs(screenId, projectKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenTabsApi#getAllScreenTabs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **Long**| The ID of the screen. |
 **projectKey** | **String**| The key of the project. | [optional]

### Return type

[**List&lt;ScreenableTab&gt;**](ScreenableTab.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="moveScreenTab"></a>
# **moveScreenTab**
> Object moveScreenTab(screenId, tabId, pos)

Move screen tab

Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenTabsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenTabsApi apiInstance = new ScreenTabsApi();
Long screenId = 789L; // Long | The ID of the screen.
Long tabId = 789L; // Long | The ID of the screen tab.
Integer pos = 56; // Integer | The position of tab. The base index is 0.
try {
    Object result = apiInstance.moveScreenTab(screenId, tabId, pos);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenTabsApi#moveScreenTab");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **Long**| The ID of the screen. |
 **tabId** | **Long**| The ID of the screen tab. |
 **pos** | **Integer**| The position of tab. The base index is 0. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="renameScreenTab"></a>
# **renameScreenTab**
> ScreenableTab renameScreenTab(body, screenId, tabId)

Update screen tab

Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.ScreenTabsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ScreenTabsApi apiInstance = new ScreenTabsApi();
ScreenableTab body = new ScreenableTab(); // ScreenableTab | 
Long screenId = 789L; // Long | The ID of the screen.
Long tabId = 789L; // Long | The ID of the screen tab.
try {
    ScreenableTab result = apiInstance.renameScreenTab(body, screenId, tabId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenTabsApi#renameScreenTab");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScreenableTab**](ScreenableTab.md)|  |
 **screenId** | **Long**| The ID of the screen. |
 **tabId** | **Long**| The ID of the screen tab. |

### Return type

[**ScreenableTab**](ScreenableTab.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

