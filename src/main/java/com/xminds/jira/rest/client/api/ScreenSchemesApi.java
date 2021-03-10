package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.PageBeanScreenScheme;
import com.xminds.jira.rest.client.model.ScreenSchemeDetails;
import com.xminds.jira.rest.client.model.ScreenSchemeId;
import com.xminds.jira.rest.client.model.UpdateScreenSchemeDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ScreenSchemesApi {
  private ApiClient apiClient;

  public ScreenSchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScreenSchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create screen scheme
   * Creates a screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @return ScreenSchemeId
   * @throws ApiException if fails to make API call
   */
  public ScreenSchemeId createScreenScheme(ScreenSchemeDetails body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screenscheme";

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

    GenericType<ScreenSchemeId> localVarReturnType = new GenericType<ScreenSchemeId>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete screen scheme
   * Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.  Only screens schemes used in classic projects can be deleted.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param screenSchemeId The ID of the screen scheme. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteScreenScheme(String screenSchemeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenSchemeId' is set
    if (screenSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenSchemeId' when calling deleteScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screenscheme/{screenSchemeId}"
      .replaceAll("\\{" + "screenSchemeId" + "\\}", apiClient.escapeString(screenSchemeId.toString()));

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
   * Get screen schemes
   * Returns a [paginated](#pagination) list of screen schemes.  Only screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 25)
   * @param id The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. (optional)
   * @return PageBeanScreenScheme
   * @throws ApiException if fails to make API call
   */
  public PageBeanScreenScheme getScreenSchemes(Long startAt, Integer maxResults, List<Long> id) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/screenscheme";

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

    GenericType<PageBeanScreenScheme> localVarReturnType = new GenericType<PageBeanScreenScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update screen scheme
   * Updates a screen scheme. Only screen schemes used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body The screen scheme update details. (required)
   * @param screenSchemeId The ID of the screen scheme. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object updateScreenScheme(UpdateScreenSchemeDetails body, String screenSchemeId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateScreenScheme");
    }
    // verify the required parameter 'screenSchemeId' is set
    if (screenSchemeId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenSchemeId' when calling updateScreenScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screenscheme/{screenSchemeId}"
      .replaceAll("\\{" + "screenSchemeId" + "\\}", apiClient.escapeString(screenSchemeId.toString()));

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
