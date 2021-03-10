package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.Avatar;
import com.xminds.jira.rest.client.model.ProjectAvatars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ProjectAvatarsApi {
  private ApiClient apiClient;

  public ProjectAvatarsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectAvatarsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Load project avatar
   * Loads an avatar for a project.  Specify the avatar&#x27;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#x27;X-Atlassian-Token: no-check&#x27; &#x60;  &#x60;--header &#x27;Content-Type: image/&lt; image_type&gt;&#x27; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#x27;https://your-domain.atlassian.net/rest/api/3/project/{projectIdOrKey}/avatar2&#x27;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#x27;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#x27;s displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
   * @param body  (required)
   * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
   * @param x The X coordinate of the top-left corner of the crop region. (optional, default to 0)
   * @param y The Y coordinate of the top-left corner of the crop region. (optional, default to 0)
   * @param size The length of each side of the crop region. (optional)
   * @return Avatar
   * @throws ApiException if fails to make API call
   */
  public Avatar createProjectAvatar(Object body, String projectIdOrKey, Integer x, Integer y, Integer size) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createProjectAvatar");
    }
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling createProjectAvatar");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/avatar2"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "x", x));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "y", y));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Avatar> localVarReturnType = new GenericType<Avatar>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete project avatar
   * Deletes a custom avatar from a project. Note that system avatars cannot be deleted.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
   * @param projectIdOrKey The project ID or (case-sensitive) key. (required)
   * @param id The ID of the avatar. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProjectAvatar(String projectIdOrKey, Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling deleteProjectAvatar");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProjectAvatar");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/avatar/{id}"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Get all project avatars
   * Returns all project avatars, grouped by system and custom avatars.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
   * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
   * @return ProjectAvatars
   * @throws ApiException if fails to make API call
   */
  public ProjectAvatars getAllProjectAvatars(String projectIdOrKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling getAllProjectAvatars");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/avatars"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()));

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

    GenericType<ProjectAvatars> localVarReturnType = new GenericType<ProjectAvatars>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set project avatar
   * Sets the avatar displayed for a project.  Use [Load project avatar](#api-rest-api-3-project-projectIdOrKey-avatar2-post) to store avatars against the project, before using this operation to set the displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
   * @param body  (required)
   * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateProjectAvatar(Avatar body, String projectIdOrKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateProjectAvatar");
    }
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling updateProjectAvatar");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/avatar"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()));

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
}
