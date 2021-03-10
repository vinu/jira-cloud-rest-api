# IssueFieldConfigurationsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignFieldConfigurationSchemeToProject**](IssueFieldConfigurationsApi.md#assignFieldConfigurationSchemeToProject) | **PUT** /rest/api/3/fieldconfigurationscheme/project | Assign field configuration scheme to project
[**getAllFieldConfigurationSchemes**](IssueFieldConfigurationsApi.md#getAllFieldConfigurationSchemes) | **GET** /rest/api/3/fieldconfigurationscheme | Get all field configuration schemes
[**getAllFieldConfigurations**](IssueFieldConfigurationsApi.md#getAllFieldConfigurations) | **GET** /rest/api/3/fieldconfiguration | Get all field configurations
[**getFieldConfigurationItems**](IssueFieldConfigurationsApi.md#getFieldConfigurationItems) | **GET** /rest/api/3/fieldconfiguration/{id}/fields | Get field configuration items
[**getFieldConfigurationSchemeMappings**](IssueFieldConfigurationsApi.md#getFieldConfigurationSchemeMappings) | **GET** /rest/api/3/fieldconfigurationscheme/mapping | Get field configuration issue type items
[**getFieldConfigurationSchemeProjectMapping**](IssueFieldConfigurationsApi.md#getFieldConfigurationSchemeProjectMapping) | **GET** /rest/api/3/fieldconfigurationscheme/project | Get field configuration schemes for projects

<a name="assignFieldConfigurationSchemeToProject"></a>
# **assignFieldConfigurationSchemeToProject**
> Object assignFieldConfigurationSchemeToProject(body)

Assign field configuration scheme to project

Assigns a field configuration scheme to a project. If the field configuration scheme ID is &#x60;null&#x60;, the operation assigns the default field configuration scheme.  Field configuration schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueFieldConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueFieldConfigurationsApi apiInstance = new IssueFieldConfigurationsApi();
FieldConfigurationSchemeProjectAssociation body = new FieldConfigurationSchemeProjectAssociation(); // FieldConfigurationSchemeProjectAssociation | 
try {
    Object result = apiInstance.assignFieldConfigurationSchemeToProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueFieldConfigurationsApi#assignFieldConfigurationSchemeToProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FieldConfigurationSchemeProjectAssociation**](FieldConfigurationSchemeProjectAssociation.md)|  |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllFieldConfigurationSchemes"></a>
# **getAllFieldConfigurationSchemes**
> PageBeanFieldConfigurationScheme getAllFieldConfigurationSchemes(startAt, maxResults, id)

Get all field configuration schemes

Returns a [paginated](#pagination) list of field configuration schemes.  Only field configuration schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueFieldConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueFieldConfigurationsApi apiInstance = new IssueFieldConfigurationsApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
List<Long> id = Arrays.asList(56L); // List<Long> | The list of field configuration scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`.
try {
    PageBeanFieldConfigurationScheme result = apiInstance.getAllFieldConfigurationSchemes(startAt, maxResults, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueFieldConfigurationsApi#getAllFieldConfigurationSchemes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **id** | [**List&lt;Long&gt;**](Long.md)| The list of field configuration scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional]

### Return type

[**PageBeanFieldConfigurationScheme**](PageBeanFieldConfigurationScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllFieldConfigurations"></a>
# **getAllFieldConfigurations**
> PageBeanFieldConfiguration getAllFieldConfigurations(startAt, maxResults, id, isDefault)

Get all field configurations

Returns a [paginated](#pagination) list of all field configurations.  Only field configurations used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueFieldConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueFieldConfigurationsApi apiInstance = new IssueFieldConfigurationsApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
List<Long> id = Arrays.asList(56L); // List<Long> | The list of field configuration IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`.
Boolean isDefault = false; // Boolean | If *true* returns the default field configuration only.
try {
    PageBeanFieldConfiguration result = apiInstance.getAllFieldConfigurations(startAt, maxResults, id, isDefault);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueFieldConfigurationsApi#getAllFieldConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **id** | [**List&lt;Long&gt;**](Long.md)| The list of field configuration IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. | [optional]
 **isDefault** | **Boolean**| If *true* returns the default field configuration only. | [optional] [default to false]

### Return type

[**PageBeanFieldConfiguration**](PageBeanFieldConfiguration.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldConfigurationItems"></a>
# **getFieldConfigurationItems**
> PageBeanFieldConfigurationItem getFieldConfigurationItems(id, startAt, maxResults)

Get field configuration items

Returns a [paginated](#pagination) list of all fields for a configuration.  Only the fields from configurations used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueFieldConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueFieldConfigurationsApi apiInstance = new IssueFieldConfigurationsApi();
Long id = 789L; // Long | The ID of the field configuration.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanFieldConfigurationItem result = apiInstance.getFieldConfigurationItems(id, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueFieldConfigurationsApi#getFieldConfigurationItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the field configuration. |
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanFieldConfigurationItem**](PageBeanFieldConfigurationItem.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldConfigurationSchemeMappings"></a>
# **getFieldConfigurationSchemeMappings**
> PageBeanFieldConfigurationIssueTypeItem getFieldConfigurationSchemeMappings(startAt, maxResults, fieldConfigurationSchemeId)

Get field configuration issue type items

Returns a [paginated](#pagination) list of field configuration issue type items.  Only items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueFieldConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueFieldConfigurationsApi apiInstance = new IssueFieldConfigurationsApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
List<Long> fieldConfigurationSchemeId = Arrays.asList(56L); // List<Long> | The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: `fieldConfigurationSchemeId=10000&fieldConfigurationSchemeId=10001`.
try {
    PageBeanFieldConfigurationIssueTypeItem result = apiInstance.getFieldConfigurationSchemeMappings(startAt, maxResults, fieldConfigurationSchemeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueFieldConfigurationsApi#getFieldConfigurationSchemeMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **fieldConfigurationSchemeId** | [**List&lt;Long&gt;**](Long.md)| The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: &#x60;fieldConfigurationSchemeId&#x3D;10000&amp;fieldConfigurationSchemeId&#x3D;10001&#x60;. | [optional]

### Return type

[**PageBeanFieldConfigurationIssueTypeItem**](PageBeanFieldConfigurationIssueTypeItem.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldConfigurationSchemeProjectMapping"></a>
# **getFieldConfigurationSchemeProjectMapping**
> PageBeanFieldConfigurationSchemeProjects getFieldConfigurationSchemeProjectMapping(projectId, startAt, maxResults)

Get field configuration schemes for projects

Returns a [paginated](#pagination) list of field configuration schemes and, for each scheme, a list of the projects that use it.  The list is sorted by field configuration scheme ID. The first item contains the list of project IDs assigned to the default field configuration scheme.  Only field configuration schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueFieldConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueFieldConfigurationsApi apiInstance = new IssueFieldConfigurationsApi();
List<Long> projectId = Arrays.asList(56L); // List<Long> | The list of project IDs. To include multiple projects, separate IDs with ampersand: `projectId=10000&projectId=10001`.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanFieldConfigurationSchemeProjects result = apiInstance.getFieldConfigurationSchemeProjectMapping(projectId, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueFieldConfigurationsApi#getFieldConfigurationSchemeProjectMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**List&lt;Long&gt;**](Long.md)| The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. |
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanFieldConfigurationSchemeProjects**](PageBeanFieldConfigurationSchemeProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

