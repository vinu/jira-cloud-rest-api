package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.EntityProperty;
import com.xminds.jira.rest.client.model.PropertyKeys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueCommentPropertiesApi {
  private ApiClient apiClient;

  public IssueCommentPropertiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueCommentPropertiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete comment property
   * Deletes a comment property.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
   * @param commentId The ID of the comment. (required)
   * @param propertyKey The key of the property. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCommentProperty(String commentId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling deleteCommentProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling deleteCommentProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/comment/{commentId}/properties/{propertyKey}"
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "propertyKey" + "\\}", apiClient.escapeString(propertyKey.toString()));

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
   * Get comment property
   * Returns the value of a comment property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param commentId The ID of the comment. (required)
   * @param propertyKey The key of the property. (required)
   * @return EntityProperty
   * @throws ApiException if fails to make API call
   */
  public EntityProperty getCommentProperty(String commentId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling getCommentProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling getCommentProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/comment/{commentId}/properties/{propertyKey}"
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "propertyKey" + "\\}", apiClient.escapeString(propertyKey.toString()));

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

    GenericType<EntityProperty> localVarReturnType = new GenericType<EntityProperty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get comment property keys
   * Returns the keys of all the properties of a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param commentId The ID of the comment. (required)
   * @return PropertyKeys
   * @throws ApiException if fails to make API call
   */
  public PropertyKeys getCommentPropertyKeys(String commentId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling getCommentPropertyKeys");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/comment/{commentId}/properties"
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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

    GenericType<PropertyKeys> localVarReturnType = new GenericType<PropertyKeys>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set comment property
   * Creates or updates the value of a property for a comment. Use this resource to store custom data against a comment.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
   * @param body  (required)
   * @param commentId The ID of the comment. (required)
   * @param propertyKey The key of the property. The maximum length is 255 characters. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object setCommentProperty(Object body, String commentId, String propertyKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setCommentProperty");
    }
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling setCommentProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling setCommentProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/comment/{commentId}/properties/{propertyKey}"
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
      .replaceAll("\\{" + "propertyKey" + "\\}", apiClient.escapeString(propertyKey.toString()));

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
