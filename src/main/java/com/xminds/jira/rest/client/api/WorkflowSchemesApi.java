package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.DefaultWorkflow;
import com.xminds.jira.rest.client.model.IssueTypeWorkflowMapping;
import com.xminds.jira.rest.client.model.IssueTypesWorkflowMapping;
import com.xminds.jira.rest.client.model.PageBeanWorkflowScheme;
import com.xminds.jira.rest.client.model.WorkflowScheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class WorkflowSchemesApi {
  private ApiClient apiClient;

  public WorkflowSchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowSchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create workflow scheme
   * Creates a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme createWorkflowScheme(WorkflowScheme body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createWorkflowScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme";

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

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete default workflow
   * Resets the default workflow for a workflow scheme. That is, the default workflow is set to Jira&#x27;s system workflow (the *jira* workflow).  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the default workflow reset. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. (required)
   * @param updateDraftIfNeeded Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. (optional)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme deleteDefaultWorkflow(Long id, Boolean updateDraftIfNeeded) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDefaultWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/default"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateDraftIfNeeded", updateDraftIfNeeded));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete issue types for workflow in workflow scheme
   * Deletes the workflow-issue type mapping for a workflow in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the workflow-issue type mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. (required)
   * @param workflowName The name of the workflow. (required)
   * @param updateDraftIfNeeded Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkflowMapping(Long id, String workflowName, Boolean updateDraftIfNeeded) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkflowMapping");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling deleteWorkflowMapping");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/workflow"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateDraftIfNeeded", updateDraftIfNeeded));


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
   * Delete workflow scheme
   * Deletes a workflow scheme. Note that a workflow scheme cannot be deleted if it is active (that is, being used by at least one project).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkflowScheme(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkflowScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Delete workflow for issue type in workflow scheme
   * Deletes the issue type-workflow mapping for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the issue type-workflow mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. (required)
   * @param issueType The ID of the issue type. (required)
   * @param updateDraftIfNeeded Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. (optional)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme deleteWorkflowSchemeIssueType(Long id, String issueType, Boolean updateDraftIfNeeded) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkflowSchemeIssueType");
    }
    // verify the required parameter 'issueType' is set
    if (issueType == null) {
      throw new ApiException(400, "Missing the required parameter 'issueType' when calling deleteWorkflowSchemeIssueType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/issuetype/{issueType}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "issueType" + "\\}", apiClient.escapeString(issueType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateDraftIfNeeded", updateDraftIfNeeded));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all workflow schemes
   * Returns a [paginated](#pagination) list of all workflow schemes, not including draft workflow schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanWorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public PageBeanWorkflowScheme getAllWorkflowSchemes(Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanWorkflowScheme> localVarReturnType = new GenericType<PageBeanWorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get default workflow
   * Returns the default workflow for a workflow scheme. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. (required)
   * @param returnDraftIfExists Set to &#x60;true&#x60; to return the default workflow for the workflow scheme&#x27;s draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned. (optional, default to false)
   * @return DefaultWorkflow
   * @throws ApiException if fails to make API call
   */
  public DefaultWorkflow getDefaultWorkflow(Long id, Boolean returnDraftIfExists) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDefaultWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/default"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnDraftIfExists", returnDraftIfExists));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<DefaultWorkflow> localVarReturnType = new GenericType<DefaultWorkflow>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue types for workflows in workflow scheme
   * Returns the workflow-issue type mappings for a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. (required)
   * @param workflowName The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. (optional)
   * @param returnDraftIfExists Returns the mapping from the workflow scheme&#x27;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. (optional, default to false)
   * @return IssueTypesWorkflowMapping
   * @throws ApiException if fails to make API call
   */
  public IssueTypesWorkflowMapping getWorkflow(Long id, String workflowName, Boolean returnDraftIfExists) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/workflow"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnDraftIfExists", returnDraftIfExists));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<IssueTypesWorkflowMapping> localVarReturnType = new GenericType<IssueTypesWorkflowMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get workflow scheme
   * Returns a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. (required)
   * @param returnDraftIfExists Returns the workflow scheme&#x27;s draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned. (optional, default to false)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme getWorkflowScheme(Long id, Boolean returnDraftIfExists) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkflowScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnDraftIfExists", returnDraftIfExists));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get workflow for issue type in workflow scheme
   * Returns the issue type-workflow mapping for an issue type in a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme. (required)
   * @param issueType The ID of the issue type. (required)
   * @param returnDraftIfExists Returns the mapping from the workflow scheme&#x27;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. (optional, default to false)
   * @return IssueTypeWorkflowMapping
   * @throws ApiException if fails to make API call
   */
  public IssueTypeWorkflowMapping getWorkflowSchemeIssueType(Long id, String issueType, Boolean returnDraftIfExists) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkflowSchemeIssueType");
    }
    // verify the required parameter 'issueType' is set
    if (issueType == null) {
      throw new ApiException(400, "Missing the required parameter 'issueType' when calling getWorkflowSchemeIssueType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/issuetype/{issueType}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "issueType" + "\\}", apiClient.escapeString(issueType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnDraftIfExists", returnDraftIfExists));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<IssueTypeWorkflowMapping> localVarReturnType = new GenericType<IssueTypeWorkflowMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set workflow for issue type in workflow scheme
   * Sets the workflow for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new issue type-workflow mapping. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The issue type-project mapping. (required)
   * @param id The ID of the workflow scheme. (required)
   * @param issueType The ID of the issue type. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme setWorkflowSchemeIssueType(IssueTypeWorkflowMapping body, Long id, String issueType) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setWorkflowSchemeIssueType");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setWorkflowSchemeIssueType");
    }
    // verify the required parameter 'issueType' is set
    if (issueType == null) {
      throw new ApiException(400, "Missing the required parameter 'issueType' when calling setWorkflowSchemeIssueType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/issuetype/{issueType}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "issueType" + "\\}", apiClient.escapeString(issueType.toString()));

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

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update default workflow
   * Sets the default workflow for a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request object and a draft workflow scheme is created or updated with the new default workflow. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The new default workflow. (required)
   * @param id The ID of the workflow scheme. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme updateDefaultWorkflow(DefaultWorkflow body, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDefaultWorkflow");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDefaultWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/default"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set issue types for workflow in workflow scheme
   * Sets the issue types for a workflow in a workflow scheme. The workflow can also be set as the default workflow for the workflow scheme. Unmapped issues types are mapped to the default workflow.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new workflow-issue types mappings. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param workflowName The name of the workflow. (required)
   * @param id The ID of the workflow scheme. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme updateWorkflowMapping(IssueTypesWorkflowMapping body, String workflowName, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowMapping");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling updateWorkflowMapping");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateWorkflowMapping");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/workflow"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update workflow scheme
   * Updates a workflow scheme, including the name, default workflow, issue type to project mappings, and more. If the workflow scheme is active (that is, being used by at least one project), then a draft workflow scheme is created or updated instead, provided that &#x60;updateDraftIfNeeded&#x60; is set to &#x60;true&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param id The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme updateWorkflowScheme(WorkflowScheme body, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowScheme");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateWorkflowScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
