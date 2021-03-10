package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.Component;
import com.xminds.jira.rest.client.model.ComponentIssuesCount;
import com.xminds.jira.rest.client.model.PageBeanComponentWithIssueCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ProjectComponentsApi {
  private ApiClient apiClient;

  public ProjectComponentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectComponentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create component
   * Creates a component. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return Component
   * @throws ApiException if fails to make API call
   */
  public Component createComponent(Component body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createComponent");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/component";

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

    GenericType<Component> localVarReturnType = new GenericType<Component>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete component
   * Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param id The ID of the component. (required)
   * @param moveIssuesTo The ID of the component to replace the deleted component. If this value is null no replacement is made. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteComponent(String id, String moveIssuesTo) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteComponent");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/component/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "moveIssuesTo", moveIssuesTo));


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
   * Get component
   * Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
   * @param id The ID of the component. (required)
   * @return Component
   * @throws ApiException if fails to make API call
   */
  public Component getComponent(String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getComponent");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/component/{id}"
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

    GenericType<Component> localVarReturnType = new GenericType<Component>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get component issues count
   * Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param id The ID of the component. (required)
   * @return ComponentIssuesCount
   * @throws ApiException if fails to make API call
   */
  public ComponentIssuesCount getComponentRelatedIssues(String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getComponentRelatedIssues");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/component/{id}/relatedIssueCounts"
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

    GenericType<ComponentIssuesCount> localVarReturnType = new GenericType<ComponentIssuesCount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get project components
   * Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
   * @param projectIdOrKey The project ID or project key (case sensitive). (required)
   * @return List&lt;Component&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Component> getProjectComponents(String projectIdOrKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling getProjectComponents");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/components"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()));

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

    GenericType<List<Component>> localVarReturnType = new GenericType<List<Component>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get project components paginated
   * Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
   * @param projectIdOrKey The project ID or project key (case sensitive). (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by the component description.  *  &#x60;issueCount&#x60; Sorts by the count of issues associated with the component.  *  &#x60;lead&#x60; Sorts by the user key of the component&#x27;s project lead.  *  &#x60;name&#x60; Sorts by component name. (optional)
   * @param query Filter the results using a literal string. Components with a matching &#x60;name&#x60; or &#x60;description&#x60; are returned (case insensitive). (optional)
   * @return PageBeanComponentWithIssueCount
   * @throws ApiException if fails to make API call
   */
  public PageBeanComponentWithIssueCount getProjectComponentsPaginated(String projectIdOrKey, Long startAt, Integer maxResults, String orderBy, String query) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectIdOrKey' is set
    if (projectIdOrKey == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIdOrKey' when calling getProjectComponentsPaginated");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/project/{projectIdOrKey}/component"
      .replaceAll("\\{" + "projectIdOrKey" + "\\}", apiClient.escapeString(projectIdOrKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanComponentWithIssueCount> localVarReturnType = new GenericType<PageBeanComponentWithIssueCount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update component
   * Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param id The ID of the component. (required)
   * @return Component
   * @throws ApiException if fails to make API call
   */
  public Component updateComponent(Component body, String id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateComponent");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateComponent");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/component/{id}"
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

    GenericType<Component> localVarReturnType = new GenericType<Component>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
