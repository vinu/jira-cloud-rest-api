package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.BulkPermissionGrants;
import com.xminds.jira.rest.client.model.BulkPermissionsRequestBean;
import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.Permissions;
import com.xminds.jira.rest.client.model.PermissionsKeysBean;
import com.xminds.jira.rest.client.model.PermittedProjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class PermissionsApi {
  private ApiClient apiClient;

  public PermissionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PermissionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get all permissions
   * Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @return Permissions
   * @throws ApiException if fails to make API call
   */
  public Permissions getAllPermissions() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/permissions";

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

    GenericType<Permissions> localVarReturnType = new GenericType<Permissions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get bulk permissions
   * Returns:   *  for a list of global permissions, the global permissions granted to a user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.  If no account ID is provided, the operation returns details for the logged in user.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  *  globalPermissions, projectPermissions, projects, permissions, issues having null values in the input are ignored.  *  globalPermissions, permissions having blank string values in the input are ignored  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn&#x27;t apply to calls made using AP.request() in a browser.
   * @param body Details of the permissions to check. (required)
   * @return BulkPermissionGrants
   * @throws ApiException if fails to make API call
   */
  public BulkPermissionGrants getBulkPermissions(BulkPermissionsRequestBean body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getBulkPermissions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissions/check";

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

    GenericType<BulkPermissionGrants> localVarReturnType = new GenericType<BulkPermissionGrants>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get my permissions
   * Returns a list of permissions indicating which permissions the user has. Details of the user&#x27;s permissions can be obtained in a global, project, or issue context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission&#x27;s criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param projectKey The key of project. Ignored if &#x60;projectId&#x60; is provided. (optional)
   * @param projectId The ID of project. (optional)
   * @param issueKey The key of the issue. Ignored if &#x60;issueId&#x60; is provided. (optional)
   * @param issueId The ID of the issue. (optional)
   * @param permissions A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get). (optional)
   * @param projectUuid  (optional)
   * @param projectConfigurationUuid  (optional)
   * @return Permissions
   * @throws ApiException if fails to make API call
   */
  public Permissions getMyPermissions(String projectKey, String projectId, String issueKey, String issueId, String permissions, String projectUuid, String projectConfigurationUuid) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/mypermissions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectKey", projectKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issueKey", issueKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issueId", issueId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permissions", permissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectUuid", projectUuid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectConfigurationUuid", projectConfigurationUuid));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Permissions> localVarReturnType = new GenericType<Permissions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get permitted projects
   * Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param body  (required)
   * @return PermittedProjects
   * @throws ApiException if fails to make API call
   */
  public PermittedProjects getPermittedProjects(PermissionsKeysBean body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getPermittedProjects");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/permissions/project";

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

    GenericType<PermittedProjects> localVarReturnType = new GenericType<PermittedProjects>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
