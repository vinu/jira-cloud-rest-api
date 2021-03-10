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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueTypePropertiesApi {
  private ApiClient apiClient;

  public IssueTypePropertiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueTypePropertiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete issue type property
   * Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param issueTypeId The ID of the issue type. (required)
   * @param propertyKey The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIssueTypeProperty(String issueTypeId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueTypeId' is set
    if (issueTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeId' when calling deleteIssueTypeProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling deleteIssueTypeProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}"
      .replaceAll("\\{" + "issueTypeId" + "\\}", apiClient.escapeString(issueTypeId.toString()))
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
   * Get issue type property
   * Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.
   * @param issueTypeId The ID of the issue type. (required)
   * @param propertyKey The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys. (required)
   * @return EntityProperty
   * @throws ApiException if fails to make API call
   */
  public EntityProperty getIssueTypeProperty(String issueTypeId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueTypeId' is set
    if (issueTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeId' when calling getIssueTypeProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling getIssueTypeProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}"
      .replaceAll("\\{" + "issueTypeId" + "\\}", apiClient.escapeString(issueTypeId.toString()))
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
   * Get issue type property keys
   * Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.
   * @param issueTypeId The ID of the issue type. (required)
   * @return PropertyKeys
   * @throws ApiException if fails to make API call
   */
  public PropertyKeys getIssueTypePropertyKeys(String issueTypeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueTypeId' is set
    if (issueTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeId' when calling getIssueTypePropertyKeys");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetype/{issueTypeId}/properties"
      .replaceAll("\\{" + "issueTypeId" + "\\}", apiClient.escapeString(issueTypeId.toString()));

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
   * Set issue type property
   * Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueTypeId The ID of the issue type. (required)
   * @param propertyKey The key of the issue type property. The maximum length is 255 characters. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object setIssueTypeProperty(Object body, String issueTypeId, String propertyKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setIssueTypeProperty");
    }
    // verify the required parameter 'issueTypeId' is set
    if (issueTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeId' when calling setIssueTypeProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling setIssueTypeProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}"
      .replaceAll("\\{" + "issueTypeId" + "\\}", apiClient.escapeString(issueTypeId.toString()))
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
