package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.FoundUsersAndGroups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class GroupAndUserPickerApi {
  private ApiClient apiClient;

  public GroupAndUserPickerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupAndUserPickerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Find users and groups
   * Returns a list of users and groups matching a string. The string is used:   *  for users, to find a case-insensitive match with display name and e-mail address. Note that if a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.  *  for groups, to find a case-sensitive match with group name.  For example, if the string *tin* is used, records with the display name *Tina*, email address *sarah@tinplatetraining.com*, and the group *accounting* would be returned.  Optionally, the search can be refined to:   *  the projects and issue types associated with a custom field, such as a user picker. The search can then be further refined to return only users and groups that have permission to view specific:           *  projects.      *  issue types.          If multiple projects or issue types are specified, they must be a subset of those enabled for the custom field or no results are returned. For example, if a field is enabled for projects A, B, and C then the search could be limited to projects B and C. However, if the search is limited to projects B and D, nothing is returned.  *  not return Connect app users and groups.  *  return groups that have a case-insensitive match with the query.  The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an &#x60;html&#x60; field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).
   * @param query The search string. (required)
   * @param maxResults The maximum number of items to return in each list. (optional, default to 50)
   * @param showAvatar Whether the user avatar should be returned. If an invalid value is provided, the default value is used. (optional, default to false)
   * @param fieldId The custom field ID of the field this request is for. (optional)
   * @param projectId The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
   * @param issueTypeId The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, &#x60;issueTypeId&#x3D;10000&amp;issueTypeId&#x3D;10001&#x60;. Special values, such as &#x60;-1&#x60; (all standard issue types) and &#x60;-2&#x60; (all subtask issue types), are supported. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
   * @param avatarSize The size of the avatar to return. If an invalid value is provided, the default value is used. (optional, default to xsmall)
   * @param caseInsensitive Whether the search for groups should be case insensitive. (optional, default to false)
   * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. (optional, default to false)
   * @return FoundUsersAndGroups
   * @throws ApiException if fails to make API call
   */
  public FoundUsersAndGroups findUsersAndGroups(String query, Integer maxResults, Boolean showAvatar, String fieldId, List<String> projectId, List<String> issueTypeId, String avatarSize, Boolean caseInsensitive, Boolean excludeConnectAddons) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling findUsersAndGroups");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/groupuserpicker";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "showAvatar", showAvatar));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldId", fieldId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "issueTypeId", issueTypeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "avatarSize", avatarSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "caseInsensitive", caseInsensitive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeConnectAddons", excludeConnectAddons));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<FoundUsersAndGroups> localVarReturnType = new GenericType<FoundUsersAndGroups>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
