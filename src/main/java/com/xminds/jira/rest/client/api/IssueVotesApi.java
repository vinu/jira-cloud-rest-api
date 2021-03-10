package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.Votes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueVotesApi {
  private ApiClient apiClient;

  public IssueVotesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueVotesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add vote
   * Adds the user&#x27;s vote to an issue. This is the equivalent of the user clicking *Vote* on an issue in Jira.  This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object addVote(String issueIdOrKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling addVote");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/votes"
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get votes
   * Returns details about the votes on an issue.  This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is ini  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  Note that users with the necessary permissions for this operation but without the *View voters and watchers* project permissions are not returned details in the &#x60;voters&#x60; field.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @return Votes
   * @throws ApiException if fails to make API call
   */
  public Votes getVotes(String issueIdOrKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getVotes");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/votes"
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

    GenericType<Votes> localVarReturnType = new GenericType<Votes>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete vote
   * Deletes a user&#x27;s vote from an issue. This is the equivalent of the user clicking *Unvote* on an issue in Jira.  This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeVote(String issueIdOrKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling removeVote");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/votes"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

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
}
