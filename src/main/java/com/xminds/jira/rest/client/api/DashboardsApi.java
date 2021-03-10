package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.Dashboard;
import com.xminds.jira.rest.client.model.DashboardDetails;
import com.xminds.jira.rest.client.model.EntityProperty;
import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.PageBeanDashboard;
import com.xminds.jira.rest.client.model.PageOfDashboards;
import com.xminds.jira.rest.client.model.PropertyKeys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class DashboardsApi {
  private ApiClient apiClient;

  public DashboardsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DashboardsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Copy dashboard
   * Copies a dashboard. Any values provided in the &#x60;dashboard&#x60; parameter replace those in the copied dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be copied must be owned by or shared with the user.
   * @param body Dashboard details. (required)
   * @param id  (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard copyDashboard(DashboardDetails body, String id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling copyDashboard");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling copyDashboard");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{id}/copy"
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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create dashboard
   * Creates a dashboard.  **[Permissions](#permissions) required:** None.
   * @param body Dashboard details. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard createDashboard(DashboardDetails body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createDashboard");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard";

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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete dashboard
   * Deletes a dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be deleted must be owned by the user.
   * @param id The ID of the dashboard. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboard(String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDashboard");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{id}"
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

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete dashboard item property
   * Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
   * @param dashboardId The ID of the dashboard. (required)
   * @param itemId The ID of the dashboard item. (required)
   * @param propertyKey The key of the dashboard item property. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboardItemProperty(String dashboardId, String itemId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling deleteDashboardItemProperty");
    }
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling deleteDashboardItemProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling deleteDashboardItemProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey}"
      .replaceAll("\\{" + "dashboardId" + "\\}", apiClient.escapeString(dashboardId.toString()))
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()))
      .replaceAll("\\{" + "propertyKey" + "\\}", apiClient.escapeString(propertyKey.toString()));

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
   * Get all dashboards
   * Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param filter The filter applied to the list of dashboards. Valid values are:   *  &#x60;favourite&#x60; Returns dashboards the user has marked as favorite.  *  &#x60;my&#x60; Returns dashboards owned by the user. (optional)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 20)
   * @return PageOfDashboards
   * @throws ApiException if fails to make API call
   */
  public PageOfDashboards getAllDashboards(String filter, Integer startAt, Integer maxResults) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
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

    GenericType<PageOfDashboards> localVarReturnType = new GenericType<PageOfDashboards>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get dashboard
   * Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
   * @param id The ID of the dashboard. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard getDashboard(String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDashboard");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{id}"
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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get dashboard item property
   * Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#x27;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or be shared the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
   * @param dashboardId The ID of the dashboard. (required)
   * @param itemId The ID of the dashboard item. (required)
   * @param propertyKey The key of the dashboard item property. (required)
   * @return EntityProperty
   * @throws ApiException if fails to make API call
   */
  public EntityProperty getDashboardItemProperty(String dashboardId, String itemId, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling getDashboardItemProperty");
    }
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getDashboardItemProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling getDashboardItemProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey}"
      .replaceAll("\\{" + "dashboardId" + "\\}", apiClient.escapeString(dashboardId.toString()))
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()))
      .replaceAll("\\{" + "propertyKey" + "\\}", apiClient.escapeString(propertyKey.toString()));

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

    GenericType<EntityProperty> localVarReturnType = new GenericType<EntityProperty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get dashboard item property keys
   * Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or be shared the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
   * @param dashboardId The ID of the dashboard. (required)
   * @param itemId The ID of the dashboard item. (required)
   * @return PropertyKeys
   * @throws ApiException if fails to make API call
   */
  public PropertyKeys getDashboardItemPropertyKeys(String dashboardId, String itemId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling getDashboardItemPropertyKeys");
    }
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getDashboardItemPropertyKeys");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties"
      .replaceAll("\\{" + "dashboardId" + "\\}", apiClient.escapeString(dashboardId.toString()))
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

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

    GenericType<PropertyKeys> localVarReturnType = new GenericType<PropertyKeys>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Search for dashboards
   * Returns a [paginated](#pagination) list of dashboards. This operation is similar to [Get dashboards](#api-rest-api-3-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public.
   * @param dashboardName String used to perform a case-insensitive partial match with &#x60;name&#x60;. (optional)
   * @param accountId User account ID used to return dashboards with the matching &#x60;owner.accountId&#x60;. This parameter cannot be used with the &#x60;owner&#x60; parameter. (optional)
   * @param owner This parameter is deprecated because of privacy changes. Use &#x60;accountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching &#x60;owner.name&#x60;. This parameter cannot be used with the &#x60;accountId&#x60; parameter. (optional)
   * @param groupname Group name used to returns dashboards that are shared with a group that matches &#x60;sharePermissions.group.name&#x60;. (optional)
   * @param projectId Project ID used to returns dashboards that are shared with a project that matches &#x60;sharePermissions.project.id&#x60;. (optional)
   * @param orderBy [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  &#x60;favourite_count&#x60; Sorts by dashboard popularity.  *  &#x60;id&#x60; Sorts by dashboard ID.  *  &#x60;is_favourite&#x60; Sorts by whether the dashboard is marked as a favorite.  *  &#x60;name&#x60; Sorts by dashboard name.  *  &#x60;owner&#x60; Sorts by dashboard owner name. (optional, default to name)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param expand Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;description&#x60; Returns the description of the dashboard.  *  &#x60;owner&#x60; Returns the owner of the dashboard.  *  &#x60;viewUrl&#x60; Returns the URL that is used to view the dashboard.  *  &#x60;favourite&#x60; Returns &#x60;isFavourite&#x60;, an indicator of whether the user has set the dashboard as a favorite.  *  &#x60;favouritedCount&#x60; Returns &#x60;popularity&#x60;, a count of how many users have set this dashboard as a favorite.  *  &#x60;sharePermissions&#x60; Returns details of the share permissions defined for the dashboard. (optional)
   * @return PageBeanDashboard
   * @throws ApiException if fails to make API call
   */
  public PageBeanDashboard getDashboardsPaginated(String dashboardName, String accountId, String owner, String groupname, Long projectId, String orderBy, Long startAt, Integer maxResults, String expand) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dashboardName", dashboardName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner", owner));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupname", groupname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAt", startAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<PageBeanDashboard> localVarReturnType = new GenericType<PageBeanDashboard>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set dashboard item property
   * Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#x27;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
   * @param body  (required)
   * @param dashboardId The ID of the dashboard. (required)
   * @param itemId The ID of the dashboard item. (required)
   * @param propertyKey The key of the dashboard item property. The maximum length is 255 characters. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object setDashboardItemProperty(Object body, String dashboardId, String itemId, String propertyKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setDashboardItemProperty");
    }
    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling setDashboardItemProperty");
    }
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling setDashboardItemProperty");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling setDashboardItemProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey}"
      .replaceAll("\\{" + "dashboardId" + "\\}", apiClient.escapeString(dashboardId.toString()))
      .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()))
      .replaceAll("\\{" + "propertyKey" + "\\}", apiClient.escapeString(propertyKey.toString()));

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
   * Update dashboard
   * Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](#permissions) required:** None  The dashboard to be updated must be owned by the user.
   * @param body Replacement dashboard details. (required)
   * @param id The ID of the dashboard to update. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard updateDashboard(DashboardDetails body, String id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDashboard");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDashboard");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/dashboard/{id}"
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

    GenericType<Dashboard> localVarReturnType = new GenericType<Dashboard>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
