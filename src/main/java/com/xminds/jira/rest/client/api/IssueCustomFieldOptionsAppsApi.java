package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.IssueFieldOption;
import com.xminds.jira.rest.client.model.PageBeanIssueFieldOption;
import com.xminds.jira.rest.client.model.TaskProgressBeanRemoveOptionFromIssuesResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueCustomFieldOptionsAppsApi {
  private ApiClient apiClient;

  public IssueCustomFieldOptionsAppsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueCustomFieldOptionsAppsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create issue field option
   * Creates an option for a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
   * @param body  (required)
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @return IssueFieldOption
   * @throws ApiException if fails to make API call
   */
  public IssueFieldOption createIssueFieldOption(Map<String, Object> body, String fieldKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIssueFieldOption");
    }
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling createIssueFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()));

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

    GenericType<IssueFieldOption> localVarReturnType = new GenericType<IssueFieldOption>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete issue field option
   * Deletes an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @param optionId The ID of the option to be deleted. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteIssueFieldOption(String fieldKey, Long optionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling deleteIssueFieldOption");
    }
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling deleteIssueFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option/{optionId}"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()))
      .replaceAll("\\{" + "optionId" + "\\}", apiClient.escapeString(optionId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all issue field options
   * Returns a [paginated](#pagination) list of all the options of a select list issue field. A select list issue field is a type of [issue field](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/) that enables a user to select a value from a list of options.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanIssueFieldOption
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueFieldOption getAllIssueFieldOptions(String fieldKey, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling getAllIssueFieldOptions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()));

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

    GenericType<PageBeanIssueFieldOption> localVarReturnType = new GenericType<PageBeanIssueFieldOption>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue field option
   * Returns an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @param optionId The ID of the option to be returned. (required)
   * @return IssueFieldOption
   * @throws ApiException if fails to make API call
   */
  public IssueFieldOption getIssueFieldOption(String fieldKey, Long optionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling getIssueFieldOption");
    }
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling getIssueFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option/{optionId}"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()))
      .replaceAll("\\{" + "optionId" + "\\}", apiClient.escapeString(optionId.toString()));

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

    GenericType<IssueFieldOption> localVarReturnType = new GenericType<IssueFieldOption>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get selectable issue field options
   * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed and selected by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param projectId Filters the results to options that are only available in the specified project. (optional)
   * @return PageBeanIssueFieldOption
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueFieldOption getSelectableIssueFieldOptions(String fieldKey, Long startAt, Integer maxResults, Long projectId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling getSelectableIssueFieldOptions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option/suggestions/edit"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanIssueFieldOption> localVarReturnType = new GenericType<PageBeanIssueFieldOption>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get visible issue field options
   * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional)
   * @param projectId Filters the results to options that are only available in the specified project. (optional)
   * @return PageBeanIssueFieldOption
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueFieldOption getVisibleIssueFieldOptions(String fieldKey, Long startAt, Integer maxResults, Long projectId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling getVisibleIssueFieldOptions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option/suggestions/search"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanIssueFieldOption> localVarReturnType = new GenericType<PageBeanIssueFieldOption>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Replace issue field option
   * Deselects an issue-field select-list option from all issues where it is selected. A different option can be selected to replace the deselected option. The update can also be limited to a smaller set of issues by using a JQL query.  This is an [asynchronous operation](#async). The response object contains a link to the long-running task.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @param optionId The ID of the option to be deselected. (required)
   * @param replaceWith The ID of the option that will replace the currently selected option. (optional)
   * @param jql A JQL query that specifies the issues to be updated. For example, *project&#x3D;10000*. (optional)
   * @throws ApiException if fails to make API call
   */
  public void replaceIssueFieldOption(String fieldKey, Long optionId, Long replaceWith, String jql) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling replaceIssueFieldOption");
    }
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling replaceIssueFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option/{optionId}/issue"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()))
      .replaceAll("\\{" + "optionId" + "\\}", apiClient.escapeString(optionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "replaceWith", replaceWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jql", jql));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update issue field option
   * Updates or creates an option for a select list issue field. This operation requires that the option ID is provided when creating an option, therefore, the option ID needs to be specified as a path and body parameter. The option ID provided in the path and body must be identical.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
   * @param body  (required)
   * @param fieldKey The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#x27;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; (required)
   * @param optionId The ID of the option to be updated. (required)
   * @return IssueFieldOption
   * @throws ApiException if fails to make API call
   */
  public IssueFieldOption updateIssueFieldOption(IssueFieldOption body, String fieldKey, Long optionId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIssueFieldOption");
    }
    // verify the required parameter 'fieldKey' is set
    if (fieldKey == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldKey' when calling updateIssueFieldOption");
    }
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling updateIssueFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldKey}/option/{optionId}"
      .replaceAll("\\{" + "fieldKey" + "\\}", apiClient.escapeString(fieldKey.toString()))
      .replaceAll("\\{" + "optionId" + "\\}", apiClient.escapeString(optionId.toString()));

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

    GenericType<IssueFieldOption> localVarReturnType = new GenericType<IssueFieldOption>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
