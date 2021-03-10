package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.Watchers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueWatchersApi {
  private ApiClient apiClient;

  public IssueWatchersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueWatchersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add watcher
   * Adds a user as a watcher of an issue by passing the account ID of the user. For example, &#x60;\&quot;5b10ac8d82e05b22cc7d4ef5\&quot;&#x60;. If no user is specified the calling user is added.  This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  To add users other than themselves to the watchlist, *Manage watcher list* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
   * @param body The account ID of the user. Note that username cannot be used due to privacy changes. (required)
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object addWatcher(String body, String issueIdOrKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addWatcher");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling addWatcher");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/watchers"
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue watchers
   * Returns the watchers for an issue.  This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is ini  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  To see details of users on the watchlist other than themselves, *View voters and watchers* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @return Watchers
   * @throws ApiException if fails to make API call
   */
  public Watchers getIssueWatchers(String issueIdOrKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getIssueWatchers");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/watchers"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Watchers> localVarReturnType = new GenericType<Watchers>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete watcher
   * Deletes a user as a watcher of an issue.  This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  To remove users other than themselves from the watchlist, *Manage watcher list* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param username This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required. (optional)
   * @throws ApiException if fails to make API call
   */
  public void removeWatcher(String issueIdOrKey, String username, String accountId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling removeWatcher");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/watchers"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
