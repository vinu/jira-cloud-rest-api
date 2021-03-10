package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.RemoteIssueLink;
import com.xminds.jira.rest.client.model.RemoteIssueLinkIdentifies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueRemoteLinksApi {
  private ApiClient apiClient;

  public IssueRemoteLinksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueRemoteLinksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create or update remote issue link
   * Creates or updates a remote issue link for an issue.  If a &#x60;globalId&#x60; is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param body  (required)
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @return RemoteIssueLinkIdentifies
   * @throws ApiException if fails to make API call
   */
  public RemoteIssueLinkIdentifies createOrUpdateRemoteIssueLink(Map<String, Object> body, String issueIdOrKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createOrUpdateRemoteIssueLink");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling createOrUpdateRemoteIssueLink");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/remotelink"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<RemoteIssueLinkIdentifies> localVarReturnType = new GenericType<RemoteIssueLinkIdentifies>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete remote issue link by global ID
   * Deletes the remote issue link from the issue using the link&#x27;s global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param globalId The global ID of a remote issue link. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRemoteIssueLinkByGlobalId(String issueIdOrKey, String globalId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling deleteRemoteIssueLinkByGlobalId");
    }
    // verify the required parameter 'globalId' is set
    if (globalId == null) {
      throw new ApiException(400, "Missing the required parameter 'globalId' when calling deleteRemoteIssueLinkByGlobalId");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/remotelink"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "globalId", globalId));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete remote issue link by ID
   * Deletes a remote issue link from an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param linkId The ID of a remote issue link. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRemoteIssueLinkById(String issueIdOrKey, String linkId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling deleteRemoteIssueLinkById");
    }
    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(400, "Missing the required parameter 'linkId' when calling deleteRemoteIssueLinkById");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "linkId" + "\\}", apiClient.escapeString(linkId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get remote issue link by ID
   * Returns a remote issue link for an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param linkId The ID of the remote issue link. (required)
   * @return RemoteIssueLink
   * @throws ApiException if fails to make API call
   */
  public RemoteIssueLink getRemoteIssueLinkById(String issueIdOrKey, String linkId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getRemoteIssueLinkById");
    }
    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(400, "Missing the required parameter 'linkId' when calling getRemoteIssueLinkById");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "linkId" + "\\}", apiClient.escapeString(linkId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<RemoteIssueLink> localVarReturnType = new GenericType<RemoteIssueLink>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get remote issue links
   * Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param globalId The global ID of the remote issue link. (optional)
   * @return RemoteIssueLink
   * @throws ApiException if fails to make API call
   */
  public RemoteIssueLink getRemoteIssueLinks(String issueIdOrKey, String globalId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getRemoteIssueLinks");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/remotelink"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "globalId", globalId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<RemoteIssueLink> localVarReturnType = new GenericType<RemoteIssueLink>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update remote issue link by ID
   * Updates a remote issue link for an issue.  Note: Fields without values in the request are set to null.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param body  (required)
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param linkId The ID of the remote issue link. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateRemoteIssueLink(Map<String, Object> body, String issueIdOrKey, String linkId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteIssueLink");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling updateRemoteIssueLink");
    }
    // verify the required parameter 'linkId' is set
    if (linkId == null) {
      throw new ApiException(400, "Missing the required parameter 'linkId' when calling updateRemoteIssueLink");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "linkId" + "\\}", apiClient.escapeString(linkId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
