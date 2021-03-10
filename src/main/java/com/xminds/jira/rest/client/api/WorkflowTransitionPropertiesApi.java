package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.WorkflowTransitionProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class WorkflowTransitionPropertiesApi {
  private ApiClient apiClient;

  public WorkflowTransitionPropertiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowTransitionPropertiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create workflow transition property
   * Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param key The key of the property being added, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. (required)
   * @param workflowName The name of the workflow that the transition belongs to. (required)
   * @param transitionId The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. (required)
   * @param workflowMode The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited. (optional, default to live)
   * @return WorkflowTransitionProperty
   * @throws ApiException if fails to make API call
   */
  public WorkflowTransitionProperty createWorkflowTransitionProperty(Map<String, Object> body, String key, String workflowName, Long transitionId, String workflowMode) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createWorkflowTransitionProperty");
    }
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling createWorkflowTransitionProperty");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling createWorkflowTransitionProperty");
    }
    // verify the required parameter 'transitionId' is set
    if (transitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transitionId' when calling createWorkflowTransitionProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflow/transitions/{transitionId}/properties"
      .replaceAll("\\{" + "transitionId" + "\\}", apiClient.escapeString(transitionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowMode", workflowMode));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowTransitionProperty> localVarReturnType = new GenericType<WorkflowTransitionProperty>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete workflow transition property
   * Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param transitionId The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. (required)
   * @param key The name of the transition property to delete, also known as the name of the property. (required)
   * @param workflowName The name of the workflow that the transition belongs to. (required)
   * @param workflowMode The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteWorkflowTransitionProperty(Long transitionId, String key, String workflowName, String workflowMode) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'transitionId' is set
    if (transitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transitionId' when calling deleteWorkflowTransitionProperty");
    }
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteWorkflowTransitionProperty");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling deleteWorkflowTransitionProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflow/transitions/{transitionId}/properties"
      .replaceAll("\\{" + "transitionId" + "\\}", apiClient.escapeString(transitionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowMode", workflowMode));


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
   * Get workflow transition properties
   * Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param transitionId The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition. (required)
   * @param workflowName The name of the workflow that the transition belongs to. (required)
   * @param includeReservedKeys Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*. (optional, default to false)
   * @param key The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned. (optional)
   * @param workflowMode The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows. (optional, default to live)
   * @return WorkflowTransitionProperty
   * @throws ApiException if fails to make API call
   */
  public WorkflowTransitionProperty getWorkflowTransitionProperties(Long transitionId, String workflowName, Boolean includeReservedKeys, String key, String workflowMode) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'transitionId' is set
    if (transitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transitionId' when calling getWorkflowTransitionProperties");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling getWorkflowTransitionProperties");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflow/transitions/{transitionId}/properties"
      .replaceAll("\\{" + "transitionId" + "\\}", apiClient.escapeString(transitionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeReservedKeys", includeReservedKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowMode", workflowMode));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowTransitionProperty> localVarReturnType = new GenericType<WorkflowTransitionProperty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update workflow transition property
   * Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param key The key of the property being updated, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. (required)
   * @param workflowName The name of the workflow that the transition belongs to. (required)
   * @param transitionId The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. (required)
   * @param workflowMode The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. (optional)
   * @return WorkflowTransitionProperty
   * @throws ApiException if fails to make API call
   */
  public WorkflowTransitionProperty updateWorkflowTransitionProperty(Map<String, Object> body, String key, String workflowName, Long transitionId, String workflowMode) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowTransitionProperty");
    }
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling updateWorkflowTransitionProperty");
    }
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling updateWorkflowTransitionProperty");
    }
    // verify the required parameter 'transitionId' is set
    if (transitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transitionId' when calling updateWorkflowTransitionProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflow/transitions/{transitionId}/properties"
      .replaceAll("\\{" + "transitionId" + "\\}", apiClient.escapeString(transitionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowMode", workflowMode));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<WorkflowTransitionProperty> localVarReturnType = new GenericType<WorkflowTransitionProperty>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
