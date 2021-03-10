package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.IssueTypeIds;
import com.xminds.jira.rest.client.model.IssueTypeSchemeDetails;
import com.xminds.jira.rest.client.model.IssueTypeSchemeID;
import com.xminds.jira.rest.client.model.IssueTypeSchemeProjectAssociation;
import com.xminds.jira.rest.client.model.IssueTypeSchemeUpdateDetails;
import com.xminds.jira.rest.client.model.OrderOfIssueTypes;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScheme;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeSchemeMapping;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeSchemeProjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueTypeSchemesApi {
  private ApiClient apiClient;

  public IssueTypeSchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueTypeSchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add issue types to issue type scheme
   * Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueTypeSchemeId The ID of the issue type scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object addIssueTypesToIssueTypeScheme(IssueTypeIds body, Long issueTypeSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addIssueTypesToIssueTypeScheme");
    }
    // verify the required parameter 'issueTypeSchemeId' is set
    if (issueTypeSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeSchemeId' when calling addIssueTypesToIssueTypeScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype"
      .replaceAll("\\{" + "issueTypeSchemeId" + "\\}", apiClient.escapeString(issueTypeSchemeId.toString()));

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
   * Assign issue type scheme to project
   * Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object assignIssueTypeSchemeToProject(IssueTypeSchemeProjectAssociation body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignIssueTypeSchemeToProject");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/project";

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
   * Create issue type scheme
   * Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return IssueTypeSchemeID
   * @throws ApiException if fails to make API call
   */
  public IssueTypeSchemeID createIssueTypeScheme(IssueTypeSchemeDetails body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIssueTypeScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme";

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

    GenericType<IssueTypeSchemeID> localVarReturnType = new GenericType<IssueTypeSchemeID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete issue type scheme
   * Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param issueTypeSchemeId The ID of the issue type scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteIssueTypeScheme(Long issueTypeSchemeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueTypeSchemeId' is set
    if (issueTypeSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeSchemeId' when calling deleteIssueTypeScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/{issueTypeSchemeId}"
      .replaceAll("\\{" + "issueTypeSchemeId" + "\\}", apiClient.escapeString(issueTypeSchemeId.toString()));

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
   * Get all issue type schemes
   * Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param id The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. (optional)
   * @return PageBeanIssueTypeScheme
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueTypeScheme getAllIssueTypeSchemes(Long startAt, Integer maxResults, List<Long> id) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "id", id));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanIssueTypeScheme> localVarReturnType = new GenericType<PageBeanIssueTypeScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue type schemes for projects
   * Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param projectId The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanIssueTypeSchemeProjects
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueTypeSchemeProjects getIssueTypeSchemeForProjects(List<Long> projectId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getIssueTypeSchemeForProjects");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/project";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "projectId", projectId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanIssueTypeSchemeProjects> localVarReturnType = new GenericType<PageBeanIssueTypeSchemeProjects>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue type scheme items
   * Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param issueTypeSchemeId The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;issueTypeSchemeId&#x3D;10000&amp;issueTypeSchemeId&#x3D;10001&#x60;. (optional)
   * @return PageBeanIssueTypeSchemeMapping
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueTypeSchemeMapping getIssueTypeSchemesMapping(Long startAt, Integer maxResults, List<Long> issueTypeSchemeId) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/mapping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "issueTypeSchemeId", issueTypeSchemeId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanIssueTypeSchemeMapping> localVarReturnType = new GenericType<PageBeanIssueTypeSchemeMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Remove issue type from issue type scheme
   * Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param issueTypeSchemeId The ID of the issue type scheme. (required)
   * @param issueTypeId The ID of the issue type. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object removeIssueTypeFromIssueTypeScheme(Long issueTypeSchemeId, Long issueTypeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueTypeSchemeId' is set
    if (issueTypeSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeSchemeId' when calling removeIssueTypeFromIssueTypeScheme");
    }
    // verify the required parameter 'issueTypeId' is set
    if (issueTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeId' when calling removeIssueTypeFromIssueTypeScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/{issueTypeId}"
      .replaceAll("\\{" + "issueTypeSchemeId" + "\\}", apiClient.escapeString(issueTypeSchemeId.toString()))
      .replaceAll("\\{" + "issueTypeId" + "\\}", apiClient.escapeString(issueTypeId.toString()));

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
   * Change order of issue types
   * Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either &#x60;after&#x60; or &#x60;position&#x60; must be provided.  *  the issue type in &#x60;after&#x60; must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueTypeSchemeId The ID of the issue type scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object reorderIssueTypesInIssueTypeScheme(OrderOfIssueTypes body, Long issueTypeSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling reorderIssueTypesInIssueTypeScheme");
    }
    // verify the required parameter 'issueTypeSchemeId' is set
    if (issueTypeSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeSchemeId' when calling reorderIssueTypesInIssueTypeScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/move"
      .replaceAll("\\{" + "issueTypeSchemeId" + "\\}", apiClient.escapeString(issueTypeSchemeId.toString()));

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
   * Update issue type scheme
   * Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueTypeSchemeId The ID of the issue type scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateIssueTypeScheme(IssueTypeSchemeUpdateDetails body, Long issueTypeSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIssueTypeScheme");
    }
    // verify the required parameter 'issueTypeSchemeId' is set
    if (issueTypeSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeSchemeId' when calling updateIssueTypeScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescheme/{issueTypeSchemeId}"
      .replaceAll("\\{" + "issueTypeSchemeId" + "\\}", apiClient.escapeString(issueTypeSchemeId.toString()));

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
