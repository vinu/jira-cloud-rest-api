# IssueCustomFieldContextsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addIssueTypesToContext**](IssueCustomFieldContextsApi.md#addIssueTypesToContext) | **PUT** /rest/api/3/field/{fieldId}/context/{contextId}/issuetype | Add issue types to context
[**assignProjectsToCustomFieldContext**](IssueCustomFieldContextsApi.md#assignProjectsToCustomFieldContext) | **PUT** /rest/api/3/field/{fieldId}/context/{contextId}/project | Assign custom field context to projects
[**createCustomFieldContext**](IssueCustomFieldContextsApi.md#createCustomFieldContext) | **POST** /rest/api/3/field/{fieldId}/context | Create custom field context
[**deleteCustomFieldContext**](IssueCustomFieldContextsApi.md#deleteCustomFieldContext) | **DELETE** /rest/api/3/field/{fieldId}/context/{contextId} | Delete custom field context
[**getContextsForField**](IssueCustomFieldContextsApi.md#getContextsForField) | **GET** /rest/api/3/field/{fieldId}/context | Get custom field contexts
[**getCustomFieldContextsForProjectsAndIssueTypes**](IssueCustomFieldContextsApi.md#getCustomFieldContextsForProjectsAndIssueTypes) | **POST** /rest/api/3/field/{fieldId}/context/mapping | Get custom field contexts for projects and issue types
[**getDefaultValues**](IssueCustomFieldContextsApi.md#getDefaultValues) | **GET** /rest/api/3/field/{fieldId}/context/defaultValue | Get custom field contexts default values
[**getIssueTypeMappingsForContexts**](IssueCustomFieldContextsApi.md#getIssueTypeMappingsForContexts) | **GET** /rest/api/3/field/{fieldId}/context/issuetypemapping | Get issue types for custom field context
[**getProjectContextMapping**](IssueCustomFieldContextsApi.md#getProjectContextMapping) | **GET** /rest/api/3/field/{fieldId}/context/projectmapping | Get project mappings for custom field context
[**removeCustomFieldContextFromProjects**](IssueCustomFieldContextsApi.md#removeCustomFieldContextFromProjects) | **POST** /rest/api/3/field/{fieldId}/context/{contextId}/project/remove | Remove custom field context from projects
[**removeIssueTypesFromContext**](IssueCustomFieldContextsApi.md#removeIssueTypesFromContext) | **POST** /rest/api/3/field/{fieldId}/context/{contextId}/issuetype/remove | Remove issue types from context
[**setDefaultValues**](IssueCustomFieldContextsApi.md#setDefaultValues) | **PUT** /rest/api/3/field/{fieldId}/context/defaultValue | Set custom field contexts default values
[**updateCustomFieldContext**](IssueCustomFieldContextsApi.md#updateCustomFieldContext) | **PUT** /rest/api/3/field/{fieldId}/context/{contextId} | Update custom field context

<a name="addIssueTypesToContext"></a>
# **addIssueTypesToContext**
> Object addIssueTypesToContext(body, fieldId, contextId)

Add issue types to context

Adds issue types to a custom field context, appending the issue types to the issue types list.  A custom field context without any issue types applies to all issue types. Adding issue types to such a custom field context would result in it applying to only the listed issue types.  If any of the issue types exists in the custom field context, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
IssueTypeIds body = new IssueTypeIds(); // IssueTypeIds | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    Object result = apiInstance.addIssueTypesToContext(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#addIssueTypesToContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssueTypeIds**](IssueTypeIds.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignProjectsToCustomFieldContext"></a>
# **assignProjectsToCustomFieldContext**
> Object assignProjectsToCustomFieldContext(body, fieldId, contextId)

Assign custom field context to projects

Assigns a custom field context to projects.  If any project in the request is assigned to any context of the custom field, the operation fails.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
ProjectIds body = new ProjectIds(); // ProjectIds | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    Object result = apiInstance.assignProjectsToCustomFieldContext(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#assignProjectsToCustomFieldContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectIds**](ProjectIds.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomFieldContext"></a>
# **createCustomFieldContext**
> CreateCustomFieldContext createCustomFieldContext(body, fieldId)

Create custom field context

Creates a custom field context.  If &#x60;projectIds&#x60; is empty, a global context is created. A global context is one that applies to all project. If &#x60;issueTypeIds&#x60; is empty, the context applies to all issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
CreateCustomFieldContext body = new CreateCustomFieldContext(); // CreateCustomFieldContext | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
try {
    CreateCustomFieldContext result = apiInstance.createCustomFieldContext(body, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#createCustomFieldContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCustomFieldContext**](CreateCustomFieldContext.md)|  |
 **fieldId** | **String**| The ID of the custom field. |

### Return type

[**CreateCustomFieldContext**](CreateCustomFieldContext.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomFieldContext"></a>
# **deleteCustomFieldContext**
> Object deleteCustomFieldContext(fieldId, contextId)

Delete custom field context

Deletes a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    Object result = apiInstance.deleteCustomFieldContext(fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#deleteCustomFieldContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContextsForField"></a>
# **getContextsForField**
> PageBeanCustomFieldContext getContextsForField(fieldId, isAnyIssueType, isGlobalContext, contextId, startAt, maxResults)

Get custom field contexts

Returns a [paginated](#pagination) list of [ contexts](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html) for a custom field. Contexts can be returned as follows:   *  With no other parameters set, all contexts.  *  By defining &#x60;id&#x60; only, all contexts from the list of IDs.  *  By defining &#x60;isAnyIssueType&#x60;, limit the list of contexts returned to either those that apply to all issue types (true) or those that apply to only a subset of issue types (false)  *  By defining &#x60;isGlobalContext&#x60;, limit the list of contexts return to either those that apply to all projects (global contexts) (true) or those that apply to only a subset of projects (false).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Boolean isAnyIssueType = true; // Boolean | Whether to return contexts that apply to all issue types.
Boolean isGlobalContext = true; // Boolean | Whether to return contexts that apply to all projects.
List<Long> contextId = Arrays.asList(56L); // List<Long> | The list of context IDs. To include multiple contexts, separate IDs with ampersand: `contextId=10000&contextId=10001`.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanCustomFieldContext result = apiInstance.getContextsForField(fieldId, isAnyIssueType, isGlobalContext, contextId, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#getContextsForField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| The ID of the custom field. |
 **isAnyIssueType** | **Boolean**| Whether to return contexts that apply to all issue types. | [optional]
 **isGlobalContext** | **Boolean**| Whether to return contexts that apply to all projects. | [optional]
 **contextId** | [**List&lt;Long&gt;**](Long.md)| The list of context IDs. To include multiple contexts, separate IDs with ampersand: &#x60;contextId&#x3D;10000&amp;contextId&#x3D;10001&#x60;. | [optional]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanCustomFieldContext**](PageBeanCustomFieldContext.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomFieldContextsForProjectsAndIssueTypes"></a>
# **getCustomFieldContextsForProjectsAndIssueTypes**
> PageBeanContextForProjectAndIssueType getCustomFieldContextsForProjectsAndIssueTypes(body, fieldId, startAt, maxResults)

Get custom field contexts for projects and issue types

Returns a [paginated](#pagination) list of project and issue type mappings and, for each mapping, the ID of a [custom field context](https://confluence.atlassian.com/x/k44fOw) that applies to the project and issue type.  If there is no custom field context assigned to the project then, if present, the custom field context that applies to all projects is returned if it also applies to the issue type or all issue types. If a custom field context is not found, the returned custom field context ID is &#x60;null&#x60;.  Duplicate project and issue type mappings cannot be provided in the request.  The order of the returned values is the same as provided in the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
ProjectIssueTypeMappings body = new ProjectIssueTypeMappings(); // ProjectIssueTypeMappings | The list of project and issue type mappings.
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanContextForProjectAndIssueType result = apiInstance.getCustomFieldContextsForProjectsAndIssueTypes(body, fieldId, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#getCustomFieldContextsForProjectsAndIssueTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectIssueTypeMappings**](ProjectIssueTypeMappings.md)| The list of project and issue type mappings. |
 **fieldId** | **String**| The ID of the custom field. |
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanContextForProjectAndIssueType**](PageBeanContextForProjectAndIssueType.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDefaultValues"></a>
# **getDefaultValues**
> PageBeanCustomFieldContextDefaultValue getDefaultValues(fieldId, contextId, startAt, maxResults)

Get custom field contexts default values

Returns a [paginated](#pagination) list of defaults for a custom field. The results can be filtered by &#x60;contextId&#x60;, otherwise all values are returned. If no defaults are set for a context, nothing is returned.   The returned object depends on type of the custom field:   *  &#x60;CustomFieldContextDefaultValueSingleOption&#x60; (type &#x60;option.single&#x60;) for single choice select lists and radio buttons.  *  &#x60;CustomFieldContextDefaultValueMultipleOption&#x60; (type &#x60;option.multiple&#x60;) for multiple choice select lists and checkboxes.  *  &#x60;CustomFieldContextDefaultValueCascadingOption&#x60; (type &#x60;option.cascading&#x60;) for cascading select lists.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
String fieldId = "fieldId_example"; // String | The ID of the custom field.
List<Long> contextId = Arrays.asList(56L); // List<Long> | The IDs of the contexts.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanCustomFieldContextDefaultValue result = apiInstance.getDefaultValues(fieldId, contextId, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#getDefaultValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | [**List&lt;Long&gt;**](Long.md)| The IDs of the contexts. | [optional]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanCustomFieldContextDefaultValue**](PageBeanCustomFieldContextDefaultValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIssueTypeMappingsForContexts"></a>
# **getIssueTypeMappingsForContexts**
> PageBeanIssueTypeToContextMapping getIssueTypeMappingsForContexts(fieldId, contextId, startAt, maxResults)

Get issue types for custom field context

Returns a [paginated](#pagination) list of context to issue type mappings for a custom field. Mappings are returned for all contexts or a list of contexts. Mappings are ordered first by context ID and then by issue type ID.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
String fieldId = "fieldId_example"; // String | The ID of the custom field.
List<Long> contextId = Arrays.asList(56L); // List<Long> | The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, `contextId=10001&contextId=10002`.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanIssueTypeToContextMapping result = apiInstance.getIssueTypeMappingsForContexts(fieldId, contextId, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#getIssueTypeMappingsForContexts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | [**List&lt;Long&gt;**](Long.md)| The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, &#x60;contextId&#x3D;10001&amp;contextId&#x3D;10002&#x60;. | [optional]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanIssueTypeToContextMapping**](PageBeanIssueTypeToContextMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectContextMapping"></a>
# **getProjectContextMapping**
> PageBeanCustomFieldContextProjectMapping getProjectContextMapping(fieldId, contextId, startAt, maxResults)

Get project mappings for custom field context

Returns a [paginated](#pagination) list of context to project mappings for a custom field. The result can be filtered by &#x60;contextId&#x60;, or otherwise all mappings are returned. Invalid IDs are ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
String fieldId = "fieldId_example"; // String | The ID of the custom field.
List<Long> contextId = Arrays.asList(56L); // List<Long> | The list of context IDs. To include multiple context, separate IDs with ampersand: `contextId=10000&contextId=10001`.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanCustomFieldContextProjectMapping result = apiInstance.getProjectContextMapping(fieldId, contextId, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#getProjectContextMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | [**List&lt;Long&gt;**](Long.md)| The list of context IDs. To include multiple context, separate IDs with ampersand: &#x60;contextId&#x3D;10000&amp;contextId&#x3D;10001&#x60;. | [optional]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanCustomFieldContextProjectMapping**](PageBeanCustomFieldContextProjectMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCustomFieldContextFromProjects"></a>
# **removeCustomFieldContextFromProjects**
> Object removeCustomFieldContextFromProjects(body, fieldId, contextId)

Remove custom field context from projects

Removes a custom field context from projects.  A custom field context without any projects applies to all projects. Removing all projects from a custom field context would result in it applying to all projects.  If any project in the request is not assigned to the context, or the operation would result in two global contexts for the field, the operation fails.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
ProjectIds body = new ProjectIds(); // ProjectIds | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    Object result = apiInstance.removeCustomFieldContextFromProjects(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#removeCustomFieldContextFromProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectIds**](ProjectIds.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeIssueTypesFromContext"></a>
# **removeIssueTypesFromContext**
> Object removeIssueTypesFromContext(body, fieldId, contextId)

Remove issue types from context

Removes issue types from a custom field context.  A custom field context without any issue types applies to all issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
IssueTypeIds body = new IssueTypeIds(); // IssueTypeIds | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    Object result = apiInstance.removeIssueTypesFromContext(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#removeIssueTypesFromContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssueTypeIds**](IssueTypeIds.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setDefaultValues"></a>
# **setDefaultValues**
> Object setDefaultValues(body, fieldId)

Set custom field contexts default values

Sets default for contexts of a custom field. Default are defined using these objects:   *  &#x60;CustomFieldContextDefaultValueSingleOption&#x60; (type &#x60;option.single&#x60;) for single choice select lists and radio buttons.  *  &#x60;CustomFieldContextDefaultValueMultipleOption&#x60; (type &#x60;option.multiple&#x60;) for multiple choice select lists and checkboxes.  *  &#x60;CustomFieldContextDefaultValueCascadingOption&#x60; (type &#x60;option.cascading&#x60;) for cascading select lists.  Only one type of default object can be included in a request. To remove a default for a context, set the default parameter to &#x60;null&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
CustomFieldContextDefaultValueUpdate body = new CustomFieldContextDefaultValueUpdate(); // CustomFieldContextDefaultValueUpdate | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
try {
    Object result = apiInstance.setDefaultValues(body, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#setDefaultValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomFieldContextDefaultValueUpdate**](CustomFieldContextDefaultValueUpdate.md)|  |
 **fieldId** | **String**| The ID of the custom field. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomFieldContext"></a>
# **updateCustomFieldContext**
> Object updateCustomFieldContext(body, fieldId, contextId)

Update custom field context

Updates a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldContextsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldContextsApi apiInstance = new IssueCustomFieldContextsApi();
CustomFieldContextUpdateDetails body = new CustomFieldContextUpdateDetails(); // CustomFieldContextUpdateDetails | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    Object result = apiInstance.updateCustomFieldContext(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldContextsApi#updateCustomFieldContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomFieldContextUpdateDetails**](CustomFieldContextUpdateDetails.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

