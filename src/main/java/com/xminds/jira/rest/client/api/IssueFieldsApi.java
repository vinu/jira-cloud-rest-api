package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.CustomFieldDefinitionJsonBean;
import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.FieldDetails;
import com.xminds.jira.rest.client.model.PageBeanContext;
import com.xminds.jira.rest.client.model.PageBeanField;
import com.xminds.jira.rest.client.model.UpdateCustomFieldDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueFieldsApi {
  private ApiClient apiClient;

  public IssueFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueFieldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create custom field
   * Creates a custom field.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body Definition of the custom field to be created (required)
   * @return FieldDetails
   * @throws ApiException if fails to make API call
   */
  public FieldDetails createCustomField(CustomFieldDefinitionJsonBean body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field";

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

    GenericType<FieldDetails> localVarReturnType = new GenericType<FieldDetails>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get contexts for a field
   * Returns a [paginated](#pagination) list of the contexts a field is used in. Deprecated, use [ Get custom field contexts](#api-rest-api-3-field-fieldId-context-get).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the field to return contexts for. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 20)
   * @return PageBeanContext
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public PageBeanContext getContextsForFieldDeprecated(String fieldId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getContextsForFieldDeprecated");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/contexts"
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

    GenericType<PageBeanContext> localVarReturnType = new GenericType<PageBeanContext>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get fields
   * Returns system and custom issue fields according to the following rules:   *  Fields that cannot be added to the issue navigator are always returned.  *  Fields that cannot be placed on an issue screen are always returned.  *  Fields that depend on global Jira settings are only returned if the setting is enabled. That is, timetracking fields, subtasks, votes, and watches.  *  For all other fields, this operation only returns the fields that the user has permission to view (that is, the field is used in at least one project that the user has *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.)  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @return List&lt;FieldDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FieldDetails> getFields() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/field";

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

    GenericType<List<FieldDetails>> localVarReturnType = new GenericType<List<FieldDetails>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get fields paginated
   * Returns a [paginated](#pagination) list of fields for Classic Jira projects. The list can include:   *  all fields.  *  specific fields, by defining &#x60;id&#x60;.  *  fields that contain a string in the field name or description, by defining &#x60;query&#x60;.  *  specific fields that contain a string in the field name or description, by defining &#x60;id&#x60; and &#x60;query&#x60;.  Only custom fields can be queried, &#x60;type&#x60; must be set to &#x60;custom&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param type The type of fields to search. (optional)
   * @param id The IDs of the custom fields to return or, where &#x60;query&#x60; is specified, filter. (optional)
   * @param query String used to perform a case-insensitive partial match with field names or descriptions. (optional)
   * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;contextsCount&#x60; Sorts by the number of contexts related to a field.  *  &#x60;lastUsed&#x60; Sorts by the date when the value of the field last changed.  *  &#x60;name&#x60; Sorts by the field name.  *  &#x60;screensCount&#x60; Sorts by the number of screens related to a field. (optional)
   * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;key&#x60; Returns the key for each field.  *  &#x60;lastUsed&#x60; Returns the date when the value of the field last changed.  *  &#x60;screensCount&#x60; Returns the number of screens related to a field.  *  &#x60;contextsCount&#x60; Returns the number of contexts related to a field.  *  &#x60;isLocked&#x60; Returns information about whether the field is [locked](https://confluence.atlassian.com/x/ZSN7Og).  *  &#x60;searcherKey&#x60; Returns the searcher key for each custom field. (optional)
   * @return PageBeanField
   * @throws ApiException if fails to make API call
   */
  public PageBeanField getFieldsPaginated(Long startAt, Integer maxResults, List<String> type, List<String> id, String query, String orderBy, String expand) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/field/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanField> localVarReturnType = new GenericType<PageBeanField>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update custom field
   * Updates a custom field.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The custom field update details. (required)
   * @param fieldId The ID of the custom field. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateCustomField(UpdateCustomFieldDetails body, String fieldId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomField");
    }
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling updateCustomField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}"
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
