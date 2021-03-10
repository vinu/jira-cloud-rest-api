package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.FoundGroups;
import com.xminds.jira.rest.client.model.Group;
import com.xminds.jira.rest.client.model.PageBeanGroupDetails;
import com.xminds.jira.rest.client.model.PageBeanUserDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class GroupsApi {
  private ApiClient apiClient;

  public GroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add user to group
   * Adds a user to a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
   * @param body The user to add to the group. (required)
   * @param groupname The name of the group (case sensitive). (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group addUserToGroup(Map<String, Object> body, String groupname) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addUserToGroup");
    }
    // verify the required parameter 'groupname' is set
    if (groupname == null) {
      throw new ApiException(400, "Missing the required parameter 'groupname' when calling addUserToGroup");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/group/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupname", groupname));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Bulk get groups
   * Returns a [paginated](#pagination) list of groups.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param groupId The ID of a group. To specify multiple IDs, pass multiple &#x60;groupId&#x60; parameters. For example, &#x60;groupId&#x3D;5b10a2844c20165700ede21g&amp;groupId&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;. (optional)
   * @param groupName The name of a group. To specify multiple names, pass multiple &#x60;groupName&#x60; parameters. For example, &#x60;groupName&#x3D;administrators&amp;groupName&#x3D;jira-software-users&#x60;. (optional)
   * @return PageBeanGroupDetails
   * @throws ApiException if fails to make API call
   */
  public PageBeanGroupDetails bulkGetGroups(Long startAt, Integer maxResults, List<String> groupId, List<String> groupName) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/group/bulk";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "groupId", groupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "groupName", groupName));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanGroupDetails> localVarReturnType = new GenericType<PageBeanGroupDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create group
   * Creates a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
   * @param body The name of the group. (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group createGroup(Map<String, Object> body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createGroup");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/group";

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find groups
   * Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.  The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the &#x60;html&#x60; field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.  The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.
   * @param accountId This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-3-user-groups-get). (optional)
   * @param query The string to find in group names. (optional)
   * @param exclude A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, &#x60;exclude&#x3D;group1&amp;exclude&#x3D;group2&#x60;. (optional)
   * @param maxResults The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property &#x60;jira.ajax.autocomplete.limit&#x60;. (optional)
   * @param userName This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @return FoundGroups
   * @throws ApiException if fails to make API call
   */
  public FoundGroups findGroups(String accountId, String query, List<String> exclude, Integer maxResults, String userName) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/groups/picker";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "exclude", exclude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<FoundGroups> localVarReturnType = new GenericType<FoundGroups>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get group
   * This operation is deprecated, use [&#x60;group/member&#x60;](#api-rest-api-3-group-member-get).  Returns all users in a group.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param groupname The name of the group. (required)
   * @param expand List of fields to expand. (optional)
   * @return Group
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Group getGroup(String groupname, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'groupname' is set
    if (groupname == null) {
      throw new ApiException(400, "Missing the required parameter 'groupname' when calling getGroup");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/group";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupname", groupname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get users from group
   * Returns a [paginated](#pagination) list of all users in a group.  Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param groupname The name of the group. (required)
   * @param includeInactiveUsers Include inactive users. (optional, default to false)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanUserDetails
   * @throws ApiException if fails to make API call
   */
  public PageBeanUserDetails getUsersFromGroup(String groupname, Boolean includeInactiveUsers, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'groupname' is set
    if (groupname == null) {
      throw new ApiException(400, "Missing the required parameter 'groupname' when calling getUsersFromGroup");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/group/member";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupname", groupname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeInactiveUsers", includeInactiveUsers));
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

    GenericType<PageBeanUserDetails> localVarReturnType = new GenericType<PageBeanUserDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Remove group
   * Deletes a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).
   * @param groupname The name of the group. (required)
   * @param swapGroup The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. (optional)
   * @throws ApiException if fails to make API call
   */
  public void removeGroup(String groupname, String swapGroup) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'groupname' is set
    if (groupname == null) {
      throw new ApiException(400, "Missing the required parameter 'groupname' when calling removeGroup");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/group";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupname", groupname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "swapGroup", swapGroup));


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
   * Remove user from group
   * Removes a user from a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
   * @param groupname The name of the group. (required)
   * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (required)
   * @param username This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromGroup(String groupname, String accountId, String username) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'groupname' is set
    if (groupname == null) {
      throw new ApiException(400, "Missing the required parameter 'groupname' when calling removeUserFromGroup");
    }
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeUserFromGroup");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/group/user";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupname", groupname));
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
