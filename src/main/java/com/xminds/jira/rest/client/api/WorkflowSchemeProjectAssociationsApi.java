package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ContainerOfWorkflowSchemeAssociations;
import com.xminds.jira.rest.client.model.WorkflowSchemeProjectAssociation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class WorkflowSchemeProjectAssociationsApi {
  private ApiClient apiClient;

  public WorkflowSchemeProjectAssociationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowSchemeProjectAssociationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Assign workflow scheme to project
   * Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.  Workflow schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object associateSchemeWithProject(WorkflowSchemeProjectAssociation body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling associateSchemeWithProject");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/project";

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
  /**
   * Get workflow scheme project associations
   * Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any next-gen or non-existent projects in the request are ignored and no errors are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param projectId The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. (required)
   * @return ContainerOfWorkflowSchemeAssociations
   * @throws ApiException if fails to make API call
   */
  public ContainerOfWorkflowSchemeAssociations getWorkflowSchemeProjectAssociations(List<Long> projectId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getWorkflowSchemeProjectAssociations");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/project";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "projectId", projectId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<ContainerOfWorkflowSchemeAssociations> localVarReturnType = new GenericType<ContainerOfWorkflowSchemeAssociations>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
