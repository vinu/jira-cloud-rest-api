package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.IdBean;
import com.xminds.jira.rest.client.model.PermissionScheme;
import com.xminds.jira.rest.client.model.ProjectIssueSecurityLevels;
import com.xminds.jira.rest.client.model.SecurityScheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ProjectPermissionSchemesApi {
  private ApiClient apiClient;

  public ProjectPermissionSchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectPermissionSchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Assign permission scheme
   * Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)
   * @param body  (required)
   * @param projectKeyOrId The project ID or project key (case sensitive). (required)
   * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. (optional)
   * @return PermissionScheme
   * @throws ApiException if fails to make API call
   */
  public PermissionScheme assignPermissionScheme(IdBean body, String projectKeyOrId, String expand) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignPermissionScheme");
    }
    // verify the required parameter 'projectKeyOrId' is set
    if (projectKeyOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKeyOrId' when calling assignPermissionScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectKeyOrId}/permissionscheme"
      .replaceAll("\\{" + "projectKeyOrId" + "\\}", apiClient.escapeString(projectKeyOrId.toString()));

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
  /**
   * Get assigned permission scheme
   * Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
   * @param projectKeyOrId The project ID or project key (case sensitive). (required)
   * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. (optional)
   * @return PermissionScheme
   * @throws ApiException if fails to make API call
   */
  public PermissionScheme getAssignedPermissionScheme(String projectKeyOrId, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectKeyOrId' is set
    if (projectKeyOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKeyOrId' when calling getAssignedPermissionScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectKeyOrId}/permissionscheme"
      .replaceAll("\\{" + "projectKeyOrId" + "\\}", apiClient.escapeString(projectKeyOrId.toString()));

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
   * Get project issue security scheme
   * Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
   * @param projectKeyOrId The project ID or project key (case sensitive). (required)
   * @return SecurityScheme
   * @throws ApiException if fails to make API call
   */
  public SecurityScheme getProjectIssueSecurityScheme(String projectKeyOrId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectKeyOrId' is set
    if (projectKeyOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKeyOrId' when calling getProjectIssueSecurityScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectKeyOrId}/issuesecuritylevelscheme"
      .replaceAll("\\{" + "projectKeyOrId" + "\\}", apiClient.escapeString(projectKeyOrId.toString()));

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

    GenericType<SecurityScheme> localVarReturnType = new GenericType<SecurityScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get project issue security levels
   * Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.
   * @param projectKeyOrId The project ID or project key (case sensitive). (required)
   * @return ProjectIssueSecurityLevels
   * @throws ApiException if fails to make API call
   */
  public ProjectIssueSecurityLevels getSecurityLevelsForProject(String projectKeyOrId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectKeyOrId' is set
    if (projectKeyOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectKeyOrId' when calling getSecurityLevelsForProject");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectKeyOrId}/securitylevel"
      .replaceAll("\\{" + "projectKeyOrId" + "\\}", apiClient.escapeString(projectKeyOrId.toString()));

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

    GenericType<ProjectIssueSecurityLevels> localVarReturnType = new GenericType<ProjectIssueSecurityLevels>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
