# PermissionsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllPermissions**](PermissionsApi.md#getAllPermissions) | **GET** /rest/api/3/permissions | Get all permissions
[**getBulkPermissions**](PermissionsApi.md#getBulkPermissions) | **POST** /rest/api/3/permissions/check | Get bulk permissions
[**getMyPermissions**](PermissionsApi.md#getMyPermissions) | **GET** /rest/api/3/mypermissions | Get my permissions
[**getPermittedProjects**](PermissionsApi.md#getPermittedProjects) | **POST** /rest/api/3/permissions/project | Get permitted projects

<a name="getAllPermissions"></a>
# **getAllPermissions**
> Permissions getAllPermissions()

Get all permissions

Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PermissionsApi apiInstance = new PermissionsApi();
try {
    Permissions result = apiInstance.getAllPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getAllPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Permissions**](Permissions.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkPermissions"></a>
# **getBulkPermissions**
> BulkPermissionGrants getBulkPermissions(body)

Get bulk permissions

Returns:   *  for a list of global permissions, the global permissions granted to a user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.  If no account ID is provided, the operation returns details for the logged in user.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  *  globalPermissions, projectPermissions, projects, permissions, issues having null values in the input are ignored.  *  globalPermissions, permissions having blank string values in the input are ignored  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn&#x27;t apply to calls made using AP.request() in a browser.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PermissionsApi apiInstance = new PermissionsApi();
BulkPermissionsRequestBean body = new BulkPermissionsRequestBean(); // BulkPermissionsRequestBean | Details of the permissions to check.
try {
    BulkPermissionGrants result = apiInstance.getBulkPermissions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getBulkPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkPermissionsRequestBean**](BulkPermissionsRequestBean.md)| Details of the permissions to check. |

### Return type

[**BulkPermissionGrants**](BulkPermissionGrants.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMyPermissions"></a>
# **getMyPermissions**
> Permissions getMyPermissions(projectKey, projectId, issueKey, issueId, permissions, projectUuid, projectConfigurationUuid)

Get my permissions

Returns a list of permissions indicating which permissions the user has. Details of the user&#x27;s permissions can be obtained in a global, project, or issue context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission&#x27;s criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PermissionsApi apiInstance = new PermissionsApi();
String projectKey = "projectKey_example"; // String | The key of project. Ignored if `projectId` is provided.
String projectId = "projectId_example"; // String | The ID of project.
String issueKey = "issueKey_example"; // String | The key of the issue. Ignored if `issueId` is provided.
String issueId = "issueId_example"; // String | The ID of the issue.
String permissions = "permissions_example"; // String | A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get).
String projectUuid = "projectUuid_example"; // String | 
String projectConfigurationUuid = "projectConfigurationUuid_example"; // String | 
try {
    Permissions result = apiInstance.getMyPermissions(projectKey, projectId, issueKey, issueId, permissions, projectUuid, projectConfigurationUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getMyPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKey** | **String**| The key of project. Ignored if &#x60;projectId&#x60; is provided. | [optional]
 **projectId** | **String**| The ID of project. | [optional]
 **issueKey** | **String**| The key of the issue. Ignored if &#x60;issueId&#x60; is provided. | [optional]
 **issueId** | **String**| The ID of the issue. | [optional]
 **permissions** | **String**| A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get). | [optional]
 **projectUuid** | **String**|  | [optional]
 **projectConfigurationUuid** | **String**|  | [optional]

### Return type

[**Permissions**](Permissions.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPermittedProjects"></a>
# **getPermittedProjects**
> PermittedProjects getPermittedProjects(body)

Get permitted projects

Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PermissionsApi apiInstance = new PermissionsApi();
PermissionsKeysBean body = new PermissionsKeysBean(); // PermissionsKeysBean | 
try {
    PermittedProjects result = apiInstance.getPermittedProjects(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getPermittedProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionsKeysBean**](PermissionsKeysBean.md)|  |

### Return type

[**PermittedProjects**](PermittedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

