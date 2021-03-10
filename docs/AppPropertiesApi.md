# AppPropertiesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonPropertiesResourceDeleteAddonPropertyDelete**](AppPropertiesApi.md#addonPropertiesResourceDeleteAddonPropertyDelete) | **DELETE** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Delete app property
[**addonPropertiesResourceGetAddonPropertiesGet**](AppPropertiesApi.md#addonPropertiesResourceGetAddonPropertiesGet) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties | Get app properties
[**addonPropertiesResourceGetAddonPropertyGet**](AppPropertiesApi.md#addonPropertiesResourceGetAddonPropertyGet) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Get app property
[**addonPropertiesResourcePutAddonPropertyPut**](AppPropertiesApi.md#addonPropertiesResourcePutAddonPropertyPut) | **PUT** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Set app property

<a name="addonPropertiesResourceDeleteAddonPropertyDelete"></a>
# **addonPropertiesResourceDeleteAddonPropertyDelete**
> addonPropertiesResourceDeleteAddonPropertyDelete(addonKey, propertyKey)

Delete app property

Deletes an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.api.AppPropertiesApi;


AppPropertiesApi apiInstance = new AppPropertiesApi();
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    apiInstance.addonPropertiesResourceDeleteAddonPropertyDelete(addonKey, propertyKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourceDeleteAddonPropertyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **String**| The key of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourceGetAddonPropertiesGet"></a>
# **addonPropertiesResourceGetAddonPropertiesGet**
> PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(addonKey)

Get app properties

Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.api.AppPropertiesApi;


AppPropertiesApi apiInstance = new AppPropertiesApi();
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
try {
    PropertyKeys result = apiInstance.addonPropertiesResourceGetAddonPropertiesGet(addonKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertiesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourceGetAddonPropertyGet"></a>
# **addonPropertiesResourceGetAddonPropertyGet**
> EntityProperty addonPropertiesResourceGetAddonPropertyGet(addonKey, propertyKey)

Get app property

Returns the key and value of an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.api.AppPropertiesApi;


AppPropertiesApi apiInstance = new AppPropertiesApi();
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    EntityProperty result = apiInstance.addonPropertiesResourceGetAddonPropertyGet(addonKey, propertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **String**| The key of the property. |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourcePutAddonPropertyPut"></a>
# **addonPropertiesResourcePutAddonPropertyPut**
> OperationMessage addonPropertiesResourcePutAddonPropertyPut(body, addonKey, propertyKey)

Set app property

Sets the value of an app&#x27;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.api.AppPropertiesApi;


AppPropertiesApi apiInstance = new AppPropertiesApi();
Object body = null; // Object | 
String addonKey = "addonKey_example"; // String | The key of the app, as defined in its descriptor.
String propertyKey = "propertyKey_example"; // String | The key of the property.
try {
    OperationMessage result = apiInstance.addonPropertiesResourcePutAddonPropertyPut(body, addonKey, propertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPropertiesApi#addonPropertiesResourcePutAddonPropertyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **addonKey** | **String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **String**| The key of the property. |

### Return type

[**OperationMessage**](OperationMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

