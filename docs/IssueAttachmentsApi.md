# IssueAttachmentsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAttachment**](IssueAttachmentsApi.md#addAttachment) | **POST** /rest/api/3/issue/{issueIdOrKey}/attachments | Add attachment
[**expandAttachmentForHumans**](IssueAttachmentsApi.md#expandAttachmentForHumans) | **GET** /rest/api/3/attachment/{id}/expand/human | Get all metadata for an expanded attachment
[**expandAttachmentForMachines**](IssueAttachmentsApi.md#expandAttachmentForMachines) | **GET** /rest/api/3/attachment/{id}/expand/raw | Get contents metadata for an expanded attachment
[**getAttachment**](IssueAttachmentsApi.md#getAttachment) | **GET** /rest/api/3/attachment/{id} | Get attachment metadata
[**getAttachmentMeta**](IssueAttachmentsApi.md#getAttachmentMeta) | **GET** /rest/api/3/attachment/meta | Get Jira attachment settings
[**removeAttachment**](IssueAttachmentsApi.md#removeAttachment) | **DELETE** /rest/api/3/attachment/{id} | Delete attachment

<a name="addAttachment"></a>
# **addAttachment**
> List&lt;Attachment&gt; addAttachment(issueIdOrKey)

Add attachment

Adds one or more attachments to an issue. Attachments are posted as multipart/form-data ([RFC 1867](https://www.ietf.org/rfc/rfc1867.txt)).  Note that:   *  The request must have a &#x60;X-Atlassian-Token: no-check&#x60; header, if not it is blocked. See [Special headers](#special-request-headers) for more information.  *  The name of the multipart/form-data parameter that contains the attachments must be &#x60;file&#x60;.  The following example uploads a file called *myfile.txt* to the issue *TEST-123*:  &#x60;curl -D- -u admin:admin -X POST -H \&quot;X-Atlassian-Token: no-check\&quot; -F \&quot;file&#x3D;@myfile.txt\&quot; https://your-domain.atlassian.net/rest/api/3/issue/TEST-123/attachments&#x60;  Tip: Use a client library. Many client libraries have classes for handling multipart POST operations. For example, in Java, the Apache HTTP Components library provides a [MultiPartEntity](http://hc.apache.org/httpcomponents-client-ga/httpmime/apidocs/org/apache/http/entity/mime/MultipartEntity.html) class for multipart POST operations.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**    *  *Browse Projects* and *Create attachments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueAttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueAttachmentsApi apiInstance = new IssueAttachmentsApi();
String issueIdOrKey = "issueIdOrKey_example"; // String | The ID or key of the issue that attachments are added to.
try {
    List<Attachment> result = apiInstance.addAttachment(issueIdOrKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentsApi#addAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **String**| The ID or key of the issue that attachments are added to. |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="expandAttachmentForHumans"></a>
# **expandAttachmentForHumans**
> AttachmentArchiveMetadataReadable expandAttachmentForHumans(id)

Get all metadata for an expanded attachment

Returns the metadata for the contents of an attachment, if it is an archive, and metadata for the attachment itself. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned and metadata for the ZIP archive. Currently, only the ZIP archive format is supported.  Use this operation to retrieve data that is presented to the user, as this operation returns the metadata for the attachment itself, such as the attachment&#x27;s ID and name. Otherwise, use [ Get contents metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-raw-get), which only returns the metadata for the attachment&#x27;s contents.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueAttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueAttachmentsApi apiInstance = new IssueAttachmentsApi();
String id = "id_example"; // String | The ID of the attachment.
try {
    AttachmentArchiveMetadataReadable result = apiInstance.expandAttachmentForHumans(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentsApi#expandAttachmentForHumans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the attachment. |

### Return type

[**AttachmentArchiveMetadataReadable**](AttachmentArchiveMetadataReadable.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="expandAttachmentForMachines"></a>
# **expandAttachmentForMachines**
> AttachmentArchiveImpl expandAttachmentForMachines(id)

Get contents metadata for an expanded attachment

Returns the metadata for the contents of an attachment, if it is an archive. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned. Currently, only the ZIP archive format is supported.  Use this operation if you are processing the data without presenting it to the user, as this operation only returns the metadata for the contents of the attachment. Otherwise, to retrieve data to present to the user, use [ Get all metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-human-get) which also returns the metadata for the attachment itself, such as the attachment&#x27;s ID and name.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueAttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueAttachmentsApi apiInstance = new IssueAttachmentsApi();
String id = "id_example"; // String | The ID of the attachment.
try {
    AttachmentArchiveImpl result = apiInstance.expandAttachmentForMachines(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentsApi#expandAttachmentForMachines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the attachment. |

### Return type

[**AttachmentArchiveImpl**](AttachmentArchiveImpl.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachment"></a>
# **getAttachment**
> AttachmentMetadata getAttachment(id)

Get attachment metadata

Returns the metadata for an attachment. Note that the attachment itself is not returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueAttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueAttachmentsApi apiInstance = new IssueAttachmentsApi();
String id = "id_example"; // String | The ID of the attachment.
try {
    AttachmentMetadata result = apiInstance.getAttachment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentsApi#getAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the attachment. |

### Return type

[**AttachmentMetadata**](AttachmentMetadata.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachmentMeta"></a>
# **getAttachmentMeta**
> AttachmentSettings getAttachmentMeta()

Get Jira attachment settings

Returns the attachment settings, that is, whether attachments are enabled and the maximum attachment size allowed.  Note that there are also [project permissions](https://confluence.atlassian.com/x/yodKLg) that restrict whether users can create and delete attachments.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueAttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueAttachmentsApi apiInstance = new IssueAttachmentsApi();
try {
    AttachmentSettings result = apiInstance.getAttachmentMeta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentsApi#getAttachmentMeta");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AttachmentSettings**](AttachmentSettings.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAttachment"></a>
# **removeAttachment**
> removeAttachment(id)

Delete attachment

Deletes an attachment from an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the project holding the issue containing the attachment:   *  *Delete own attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by the calling user.  *  *Delete all attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by any user.

### Example
```java
// Import classes:
//import com.xminds.jira.rest.client.ApiClient;
//import com.xminds.jira.rest.client.ApiException;
//import com.xminds.jira.rest.client.Configuration;
//import com.xminds.jira.rest.client.auth.*;
//import com.xminds.jira.rest.client.api.IssueAttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IssueAttachmentsApi apiInstance = new IssueAttachmentsApi();
String id = "id_example"; // String | The ID of the attachment.
try {
    apiInstance.removeAttachment(id);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentsApi#removeAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the attachment. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

