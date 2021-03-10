package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ChangedWorklogs;
import com.xminds.jira.rest.client.model.PageOfWorklogs;
import com.xminds.jira.rest.client.model.Worklog;
import com.xminds.jira.rest.client.model.WorklogIdsRequestBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueWorklogsApi {
  private ApiClient apiClient;

  public IssueWorklogsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueWorklogsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add worklog
   * Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param body  (required)
   * @param issueIdOrKey The ID or key the issue. (required)
   * @param notifyUsers Whether users watching the issue are notified by email. (optional, default to true)
   * @param adjustEstimate Defines how to update the issue&#x27;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Reduces the estimate by amount specified in &#x60;reduceBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. (optional, default to auto)
   * @param newEstimate The value to set as the issue&#x27;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. (optional)
   * @param reduceBy The amount to reduce the issue&#x27;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. (optional)
   * @param expand Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. (optional)
   * @param overrideEditableFlag Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin scope permission can use this flag. (optional, default to false)
   * @return Worklog
   * @throws ApiException if fails to make API call
   */
  public Worklog addWorklog(Map<String, Object> body, String issueIdOrKey, Boolean notifyUsers, String adjustEstimate, String newEstimate, String reduceBy, String expand, Boolean overrideEditableFlag) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addWorklog");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling addWorklog");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notifyUsers", notifyUsers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "adjustEstimate", adjustEstimate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newEstimate", newEstimate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reduceBy", reduceBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overrideEditableFlag", overrideEditableFlag));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Worklog> localVarReturnType = new GenericType<Worklog>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete worklog
   * Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param id The ID of the worklog. (required)
   * @param notifyUsers Whether users watching the issue are notified by email. (optional, default to true)
   * @param adjustEstimate Defines how to update the issue&#x27;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Increases the estimate by amount specified in &#x60;increaseBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. (optional, default to auto)
   * @param newEstimate The value to set as the issue&#x27;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. (optional)
   * @param increaseBy The amount to increase the issue&#x27;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. (optional)
   * @param overrideEditableFlag Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin permissions can use this flag. (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorklog(String issueIdOrKey, String id, Boolean notifyUsers, String adjustEstimate, String newEstimate, String increaseBy, Boolean overrideEditableFlag) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling deleteWorklog");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorklog");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog/{id}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notifyUsers", notifyUsers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "adjustEstimate", adjustEstimate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newEstimate", newEstimate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "increaseBy", increaseBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overrideEditableFlag", overrideEditableFlag));


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
   * Get IDs of deleted worklogs
   * Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param since The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned. (optional, default to 0)
   * @return ChangedWorklogs
   * @throws ApiException if fails to make API call
   */
  public ChangedWorklogs getIdsOfWorklogsDeletedSince(Long since) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/worklog/deleted";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<ChangedWorklogs> localVarReturnType = new GenericType<ChangedWorklogs>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get IDs of updated worklogs
   * Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
   * @param since The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned. (optional, default to 0)
   * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. (optional)
   * @return ChangedWorklogs
   * @throws ApiException if fails to make API call
   */
  public ChangedWorklogs getIdsOfWorklogsModifiedSince(Long since, String expand) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/worklog/updated";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<ChangedWorklogs> localVarReturnType = new GenericType<ChangedWorklogs>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue worklogs
   * Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 1048576)
   * @param startedAfter The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned. (optional)
   * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts&#x60;properties&#x60;, which returns worklog properties. (optional)
   * @return PageOfWorklogs
   * @throws ApiException if fails to make API call
   */
  public PageOfWorklogs getIssueWorklog(String issueIdOrKey, Long startAt, Integer maxResults, Long startedAfter, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getIssueWorklog");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startedAfter", startedAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageOfWorklogs> localVarReturnType = new GenericType<PageOfWorklogs>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get worklog
   * Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param id The ID of the worklog. (required)
   * @param expand Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  &#x60;properties&#x60;, which returns worklog properties. (optional)
   * @return Worklog
   * @throws ApiException if fails to make API call
   */
  public Worklog getWorklog(String issueIdOrKey, String id, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getWorklog");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorklog");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog/{id}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Worklog> localVarReturnType = new GenericType<Worklog>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get worklogs
   * Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
   * @param body A JSON object containing a list of worklog IDs. (required)
   * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. (optional)
   * @return List&lt;Worklog&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Worklog> getWorklogsForIds(WorklogIdsRequestBean body, String expand) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getWorklogsForIds");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/worklog/list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<List<Worklog>> localVarReturnType = new GenericType<List<Worklog>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update worklog
   * Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param body  (required)
   * @param issueIdOrKey The ID or key the issue. (required)
   * @param id The ID of the worklog. (required)
   * @param notifyUsers Whether users watching the issue are notified by email. (optional, default to true)
   * @param adjustEstimate Defines how to update the issue&#x27;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;auto&#x60; Updates the estimate by the difference between the original and updated value of &#x60;timeSpent&#x60; or &#x60;timeSpentSeconds&#x60;. (optional, default to auto)
   * @param newEstimate The value to set as the issue&#x27;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. (optional)
   * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. (optional)
   * @param overrideEditableFlag Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Only connect app users with admin permissions can use this flag. (optional, default to false)
   * @return Worklog
   * @throws ApiException if fails to make API call
   */
  public Worklog updateWorklog(Map<String, Object> body, String issueIdOrKey, String id, Boolean notifyUsers, String adjustEstimate, String newEstimate, String expand, Boolean overrideEditableFlag) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorklog");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling updateWorklog");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateWorklog");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog/{id}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notifyUsers", notifyUsers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "adjustEstimate", adjustEstimate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newEstimate", newEstimate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overrideEditableFlag", overrideEditableFlag));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Worklog> localVarReturnType = new GenericType<Worklog>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
