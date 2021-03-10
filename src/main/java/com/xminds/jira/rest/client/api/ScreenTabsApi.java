package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ScreenableTab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ScreenTabsApi {
  private ApiClient apiClient;

  public ScreenTabsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScreenTabsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create screen tab
   * Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param screenId The ID of the screen. (required)
   * @return ScreenableTab
   * @throws ApiException if fails to make API call
   */
  public ScreenableTab addScreenTab(ScreenableTab body, Long screenId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addScreenTab");
    }
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling addScreenTab");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()));

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

    GenericType<ScreenableTab> localVarReturnType = new GenericType<ScreenableTab>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete screen tab
   * Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param screenId The ID of the screen. (required)
   * @param tabId The ID of the screen tab. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScreenTab(Long screenId, Long tabId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling deleteScreenTab");
    }
    // verify the required parameter 'tabId' is set
    if (tabId == null) {
      throw new ApiException(400, "Missing the required parameter 'tabId' when calling deleteScreenTab");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
      .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()));

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
   * Get all screen tabs
   * Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
   * @param screenId The ID of the screen. (required)
   * @param projectKey The key of the project. (optional)
   * @return List&lt;ScreenableTab&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ScreenableTab> getAllScreenTabs(Long screenId, String projectKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling getAllScreenTabs");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectKey", projectKey));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<List<ScreenableTab>> localVarReturnType = new GenericType<List<ScreenableTab>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Move screen tab
   * Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param screenId The ID of the screen. (required)
   * @param tabId The ID of the screen tab. (required)
   * @param pos The position of tab. The base index is 0. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object moveScreenTab(Long screenId, Long tabId, Integer pos) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling moveScreenTab");
    }
    // verify the required parameter 'tabId' is set
    if (tabId == null) {
      throw new ApiException(400, "Missing the required parameter 'tabId' when calling moveScreenTab");
    }
    // verify the required parameter 'pos' is set
    if (pos == null) {
      throw new ApiException(400, "Missing the required parameter 'pos' when calling moveScreenTab");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/move/{pos}"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
      .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()))
      .replaceAll("\\{" + "pos" + "\\}", apiClient.escapeString(pos.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update screen tab
   * Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param screenId The ID of the screen. (required)
   * @param tabId The ID of the screen tab. (required)
   * @return ScreenableTab
   * @throws ApiException if fails to make API call
   */
  public ScreenableTab renameScreenTab(ScreenableTab body, Long screenId, Long tabId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling renameScreenTab");
    }
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling renameScreenTab");
    }
    // verify the required parameter 'tabId' is set
    if (tabId == null) {
      throw new ApiException(400, "Missing the required parameter 'tabId' when calling renameScreenTab");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
      .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()));

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

    GenericType<ScreenableTab> localVarReturnType = new GenericType<ScreenableTab>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
