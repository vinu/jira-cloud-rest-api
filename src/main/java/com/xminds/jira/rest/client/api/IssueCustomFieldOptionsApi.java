package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.BulkCreateCustomFieldOptionRequest;
import com.xminds.jira.rest.client.model.BulkCustomFieldOptionCreateRequest;
import com.xminds.jira.rest.client.model.BulkCustomFieldOptionUpdateRequest;
import com.xminds.jira.rest.client.model.CustomFieldCreatedContextOptionsList;
import com.xminds.jira.rest.client.model.CustomFieldOption;
import com.xminds.jira.rest.client.model.CustomFieldUpdatedContextOptionsList;
import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.OrderOfCustomFieldOptions;
import com.xminds.jira.rest.client.model.PageBeanCustomFieldContextOption;
import com.xminds.jira.rest.client.model.PageBeanCustomFieldOptionDetails;
import com.xminds.jira.rest.client.model.UpdateCustomFieldOption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueCustomFieldOptionsApi {
  private ApiClient apiClient;

  public IssueCustomFieldOptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueCustomFieldOptionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create custom field options (context)
   * Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return CustomFieldCreatedContextOptionsList
   * @throws ApiException if fails to make API call
   */
  public CustomFieldCreatedContextOptionsList createCustomFieldOption(BulkCustomFieldOptionCreateRequest body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomFieldOption");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling createCustomFieldOption");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling createCustomFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/option"
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

    GenericType<CustomFieldCreatedContextOptionsList> localVarReturnType = new GenericType<CustomFieldCreatedContextOptionsList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create custom field options
   * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Create custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-post) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Creates options and, where the custom select field is of the type *Select List (cascading)*, cascading options for a custom select field. The options are added to the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object createCustomFieldOptions(BulkCreateCustomFieldOptionRequest body, Long fieldId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomFieldOptions");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling createCustomFieldOptions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/customField/{fieldId}/option"
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete custom field options (context)
   * Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context from which an option should be deleted. (required)
   * @param optionId The ID of the option to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomFieldOption(String fieldId, Long contextId, Long optionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling deleteCustomFieldOption");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling deleteCustomFieldOption");
    }
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling deleteCustomFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/option/{optionId}"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()))
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

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get custom field option
   * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Get custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-get) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.
   * @param id The ID of the custom field option. (required)
   * @return CustomFieldOption
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CustomFieldOption getCustomFieldOption(String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/customFieldOption/{id}"
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

    GenericType<CustomFieldOption> localVarReturnType = new GenericType<CustomFieldOption>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get custom field options (context)
   * Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @param optionId The ID of the option. (optional)
   * @param onlyOptions Whether only options are returned. (optional, default to false)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 100)
   * @return PageBeanCustomFieldContextOption
   * @throws ApiException if fails to make API call
   */
  public PageBeanCustomFieldContextOption getOptionsForContext(String fieldId, Long contextId, Long optionId, Boolean onlyOptions, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getOptionsForContext");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling getOptionsForContext");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/option"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
      .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "optionId", optionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyOptions", onlyOptions));
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

    GenericType<PageBeanCustomFieldContextOption> localVarReturnType = new GenericType<PageBeanCustomFieldContextOption>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get options for field
   * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Get custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-get) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Returns a [paginated](#pagination) list of options and, where the custom select field is of the type *Select List (cascading)*, cascading options for custom select fields. Cascading options are included in the item count when determining pagination. Only options from the global context are returned.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 1000)
   * @return PageBeanCustomFieldOptionDetails
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public PageBeanCustomFieldOptionDetails getOptionsForField(Long fieldId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getOptionsForField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/customField/{fieldId}/option"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanCustomFieldOptionDetails> localVarReturnType = new GenericType<PageBeanCustomFieldOptionDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Reorder custom field options (context)
   * Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object reorderCustomFieldOptions(OrderOfCustomFieldOptions body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling reorderCustomFieldOptions");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling reorderCustomFieldOptions");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling reorderCustomFieldOptions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/option/move"
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
   * Update custom field options (context)
   * Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren&#x27;t updated and aren&#x27;t reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. (required)
   * @param contextId The ID of the context. (required)
   * @return CustomFieldUpdatedContextOptionsList
   * @throws ApiException if fails to make API call
   */
  public CustomFieldUpdatedContextOptionsList updateCustomFieldOption(BulkCustomFieldOptionUpdateRequest body, String fieldId, Long contextId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomFieldOption");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling updateCustomFieldOption");
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling updateCustomFieldOption");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/context/{contextId}/option"
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

    GenericType<CustomFieldUpdatedContextOptionsList> localVarReturnType = new GenericType<CustomFieldUpdatedContextOptionsList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update custom field options
   * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Update custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-put) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Updates the options on a custom select field. Where an updated option is in use on an issue, the value on the issue is also updated. Options that are not found are ignored. A maximum of 1000 options, including sub-options of *Select List (cascading)* fields, can be updated per request. The options are updated on the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param fieldId The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Object updateCustomFieldOptions(UpdateCustomFieldOption body, Long fieldId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomFieldOptions");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling updateCustomFieldOptions");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/customField/{fieldId}/option"
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
}
