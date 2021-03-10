package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.DefaultShareScope;
import com.xminds.jira.rest.client.model.SharePermission;
import com.xminds.jira.rest.client.model.SharePermissionInputBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class FilterSharingApi {
  private ApiClient apiClient;

  public FilterSharingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FilterSharingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add share permission
   * Add a share permissions to a filter. If you add a global share permission (one for all logged-in users or the public) it will overwrite all share permissions for the filter.  Be aware that this operation uses different objects for updating share permissions compared to [Update filter](#api-rest-api-3-filter-id-put).  **[Permissions](#permissions) required:** *Share dashboards and filters* [global permission](https://confluence.atlassian.com/x/x4dKLg) and the user must own the filter.
   * @param body  (required)
   * @param id The ID of the filter. (required)
   * @return List&lt;SharePermission&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SharePermission> addSharePermission(SharePermissionInputBean body, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addSharePermission");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addSharePermission");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/filter/{id}/permission"
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

    GenericType<List<SharePermission>> localVarReturnType = new GenericType<List<SharePermission>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete share permission
   * Deletes a share permission from a filter.  **[Permissions](#permissions) required:** Permission to access Jira and the user must own the filter.
   * @param id The ID of the filter. (required)
   * @param permissionId The ID of the share permission. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSharePermission(Long id, Long permissionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSharePermission");
    }
    // verify the required parameter 'permissionId' is set
    if (permissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionId' when calling deleteSharePermission");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/filter/{id}/permission/{permissionId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
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
   * Get default share scope
   * Returns the default sharing settings for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @return DefaultShareScope
   * @throws ApiException if fails to make API call
   */
  public DefaultShareScope getDefaultShareScope() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/filter/defaultShareScope";

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

    GenericType<DefaultShareScope> localVarReturnType = new GenericType<DefaultShareScope>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get share permission
   * Returns a share permission for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, a share permission is only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
   * @param id The ID of the filter. (required)
   * @param permissionId The ID of the share permission. (required)
   * @return SharePermission
   * @throws ApiException if fails to make API call
   */
  public SharePermission getSharePermission(Long id, Long permissionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSharePermission");
    }
    // verify the required parameter 'permissionId' is set
    if (permissionId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionId' when calling getSharePermission");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/filter/{id}/permission/{permissionId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "permissionId" + "\\}", apiClient.escapeString(permissionId.toString()));

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

    GenericType<SharePermission> localVarReturnType = new GenericType<SharePermission>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get share permissions
   * Returns the share permissions for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, share permissions are only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
   * @param id The ID of the filter. (required)
   * @return List&lt;SharePermission&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SharePermission> getSharePermissions(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSharePermissions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/filter/{id}/permission"
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

    GenericType<List<SharePermission>> localVarReturnType = new GenericType<List<SharePermission>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set default share scope
   * Sets the default sharing for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param body  (required)
   * @return DefaultShareScope
   * @throws ApiException if fails to make API call
   */
  public DefaultShareScope setDefaultShareScope(DefaultShareScope body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setDefaultShareScope");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/filter/defaultShareScope";

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

    GenericType<DefaultShareScope> localVarReturnType = new GenericType<DefaultShareScope>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
