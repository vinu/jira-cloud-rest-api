package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.PageBeanWorkflowTransitionRules;
import com.xminds.jira.rest.client.model.WorkflowTransitionRulesUpdate;
import com.xminds.jira.rest.client.model.WorkflowTransitionRulesUpdateErrors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class WorkflowTransitionRulesApi {
  private ApiClient apiClient;

  public WorkflowTransitionRulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowTransitionRulesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get workflow transition rule configurations
   * Returns a [paginated](#pagination) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling Connect app are returned. However, if a workflow is returned all transition rules that match the filters are returned for that workflow.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.
   * @param types The types of the transition rules to return. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 10)
   * @param keys The transition rule class keys, as defined in the Connect app descriptor, of the transition rules to return. (optional)
   * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts &#x60;transition&#x60;, which, for each rule, returns information about the transition the rule is assigned to. (optional)
   * @return PageBeanWorkflowTransitionRules
   * @throws ApiException if fails to make API call
   */
  public PageBeanWorkflowTransitionRules getWorkflowTransitionRuleConfigurations(List<String> types, Long startAt, Integer maxResults, List<String> keys, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'types' is set
    if (types == null) {
      throw new ApiException(400, "Missing the required parameter 'types' when calling getWorkflowTransitionRuleConfigurations");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflow/rule/config";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "types", types));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "keys", keys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<PageBeanWorkflowTransitionRules> localVarReturnType = new GenericType<PageBeanWorkflowTransitionRules>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update workflow transition rule configurations
   * Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be updated.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.
   * @param body  (required)
   * @return WorkflowTransitionRulesUpdateErrors
   * @throws ApiException if fails to make API call
   */
  public WorkflowTransitionRulesUpdateErrors updateWorkflowTransitionRuleConfigurations(WorkflowTransitionRulesUpdate body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowTransitionRuleConfigurations");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/workflow/rule/config";

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

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<WorkflowTransitionRulesUpdateErrors> localVarReturnType = new GenericType<WorkflowTransitionRulesUpdateErrors>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
