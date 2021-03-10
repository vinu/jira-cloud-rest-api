# JqlApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAutoComplete**](JqlApi.md#getAutoComplete) | **GET** /rest/api/3/jql/autocompletedata | Get field reference data
[**getFieldAutoCompleteForQueryString**](JqlApi.md#getFieldAutoCompleteForQueryString) | **GET** /rest/api/3/jql/autocompletedata/suggestions | Get field auto complete suggestions
[**migrateQueries**](JqlApi.md#migrateQueries) | **POST** /rest/api/3/jql/pdcleaner | Convert user identifiers to account IDs in JQL queries
[**parseJqlQueries**](JqlApi.md#parseJqlQueries) | **POST** /rest/api/3/jql/parse | Parse JQL query

<a name="getAutoComplete"></a>
# **getAutoComplete**
> JQLReferenceData getAutoComplete()

Get field reference data

Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.JqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JqlApi apiInstance = new JqlApi();
try {
    JQLReferenceData result = apiInstance.getAutoComplete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JqlApi#getAutoComplete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JQLReferenceData**](JQLReferenceData.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldAutoCompleteForQueryString"></a>
# **getFieldAutoCompleteForQueryString**
> AutoCompleteSuggestions getFieldAutoCompleteForQueryString(fieldName, fieldValue, predicateName, predicateValue)

Get field auto complete suggestions

Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.JqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JqlApi apiInstance = new JqlApi();
String fieldName = "fieldName_example"; // String | The name of the field.
String fieldValue = "fieldValue_example"; // String | The partial field item name entered by the user.
String predicateName = "predicateName_example"; // String | The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*.
String predicateValue = "predicateValue_example"; // String | The partial predicate item name entered by the user.
try {
    AutoCompleteSuggestions result = apiInstance.getFieldAutoCompleteForQueryString(fieldName, fieldValue, predicateName, predicateValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JqlApi#getFieldAutoCompleteForQueryString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldName** | **String**| The name of the field. | [optional]
 **fieldValue** | **String**| The partial field item name entered by the user. | [optional]
 **predicateName** | **String**| The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. | [optional]
 **predicateValue** | **String**| The partial predicate item name entered by the user. | [optional]

### Return type

[**AutoCompleteSuggestions**](AutoCompleteSuggestions.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="migrateQueries"></a>
# **migrateQueries**
> ConvertedJQLQueries migrateQueries(body)

Convert user identifiers to account IDs in JQL queries

Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.JqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JqlApi apiInstance = new JqlApi();
JQLPersonalDataMigrationRequest body = new JQLPersonalDataMigrationRequest(); // JQLPersonalDataMigrationRequest | 
try {
    ConvertedJQLQueries result = apiInstance.migrateQueries(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JqlApi#migrateQueries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JQLPersonalDataMigrationRequest**](JQLPersonalDataMigrationRequest.md)|  |

### Return type

[**ConvertedJQLQueries**](ConvertedJQLQueries.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="parseJqlQueries"></a>
# **parseJqlQueries**
> ParsedJqlQueries parseJqlQueries(body, validation)

Parse JQL query

Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.JqlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JqlApi apiInstance = new JqlApi();
JqlQueriesToParse body = new JqlQueriesToParse(); // JqlQueriesToParse | 
String validation = "strict"; // String | How to validate the JQL query and treat the validation results. Validation options include:   *  `strict` Returns all errors. If validation fails, the query structure is not returned.  *  `warn` Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  `none` No validation is performed. If JQL query is correctly formed, the query structure is returned.
try {
    ParsedJqlQueries result = apiInstance.parseJqlQueries(body, validation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JqlApi#parseJqlQueries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JqlQueriesToParse**](JqlQueriesToParse.md)|  |
 **validation** | **String**| How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned. | [optional] [default to strict] [enum: strict, warn, none]

### Return type

[**ParsedJqlQueries**](ParsedJqlQueries.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

