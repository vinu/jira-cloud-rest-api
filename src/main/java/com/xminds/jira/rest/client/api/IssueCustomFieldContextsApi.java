package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.CreateCustomFieldContext;
import com.xminds.jira.rest.client.model.CustomFieldContextDefaultValueUpdate;
import com.xminds.jira.rest.client.model.CustomFieldContextUpdateDetails;
import com.xminds.jira.rest.client.model.IssueTypeIds;
import com.xminds.jira.rest.client.model.PageBeanContextForProjectAndIssueType;
import com.xminds.jira.rest.client.model.PageBeanCustomFieldContext;
import com.xminds.jira.rest.client.model.PageBeanCustomFieldContextDefaultValue;
import com.xminds.jira.rest.client.model.PageBeanCustomFieldContextProjectMapping;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeToContextMapping;
import com.xminds.jira.rest.client.model.ProjectIds;
import com.xminds.jira.rest.client.model.ProjectIssueTypeMappings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueCustomFieldContextsApi {
  private ApiClient apiClient;

  public IssueCustomFieldContextsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueCustomFieldContextsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add issue types to context
   * Adds issue types to a custom field context, appending the issue types to the issue types list.  A custom field context without any issue types applies to all issue types. Adding issue types to such a custom field context would result in it applying to only the listed issue types.  If any of the issue types exists in the custom field context, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object addIssueTypesToContext(IssueTypeIds body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addIssueTypesToContext");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling addIssueTypesToContext");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling addIssueTypesToContext");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/issuetype"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

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
   * Assign custom field context to projects
   * Assigns a custom field context to projects.  If any project in the request is assigned to any context of the custom field, the operation fails.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object assignProjectsToCustomFieldContext(ProjectIds body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignProjectsToCustomFieldContext");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling assignProjectsToCustomFieldContext");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling assignProjectsToCustomFieldContext");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/project"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

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
   * Create custom field context
   * Creates a custom field context.  If &#x60;projectIds&#x60; is empty, a global context is created. A global context is one that applies to all project. If &#x60;issueTypeIds&#x60; is empty, the context applies to all issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @return CreateCustomFieldContext
   * @throws ApiException if fails to make API call
   */
  public CreateCustomFieldContext createCustomFieldContext(CreateCustomFieldContext body, String fieldId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomFieldContext");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling createCustomFieldContext");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

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

    GenericType<CreateCustomFieldContext> localVarReturnType = new GenericType<CreateCustomFieldContext>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete custom field context
   * Deletes a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteCustomFieldContext(String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling deleteCustomFieldContext");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling deleteCustomFieldContext");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

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
   * Get custom field contexts
   * Returns a [paginated](#pagination) list of [ contexts](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html) for a custom field. Contexts can be returned as follows:   *  With no other parameters set, all contexts.  *  By defining &#x60;id&#x60; only, all contexts from the list of IDs.  *  By defining &#x60;isAnyIssueType&#x60;, limit the list of contexts returned to either those that apply to all issue types (true) or those that apply to only a subset of issue types (false)  *  By defining &#x60;isGlobalContext&#x60;, limit the list of contexts return to either those that apply to all projects (global contexts) (true) or those that apply to only a subset of projects (false).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. (required)
   * @param isAnyIssueType Whether to return contexts that apply to all issue types. (optional)
   * @param isGlobalContext Whether to return contexts that apply to all projects. (optional)
   * @param contextId The list of context IDs. To include multiple contexts, separate IDs with ampersand: &#x60;contextId&#x3D;10000&amp;contextId&#x3D;10001&#x60;. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanCustomFieldContext
   * @throws ApiException if fails to make API call
   */
  public PageBeanCustomFieldContext getContextsForField(String fieldId, Boolean isAnyIssueType, Boolean isGlobalContext, List<Long> contextId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getContextsForField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAnyIssueType", isAnyIssueType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isGlobalContext", isGlobalContext));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contextId", contextId));
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

    GenericType<PageBeanCustomFieldContext> localVarReturnType = new GenericType<PageBeanCustomFieldContext>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get custom field contexts for projects and issue types
   * Returns a [paginated](#pagination) list of project and issue type mappings and, for each mapping, the ID of a [custom field context](https://confluence.atlassian.com/x/k44fOw) that applies to the project and issue type.  If there is no custom field context assigned to the project then, if present, the custom field context that applies to all projects is returned if it also applies to the issue type or all issue types. If a custom field context is not found, the returned custom field context ID is &#x60;null&#x60;.  Duplicate project and issue type mappings cannot be provided in the request.  The order of the returned values is the same as provided in the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The list of project and issue type mappings. (required)
   * @param fieldId The ID of the custom field. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanContextForProjectAndIssueType
   * @throws ApiException if fails to make API call
   */
  public PageBeanContextForProjectAndIssueType getCustomFieldContextsForProjectsAndIssueTypes(ProjectIssueTypeMappings body, String fieldId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getCustomFieldContextsForProjectsAndIssueTypes");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getCustomFieldContextsForProjectsAndIssueTypes");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/mapping"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanContextForProjectAndIssueType> localVarReturnType = new GenericType<PageBeanContextForProjectAndIssueType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get custom field contexts default values
   * Returns a [paginated](#pagination) list of defaults for a custom field. The results can be filtered by &#x60;contextId&#x60;, otherwise all values are returned. If no defaults are set for a context, nothing is returned.   The returned object depends on type of the custom field:   *  &#x60;CustomFieldContextDefaultValueSingleOption&#x60; (type &#x60;option.single&#x60;) for single choice select lists and radio buttons.  *  &#x60;CustomFieldContextDefaultValueMultipleOption&#x60; (type &#x60;option.multiple&#x60;) for multiple choice select lists and checkboxes.  *  &#x60;CustomFieldContextDefaultValueCascadingOption&#x60; (type &#x60;option.cascading&#x60;) for cascading select lists.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The IDs of the contexts. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanCustomFieldContextDefaultValue
   * @throws ApiException if fails to make API call
   */
  public PageBeanCustomFieldContextDefaultValue getDefaultValues(String fieldId, List<Long> contextId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getDefaultValues");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/defaultValue"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contextId", contextId));
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

    GenericType<PageBeanCustomFieldContextDefaultValue> localVarReturnType = new GenericType<PageBeanCustomFieldContextDefaultValue>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue types for custom field context
   * Returns a [paginated](#pagination) list of context to issue type mappings for a custom field. Mappings are returned for all contexts or a list of contexts. Mappings are ordered first by context ID and then by issue type ID.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, &#x60;contextId&#x3D;10001&amp;contextId&#x3D;10002&#x60;. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanIssueTypeToContextMapping
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueTypeToContextMapping getIssueTypeMappingsForContexts(String fieldId, List<Long> contextId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getIssueTypeMappingsForContexts");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/issuetypemapping"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contextId", contextId));
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

    GenericType<PageBeanIssueTypeToContextMapping> localVarReturnType = new GenericType<PageBeanIssueTypeToContextMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get project mappings for custom field context
   * Returns a [paginated](#pagination) list of context to project mappings for a custom field. The result can be filtered by &#x60;contextId&#x60;, or otherwise all mappings are returned. Invalid IDs are ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The list of context IDs. To include multiple context, separate IDs with ampersand: &#x60;contextId&#x3D;10000&amp;contextId&#x3D;10001&#x60;. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanCustomFieldContextProjectMapping
   * @throws ApiException if fails to make API call
   */
  public PageBeanCustomFieldContextProjectMapping getProjectContextMapping(String fieldId, List<Long> contextId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getProjectContextMapping");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/projectmapping"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contextId", contextId));
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

    GenericType<PageBeanCustomFieldContextProjectMapping> localVarReturnType = new GenericType<PageBeanCustomFieldContextProjectMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Remove custom field context from projects
   * Removes a custom field context from projects.  A custom field context without any projects applies to all projects. Removing all projects from a custom field context would result in it applying to all projects.  If any project in the request is not assigned to the context, or the operation would result in two global contexts for the field, the operation fails.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object removeCustomFieldContextFromProjects(ProjectIds body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling removeCustomFieldContextFromProjects");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling removeCustomFieldContextFromProjects");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling removeCustomFieldContextFromProjects");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/project/remove"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Remove issue types from context
   * Removes issue types from a custom field context.  A custom field context without any issue types applies to all issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object removeIssueTypesFromContext(IssueTypeIds body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling removeIssueTypesFromContext");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling removeIssueTypesFromContext");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling removeIssueTypesFromContext");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/issuetype/remove"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set custom field contexts default values
   * Sets default for contexts of a custom field. Default are defined using these objects:   *  &#x60;CustomFieldContextDefaultValueSingleOption&#x60; (type &#x60;option.single&#x60;) for single choice select lists and radio buttons.  *  &#x60;CustomFieldContextDefaultValueMultipleOption&#x60; (type &#x60;option.multiple&#x60;) for multiple choice select lists and checkboxes.  *  &#x60;CustomFieldContextDefaultValueCascadingOption&#x60; (type &#x60;option.cascading&#x60;) for cascading select lists.  Only one type of default object can be included in a request. To remove a default for a context, set the default parameter to &#x60;null&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object setDefaultValues(CustomFieldContextDefaultValueUpdate body, String fieldId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setDefaultValues");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling setDefaultValues");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/defaultValue"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

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
   * Update custom field context
   * Updates a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateCustomFieldContext(CustomFieldContextUpdateDetails body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomFieldContext");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling updateCustomFieldContext");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling updateCustomFieldContext");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

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
}
