# AuditRecordsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuditRecords**](AuditRecordsApi.md#getAuditRecords) | **GET** /rest/api/3/auditing/record | Get audit records

<a name="getAuditRecords"></a>
# **getAuditRecords**
> AuditRecords getAuditRecords(offset, limit, filter, from, to)

Get audit records

Returns a list of audit records. The list can be filtered to include items:   *  containing a string in at least one field. For example, providing *up* will return all audit records where one or more fields contains words such as *update*.  *  created on or after a date and time.  *  created or or before a date and time.  *  created during a time period.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.AuditRecordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditRecordsApi apiInstance = new AuditRecordsApi();
Integer offset = 0; // Integer | The number of records to skip before returning the first result.
Integer limit = 1000; // Integer | The maximum number of results to return.
String filter = "filter_example"; // String | The query string.
OffsetDateTime from = new OffsetDateTime(); // OffsetDateTime | The date and time on or after which returned audit records must have been created. If `to` is provided `from` must be before `to` or no audit records are returned.
OffsetDateTime to = new OffsetDateTime(); // OffsetDateTime | The date and time on or before which returned audit results must have been created. If `from` is provided `to` must be after `from` or no audit records are returned.
try {
    AuditRecords result = apiInstance.getAuditRecords(offset, limit, filter, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditRecordsApi#getAuditRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| The number of records to skip before returning the first result. | [optional] [default to 0]
 **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 1000]
 **filter** | **String**| The query string. | [optional]
 **from** | **OffsetDateTime**| The date and time on or after which returned audit records must have been created. If &#x60;to&#x60; is provided &#x60;from&#x60; must be before &#x60;to&#x60; or no audit records are returned. | [optional]
 **to** | **OffsetDateTime**| The date and time on or before which returned audit results must have been created. If &#x60;from&#x60; is provided &#x60;to&#x60; must be after &#x60;from&#x60; or no audit records are returned. | [optional]

### Return type

[**AuditRecords**](AuditRecords.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

