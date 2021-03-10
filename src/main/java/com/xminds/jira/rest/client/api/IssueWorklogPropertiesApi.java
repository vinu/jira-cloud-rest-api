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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueWorklogPropertiesApi {
  private ApiClient apiClient;

  public IssueWorklogPropertiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueWorklogPropertiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete worklog property
   * Deletes a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param worklogId The ID of the worklog. (required)
   * @param propertyKey The key of the property. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorklogProperty(String issueIdOrKey, String worklogId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling deleteWorklogProperty");
    }
    // verify the required parameter 'worklogId' is set
    if (worklogId == null) {
      throw new ApiException(400, "Missing the required parameter 'worklogId' when calling deleteWorklogProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling deleteWorklogProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "worklogId" + "\\}", apiClient.escapeString(worklogId.toString()))
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
   * Get worklog property
   * Returns the value of a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param worklogId The ID of the worklog. (required)
   * @param propertyKey The key of the property. (required)
   * @return EntityProperty
   * @throws ApiException if fails to make API call
   */
  public EntityProperty getWorklogProperty(String issueIdOrKey, String worklogId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getWorklogProperty");
    }
    // verify the required parameter 'worklogId' is set
    if (worklogId == null) {
      throw new ApiException(400, "Missing the required parameter 'worklogId' when calling getWorklogProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling getWorklogProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "worklogId" + "\\}", apiClient.escapeString(worklogId.toString()))
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
   * Get worklog property keys
   * Returns the keys of all properties for a worklog.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param worklogId The ID of the worklog. (required)
   * @return PropertyKeys
   * @throws ApiException if fails to make API call
   */
  public PropertyKeys getWorklogPropertyKeys(String issueIdOrKey, String worklogId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling getWorklogPropertyKeys");
    }
    // verify the required parameter 'worklogId' is set
    if (worklogId == null) {
      throw new ApiException(400, "Missing the required parameter 'worklogId' when calling getWorklogPropertyKeys");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "worklogId" + "\\}", apiClient.escapeString(worklogId.toString()));

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
   * Set worklog property
   * Sets the value of a worklog property. Use this operation to store custom data against the worklog.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
   * @param body  (required)
   * @param issueIdOrKey The ID or key of the issue. (required)
   * @param worklogId The ID of the worklog. (required)
   * @param propertyKey The key of the issue property. The maximum length is 255 characters. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object setWorklogProperty(Object body, String issueIdOrKey, String worklogId, String propertyKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setWorklogProperty");
    }
    // verify the required parameter 'issueIdOrKey' is set
    if (issueIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'issueIdOrKey' when calling setWorklogProperty");
    }
    // verify the required parameter 'worklogId' is set
    if (worklogId == null) {
      throw new ApiException(400, "Missing the required parameter 'worklogId' when calling setWorklogProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling setWorklogProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}"
      .replaceAll("\\{" + "issueIdOrKey" + "\\}", apiClient.escapeString(issueIdOrKey.toString()))
      .replaceAll("\\{" + "worklogId" + "\\}", apiClient.escapeString(worklogId.toString()))
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
