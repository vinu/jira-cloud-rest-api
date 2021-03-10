package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.StatusCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class WorkflowStatusCategoriesApi {
  private ApiClient apiClient;

  public WorkflowStatusCategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowStatusCategoriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get all status categories
   * Returns a list of all status categories.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @return List&lt;StatusCategory&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StatusCategory> getStatusCategories() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/statuscategory";

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

    GenericType<List<StatusCategory>> localVarReturnType = new GenericType<List<StatusCategory>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get status category
   * Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-3-status-idOrName-get).  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param idOrKey The ID or key of the status category. (required)
   * @return StatusCategory
   * @throws ApiException if fails to make API call
   */
  public StatusCategory getStatusCategory(String idOrKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'idOrKey' is set
    if (idOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'idOrKey' when calling getStatusCategory");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/statuscategory/{idOrKey}"
      .replaceAll("\\{" + "idOrKey" + "\\}", apiClient.escapeString(idOrKey.toString()));

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

    GenericType<StatusCategory> localVarReturnType = new GenericType<StatusCategory>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
