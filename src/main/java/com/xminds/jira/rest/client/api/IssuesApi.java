package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.CreatedIssue;
import com.xminds.jira.rest.client.model.CreatedIssues;
import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.IssueBean;
import com.xminds.jira.rest.client.model.IssueCreateMetadata;
import com.xminds.jira.rest.client.model.IssueUpdateMetadata;
import com.xminds.jira.rest.client.model.PageBeanChangelog;
import com.xminds.jira.rest.client.model.Transitions;
import com.xminds.jira.rest.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssuesApi {
  private ApiClient apiClient;

  public IssuesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssuesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Assign issue
   * Assigns an issue to a user. Use this operation when the calling user does not have the *Edit Issues* permission but has the *Assign issue* permission for the project that the issue is in.  If &#x60;name&#x60; or &#x60;accountId&#x60; is set to:   *  &#x60;\&quot;-1\&quot;&#x60;, the issue is assigned to the default assignee for the project.  *  &#x60;null&#x60;, the issue is set to unassigned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse Projects* and *Assign Issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param body The request object with the user that the issue is assigned to. (required)
   * @param issueIdOrKey The ID or key of the issue to be assigned. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object assignIssue(User body, String issueIdOrKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignIssue");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling assignIssue");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/assignee"
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create issue
   * Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.  The content of the issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get). These are the same fields that appear on the issue&#x27;s create screen. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#x27;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get) to find subtask issue types).  *  &#x60;parent&#x60; must contain the ID or key of the parent issue.  In a next-gen project any issue may be made a child providing that the parent and child are members of the same project. In a classic project the parent field is only valid for subtasks.  **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue or subtask is created.
   * @param body  (required)
   * @param updateHistory Whether the project in which the issue is created is added to the user&#x27;s **Recently viewed** project list, as shown under **Projects** in Jira. (optional, default to false)
   * @return CreatedIssue
   * @throws ApiException if fails to make API call
   */
  public CreatedIssue createIssue(Map<String, Object> body, Boolean updateHistory) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIssue");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateHistory", updateHistory));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<CreatedIssue> localVarReturnType = new GenericType<CreatedIssue>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Bulk create issue
   * Creates issues and, where the option to create subtasks is enabled in Jira, subtasks. Transitions may be applied, to move the issues or subtasks to a workflow step other than the default start step, and issue properties set.  The content of each issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get). These are the same fields that appear on the issues&#x27; create screens. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#x27;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get) to find subtask issue types).  *  &#x60;parent&#x60; the must contain the ID or key of the parent issue.  **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which each issue or subtask is created.
   * @param body  (required)
   * @return CreatedIssues
   * @throws ApiException if fails to make API call
   */
  public CreatedIssues createIssues(Map<String, Object> body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIssues");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/bulk";

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

    GenericType<CreatedIssues> localVarReturnType = new GenericType<CreatedIssues>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete issue
   * Deletes an issue.  An issue cannot be deleted if it has one or more subtasks. To delete an issue with subtasks, set &#x60;deleteSubtasks&#x60;. This causes the issue&#x27;s subtasks to be deleted with the issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Delete issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param deleteSubtasks Whether the issue&#x27;s subtasks are deleted when the issue is deleted. (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteIssue(String issueIdOrKey, String deleteSubtasks) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling deleteIssue");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleteSubtasks", deleteSubtasks));


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
   * Transition issue
   * Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.  sortByCategory To update the fields on the transition screen, specify the fields in the &#x60;fields&#x60; or &#x60;update&#x60; parameters in the request body. Get details about the fields using [ Get transitions](#api-rest-api-3-issue-issueIdOrKey-transitions-get) with the &#x60;transitions.fields&#x60; expand.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Transition issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param body  (required)
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object doTransition(Map<String, Object> body, String issueIdOrKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling doTransition");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling doTransition");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/transitions"
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
   * Edit issue
   * Edits an issue. A transition may be applied and issue properties updated as part of the edit.  The edits to the issue&#x27;s fields are defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be edited are determined using [ Get edit issue metadata](#api-rest-api-3-issue-issueIdOrKey-editmeta-get).  The parent field may be set by key or ID. For standard issue types, the parent may be removed by setting &#x60;update.parent.set.none&#x60; to *true*. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#x27;t handle Atlassian Document Format content.  Connect app users with admin permissions (from user permissions and app scopes) can override the screen security configuration using &#x60;overrideScreenSecurity&#x60; and &#x60;overrideEditableFlag&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param body  (required)
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param notifyUsers Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn&#x27;t have the necessary permission the request is ignored. (optional, default to true)
   * @param overrideScreenSecurity Whether screen security should be overridden to enable hidden fields to be edited. Available to Connect app users with admin permissions. (optional, default to false)
   * @param overrideEditableFlag Whether screen security should be overridden to enable uneditable fields to be edited. Available to Connect app users with admin permissions. (optional, default to false)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object editIssue(Map<String, Object> body, String issueIdOrKey, Boolean notifyUsers, Boolean overrideScreenSecurity, Boolean overrideEditableFlag) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling editIssue");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling editIssue");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notifyUsers", notifyUsers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overrideScreenSecurity", overrideScreenSecurity));
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get change logs
   * Returns a [paginated](#pagination) list of all changelogs for an issue sorted by date, starting from the oldest.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 100)
   * @return PageBeanChangelog
   * @throws ApiException if fails to make API call
   */
  public PageBeanChangelog getChangeLogs(String issueIdOrKey, Integer startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getChangeLogs");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/changelog"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanChangelog> localVarReturnType = new GenericType<PageBeanChangelog>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get create issue metadata
   * Returns details of projects, issue types within projects, and, when requested, the create screen fields for each issue type for the user. Use the information to populate the requests in [ Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post).  The request can be restricted to specific projects or issue types using the query parameters. The response will contain information for the valid projects, issue types, or project and issue type combinations requested. Note that invalid project, issue type, or project and issue type combinations do not generate errors.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.
   * @param projectIds List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, &#x60;projectIds&#x3D;10000,10001&amp;projectIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;projectKeys&#x60;. (optional)
   * @param projectKeys List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, &#x60;projectKeys&#x3D;proj1,proj2&amp;projectKeys&#x3D;proj3&#x60;. This parameter may be provided with &#x60;projectIds&#x60;. (optional)
   * @param issuetypeIds List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, &#x60;issuetypeIds&#x3D;10000,10001&amp;issuetypeIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;issuetypeNames&#x60;. (optional)
   * @param issuetypeNames List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, &#x60;issuetypeNames&#x3D;name1,name2&amp;issuetypeNames&#x3D;name3&#x60;. This parameter may be provided with &#x60;issuetypeIds&#x60;. (optional)
   * @param expand Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts &#x60;projects.issuetypes.fields&#x60;, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post). (optional)
   * @return IssueCreateMetadata
   * @throws ApiException if fails to make API call
   */
  public IssueCreateMetadata getCreateIssueMeta(List<String> projectIds, List<String> projectKeys, List<String> issuetypeIds, List<String> issuetypeNames, String expand) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/createmeta";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "projectIds", projectIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "projectKeys", projectKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "issuetypeIds", issuetypeIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "issuetypeNames", issuetypeNames));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<IssueCreateMetadata> localVarReturnType = new GenericType<IssueCreateMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get edit issue metadata
   * Returns the edit screen fields for an issue that are visible to and editable by the user. Use the information to populate the requests in [Edit issue](#api-rest-api-3-issue-issueIdOrKey-put).  Connect app users with admin permissions (from user permissions and app scopes) can return additional details using:   *  &#x60;overrideScreenSecurity&#x60; Returns hidden fields.  *  &#x60;overrideEditableFlag&#x60; Returns uneditable fields. For example, where an issue has a workflow status of closed none of its fields are editable.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  Note: For any fields to be editable the user must have the *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param overrideScreenSecurity Whether hidden fields should be returned. Available to connect app users with admin permissions. (optional, default to false)
   * @param overrideEditableFlag Whether non-editable fields should be returned. Available to connect app users with admin permissions. (optional, default to false)
   * @return IssueUpdateMetadata
   * @throws ApiException if fails to make API call
   */
  public IssueUpdateMetadata getEditIssueMeta(String issueIdOrKey, Boolean overrideScreenSecurity, Boolean overrideEditableFlag) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getEditIssueMeta");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/editmeta"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overrideScreenSecurity", overrideScreenSecurity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "overrideEditableFlag", overrideEditableFlag));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<IssueUpdateMetadata> localVarReturnType = new GenericType<IssueUpdateMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue
   * Returns the details for an issue.  The issue is identified by its ID or key, however, if the identifier doesn&#x27;t match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is **not** returned. The issue key returned in the response is the key of the issue found.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param fields A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all (default) fields except description.  *  &#x60;*navigable,-comment&#x60; Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp; fields&#x3D;field3&#x60;.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-3-search-get) and [Search for issues using JQL (POST)](#api-rest-api-3-search-post) where the default is all navigable fields. (optional)
   * @param fieldsByKeys Whether fields in &#x60;fields&#x60; are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field&#x27;s key may differ from its ID. (optional, default to false)
   * @param expand Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Returns a JSON array for each version of a field&#x27;s value, with the highest number representing the most recent version. Note: When included in the request, the &#x60;fields&#x60; parameter is ignored. (optional)
   * @param properties A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  &#x60;*all&#x60; Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  &#x60;*all&#x60; Returns all properties.  *  &#x60;*all,-prop1&#x60; Returns all properties except &#x60;prop1&#x60;.  *  &#x60;prop1,prop2&#x60; Returns &#x60;prop1&#x60; and &#x60;prop2&#x60; properties.  This parameter may be specified multiple times. For example, &#x60;properties&#x3D;prop1,prop2&amp; properties&#x3D;prop3&#x60;. (optional)
   * @param updateHistory Whether the project in which the issue is created is added to the user&#x27;s **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-3-search-get) &#x60;lastViewed&#x60; field. (optional, default to false)
   * @return IssueBean
   * @throws ApiException if fails to make API call
   */
  public IssueBean getIssue(String issueIdOrKey, List<String> fields, Boolean fieldsByKeys, String expand, List<String> properties, Boolean updateHistory) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getIssue");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldsByKeys", fieldsByKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "properties", properties));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateHistory", updateHistory));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<IssueBean> localVarReturnType = new GenericType<IssueBean>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get transitions
   * Returns either all transitions or a transition that can be performed by the user on an issue, based on the issue&#x27;s status.  Note, if a request is made for a transition that does not exist or cannot be performed on the issue, given its status, the response will return any empty transitions list.  This operation can be accessed anonymously.  **[Permissions](#permissions) required: A list or transition is returned only when the user has:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  However, if the user does not have the *Transition issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) the response will not list any transitions.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param expand Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts &#x60;transitions.fields&#x60;, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Transition issue](#api-rest-api-3-issue-issueIdOrKey-transitions-post). (optional)
   * @param transitionId The ID of the transition. (optional)
   * @param skipRemoteOnlyCondition Whether transitions with the condition *Hide From User Condition* are included in the response. (optional, default to false)
   * @param includeUnavailableTransitions Whether details of transitions that fail a condition are included in the response (optional, default to false)
   * @param sortByOpsBarAndStatus Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value. (optional, default to false)
   * @return Transitions
   * @throws ApiException if fails to make API call
   */
  public Transitions getTransitions(String issueIdOrKey, String expand, String transitionId, Boolean skipRemoteOnlyCondition, Boolean includeUnavailableTransitions, Boolean sortByOpsBarAndStatus) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getTransitions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/transitions"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transitionId", transitionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skipRemoteOnlyCondition", skipRemoteOnlyCondition));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeUnavailableTransitions", includeUnavailableTransitions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortByOpsBarAndStatus", sortByOpsBarAndStatus));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Transitions> localVarReturnType = new GenericType<Transitions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Send notification for issue
   * Creates an email notification for an issue and adds it to the mail queue.  **[Permissions](#permissions) required:**   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
   * @param body The request object for the notification and recipients. (required)
   * @param issueIdOrKey ID or key of the issue that the notification is sent for. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notify(Map<String, Object> body, String issueIdOrKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling notify");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling notify");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/notify"
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
}
