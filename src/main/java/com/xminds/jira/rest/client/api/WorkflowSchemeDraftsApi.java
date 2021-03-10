package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.DefaultWorkflow;
import com.xminds.jira.rest.client.model.IssueTypeWorkflowMapping;
import com.xminds.jira.rest.client.model.IssueTypesWorkflowMapping;
import com.xminds.jira.rest.client.model.WorkflowScheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class WorkflowSchemeDraftsApi {
  private ApiClient apiClient;

  public WorkflowSchemeDraftsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowSchemeDraftsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create draft workflow scheme
   * Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the active workflow scheme that the draft is created from. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme createWorkflowSchemeDraftFromParent(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createWorkflowSchemeDraftFromParent");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/createdraft"
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

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete draft default workflow
   * Resets the default workflow for a workflow scheme&#x27;s draft. That is, the default workflow is set to Jira&#x27;s system workflow (the *jira* workflow).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme deleteDraftDefaultWorkflow(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDraftDefaultWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/default"
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

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete issue types for workflow in draft workflow scheme
   * Deletes the workflow-issue type mapping for a workflow in a workflow scheme&#x27;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @param workflowName The name of the workflow. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDraftWorkflowMapping(Long id, String workflowName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDraftWorkflowMapping");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling deleteDraftWorkflowMapping");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/workflow"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));


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
   * Delete draft workflow scheme
   * Deletes a draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the active workflow scheme that the draft was created from. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkflowSchemeDraft(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkflowSchemeDraft");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft"
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
   * Delete workflow for issue type in draft workflow scheme
   * Deletes the issue type-workflow mapping for an issue type in a workflow scheme&#x27;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @param issueType The ID of the issue type. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme deleteWorkflowSchemeDraftIssueType(Long id, String issueType) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkflowSchemeDraftIssueType");
    }
    // verify the required parameter 'issueType' is set
    if (issueType == null) {
      throw new ApiException(400, "Missing the required parameter 'issueType' when calling deleteWorkflowSchemeDraftIssueType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get draft default workflow
   * Returns the default workflow for a workflow scheme&#x27;s draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @return DefaultWorkflow
   * @throws ApiException if fails to make API call
   */
  public DefaultWorkflow getDraftDefaultWorkflow(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDraftDefaultWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/default"
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

    GenericType<DefaultWorkflow> localVarReturnType = new GenericType<DefaultWorkflow>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue types for workflows in draft workflow scheme
   * Returns the workflow-issue type mappings for a workflow scheme&#x27;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @param workflowName The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. (optional)
   * @return IssueTypesWorkflowMapping
   * @throws ApiException if fails to make API call
   */
  public IssueTypesWorkflowMapping getDraftWorkflow(Long id, String workflowName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDraftWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/workflow"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<IssueTypesWorkflowMapping> localVarReturnType = new GenericType<IssueTypesWorkflowMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get draft workflow scheme
   * Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.   Note that:   *  Only active workflow schemes can have draft workflow schemes.  *  An active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the active workflow scheme that the draft was created from. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme getWorkflowSchemeDraft(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkflowSchemeDraft");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft"
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

    GenericType<WorkflowScheme> localVarReturnType = new GenericType<WorkflowScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get workflow for issue type in draft workflow scheme
   * Returns the issue type-workflow mapping for an issue type in a workflow scheme&#x27;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @param issueType The ID of the issue type. (required)
   * @return IssueTypeWorkflowMapping
   * @throws ApiException if fails to make API call
   */
  public IssueTypeWorkflowMapping getWorkflowSchemeDraftIssueType(Long id, String issueType) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkflowSchemeDraftIssueType");
    }
    // verify the required parameter 'issueType' is set
    if (issueType == null) {
      throw new ApiException(400, "Missing the required parameter 'issueType' when calling getWorkflowSchemeDraftIssueType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<IssueTypeWorkflowMapping> localVarReturnType = new GenericType<IssueTypeWorkflowMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set workflow for issue type in draft workflow scheme
   * Sets the workflow for an issue type in a workflow scheme&#x27;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The issue type-project mapping. (required)
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @param issueType The ID of the issue type. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme setWorkflowSchemeDraftIssueType(IssueTypeWorkflowMapping body, Long id, String issueType) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setWorkflowSchemeDraftIssueType");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setWorkflowSchemeDraftIssueType");
    }
    // verify the required parameter 'issueType' is set
    if (issueType == null) {
      throw new ApiException(400, "Missing the required parameter 'issueType' when calling setWorkflowSchemeDraftIssueType");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType}"
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
   * Update draft default workflow
   * Sets the default workflow for a workflow scheme&#x27;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The object for the new default workflow. (required)
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme updateDraftDefaultWorkflow(DefaultWorkflow body, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDraftDefaultWorkflow");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDraftDefaultWorkflow");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/default"
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
   * Sets the issue types for a workflow in a workflow scheme&#x27;s draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param workflowName The name of the workflow. (required)
   * @param id The ID of the workflow scheme that the draft belongs to. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme updateDraftWorkflowMapping(IssueTypesWorkflowMapping body, String workflowName, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDraftWorkflowMapping");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling updateDraftWorkflowMapping");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDraftWorkflowMapping");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft/workflow"
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
   * Update draft workflow scheme
   * Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param id The ID of the active workflow scheme that the draft was created from. (required)
   * @return WorkflowScheme
   * @throws ApiException if fails to make API call
   */
  public WorkflowScheme updateWorkflowSchemeDraft(WorkflowScheme body, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowSchemeDraft");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateWorkflowSchemeDraft");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflowscheme/{id}/draft"
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
