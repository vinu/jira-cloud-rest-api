package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.AddFieldBean;
import com.xminds.jira.rest.client.model.MoveFieldBean;
import com.xminds.jira.rest.client.model.ScreenableField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class ScreenTabFieldsApi {
  private ApiClient apiClient;

  public ScreenTabFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScreenTabFieldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add screen tab field
   * Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param screenId The ID of the screen. (required)
   * @param tabId The ID of the screen tab. (required)
   * @return ScreenableField
   * @throws ApiException if fails to make API call
   */
  public ScreenableField addScreenTabField(AddFieldBean body, Long screenId, Long tabId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addScreenTabField");
    }
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling addScreenTabField");
    }
    // verify the required parameter 'tabId' is set
    if (tabId == null) {
      throw new ApiException(400, "Missing the required parameter 'tabId' when calling addScreenTabField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields"
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

    GenericType<ScreenableField> localVarReturnType = new GenericType<ScreenableField>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get all screen tab fields
   * Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
   * @param screenId The ID of the screen. (required)
   * @param tabId The ID of the screen tab. (required)
   * @param projectKey The key of the project. (optional)
   * @return List&lt;ScreenableField&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ScreenableField> getAllScreenTabFields(Long screenId, Long tabId, String projectKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling getAllScreenTabFields");
    }
    // verify the required parameter 'tabId' is set
    if (tabId == null) {
      throw new ApiException(400, "Missing the required parameter 'tabId' when calling getAllScreenTabFields");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
      .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()));

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

    GenericType<List<ScreenableField>> localVarReturnType = new GenericType<List<ScreenableField>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Move screen tab field
   * Moves a screen tab field.  If &#x60;after&#x60; and &#x60;position&#x60; are provided in the request, &#x60;position&#x60; is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param screenId The ID of the screen. (required)
   * @param tabId The ID of the screen tab. (required)
   * @param id The ID of the field. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object moveScreenTabField(MoveFieldBean body, Long screenId, Long tabId, String id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling moveScreenTabField");
    }
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling moveScreenTabField");
    }
    // verify the required parameter 'tabId' is set
    if (tabId == null) {
      throw new ApiException(400, "Missing the required parameter 'tabId' when calling moveScreenTabField");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling moveScreenTabField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields/{id}/move"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
      .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()))
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Remove screen tab field
   * Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param screenId The ID of the screen. (required)
   * @param tabId The ID of the screen tab. (required)
   * @param id The ID of the field. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeScreenTabField(Long screenId, Long tabId, String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'screenId' is set
    if (screenId == null) {
      throw new ApiException(400, "Missing the required parameter 'screenId' when calling removeScreenTabField");
    }
    // verify the required parameter 'tabId' is set
    if (tabId == null) {
      throw new ApiException(400, "Missing the required parameter 'tabId' when calling removeScreenTabField");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeScreenTabField");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/screens/{screenId}/tabs/{tabId}/fields/{id}"
      .replaceAll("\\{" + "screenId" + "\\}", apiClient.escapeString(screenId.toString()))
      .replaceAll("\\{" + "tabId" + "\\}", apiClient.escapeString(tabId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
}
