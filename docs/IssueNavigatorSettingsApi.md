# IssueNavigatorSettingsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssueNavigatorDefaultColumns**](IssueNavigatorSettingsApi.md#getIssueNavigatorDefaultColumns) | **GET** /rest/api/3/settings/columns | Get issue navigator default columns
[**setIssueNavigatorDefaultColumns**](IssueNavigatorSettingsApi.md#setIssueNavigatorDefaultColumns) | **PUT** /rest/api/3/settings/columns | Set issue navigator default columns

<a name="getIssueNavigatorDefaultColumns"></a>
# **getIssueNavigatorDefaultColumns**
> List&lt;ColumnItem&gt; getIssueNavigatorDefaultColumns()

Get issue navigator default columns

Returns the default issue navigator columns.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueNavigatorSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueNavigatorSettingsApi apiInstance = new IssueNavigatorSettingsApi();
try {
    List<ColumnItem> result = apiInstance.getIssueNavigatorDefaultColumns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueNavigatorSettingsApi#getIssueNavigatorDefaultColumns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ColumnItem&gt;**](ColumnItem.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setIssueNavigatorDefaultColumns"></a>
# **setIssueNavigatorDefaultColumns**
> Object setIssueNavigatorDefaultColumns(body)

Set issue navigator default columns

Sets the default issue navigator columns.  The &#x60;columns&#x60; parameter accepts a navigable field value and is expressed as HTML form data. To specify multiple columns, pass multiple &#x60;columns&#x60; parameters. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/settings/columns&#x60;  If no column details are sent, then all default columns are removed.  A navigable field is one that can be used as a column on the issue navigator. Find details of navigable issue columns using [Get fields](#api-rest-api-3-field-get).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueNavigatorSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueNavigatorSettingsApi apiInstance = new IssueNavigatorSettingsApi();
List<String> body = Arrays.asList("body_example"); // List<String> | A navigable field value.
try {
    Object result = apiInstance.setIssueNavigatorDefaultColumns(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueNavigatorSettingsApi#setIssueNavigatorDefaultColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)| A navigable field value. | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*, multipart/form-data
 - **Accept**: application/json

