package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.StatusDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class WorkflowStatusesApi {
  private ApiClient apiClient;

  public WorkflowStatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowStatusesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get status
   * Returns a status. The status must be associated with a workflow to be returned.  If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.  This operation can be accessed anonymously.  [Permissions](#permissions) required: None.
   * @param idOrName The ID or name of the status. (required)
   * @return StatusDetails
   * @throws ApiException if fails to make API call
   */
  public StatusDetails getStatus(String idOrName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'idOrName' is set
    if (idOrName == null) {
      throw new ApiException(400, "Missing the required parameter 'idOrName' when calling getStatus");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/status/{idOrName}"
      .replaceAll("\\{" + "idOrName" + "\\}", apiClient.escapeString(idOrName.toString()));

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

    GenericType<StatusDetails> localVarReturnType = new GenericType<StatusDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all statuses
   * Returns a list of all statuses associated with workflows.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @return List&lt;StatusDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StatusDetails> getStatuses() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/status";

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

    GenericType<List<StatusDetails>> localVarReturnType = new GenericType<List<StatusDetails>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
