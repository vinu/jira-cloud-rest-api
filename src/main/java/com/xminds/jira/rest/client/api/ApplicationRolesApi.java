package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ApplicationRole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ApplicationRolesApi {
  private ApiClient apiClient;

  public ApplicationRolesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationRolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get all application roles
   * Returns all application roles. In Jira, application roles are managed using the [Application access configuration](https://confluence.atlassian.com/x/3YxjL) page.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @return List&lt;ApplicationRole&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ApplicationRole> getAllApplicationRoles() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/applicationrole";

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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<ApplicationRole>> localVarReturnType = new GenericType<List<ApplicationRole>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get application role
   * Returns an application role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param key The key of the application role. Use the [Get all application roles](#api-rest-api-3-applicationrole-get) operation to get the key for each application role. (required)
   * @return ApplicationRole
   * @throws ApiException if fails to make API call
   */
  public ApplicationRole getApplicationRole(String key) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getApplicationRole");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/applicationrole/{key}"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ApplicationRole> localVarReturnType = new GenericType<ApplicationRole>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
