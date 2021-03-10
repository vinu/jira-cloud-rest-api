# GroupsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserToGroup**](GroupsApi.md#addUserToGroup) | **POST** /rest/api/3/group/user | Add user to group
[**bulkGetGroups**](GroupsApi.md#bulkGetGroups) | **GET** /rest/api/3/group/bulk | Bulk get groups
[**createGroup**](GroupsApi.md#createGroup) | **POST** /rest/api/3/group | Create group
[**findGroups**](GroupsApi.md#findGroups) | **GET** /rest/api/3/groups/picker | Find groups
[**getGroup**](GroupsApi.md#getGroup) | **GET** /rest/api/3/group | Get group
[**getUsersFromGroup**](GroupsApi.md#getUsersFromGroup) | **GET** /rest/api/3/group/member | Get users from group
[**removeGroup**](GroupsApi.md#removeGroup) | **DELETE** /rest/api/3/group | Remove group
[**removeUserFromGroup**](GroupsApi.md#removeUserFromGroup) | **DELETE** /rest/api/3/group/user | Remove user from group

<a name="addUserToGroup"></a>
# **addUserToGroup**
> Group addUserToGroup(body, groupname)

Add user to group

Adds a user to a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
Map<String, Object> body = new Map(); // Map<String, Object> | The user to add to the group.
String groupname = "groupname_example"; // String | The name of the group (case sensitive).
try {
    Group result = apiInstance.addUserToGroup(body, groupname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#addUserToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)| The user to add to the group. |
 **groupname** | **String**| The name of the group (case sensitive). |

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bulkGetGroups"></a>
# **bulkGetGroups**
> PageBeanGroupDetails bulkGetGroups(startAt, maxResults, groupId, groupName)

Bulk get groups

Returns a [paginated](#pagination) list of groups.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
List<String> groupId = Arrays.asList("groupId_example"); // List<String> | The ID of a group. To specify multiple IDs, pass multiple `groupId` parameters. For example, `groupId=5b10a2844c20165700ede21g&groupId=5b10ac8d82e05b22cc7d4ef5`.
List<String> groupName = Arrays.asList("groupName_example"); // List<String> | The name of a group. To specify multiple names, pass multiple `groupName` parameters. For example, `groupName=administrators&groupName=jira-software-users`.
try {
    PageBeanGroupDetails result = apiInstance.bulkGetGroups(startAt, maxResults, groupId, groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#bulkGetGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **groupId** | [**List&lt;String&gt;**](String.md)| The ID of a group. To specify multiple IDs, pass multiple &#x60;groupId&#x60; parameters. For example, &#x60;groupId&#x3D;5b10a2844c20165700ede21g&amp;groupId&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;. | [optional]
 **groupName** | [**List&lt;String&gt;**](String.md)| The name of a group. To specify multiple names, pass multiple &#x60;groupName&#x60; parameters. For example, &#x60;groupName&#x3D;administrators&amp;groupName&#x3D;jira-software-users&#x60;. | [optional]

### Return type

[**PageBeanGroupDetails**](PageBeanGroupDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroup"></a>
# **createGroup**
> Group createGroup(body)

Create group

Creates a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
Map<String, Object> body = new Map(); // Map<String, Object> | The name of the group.
try {
    Group result = apiInstance.createGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)| The name of the group. |

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findGroups"></a>
# **findGroups**
> FoundGroups findGroups(accountId, query, exclude, maxResults, userName)

Find groups

Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.  The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the &#x60;html&#x60; field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.  The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String accountId = "accountId_example"; // String | This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-3-user-groups-get).
String query = "query_example"; // String | The string to find in group names.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, `exclude=group1&exclude=group2`.
Integer maxResults = 56; // Integer | The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property `jira.ajax.autocomplete.limit`.
String userName = "userName_example"; // String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    FoundGroups result = apiInstance.findGroups(accountId, query, exclude, maxResults, userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#findGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-3-user-groups-get). | [optional]
 **query** | **String**| The string to find in group names. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, &#x60;exclude&#x3D;group1&amp;exclude&#x3D;group2&#x60;. | [optional]
 **maxResults** | **Integer**| The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property &#x60;jira.ajax.autocomplete.limit&#x60;. | [optional]
 **userName** | **String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

[**FoundGroups**](FoundGroups.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroup"></a>
# **getGroup**
> Group getGroup(groupname, expand)

Get group

This operation is deprecated, use [&#x60;group/member&#x60;](#api-rest-api-3-group-member-get).  Returns all users in a group.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String groupname = "groupname_example"; // String | The name of the group.
String expand = "expand_example"; // String | List of fields to expand.
try {
    Group result = apiInstance.getGroup(groupname, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **String**| The name of the group. |
 **expand** | **String**| List of fields to expand. | [optional]

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersFromGroup"></a>
# **getUsersFromGroup**
> PageBeanUserDetails getUsersFromGroup(groupname, includeInactiveUsers, startAt, maxResults)

Get users from group

Returns a [paginated](#pagination) list of all users in a group.  Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String groupname = "groupname_example"; // String | The name of the group.
Boolean includeInactiveUsers = false; // Boolean | Include inactive users.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
try {
    PageBeanUserDetails result = apiInstance.getUsersFromGroup(groupname, includeInactiveUsers, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getUsersFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **String**| The name of the group. |
 **includeInactiveUsers** | **Boolean**| Include inactive users. | [optional] [default to false]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanUserDetails**](PageBeanUserDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeGroup"></a>
# **removeGroup**
> removeGroup(groupname, swapGroup)

Remove group

Deletes a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String groupname = "groupname_example"; // String | The name of the group.
String swapGroup = "swapGroup_example"; // String | The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion.
try {
    apiInstance.removeGroup(groupname, swapGroup);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#removeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **String**| The name of the group. |
 **swapGroup** | **String**| The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeUserFromGroup"></a>
# **removeUserFromGroup**
> removeUserFromGroup(groupname, accountId, username)

Remove user from group

Removes a user from a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GroupsApi apiInstance = new GroupsApi();
String groupname = "groupname_example"; // String | The name of the group.
String accountId = "accountId_example"; // String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
String username = "username_example"; // String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    apiInstance.removeUserFromGroup(groupname, accountId, username);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#removeUserFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **String**| The name of the group. |
 **accountId** | **String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. |
 **username** | **String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

