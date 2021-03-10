package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ProjectType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ProjectTypesApi {
  private ApiClient apiClient;

  public ProjectTypesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectTypesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get accessible project type by key
   * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param projectTypeKey The key of the project type. (required)
   * @return ProjectType
   * @throws ApiException if fails to make API call
   */
  public ProjectType getAccessibleProjectTypeByKey(String projectTypeKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectTypeKey' is set
    if (projectTypeKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectTypeKey' when calling getAccessibleProjectTypeByKey");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/type/{projectTypeKey}/accessible"
      .replaceAll("\\{" + "projectTypeKey" + "\\}", apiClient.escapeString(projectTypeKey.toString()));

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

    GenericType<ProjectType> localVarReturnType = new GenericType<ProjectType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get licensed project types
   * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
   * @return List&lt;ProjectType&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ProjectType> getAllAccessibleProjectTypes() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/project/type/accessible";

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

    GenericType<List<ProjectType>> localVarReturnType = new GenericType<List<ProjectType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all project types
   * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @return List&lt;ProjectType&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ProjectType> getAllProjectTypes() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/project/type";

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

    GenericType<List<ProjectType>> localVarReturnType = new GenericType<List<ProjectType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get project type by key
   * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param projectTypeKey The key of the project type. (required)
   * @return ProjectType
   * @throws ApiException if fails to make API call
   */
  public ProjectType getProjectTypeByKey(String projectTypeKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectTypeKey' is set
    if (projectTypeKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectTypeKey' when calling getProjectTypeByKey");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/type/{projectTypeKey}"
      .replaceAll("\\{" + "projectTypeKey" + "\\}", apiClient.escapeString(projectTypeKey.toString()));

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

    GenericType<ProjectType> localVarReturnType = new GenericType<ProjectType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
