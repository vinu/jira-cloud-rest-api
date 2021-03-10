package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.SecurityScheme;
import com.xminds.jira.rest.client.model.SecuritySchemes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueSecuritySchemesApi {
  private ApiClient apiClient;

  public IssueSecuritySchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueSecuritySchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get issue security scheme
   * Returns an issue security scheme along with its security levels.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.
   * @param id The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs. (required)
   * @return SecurityScheme
   * @throws ApiException if fails to make API call
   */
  public SecurityScheme getIssueSecurityScheme(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getIssueSecurityScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuesecurityschemes/{id}"
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

    GenericType<SecurityScheme> localVarReturnType = new GenericType<SecurityScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue security schemes
   * Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @return SecuritySchemes
   * @throws ApiException if fails to make API call
   */
  public SecuritySchemes getIssueSecuritySchemes() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/issuesecurityschemes";

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

    GenericType<SecuritySchemes> localVarReturnType = new GenericType<SecuritySchemes>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
