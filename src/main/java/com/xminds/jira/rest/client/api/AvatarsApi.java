package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.Avatar;
import com.xminds.jira.rest.client.model.Avatars;
import com.xminds.jira.rest.client.model.SystemAvatars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class AvatarsApi {
  private ApiClient apiClient;

  public AvatarsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AvatarsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete avatar
   * Deletes an avatar from a project or issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param type The avatar type. (required)
   * @param owningObjectId The ID of the item the avatar is associated with. (required)
   * @param id The ID of the avatar. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAvatar(String type, String owningObjectId, Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling deleteAvatar");
    }
    // verify the required parameter 'owningObjectId' is set
    if (owningObjectId == null) {
      throw new ApiException(400, "Missing the required parameter 'owningObjectId' when calling deleteAvatar");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAvatar");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "owningObjectId" + "\\}", apiClient.escapeString(owningObjectId.toString()))
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
   * Get system avatars by type
   * Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param type The avatar type. (required)
   * @return SystemAvatars
   * @throws ApiException if fails to make API call
   */
  public SystemAvatars getAllSystemAvatars(String type) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getAllSystemAvatars");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/avatar/{type}/system"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<SystemAvatars> localVarReturnType = new GenericType<SystemAvatars>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get avatars
   * Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param type The avatar type. (required)
   * @param entityId The ID of the item the avatar is associated with. (required)
   * @return Avatars
   * @throws ApiException if fails to make API call
   */
  public Avatars getAvatars(String type, String entityId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getAvatars");
    }
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling getAvatars");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/universal_avatar/type/{type}/owner/{entityId}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "entityId" + "\\}", apiClient.escapeString(entityId.toString()));

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

    GenericType<Avatars> localVarReturnType = new GenericType<Avatars>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Load avatar
   * Loads a custom avatar for a project or issue type.  Specify the avatar&#x27;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#x27;X-Atlassian-Token: no-check&#x27; &#x60;  &#x60;--header &#x27;Content-Type: image/&lt; image_type&gt;&#x27; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#x27;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#x27;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#x27;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#x27;s displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#x27;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param size The length of each side of the crop region. (required)
   * @param type The avatar type. (required)
   * @param entityId The ID of the item the avatar is associated with. (required)
   * @param x The X coordinate of the top-left corner of the crop region. (optional, default to 0)
   * @param y The Y coordinate of the top-left corner of the crop region. (optional, default to 0)
   * @return Avatar
   * @throws ApiException if fails to make API call
   */
  public Avatar storeAvatar(Object body, Integer size, String type, String entityId, Integer x, Integer y) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling storeAvatar");
    }
    // verify the required parameter 'size' is set
    if (size == null) {
      throw new ApiException(400, "Missing the required parameter 'size' when calling storeAvatar");
    }
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling storeAvatar");
    }
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling storeAvatar");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/universal_avatar/type/{type}/owner/{entityId}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "entityId" + "\\}", apiClient.escapeString(entityId.toString()));

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
}
