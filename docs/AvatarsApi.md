# AvatarsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAvatar**](AvatarsApi.md#deleteAvatar) | **DELETE** /rest/api/3/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id} | Delete avatar
[**getAllSystemAvatars**](AvatarsApi.md#getAllSystemAvatars) | **GET** /rest/api/3/avatar/{type}/system | Get system avatars by type
[**getAvatars**](AvatarsApi.md#getAvatars) | **GET** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Get avatars
[**storeAvatar**](AvatarsApi.md#storeAvatar) | **POST** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Load avatar

<a name="deleteAvatar"></a>
# **deleteAvatar**
> deleteAvatar(type, owningObjectId, id)

Delete avatar

Deletes an avatar from a project or issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.AvatarsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AvatarsApi apiInstance = new AvatarsApi();
String type = "type_example"; // String | The avatar type.
String owningObjectId = "owningObjectId_example"; // String | The ID of the item the avatar is associated with.
Long id = 789L; // Long | The ID of the avatar.
try {
    apiInstance.deleteAvatar(type, owningObjectId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarsApi#deleteAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The avatar type. | [enum: project, issuetype]
 **owningObjectId** | **String**| The ID of the item the avatar is associated with. |
 **id** | **Long**| The ID of the avatar. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllSystemAvatars"></a>
# **getAllSystemAvatars**
> SystemAvatars getAllSystemAvatars(type)

Get system avatars by type

Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.AvatarsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AvatarsApi apiInstance = new AvatarsApi();
String type = "type_example"; // String | The avatar type.
try {
    SystemAvatars result = apiInstance.getAllSystemAvatars(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarsApi#getAllSystemAvatars");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The avatar type. | [enum: issuetype, project, user]

### Return type

[**SystemAvatars**](SystemAvatars.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAvatars"></a>
# **getAvatars**
> Avatars getAvatars(type, entityId)

Get avatars

Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.AvatarsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AvatarsApi apiInstance = new AvatarsApi();
String type = "type_example"; // String | The avatar type.
String entityId = "entityId_example"; // String | The ID of the item the avatar is associated with.
try {
    Avatars result = apiInstance.getAvatars(type, entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarsApi#getAvatars");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The avatar type. | [enum: project, issuetype]
 **entityId** | **String**| The ID of the item the avatar is associated with. |

### Return type

[**Avatars**](Avatars.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeAvatar"></a>
# **storeAvatar**
> Avatar storeAvatar(body, size, type, entityId, x, y)

Load avatar

Loads a custom avatar for a project or issue type.  Specify the avatar&#x27;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#x27;X-Atlassian-Token: no-check&#x27; &#x60;  &#x60;--header &#x27;Content-Type: image/&lt; image_type&gt;&#x27; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#x27;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#x27;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#x27;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#x27;s displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#x27;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.AvatarsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AvatarsApi apiInstance = new AvatarsApi();
Object body = null; // Object | 
Integer size = 56; // Integer | The length of each side of the crop region.
String type = "type_example"; // String | The avatar type.
String entityId = "entityId_example"; // String | The ID of the item the avatar is associated with.
Integer x = 0; // Integer | The X coordinate of the top-left corner of the crop region.
Integer y = 0; // Integer | The Y coordinate of the top-left corner of the crop region.
try {
    Avatar result = apiInstance.storeAvatar(body, size, type, entityId, x, y);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvatarsApi#storeAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **size** | **Integer**| The length of each side of the crop region. |
 **type** | **String**| The avatar type. | [enum: project, issuetype]
 **entityId** | **String**| The ID of the item the avatar is associated with. |
 **x** | **Integer**| The X coordinate of the top-left corner of the crop region. | [optional] [default to 0]
 **y** | **Integer**| The Y coordinate of the top-left corner of the crop region. | [optional] [default to 0]

### Return type

[**Avatar**](Avatar.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

