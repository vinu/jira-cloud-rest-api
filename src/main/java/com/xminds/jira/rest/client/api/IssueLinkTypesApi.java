package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.IssueLinkType;
import com.xminds.jira.rest.client.model.IssueLinkTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueLinkTypesApi {
  private ApiClient apiClient;

  public IssueLinkTypesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueLinkTypesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create issue link type
   * Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link&#x27;s inward and outward relationships.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return IssueLinkType
   * @throws ApiException if fails to make API call
   */
  public IssueLinkType createIssueLinkType(IssueLinkType body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIssueLinkType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issueLinkType";

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

    GenericType<IssueLinkType> localVarReturnType = new GenericType<IssueLinkType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete issue link type
   * Deletes an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param issueLinkTypeId The ID of the issue link type. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIssueLinkType(String issueLinkTypeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueLinkTypeId' is set
    if (issueLinkTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueLinkTypeId' when calling deleteIssueLinkType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issueLinkType/{issueLinkTypeId}"
      .replaceAll("\\{" + "issueLinkTypeId" + "\\}", apiClient.escapeString(issueLinkTypeId.toString()));

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
   * Get issue link type
   * Returns an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
   * @param issueLinkTypeId The ID of the issue link type. (required)
   * @return IssueLinkType
   * @throws ApiException if fails to make API call
   */
  public IssueLinkType getIssueLinkType(String issueLinkTypeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueLinkTypeId' is set
    if (issueLinkTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueLinkTypeId' when calling getIssueLinkType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issueLinkType/{issueLinkTypeId}"
      .replaceAll("\\{" + "issueLinkTypeId" + "\\}", apiClient.escapeString(issueLinkTypeId.toString()));

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

    GenericType<IssueLinkType> localVarReturnType = new GenericType<IssueLinkType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue link types
   * Returns a list of all issue link types.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
   * @return IssueLinkTypes
   * @throws ApiException if fails to make API call
   */
  public IssueLinkTypes getIssueLinkTypes() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/issueLinkType";

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

    GenericType<IssueLinkTypes> localVarReturnType = new GenericType<IssueLinkTypes>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update issue link type
   * Updates an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueLinkTypeId The ID of the issue link type. (required)
   * @return IssueLinkType
   * @throws ApiException if fails to make API call
   */
  public IssueLinkType updateIssueLinkType(IssueLinkType body, String issueLinkTypeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIssueLinkType");
    }
    // verify the required parameter 'issueLinkTypeId' is set
    if (issueLinkTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueLinkTypeId' when calling updateIssueLinkType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issueLinkType/{issueLinkTypeId}"
      .replaceAll("\\{" + "issueLinkTypeId" + "\\}", apiClient.escapeString(issueLinkTypeId.toString()));

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

    GenericType<IssueLinkType> localVarReturnType = new GenericType<IssueLinkType>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
