# IssueCustomFieldOptionsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomFieldOption**](IssueCustomFieldOptionsApi.md#createCustomFieldOption) | **POST** /rest/api/3/field/{fieldId}/context/{contextId}/option | Create custom field options (context)
[**createCustomFieldOptions**](IssueCustomFieldOptionsApi.md#createCustomFieldOptions) | **POST** /rest/api/3/customField/{fieldId}/option | Create custom field options
[**deleteCustomFieldOption**](IssueCustomFieldOptionsApi.md#deleteCustomFieldOption) | **DELETE** /rest/api/3/field/{fieldId}/context/{contextId}/option/{optionId} | Delete custom field options (context)
[**getCustomFieldOption**](IssueCustomFieldOptionsApi.md#getCustomFieldOption) | **GET** /rest/api/3/customFieldOption/{id} | Get custom field option
[**getOptionsForContext**](IssueCustomFieldOptionsApi.md#getOptionsForContext) | **GET** /rest/api/3/field/{fieldId}/context/{contextId}/option | Get custom field options (context)
[**getOptionsForField**](IssueCustomFieldOptionsApi.md#getOptionsForField) | **GET** /rest/api/3/customField/{fieldId}/option | Get options for field
[**reorderCustomFieldOptions**](IssueCustomFieldOptionsApi.md#reorderCustomFieldOptions) | **PUT** /rest/api/3/field/{fieldId}/context/{contextId}/option/move | Reorder custom field options (context)
[**updateCustomFieldOption**](IssueCustomFieldOptionsApi.md#updateCustomFieldOption) | **PUT** /rest/api/3/field/{fieldId}/context/{contextId}/option | Update custom field options (context)
[**updateCustomFieldOptions**](IssueCustomFieldOptionsApi.md#updateCustomFieldOptions) | **PUT** /rest/api/3/customField/{fieldId}/option | Update custom field options

<a name="createCustomFieldOption"></a>
# **createCustomFieldOption**
> CustomFieldCreatedContextOptionsList createCustomFieldOption(body, fieldId, contextId)

Create custom field options (context)

Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
BulkCustomFieldOptionCreateRequest body = new BulkCustomFieldOptionCreateRequest(); // BulkCustomFieldOptionCreateRequest | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    CustomFieldCreatedContextOptionsList result = apiInstance.createCustomFieldOption(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#createCustomFieldOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkCustomFieldOptionCreateRequest**](BulkCustomFieldOptionCreateRequest.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

[**CustomFieldCreatedContextOptionsList**](CustomFieldCreatedContextOptionsList.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomFieldOptions"></a>
# **createCustomFieldOptions**
> Object createCustomFieldOptions(body, fieldId)

Create custom field options

This operation is deprecated and becomes unavailable on 8 May 2021. Use [Create custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-post) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Creates options and, where the custom select field is of the type *Select List (cascading)*, cascading options for a custom select field. The options are added to the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
BulkCreateCustomFieldOptionRequest body = new BulkCreateCustomFieldOptionRequest(); // BulkCreateCustomFieldOptionRequest | 
Long fieldId = 789L; // Long | The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
try {
    Object result = apiInstance.createCustomFieldOptions(body, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#createCustomFieldOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkCreateCustomFieldOptionRequest**](BulkCreateCustomFieldOptionRequest.md)|  |
 **fieldId** | **Long**| The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomFieldOption"></a>
# **deleteCustomFieldOption**
> deleteCustomFieldOption(fieldId, contextId, optionId)

Delete custom field options (context)

Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context from which an option should be deleted.
Long optionId = 789L; // Long | The ID of the option to delete.
try {
    apiInstance.deleteCustomFieldOption(fieldId, contextId, optionId);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#deleteCustomFieldOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context from which an option should be deleted. |
 **optionId** | **Long**| The ID of the option to delete. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomFieldOption"></a>
# **getCustomFieldOption**
> CustomFieldOption getCustomFieldOption(id)

Get custom field option

This operation is deprecated and becomes unavailable on 8 May 2021. Use [Get custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-get) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
String id = "id_example"; // String | The ID of the custom field option.
try {
    CustomFieldOption result = apiInstance.getCustomFieldOption(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#getCustomFieldOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the custom field option. |

### Return type

[**CustomFieldOption**](CustomFieldOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOptionsForContext"></a>
# **getOptionsForContext**
> PageBeanCustomFieldContextOption getOptionsForContext(fieldId, contextId, optionId, onlyOptions, startAt, maxResults)

Get custom field options (context)

Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
Long optionId = 789L; // Long | The ID of the option.
Boolean onlyOptions = false; // Boolean | Whether only options are returned.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 100; // Integer | The maximum number of items to return per page.
try {
    PageBeanCustomFieldContextOption result = apiInstance.getOptionsForContext(fieldId, contextId, optionId, onlyOptions, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#getOptionsForContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |
 **optionId** | **Long**| The ID of the option. | [optional]
 **onlyOptions** | **Boolean**| Whether only options are returned. | [optional] [default to false]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanCustomFieldContextOption**](PageBeanCustomFieldContextOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOptionsForField"></a>
# **getOptionsForField**
> PageBeanCustomFieldOptionDetails getOptionsForField(fieldId, startAt, maxResults)

Get options for field

This operation is deprecated and becomes unavailable on 8 May 2021. Use [Get custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-get) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Returns a [paginated](#pagination) list of options and, where the custom select field is of the type *Select List (cascading)*, cascading options for custom select fields. Cascading options are included in the item count when determining pagination. Only options from the global context are returned.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
Long fieldId = 789L; // Long | The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 1000; // Integer | The maximum number of items to return per page.
try {
    PageBeanCustomFieldOptionDetails result = apiInstance.getOptionsForField(fieldId, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#getOptionsForField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **Long**| The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. |
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 1000]

### Return type

[**PageBeanCustomFieldOptionDetails**](PageBeanCustomFieldOptionDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reorderCustomFieldOptions"></a>
# **reorderCustomFieldOptions**
> Object reorderCustomFieldOptions(body, fieldId, contextId)

Reorder custom field options (context)

Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
OrderOfCustomFieldOptions body = new OrderOfCustomFieldOptions(); // OrderOfCustomFieldOptions | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    Object result = apiInstance.reorderCustomFieldOptions(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#reorderCustomFieldOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderOfCustomFieldOptions**](OrderOfCustomFieldOptions.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomFieldOption"></a>
# **updateCustomFieldOption**
> CustomFieldUpdatedContextOptionsList updateCustomFieldOption(body, fieldId, contextId)

Update custom field options (context)

Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren&#x27;t updated and aren&#x27;t reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
BulkCustomFieldOptionUpdateRequest body = new BulkCustomFieldOptionUpdateRequest(); // BulkCustomFieldOptionUpdateRequest | 
String fieldId = "fieldId_example"; // String | The ID of the custom field.
Long contextId = 789L; // Long | The ID of the context.
try {
    CustomFieldUpdatedContextOptionsList result = apiInstance.updateCustomFieldOption(body, fieldId, contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#updateCustomFieldOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkCustomFieldOptionUpdateRequest**](BulkCustomFieldOptionUpdateRequest.md)|  |
 **fieldId** | **String**| The ID of the custom field. |
 **contextId** | **Long**| The ID of the context. |

### Return type

[**CustomFieldUpdatedContextOptionsList**](CustomFieldUpdatedContextOptionsList.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomFieldOptions"></a>
# **updateCustomFieldOptions**
> Object updateCustomFieldOptions(body, fieldId)

Update custom field options

This operation is deprecated and becomes unavailable on 8 May 2021. Use [Update custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-put) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Updates the options on a custom select field. Where an updated option is in use on an issue, the value on the issue is also updated. Options that are not found are ignored. A maximum of 1000 options, including sub-options of *Select List (cascading)* fields, can be updated per request. The options are updated on the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueCustomFieldOptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueCustomFieldOptionsApi apiInstance = new IssueCustomFieldOptionsApi();
UpdateCustomFieldOption body = new UpdateCustomFieldOption(); // UpdateCustomFieldOption | 
Long fieldId = 789L; // Long | The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
try {
    Object result = apiInstance.updateCustomFieldOptions(body, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueCustomFieldOptionsApi#updateCustomFieldOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCustomFieldOption**](UpdateCustomFieldOption.md)|  |
 **fieldId** | **Long**| The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

