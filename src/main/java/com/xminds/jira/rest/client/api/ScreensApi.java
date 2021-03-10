package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.PageBeanScreen;
import com.xminds.jira.rest.client.model.PageBeanScreenWithTab;
import com.xminds.jira.rest.client.model.Screen;
import com.xminds.jira.rest.client.model.ScreenDetails;
import com.xminds.jira.rest.client.model.ScreenableField;
import com.xminds.jira.rest.client.model.UpdateScreenDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ScreensApi {
  private ApiClient apiClient;

  public ScreensApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScreensApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add field to default screen
   * Adds a field to the default tab of the default screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the field. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object addFieldToDefaultScreen(String fieldId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling addFieldToDefaultScreen");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/addToDefault/{fieldId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create screen
   * Creates a screen with a default field tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return Screen
   * @throws ApiException if fails to make API call
   */
  public Screen createScreen(ScreenDetails body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createScreen");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens";

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

    GenericType<Screen> localVarReturnType = new GenericType<Screen>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete screen
   * Deletes a screen. A screen cannot be deleted if it is used in a screen scheme, workflow, or workflow draft.  Only screens used in classic projects can be deleted.
   * @param screenId The ID of the screen. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScreen(Long screenId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling deleteScreen");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get available screen fields
   * Returns the fields that can be added to a tab on a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param screenId The ID of the screen. (required)
   * @return List&lt;ScreenableField&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ScreenableField> getAvailableScreenFields(Long screenId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling getAvailableScreenFields");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/availableFields"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<List<ScreenableField>> localVarReturnType = new GenericType<List<ScreenableField>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get screens
   * Returns a [paginated](#pagination) list of all screens or those specified by one or more screen IDs.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 100)
   * @param id The list of screen IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. (optional)
   * @return PageBeanScreen
   * @throws ApiException if fails to make API call
   */
  public PageBeanScreen getScreens(Long startAt, Integer maxResults, List<Long> id) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/screens";

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

    GenericType<PageBeanScreen> localVarReturnType = new GenericType<PageBeanScreen>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get screens for a field
   * Returns a [paginated](#pagination) list of the screens a field is used in.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param fieldId The ID of the field to return screens for. (required)
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 100)
   * @param expand Use [expand](#expansion) to include additional information about screens in the response. This parameter accepts &#x60;tab&#x60; which returns details about the screen tabs the field is used in. (optional)
   * @return PageBeanScreenWithTab
   * @throws ApiException if fails to make API call
   */
  public PageBeanScreenWithTab getScreensForField(String fieldId, Long startAt, Integer maxResults, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'fieldId' is set
    if (fieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'fieldId' when calling getScreensForField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/field/{fieldId}/screens"
      .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<PageBeanScreenWithTab> localVarReturnType = new GenericType<PageBeanScreenWithTab>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update screen
   * Updates a screen. Only screens used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param screenId The ID of the screen. (required)
   * @return Screen
   * @throws ApiException if fails to make API call
   */
  public Screen updateScreen(UpdateScreenDetails body, Long screenId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateScreen");
    }
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling updateScreen");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}"
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

    GenericType<Screen> localVarReturnType = new GenericType<Screen>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
