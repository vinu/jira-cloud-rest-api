package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.PermissionGrant;
import com.xminds.jira.rest.client.model.PermissionGrants;
import com.xminds.jira.rest.client.model.PermissionScheme;
import com.xminds.jira.rest.client.model.PermissionSchemes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class PermissionSchemesApi {
  private ApiClient apiClient;

  public PermissionSchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PermissionSchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create permission grant
   * Creates a permission grant in a permission scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The permission grant to create. (required)
   * @param schemeId The ID of the permission scheme in which to create a new permission grant. (required)
   * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;all&#x60; Returns all expandable information. (optional)
   * @return PermissionGrant
   * @throws ApiException if fails to make API call
   */
  public PermissionGrant createPermissionGrant(PermissionGrant body, Long schemeId, String expand) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPermissionGrant");
    }
    // verify the required parameter 'schemeId' is set
    if (schemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemeId' when calling createPermissionGrant");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme/{schemeId}/permission"
      .replaceAll("\\{" + "schemeId" + "\\}", apiClient.escapeString(schemeId.toString()));

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

    GenericType<PermissionGrant> localVarReturnType = new GenericType<PermissionGrant>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create permission scheme
   * Creates a new permission scheme. You can create a permission scheme with or without defining a set of permission grants.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The permission scheme to create. (required)
   * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. (optional)
   * @return PermissionScheme
   * @throws ApiException if fails to make API call
   */
  public PermissionScheme createPermissionScheme(Map<String, Object> body, String expand) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPermissionScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme";

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

    GenericType<PermissionScheme> localVarReturnType = new GenericType<PermissionScheme>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete permission scheme
   * Deletes a permission scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param schemeId The ID of the permission scheme being deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePermissionScheme(Long schemeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'schemeId' is set
    if (schemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemeId' when calling deletePermissionScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme/{schemeId}"
      .replaceAll("\\{" + "schemeId" + "\\}", apiClient.escapeString(schemeId.toString()));

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
   * Delete permission scheme grant
   * Deletes a permission grant from a permission scheme. See [About permission schemes and grants](#about-permission-schemes) for more details.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param schemeId The ID of the permission scheme to delete the permission grant from. (required)
   * @param permissionId The ID of the permission grant to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePermissionSchemeEntity(Long schemeId, Long permissionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'schemeId' is set
    if (schemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemeId' when calling deletePermissionSchemeEntity");
    }
    // verify the required parameter 'permissionId' is set
    if (permissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionId' when calling deletePermissionSchemeEntity");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme/{schemeId}/permission/{permissionId}"
      .replaceAll("\\{" + "schemeId" + "\\}", apiClient.escapeString(schemeId.toString()))
      .replaceAll("\\{" + "permissionId" + "\\}", apiClient.escapeString(permissionId.toString()));

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
   * Get all permission schemes
   * Returns all permission schemes.  ### About permission schemes and grants ###  A permission scheme is a collection of permission grants. A permission grant consists of a &#x60;holder&#x60; and a &#x60;permission&#x60;.  #### Holder object ####  The &#x60;holder&#x60; object contains information about the user or group being granted the permission. For example, the *Administer projects* permission is granted to a group named *Teams in space administrators*. In this case, the type is &#x60;\&quot;type\&quot;: \&quot;group\&quot;&#x60;, and the parameter is the group name, &#x60;\&quot;parameter\&quot;: \&quot;Teams in space administrators\&quot;&#x60;. The &#x60;holder&#x60; object is defined by the following properties:   *  &#x60;type&#x60; Identifies the user or group (see the list of types below).  *  &#x60;parameter&#x60; The value of this property depends on the &#x60;type&#x60;. For example, if the &#x60;type&#x60; is a group, then you need to specify the group name.  The following &#x60;types&#x60; are available. The expected values for the &#x60;parameter&#x60; are given in parenthesis (some &#x60;types&#x60; may not have a &#x60;parameter&#x60;):   *  &#x60;anyone&#x60; Grant for anonymous users.  *  &#x60;applicationRole&#x60; Grant for users with access to the specified application (application name). See [Update product access settings](https://confluence.atlassian.com/x/3YxjL) for more information.  *  &#x60;assignee&#x60; Grant for the user currently assigned to an issue.  *  &#x60;group&#x60; Grant for the specified group (group name).  *  &#x60;groupCustomField&#x60; Grant for a user in the group selected in the specified custom field (custom field ID).  *  &#x60;projectLead&#x60; Grant for a project lead.  *  &#x60;projectRole&#x60; Grant for the specified project role (project role ID).  *  &#x60;reporter&#x60; Grant for the user who reported the issue.  *  &#x60;sd.customer.portal.only&#x60; Jira Service Desk only. Grants customers permission to access the customer portal but not Jira. See [Customizing Jira Service Desk permissions](https://confluence.atlassian.com/x/24dKLg) for more information.  *  &#x60;user&#x60; Grant for the specified user (user ID - historically this was the userkey but that is deprecated and the account ID should be used).  *  &#x60;userCustomField&#x60; Grant for a user selected in the specified custom field (custom field ID).  #### Built-in permissions ####  The [built-in Jira permissions](https://confluence.atlassian.com/x/yodKLg) are listed below. Apps can also define custom permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information.  **Project permissions**   *  &#x60;ADMINISTER_PROJECTS&#x60;  *  &#x60;BROWSE_PROJECTS&#x60;  *  &#x60;MANAGE_SPRINTS_PERMISSION&#x60; (Jira Software only)  *  &#x60;SERVICEDESK_AGENT&#x60; (Jira Service Desk only)  *  &#x60;VIEW_DEV_TOOLS&#x60; (Jira Software only)  *  &#x60;VIEW_READONLY_WORKFLOW&#x60;  **Issue permissions**   *  &#x60;ASSIGNABLE_USER&#x60;  *  &#x60;ASSIGN_ISSUES&#x60;  *  &#x60;CLOSE_ISSUES&#x60;  *  &#x60;CREATE_ISSUES&#x60;  *  &#x60;DELETE_ISSUES&#x60;  *  &#x60;EDIT_ISSUES&#x60;  *  &#x60;LINK_ISSUES&#x60;  *  &#x60;MODIFY_REPORTER&#x60;  *  &#x60;MOVE_ISSUES&#x60;  *  &#x60;RESOLVE_ISSUES&#x60;  *  &#x60;SCHEDULE_ISSUES&#x60;  *  &#x60;SET_ISSUE_SECURITY&#x60;  *  &#x60;TRANSITION_ISSUES&#x60;  **Voters and watchers permissions**   *  &#x60;MANAGE_WATCHERS&#x60;  *  &#x60;VIEW_VOTERS_AND_WATCHERS&#x60;  **Comments permissions**   *  &#x60;ADD_COMMENTS&#x60;  *  &#x60;DELETE_ALL_COMMENTS&#x60;  *  &#x60;DELETE_OWN_COMMENTS&#x60;  *  &#x60;EDIT_ALL_COMMENTS&#x60;  *  &#x60;EDIT_OWN_COMMENTS&#x60;  **Attachments permissions**   *  &#x60;CREATE_ATTACHMENTS&#x60;  *  &#x60;DELETE_ALL_ATTACHMENTS&#x60;  *  &#x60;DELETE_OWN_ATTACHMENTS&#x60;  **Time tracking permissions**   *  &#x60;DELETE_ALL_WORKLOGS&#x60;  *  &#x60;DELETE_OWN_WORKLOGS&#x60;  *  &#x60;EDIT_ALL_WORKLOGS&#x60;  *  &#x60;EDIT_OWN_WORKLOGS&#x60;  *  &#x60;WORK_ON_ISSUES&#x60;  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. (optional)
   * @return PermissionSchemes
   * @throws ApiException if fails to make API call
   */
  public PermissionSchemes getAllPermissionSchemes(String expand) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme";

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

    GenericType<PermissionSchemes> localVarReturnType = new GenericType<PermissionSchemes>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get permission scheme
   * Returns a permission scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param schemeId The ID of the permission scheme to return. (required)
   * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. (optional)
   * @return PermissionScheme
   * @throws ApiException if fails to make API call
   */
  public PermissionScheme getPermissionScheme(Long schemeId, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'schemeId' is set
    if (schemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemeId' when calling getPermissionScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme/{schemeId}"
      .replaceAll("\\{" + "schemeId" + "\\}", apiClient.escapeString(schemeId.toString()));

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

    GenericType<PermissionScheme> localVarReturnType = new GenericType<PermissionScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get permission scheme grant
   * Returns a permission grant.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param schemeId The ID of the permission scheme. (required)
   * @param permissionId The ID of the permission grant. (required)
   * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. (optional)
   * @return PermissionGrant
   * @throws ApiException if fails to make API call
   */
  public PermissionGrant getPermissionSchemeGrant(Long schemeId, Long permissionId, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'schemeId' is set
    if (schemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemeId' when calling getPermissionSchemeGrant");
    }
    // verify the required parameter 'permissionId' is set
    if (permissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionId' when calling getPermissionSchemeGrant");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme/{schemeId}/permission/{permissionId}"
      .replaceAll("\\{" + "schemeId" + "\\}", apiClient.escapeString(schemeId.toString()))
      .replaceAll("\\{" + "permissionId" + "\\}", apiClient.escapeString(permissionId.toString()));

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

    GenericType<PermissionGrant> localVarReturnType = new GenericType<PermissionGrant>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get permission scheme grants
   * Returns all permission grants for a permission scheme.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param schemeId The ID of the permission scheme. (required)
   * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;all&#x60; Returns all expandable information. (optional)
   * @return PermissionGrants
   * @throws ApiException if fails to make API call
   */
  public PermissionGrants getPermissionSchemeGrants(Long schemeId, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'schemeId' is set
    if (schemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemeId' when calling getPermissionSchemeGrants");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme/{schemeId}/permission"
      .replaceAll("\\{" + "schemeId" + "\\}", apiClient.escapeString(schemeId.toString()));

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

    GenericType<PermissionGrants> localVarReturnType = new GenericType<PermissionGrants>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update permission scheme
   * Updates a permission scheme. Below are some important things to note when using this resource:   *  If a permissions list is present in the request, then it is set in the permission scheme, overwriting *all existing* grants.  *  If you want to update only the name and description, then do not send a permissions list in the request.  *  Sending an empty list will remove all permission grants from the permission scheme.  If you want to add or delete a permission grant instead of updating the whole list, see [Create permission grant](#api-rest-api-3-permissionscheme-schemeId-permission-post) or [Delete permission scheme entity](#api-rest-api-3-permissionscheme-schemeId-permission-permissionId-delete).  See [About permission schemes and grants](#about-permission-schemes) for more details.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param schemeId The ID of the permission scheme to update. (required)
   * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. (optional)
   * @return PermissionScheme
   * @throws ApiException if fails to make API call
   */
  public PermissionScheme updatePermissionScheme(Map<String, Object> body, Long schemeId, String expand) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePermissionScheme");
    }
    // verify the required parameter 'schemeId' is set
    if (schemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemeId' when calling updatePermissionScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissionscheme/{schemeId}"
      .replaceAll("\\{" + "schemeId" + "\\}", apiClient.escapeString(schemeId.toString()));

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

    GenericType<PermissionScheme> localVarReturnType = new GenericType<PermissionScheme>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
