# IssueNotificationSchemesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotificationScheme**](IssueNotificationSchemesApi.md#getNotificationScheme) | **GET** /rest/api/3/notificationscheme/{id} | Get notification scheme
[**getNotificationSchemes**](IssueNotificationSchemesApi.md#getNotificationSchemes) | **GET** /rest/api/3/notificationscheme | Get notification schemes paginated

<a name="getNotificationScheme"></a>
# **getNotificationScheme**
> NotificationScheme getNotificationScheme(id, expand)

Get notification scheme

Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with the notification scheme.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueNotificationSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueNotificationSchemesApi apiInstance = new IssueNotificationSchemesApi();
Long id = 789L; // Long | The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about any custom fields assigned to receive an event.  *  `group` Returns information about any groups assigned to receive an event.  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information.  *  `projectRole` Returns information about any project roles assigned to receive an event.  *  `user` Returns information about any users assigned to receive an event.
try {
    NotificationScheme result = apiInstance.getNotificationScheme(id, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueNotificationSchemesApi#getNotificationScheme");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs. |
 **expand** | **String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. | [optional]

### Return type

[**NotificationScheme**](NotificationScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationSchemes"></a>
# **getNotificationSchemes**
> PageBeanNotificationScheme getNotificationSchemes(startAt, maxResults, expand)

Get notification schemes paginated

Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by display name.  ### About notification schemes ###  A notification scheme is a list of events and recipients who will receive notifications for those events. The list is contained within the &#x60;notificationSchemeEvents&#x60; object and contains pairs of &#x60;events&#x60; and &#x60;notifications&#x60;:   *  &#x60;event&#x60; Identifies the type of event. The events can be [Jira system events](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or [custom events](https://confluence.atlassian.com/x/AIlKLg).  *  &#x60;notifications&#x60; Identifies the [recipients](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-recipientsRecipients) of notifications for each event. Recipients can be any of the following types:           *  &#x60;CurrentAssignee&#x60;      *  &#x60;Reporter&#x60;      *  &#x60;CurrentUser&#x60;      *  &#x60;ProjectLead&#x60;      *  &#x60;ComponentLead&#x60;      *  &#x60;User&#x60; (the &#x60;parameter&#x60; is the user key)      *  &#x60;Group&#x60; (the &#x60;parameter&#x60; is the group name)      *  &#x60;ProjectRole&#x60; (the &#x60;parameter&#x60; is the project role ID)      *  &#x60;EmailAddress&#x60;      *  &#x60;AllWatchers&#x60;      *  &#x60;UserCustomField&#x60; (the &#x60;parameter&#x60; is the ID of the custom field)      *  &#x60;GroupCustomField&#x60;(the &#x60;parameter&#x60; is the ID of the custom field)  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with a notification scheme for it to be returned.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueNotificationSchemesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueNotificationSchemesApi apiInstance = new IssueNotificationSchemesApi();
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about any custom fields assigned to receive an event.  *  `group` Returns information about any groups assigned to receive an event.  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information.  *  `projectRole` Returns information about any project roles assigned to receive an event.  *  `user` Returns information about any users assigned to receive an event.
try {
    PageBeanNotificationScheme result = apiInstance.getNotificationSchemes(startAt, maxResults, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueNotificationSchemesApi#getNotificationSchemes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **expand** | **String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. | [optional]

### Return type

[**PageBeanNotificationScheme**](PageBeanNotificationScheme.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

