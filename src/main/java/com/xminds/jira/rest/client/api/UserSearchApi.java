package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.FoundUsers;
import com.xminds.jira.rest.client.model.PageBeanUser;
import com.xminds.jira.rest.client.model.PageBeanUserKey;
import com.xminds.jira.rest.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class UserSearchApi {
  private ApiClient apiClient;

  public UserSearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserSearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Find users assignable to issues
   * Returns a list of users that can be assigned to an issue. Use this operation to find the list of users who can be assigned to:   *  a new issue, by providing the &#x60;projectKeyOrId&#x60;.  *  an updated issue, by providing the &#x60;issueKey&#x60;.  *  to an issue during a transition (workflow action), by providing the &#x60;issueKey&#x60; and the transition id in &#x60;actionDescriptorId&#x60;. You can obtain the IDs of an issue&#x27;s valid transitions using the &#x60;transitions&#x60; option in the &#x60;expand&#x60; parameter of [ Get issue](#api-rest-api-3-issue-issueIdOrKey-get).  In all these cases, you can pass an account ID to determine if a user can be assigned to an issue. The user is returned in the response if they can be assigned to the issue or issue transition.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that can be assigned the issue. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who can be assigned the issue, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param query A query string that is matched against user attributes, such as &#x60;displayName&#x60;, and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#x27;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;username&#x60; or &#x60;accountId&#x60; is specified. (optional)
   * @param sessionId The sessionId of this request. SessionId is the same until the assignee is set. (optional)
   * @param username This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @param accountId A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. (optional)
   * @param project The project ID or project key (case sensitive). Required, unless &#x60;issueKey&#x60; is specified. (optional)
   * @param issueKey The key of the issue. Required, unless &#x60;project&#x60; is specified. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue. (optional, default to 50)
   * @param actionDescriptorId The ID of the transition. (optional)
   * @param recommend  (optional, default to false)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> findAssignableUsers(String query, String sessionId, String username, String accountId, String project, String issueKey, Integer startAt, Integer maxResults, Integer actionDescriptorId, Boolean recommend) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/user/assignable/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sessionId", sessionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "project", project));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issueKey", issueKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actionDescriptorId", actionDescriptorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recommend", recommend));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find users assignable to projects
   * Returns a list of users who can be assigned issues in one or more projects. The list may be restricted to users whose attributes match a string.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that can be assigned issues in the projects. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who can be assigned issues in the projects, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param projectKeys A list of project keys (case sensitive). This parameter accepts a comma-separated list. (required)
   * @param query A query string that is matched against user attributes, such as &#x60;displayName&#x60; and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#x27;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; is specified. (optional)
   * @param username This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @param accountId A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> findBulkAssignableUsers(String projectKeys, String query, String username, String accountId, Integer startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectKeys' is set
    if (projectKeys == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKeys' when calling findBulkAssignableUsers");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/user/assignable/multiProjectSearch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectKeys", projectKeys));
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

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find user keys by query
   * Finds users with a structured query and returns a [paginated](#pagination) list of user keys.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the structured query, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  The query statements are:   *  &#x60;is assignee of PROJ&#x60; Returns the users that are assignees of at least one issue in project *PROJ*.  *  &#x60;is assignee of (PROJ-1, PROJ-2)&#x60; Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is reporter of (PROJ-1, PROJ-2)&#x60; Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is watcher of (PROJ-1, PROJ-2)&#x60; Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is voter of (PROJ-1, PROJ-2)&#x60; Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is commenter of (PROJ-1, PROJ-2)&#x60; Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is transitioner of (PROJ-1, PROJ-2)&#x60; Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.  *  &#x60;[propertyKey].entity.property.path is \&quot;property value\&quot;&#x60; Returns users with the entity property value.  The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the &#x60;AND&#x60; and &#x60;OR&#x60; operators to form more complex queries. For example:  &#x60;is assignee of PROJ AND [propertyKey].entity.property.path is \&quot;property value\&quot;&#x60;
   * @param query The search query. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 100)
   * @return PageBeanUserKey
   * @throws ApiException if fails to make API call
   */
  public PageBeanUserKey findUserKeysByQuery(String query, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling findUserKeysByQuery");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/user/search/query/key";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
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

    GenericType<PageBeanUserKey> localVarReturnType = new GenericType<PageBeanUserKey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find users
   * Returns a list of users that match the search string and property.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and property. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and property, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls or calls by users without the required permission return empty search results.
   * @param query A query string that is matched against user attributes ( &#x60;displayName&#x60;, and &#x60;emailAddress&#x60;) to find relevant users. The string can match the prefix of the attribute&#x27;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; or &#x60;property&#x60; is specified. (optional)
   * @param username  (optional)
   * @param accountId A query string that is matched exactly against a user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; or &#x60;property&#x60; is specified. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param property A query string used to search properties. Property keys are specified by path, so property keys containing dot (.) or equals (&#x3D;) characters cannot be used. The query string cannot be specified using a JSON object. Example: To search for the value of &#x60;nested&#x60; from &#x60;{\&quot;something\&quot;:{\&quot;nested\&quot;:1,\&quot;other\&quot;:2}}&#x60; use &#x60;thepropertykey.something.nested&#x3D;1&#x60;. Required, unless &#x60;accountId&#x60; or &#x60;query&#x60; is specified. (optional)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> findUsers(String query, String username, String accountId, Integer startAt, Integer maxResults, String property) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/user/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "property", property));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find users by query
   * Finds users with a structured query and returns a [paginated](#pagination) list of user details.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the structured query, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  The query statements are:   *  &#x60;is assignee of PROJ&#x60; Returns the users that are assignees of at least one issue in project *PROJ*.  *  &#x60;is assignee of (PROJ-1, PROJ-2)&#x60; Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is reporter of (PROJ-1, PROJ-2)&#x60; Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is watcher of (PROJ-1, PROJ-2)&#x60; Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is voter of (PROJ-1, PROJ-2)&#x60; Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is commenter of (PROJ-1, PROJ-2)&#x60; Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is transitioner of (PROJ-1, PROJ-2)&#x60; Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.  *  &#x60;[propertyKey].entity.property.path is \&quot;property value\&quot;&#x60; Returns users with the entity property value.  The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the &#x60;AND&#x60; and &#x60;OR&#x60; operators to form more complex queries. For example:  &#x60;is assignee of PROJ AND [propertyKey].entity.property.path is \&quot;property value\&quot;&#x60;
   * @param query The search query. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 100)
   * @return PageBeanUser
   * @throws ApiException if fails to make API call
   */
  public PageBeanUser findUsersByQuery(String query, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling findUsersByQuery");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/user/search/query";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
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

    GenericType<PageBeanUser> localVarReturnType = new GenericType<PageBeanUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find users for picker
   * Returns a list of users whose attributes match the query term. The returned object includes the &#x60;html&#x60; field where the matched query term is highlighted with the HTML strong tag. A list of account IDs can be provided to exclude users from the results.  This operation takes the users in the range defined by &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the query term. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the query term, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return search results for an exact name match only.
   * @param query A query string that is matched against user attributes, such as &#x60;displayName&#x60;, and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#x27;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. (required)
   * @param maxResults The maximum number of items to return. The total number of matched users is returned in &#x60;total&#x60;. (optional, default to 50)
   * @param showAvatar Include the URI to the user&#x27;s avatar. (optional, default to false)
   * @param exclude This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @param excludeAccountIds A list of account IDs to exclude from the search results. This parameter accepts a comma-separated list. Multiple account IDs can also be provided using an ampersand-separated list. For example, &#x60;excludeAccountIds&#x3D;5b10a2844c20165700ede21g,5b10a0effa615349cb016cd8&amp;excludeAccountIds&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;. Cannot be provided with &#x60;exclude&#x60;. (optional)
   * @param avatarSize  (optional)
   * @param excludeConnectUsers  (optional, default to false)
   * @return FoundUsers
   * @throws ApiException if fails to make API call
   */
  public FoundUsers findUsersForPicker(String query, Integer maxResults, Boolean showAvatar, List<String> exclude, List<String> excludeAccountIds, String avatarSize, Boolean excludeConnectUsers) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling findUsersForPicker");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/user/picker";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "showAvatar", showAvatar));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "exclude", exclude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "excludeAccountIds", excludeAccountIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "avatarSize", avatarSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeConnectUsers", excludeConnectUsers));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<FoundUsers> localVarReturnType = new GenericType<FoundUsers>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find users with permissions
   * Returns a list of users who fulfill these criteria:   *  their user attributes match a search string.  *  they have a set of permissions for a project or issue.  If no search string is provided, a list of all users with the permissions is returned.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and have permission for the project or issue. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and have permission for the project or issue, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get users for any project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project, to get users for that project.
   * @param permissions A comma separated list of permissions. Permissions can be specified as any:   *  permission returned by [Get all permissions](#api-rest-api-3-permissions-get).  *  custom project permission added by Connect apps.  *  (deprecated) one of the following:           *  ASSIGNABLE\\_USER      *  ASSIGN\\_ISSUE      *  ATTACHMENT\\_DELETE\\_ALL      *  ATTACHMENT\\_DELETE\\_OWN      *  BROWSE      *  CLOSE\\_ISSUE      *  COMMENT\\_DELETE\\_ALL      *  COMMENT\\_DELETE\\_OWN      *  COMMENT\\_EDIT\\_ALL      *  COMMENT\\_EDIT\\_OWN      *  COMMENT\\_ISSUE      *  CREATE\\_ATTACHMENT      *  CREATE\\_ISSUE      *  DELETE\\_ISSUE      *  EDIT\\_ISSUE      *  LINK\\_ISSUE      *  MANAGE\\_WATCHER\\_LIST      *  MODIFY\\_REPORTER      *  MOVE\\_ISSUE      *  PROJECT\\_ADMIN      *  RESOLVE\\_ISSUE      *  SCHEDULE\\_ISSUE      *  SET\\_ISSUE\\_SECURITY      *  TRANSITION\\_ISSUE      *  VIEW\\_VERSION\\_CONTROL      *  VIEW\\_VOTERS\\_AND\\_WATCHERS      *  VIEW\\_WORKFLOW\\_READONLY      *  WORKLOG\\_DELETE\\_ALL      *  WORKLOG\\_DELETE\\_OWN      *  WORKLOG\\_EDIT\\_ALL      *  WORKLOG\\_EDIT\\_OWN      *  WORK\\_ISSUE (required)
   * @param query A query string that is matched against user attributes, such as &#x60;displayName&#x60; and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#x27;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; is specified. (optional)
   * @param username This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @param accountId A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. (optional)
   * @param issueKey The issue key for the issue. (optional)
   * @param projectKey The project key for the project (case sensitive). (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> findUsersWithAllPermissions(String permissions, String query, String username, String accountId, String issueKey, String projectKey, Integer startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'permissions' is set
    if (permissions == null) {
      throw new ApiException(400, "Missing the required parameter 'permissions' when calling findUsersWithAllPermissions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/user/permission/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permissions", permissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issueKey", issueKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectKey", projectKey));
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

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find users with browse permission
   * Returns a list of users who fulfill these criteria:   *  their user attributes match a search string.  *  they have permission to browse issues.  Use this resource to find users who can browse:   *  an issue, by providing the &#x60;issueKey&#x60;.  *  any issue in a project, by providing the &#x60;projectKey&#x60;.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and have permission to browse issues. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and have permission to browse issues, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return empty search results.
   * @param query A query string that is matched against user attributes, such as &#x60;displayName&#x60; and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#x27;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; is specified. (optional)
   * @param username This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @param accountId A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. (optional)
   * @param issueKey The issue key for the issue. Required, unless &#x60;projectKey&#x60; is specified. (optional)
   * @param projectKey The project key for the project (case sensitive). Required, unless &#x60;issueKey&#x60; is specified. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> findUsersWithBrowsePermission(String query, String username, String accountId, String issueKey, String projectKey, Integer startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/user/viewissue/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issueKey", issueKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectKey", projectKey));
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

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
