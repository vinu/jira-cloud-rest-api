package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.IssueTypeIds;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeDetails;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeId;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeMappingDetails;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeProjectAssociation;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeUpdateDetails;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScreenScheme;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScreenSchemeItem;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScreenSchemesProjects;
import com.xminds.jira.rest.client.model.UpdateDefaultScreenScheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueTypeScreenSchemesApi {
  private ApiClient apiClient;

  public IssueTypeScreenSchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueTypeScreenSchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Append mappings to issue type screen scheme
   * Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object appendMappingsForIssueTypeScreenScheme(IssueTypeScreenSchemeMappingDetails body, String issueTypeScreenSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling appendMappingsForIssueTypeScreenScheme");
    }
    // verify the required parameter 'issueTypeScreenSchemeId' is set
    if (issueTypeScreenSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeScreenSchemeId' when calling appendMappingsForIssueTypeScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping"
      .replaceAll("\\{" + "issueTypeScreenSchemeId" + "\\}", apiClient.escapeString(issueTypeScreenSchemeId.toString()));

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
   * Assign issue type screen scheme to project
   * Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object assignIssueTypeScreenSchemeToProject(IssueTypeScreenSchemeProjectAssociation body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignIssueTypeScreenSchemeToProject");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/project";

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
   * Create issue type screen scheme
   * Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body An issue type screen scheme bean. (required)
   * @return IssueTypeScreenSchemeId
   * @throws ApiException if fails to make API call
   */
  public IssueTypeScreenSchemeId createIssueTypeScreenScheme(IssueTypeScreenSchemeDetails body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createIssueTypeScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme";

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

    GenericType<IssueTypeScreenSchemeId> localVarReturnType = new GenericType<IssueTypeScreenSchemeId>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete issue type screen scheme
   * Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteIssueTypeScreenScheme(String issueTypeScreenSchemeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'issueTypeScreenSchemeId' is set
    if (issueTypeScreenSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeScreenSchemeId' when calling deleteIssueTypeScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}"
      .replaceAll("\\{" + "issueTypeScreenSchemeId" + "\\}", apiClient.escapeString(issueTypeScreenSchemeId.toString()));

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
   * Get issue type screen scheme items
   * Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param issueTypeScreenSchemeId The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: &#x60;issueTypeScreenSchemeId&#x3D;10000&amp;issueTypeScreenSchemeId&#x3D;10001&#x60;. (optional)
   * @return PageBeanIssueTypeScreenSchemeItem
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueTypeScreenSchemeItem getIssueTypeScreenSchemeMappings(Long startAt, Integer maxResults, List<Long> issueTypeScreenSchemeId) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/mapping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "issueTypeScreenSchemeId", issueTypeScreenSchemeId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanIssueTypeScreenSchemeItem> localVarReturnType = new GenericType<PageBeanIssueTypeScreenSchemeItem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue type screen schemes for projects
   * Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param projectId The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @return PageBeanIssueTypeScreenSchemesProjects
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueTypeScreenSchemesProjects getIssueTypeScreenSchemeProjectAssociations(List<Long> projectId, Long startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getIssueTypeScreenSchemeProjectAssociations");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/project";

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

    GenericType<PageBeanIssueTypeScreenSchemesProjects> localVarReturnType = new GenericType<PageBeanIssueTypeScreenSchemesProjects>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get issue type screen schemes
   * Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param id The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. (optional)
   * @return PageBeanIssueTypeScreenScheme
   * @throws ApiException if fails to make API call
   */
  public PageBeanIssueTypeScreenScheme getIssueTypeScreenSchemes(Long startAt, Integer maxResults, List<Long> id) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme";

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

    GenericType<PageBeanIssueTypeScreenScheme> localVarReturnType = new GenericType<PageBeanIssueTypeScreenScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Remove mappings from issue type screen scheme
   * Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object removeMappingsFromIssueTypeScreenScheme(IssueTypeIds body, String issueTypeScreenSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling removeMappingsFromIssueTypeScreenScheme");
    }
    // verify the required parameter 'issueTypeScreenSchemeId' is set
    if (issueTypeScreenSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeScreenSchemeId' when calling removeMappingsFromIssueTypeScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/remove"
      .replaceAll("\\{" + "issueTypeScreenSchemeId" + "\\}", apiClient.escapeString(issueTypeScreenSchemeId.toString()));

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
   * Update issue type screen scheme default screen scheme
   * Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateDefaultScreenScheme(UpdateDefaultScreenScheme body, String issueTypeScreenSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDefaultScreenScheme");
    }
    // verify the required parameter 'issueTypeScreenSchemeId' is set
    if (issueTypeScreenSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeScreenSchemeId' when calling updateDefaultScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/default"
      .replaceAll("\\{" + "issueTypeScreenSchemeId" + "\\}", apiClient.escapeString(issueTypeScreenSchemeId.toString()));

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
   * Update issue type screen scheme
   * Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The issue type screen scheme update details. (required)
   * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateIssueTypeScreenScheme(IssueTypeScreenSchemeUpdateDetails body, String issueTypeScreenSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateIssueTypeScreenScheme");
    }
    // verify the required parameter 'issueTypeScreenSchemeId' is set
    if (issueTypeScreenSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueTypeScreenSchemeId' when calling updateIssueTypeScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}"
      .replaceAll("\\{" + "issueTypeScreenSchemeId" + "\\}", apiClient.escapeString(issueTypeScreenSchemeId.toString()));

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
