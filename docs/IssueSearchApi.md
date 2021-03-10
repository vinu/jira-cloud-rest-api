# IssueSearchApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssuePickerResource**](IssueSearchApi.md#getIssuePickerResource) | **GET** /rest/api/3/issue/picker | Get issue picker suggestions
[**matchIssues**](IssueSearchApi.md#matchIssues) | **POST** /rest/api/3/jql/match | Check issues against JQL
[**searchForIssuesUsingJql**](IssueSearchApi.md#searchForIssuesUsingJql) | **GET** /rest/api/3/search | Search for issues using JQL (GET)
[**searchForIssuesUsingJqlPost**](IssueSearchApi.md#searchForIssuesUsingJqlPost) | **POST** /rest/api/3/search | Search for issues using JQL (POST)

<a name="getIssuePickerResource"></a>
# **getIssuePickerResource**
> IssuePickerSuggestions getIssuePickerResource(query, currentJQL, currentIssueKey, currentProjectId, showSubTasks, showSubTaskParent)

Get issue picker suggestions

Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.  This operation returns two lists:   *  &#x60;History Search&#x60; which includes issues from the user&#x27;s history of created, edited, or viewed issues that contain the string in the &#x60;query&#x60; parameter.  *  &#x60;Current Search&#x60; which includes issues that match the JQL expression in &#x60;currentJQL&#x60; and contain the string in the &#x60;query&#x60; parameter.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueSearchApi apiInstance = new IssueSearchApi();
String query = "query_example"; // String | A string to match against text fields in the issue such as title, description, or comments.
String currentJQL = "currentJQL_example"; // String | A JQL query defining a list of issues to search for the query term. Note that `username` and `userkey` cannot be used as search terms for this parameter, due to privacy reasons. Use `accountId` instead.
String currentIssueKey = "currentIssueKey_example"; // String | The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query.
String currentProjectId = "currentProjectId_example"; // String | The ID of a project that suggested issues must belong to.
Boolean showSubTasks = true; // Boolean | Indicate whether to include subtasks in the suggestions list.
Boolean showSubTaskParent = true; // Boolean | When `currentIssueKey` is a subtask, whether to include the parent issue in the suggestions if it matches the query.
try {
    IssuePickerSuggestions result = apiInstance.getIssuePickerResource(query, currentJQL, currentIssueKey, currentProjectId, showSubTasks, showSubTaskParent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSearchApi#getIssuePickerResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| A string to match against text fields in the issue such as title, description, or comments. | [optional]
 **currentJQL** | **String**| A JQL query defining a list of issues to search for the query term. Note that &#x60;username&#x60; and &#x60;userkey&#x60; cannot be used as search terms for this parameter, due to privacy reasons. Use &#x60;accountId&#x60; instead. | [optional]
 **currentIssueKey** | **String**| The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query. | [optional]
 **currentProjectId** | **String**| The ID of a project that suggested issues must belong to. | [optional]
 **showSubTasks** | **Boolean**| Indicate whether to include subtasks in the suggestions list. | [optional]
 **showSubTaskParent** | **Boolean**| When &#x60;currentIssueKey&#x60; is a subtask, whether to include the parent issue in the suggestions if it matches the query. | [optional]

### Return type

[**IssuePickerSuggestions**](IssuePickerSuggestions.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchIssues"></a>
# **matchIssues**
> IssueMatches matchIssues(body)

Check issues against JQL

Checks whether one or more issues would be returned by one or more JQL queries.  **[Permissions](#permissions) required:** None, however, issues are only matched against JQL queries where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueSearchApi apiInstance = new IssueSearchApi();
IssuesAndJQLQueries body = new IssuesAndJQLQueries(); // IssuesAndJQLQueries | 
try {
    IssueMatches result = apiInstance.matchIssues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSearchApi#matchIssues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssuesAndJQLQueries**](IssuesAndJQLQueries.md)|  |

### Return type

[**IssueMatches**](IssueMatches.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchForIssuesUsingJql"></a>
# **searchForIssuesUsingJql**
> SearchResults searchForIssuesUsingJql(jql, startAt, maxResults, validateQuery, fields, expand, properties, fieldsByKeys)

Search for issues using JQL (GET)

Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  If the JQL query expression is too large to be encoded as a query parameter, use the [POST](#api-rest-api-3-search-post) version of this resource.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueSearchApi apiInstance = new IssueSearchApi();
String jql = "jql_example"; // String | The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  `username` and `userkey` cannot be used as search terms due to privacy reasons. Use `accountId` instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.
Integer startAt = 0; // Integer | The index of the first item to return in a page of results (page offset).
Integer maxResults = 50; // Integer | The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting `id` or `key` only.
String validateQuery = "strict"; // String | Determines how to validate the JQL query and treat the validation results. Supported values are:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  `summary,comment` Returns only the summary and comments fields.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  This parameter may be specified multiple times. For example, `fields=field1,field2&fields=field3`.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
List<String> properties = Arrays.asList("properties_example"); // List<String> | A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, `properties=prop1,prop2&properties=prop3`. A maximum of 5 issue property keys can be specified.
Boolean fieldsByKeys = false; // Boolean | Reference fields by their key (rather than ID).
try {
    SearchResults result = apiInstance.searchForIssuesUsingJql(jql, startAt, maxResults, validateQuery, fields, expand, properties, fieldsByKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSearchApi#searchForIssuesUsingJql");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jql** | **String**| The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  &#x60;username&#x60; and &#x60;userkey&#x60; cannot be used as search terms due to privacy reasons. Use &#x60;accountId&#x60; instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required. | [optional]
 **startAt** | **Integer**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting &#x60;id&#x60; or &#x60;key&#x60; only. | [optional] [default to 50]
 **validateQuery** | **String**| Determines how to validate the JQL query and treat the validation results. Supported values are:   *  &#x60;strict&#x60; Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  &#x60;warn&#x60; Returns all errors as warnings.  *  &#x60;none&#x60; No validation is performed.  *  &#x60;true&#x60; *Deprecated* A legacy synonym for &#x60;strict&#x60;.  *  &#x60;false&#x60; *Deprecated* A legacy synonym for &#x60;warn&#x60;.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the &#x60;validateQuery&#x60; value. | [optional] [default to strict] [enum: strict, warn, none, true, false]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all navigable (default) fields except description.  *  &#x60;*all,-comment&#x60; Returns all fields except comments.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp;fields&#x3D;field3&#x60;.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields. | [optional]
 **expand** | **String**| Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;operations&#x60; Returns all possible operations for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Instead of &#x60;fields&#x60;, returns &#x60;versionedRepresentations&#x60; a JSON array containing each version of a field&#x27;s value, with the highest numbered item representing the most recent version. | [optional]
 **properties** | [**List&lt;String&gt;**](String.md)| A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, &#x60;properties&#x3D;prop1,prop2&amp;properties&#x3D;prop3&#x60;. A maximum of 5 issue property keys can be specified. | [optional]
 **fieldsByKeys** | **Boolean**| Reference fields by their key (rather than ID). | [optional] [default to false]

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchForIssuesUsingJqlPost"></a>
# **searchForIssuesUsingJqlPost**
> SearchResults searchForIssuesUsingJqlPost(body)

Search for issues using JQL (POST)

Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  There is a [GET](#api-rest-api-3-search-get) version of this resource that can be used for smaller JQL query expressions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueSearchApi apiInstance = new IssueSearchApi();
SearchRequestBean body = new SearchRequestBean(); // SearchRequestBean | A JSON object containing the search request.
try {
    SearchResults result = apiInstance.searchForIssuesUsingJqlPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSearchApi#searchForIssuesUsingJqlPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequestBean**](SearchRequestBean.md)| A JSON object containing the search request. |

### Return type

[**SearchResults**](SearchResults.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

