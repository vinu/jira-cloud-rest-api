# DashboardsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyDashboard**](DashboardsApi.md#copyDashboard) | **POST** /rest/api/3/dashboard/{id}/copy | Copy dashboard
[**createDashboard**](DashboardsApi.md#createDashboard) | **POST** /rest/api/3/dashboard | Create dashboard
[**deleteDashboard**](DashboardsApi.md#deleteDashboard) | **DELETE** /rest/api/3/dashboard/{id} | Delete dashboard
[**deleteDashboardItemProperty**](DashboardsApi.md#deleteDashboardItemProperty) | **DELETE** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Delete dashboard item property
[**getAllDashboards**](DashboardsApi.md#getAllDashboards) | **GET** /rest/api/3/dashboard | Get all dashboards
[**getDashboard**](DashboardsApi.md#getDashboard) | **GET** /rest/api/3/dashboard/{id} | Get dashboard
[**getDashboardItemProperty**](DashboardsApi.md#getDashboardItemProperty) | **GET** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Get dashboard item property
[**getDashboardItemPropertyKeys**](DashboardsApi.md#getDashboardItemPropertyKeys) | **GET** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties | Get dashboard item property keys
[**getDashboardsPaginated**](DashboardsApi.md#getDashboardsPaginated) | **GET** /rest/api/3/dashboard/search | Search for dashboards
[**setDashboardItemProperty**](DashboardsApi.md#setDashboardItemProperty) | **PUT** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Set dashboard item property
[**updateDashboard**](DashboardsApi.md#updateDashboard) | **PUT** /rest/api/3/dashboard/{id} | Update dashboard

<a name="copyDashboard"></a>
# **copyDashboard**
> Dashboard copyDashboard(body, id)

Copy dashboard

Copies a dashboard. Any values provided in the &#x60;dashboard&#x60; parameter replace those in the copied dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be copied must be owned by or shared with the user.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
DashboardDetails body = new DashboardDetails(); // DashboardDetails | Dashboard details.
String id = "id_example"; // String | 
try {
    Dashboard result = apiInstance.copyDashboard(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#copyDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardDetails**](DashboardDetails.md)| Dashboard details. |
 **id** | **String**|  |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDashboard"></a>
# **createDashboard**
> Dashboard createDashboard(body)

Create dashboard

Creates a dashboard.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
DashboardDetails body = new DashboardDetails(); // DashboardDetails | Dashboard details.
try {
    Dashboard result = apiInstance.createDashboard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#createDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardDetails**](DashboardDetails.md)| Dashboard details. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDashboard"></a>
# **deleteDashboard**
> deleteDashboard(id)

Delete dashboard

Deletes a dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be deleted must be owned by the user.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
String id = "id_example"; // String | The ID of the dashboard.
try {
    apiInstance.deleteDashboard(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#deleteDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the dashboard. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDashboardItemProperty"></a>
# **deleteDashboardItemProperty**
> deleteDashboardItemProperty(dashboardId, itemId, propertyKey)

Delete dashboard item property

Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
String dashboardId = "dashboardId_example"; // String | The ID of the dashboard.
String itemId = "itemId_example"; // String | The ID of the dashboard item.
String propertyKey = "propertyKey_example"; // String | The key of the dashboard item property.
try {
    apiInstance.deleteDashboardItemProperty(dashboardId, itemId, propertyKey);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#deleteDashboardItemProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| The ID of the dashboard. |
 **itemId** | **String**| The ID of the dashboard item. |
 **propertyKey** | **String**| The key of the dashboard item property. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllDashboards"></a>
# **getAllDashboards**
> PageOfDashboards getAllDashboards(filter, startAt, maxResults)

Get all dashboards

Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
String filter = "filter_example"; // String | The filter applied to the list of dashboards. Valid values are:   *  `favourite` Returns dashboards the user has marked as favorite.  *  `my` Returns dashboards owned by the user.
Integer startAt = 0; // Integer | The index of the first item to return in a page of results (page offset).
Integer maxResults = 20; // Integer | The maximum number of items to return per page.
try {
    PageOfDashboards result = apiInstance.getAllDashboards(filter, startAt, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#getAllDashboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| The filter applied to the list of dashboards. Valid values are:   *  &#x60;favourite&#x60; Returns dashboards the user has marked as favorite.  *  &#x60;my&#x60; Returns dashboards owned by the user. | [optional] [enum: my, favourite]
 **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 20]

### Return type

[**PageOfDashboards**](PageOfDashboards.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDashboard"></a>
# **getDashboard**
> Dashboard getDashboard(id)

Get dashboard

Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
String id = "id_example"; // String | The ID of the dashboard.
try {
    Dashboard result = apiInstance.getDashboard(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#getDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the dashboard. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDashboardItemProperty"></a>
# **getDashboardItemProperty**
> EntityProperty getDashboardItemProperty(dashboardId, itemId, propertyKey)

Get dashboard item property

Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#x27;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or be shared the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
String dashboardId = "dashboardId_example"; // String | The ID of the dashboard.
String itemId = "itemId_example"; // String | The ID of the dashboard item.
String propertyKey = "propertyKey_example"; // String | The key of the dashboard item property.
try {
    EntityProperty result = apiInstance.getDashboardItemProperty(dashboardId, itemId, propertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#getDashboardItemProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| The ID of the dashboard. |
 **itemId** | **String**| The ID of the dashboard item. |
 **propertyKey** | **String**| The key of the dashboard item property. |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDashboardItemPropertyKeys"></a>
# **getDashboardItemPropertyKeys**
> PropertyKeys getDashboardItemPropertyKeys(dashboardId, itemId)

Get dashboard item property keys

Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or be shared the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
String dashboardId = "dashboardId_example"; // String | The ID of the dashboard.
String itemId = "itemId_example"; // String | The ID of the dashboard item.
try {
    PropertyKeys result = apiInstance.getDashboardItemPropertyKeys(dashboardId, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#getDashboardItemPropertyKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **String**| The ID of the dashboard. |
 **itemId** | **String**| The ID of the dashboard item. |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDashboardsPaginated"></a>
# **getDashboardsPaginated**
> PageBeanDashboard getDashboardsPaginated(dashboardName, accountId, owner, groupname, projectId, orderBy, startAt, maxResults, expand)

Search for dashboards

Returns a [paginated](#pagination) list of dashboards. This operation is similar to [Get dashboards](#api-rest-api-3-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
String dashboardName = "dashboardName_example"; // String | String used to perform a case-insensitive partial match with `name`.
String accountId = "accountId_example"; // String | User account ID used to return dashboards with the matching `owner.accountId`. This parameter cannot be used with the `owner` parameter.
String owner = "owner_example"; // String | This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching `owner.name`. This parameter cannot be used with the `accountId` parameter.
String groupname = "groupname_example"; // String | Group name used to returns dashboards that are shared with a group that matches `sharePermissions.group.name`.
Long projectId = 789L; // Long | Project ID used to returns dashboards that are shared with a project that matches `sharePermissions.project.id`.
String orderBy = "name"; // String | [Order](#ordering) the results by a field:   *  `description` Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  `favourite_count` Sorts by dashboard popularity.  *  `id` Sorts by dashboard ID.  *  `is_favourite` Sorts by whether the dashboard is marked as a favorite.  *  `name` Sorts by dashboard name.  *  `owner` Sorts by dashboard owner name.
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  `description` Returns the description of the dashboard.  *  `owner` Returns the owner of the dashboard.  *  `viewUrl` Returns the URL that is used to view the dashboard.  *  `favourite` Returns `isFavourite`, an indicator of whether the user has set the dashboard as a favorite.  *  `favouritedCount` Returns `popularity`, a count of how many users have set this dashboard as a favorite.  *  `sharePermissions` Returns details of the share permissions defined for the dashboard.
try {
    PageBeanDashboard result = apiInstance.getDashboardsPaginated(dashboardName, accountId, owner, groupname, projectId, orderBy, startAt, maxResults, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#getDashboardsPaginated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardName** | **String**| String used to perform a case-insensitive partial match with &#x60;name&#x60;. | [optional]
 **accountId** | **String**| User account ID used to return dashboards with the matching &#x60;owner.accountId&#x60;. This parameter cannot be used with the &#x60;owner&#x60; parameter. | [optional]
 **owner** | **String**| This parameter is deprecated because of privacy changes. Use &#x60;accountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching &#x60;owner.name&#x60;. This parameter cannot be used with the &#x60;accountId&#x60; parameter. | [optional]
 **groupname** | **String**| Group name used to returns dashboards that are shared with a group that matches &#x60;sharePermissions.group.name&#x60;. | [optional]
 **projectId** | **Long**| Project ID used to returns dashboards that are shared with a project that matches &#x60;sharePermissions.project.id&#x60;. | [optional]
 **orderBy** | **String**| [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  &#x60;favourite_count&#x60; Sorts by dashboard popularity.  *  &#x60;id&#x60; Sorts by dashboard ID.  *  &#x60;is_favourite&#x60; Sorts by whether the dashboard is marked as a favorite.  *  &#x60;name&#x60; Sorts by dashboard name.  *  &#x60;owner&#x60; Sorts by dashboard owner name. | [optional] [default to name] [enum: description, -description, +description, favorite_count, -favorite_count, +favorite_count, id, -id, +id, is_favorite, -is_favorite, +is_favorite, name, -name, +name, owner, -owner, +owner]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **expand** | **String**| Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;description&#x60; Returns the description of the dashboard.  *  &#x60;owner&#x60; Returns the owner of the dashboard.  *  &#x60;viewUrl&#x60; Returns the URL that is used to view the dashboard.  *  &#x60;favourite&#x60; Returns &#x60;isFavourite&#x60;, an indicator of whether the user has set the dashboard as a favorite.  *  &#x60;favouritedCount&#x60; Returns &#x60;popularity&#x60;, a count of how many users have set this dashboard as a favorite.  *  &#x60;sharePermissions&#x60; Returns details of the share permissions defined for the dashboard. | [optional]

### Return type

[**PageBeanDashboard**](PageBeanDashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setDashboardItemProperty"></a>
# **setDashboardItemProperty**
> Object setDashboardItemProperty(body, dashboardId, itemId, propertyKey)

Set dashboard item property

Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#x27;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
Object body = null; // Object | 
String dashboardId = "dashboardId_example"; // String | The ID of the dashboard.
String itemId = "itemId_example"; // String | The ID of the dashboard item.
String propertyKey = "propertyKey_example"; // String | The key of the dashboard item property. The maximum length is 255 characters.
try {
    Object result = apiInstance.setDashboardItemProperty(body, dashboardId, itemId, propertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#setDashboardItemProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **dashboardId** | **String**| The ID of the dashboard. |
 **itemId** | **String**| The ID of the dashboard item. |
 **propertyKey** | **String**| The key of the dashboard item property. The maximum length is 255 characters. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDashboard"></a>
# **updateDashboard**
> Dashboard updateDashboard(body, id)

Update dashboard

Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](#permissions) required:** None  The dashboard to be updated must be owned by the user.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DashboardsApi apiInstance = new DashboardsApi();
DashboardDetails body = new DashboardDetails(); // DashboardDetails | Replacement dashboard details.
String id = "id_example"; // String | The ID of the dashboard to update.
try {
    Dashboard result = apiInstance.updateDashboard(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#updateDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardDetails**](DashboardDetails.md)| Replacement dashboard details. |
 **id** | **String**| The ID of the dashboard to update. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

