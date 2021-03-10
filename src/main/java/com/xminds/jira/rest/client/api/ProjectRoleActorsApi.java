package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ActorInputBean;
import com.xminds.jira.rest.client.model.ActorsMap;
import com.xminds.jira.rest.client.model.ProjectRole;
import com.xminds.jira.rest.client.model.ProjectRoleActorsUpdateBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ProjectRoleActorsApi {
  private ApiClient apiClient;

  public ProjectRoleActorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectRoleActorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add actors to project role
   * Adds actors to a project role for the project.  To replace all actors for the project, use [Set actors for project role](#api-rest-api-3-project-projectIdOrKey-role-id-put).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The groups or users to associate with the project role for this project. Provide the user account ID or group name. (required)
   * @param projectIdOrKey The project ID or project key (case sensitive). (required)
   * @param id The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. (required)
   * @return ProjectRole
   * @throws ApiException if fails to make API call
   */
  public ProjectRole addActorUsers(ActorsMap body, String projectIdOrKey, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addActorUsers");
    }
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling addActorUsers");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addActorUsers");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/role/{id}"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ProjectRole> localVarReturnType = new GenericType<ProjectRole>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Add default actors to project role
   * Adds [default actors](#api-rest-api-3-resolution-get) to a role. You may add groups or users, but you cannot add groups and users in the same request.  Changing a project role&#x27;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param id The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. (required)
   * @return ProjectRole
   * @throws ApiException if fails to make API call
   */
  public ProjectRole addProjectRoleActorsToRole(ActorInputBean body, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addProjectRoleActorsToRole");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addProjectRoleActorsToRole");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/role/{id}/actors"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ProjectRole> localVarReturnType = new GenericType<ProjectRole>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete actors from project role
   * Deletes actors from a project role for the project.  To remove default actors from the project role, use [Delete default actors from project role](#api-rest-api-3-role-id-actors-delete).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param projectIdOrKey The project ID or project key (case sensitive). (required)
   * @param id The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. (required)
   * @param user The user account ID of the user to remove from the project role. (optional)
   * @param group The name of the group to remove from the project role. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteActor(String projectIdOrKey, Long id, String user, String group) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling deleteActor");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteActor");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/role/{id}"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user", user));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group", group));


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
   * Delete default actors from project role
   * Deletes the [default actors](#api-rest-api-3-resolution-get) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.  Changing a project role&#x27;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. (required)
   * @param user The user account ID of the user to remove as a default actor. (optional)
   * @param group The group name of the group to be removed as a default actor. (optional)
   * @return ProjectRole
   * @throws ApiException if fails to make API call
   */
  public ProjectRole deleteProjectRoleActorsFromRole(Long id, String user, String group) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProjectRoleActorsFromRole");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/role/{id}/actors"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user", user));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group", group));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<ProjectRole> localVarReturnType = new GenericType<ProjectRole>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get default actors for project role
   * Returns the [default actors](#api-rest-api-3-resolution-get) for the project role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. (required)
   * @return ProjectRole
   * @throws ApiException if fails to make API call
   */
  public ProjectRole getProjectRoleActorsForRole(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getProjectRoleActorsForRole");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/role/{id}/actors"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ProjectRole> localVarReturnType = new GenericType<ProjectRole>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set actors for project role
   * Sets the actors for a project role for a project, replacing all existing actors.  To add actors to the project without overwriting the existing list, use [Add actors to project role](#api-rest-api-3-project-projectIdOrKey-role-id-post).  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The groups or users to associate with the project role for this project. Provide the user account ID or group name. (required)
   * @param projectIdOrKey The project ID or project key (case sensitive). (required)
   * @param id The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. (required)
   * @return ProjectRole
   * @throws ApiException if fails to make API call
   */
  public ProjectRole setActors(ProjectRoleActorsUpdateBean body, String projectIdOrKey, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setActors");
    }
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling setActors");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setActors");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/role/{id}"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ProjectRole> localVarReturnType = new GenericType<ProjectRole>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
