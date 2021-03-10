package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.EntityProperty;
import com.xminds.jira.rest.client.model.OperationMessage;
import com.xminds.jira.rest.client.model.PropertyKeys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class AppPropertiesApi {
  private ApiClient apiClient;

  public AppPropertiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppPropertiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete app property
   * Deletes an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
   * @param addonKey The key of the app, as defined in its descriptor. (required)
   * @param propertyKey The key of the property. (required)
   * @throws ApiException if fails to make API call
   */
  public void addonPropertiesResourceDeleteAddonPropertyDelete(String addonKey, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'addonKey' is set
    if (addonKey == null) {
      throw new ApiException(400, "Missing the required parameter 'addonKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete");
    }
    // create path and map variables
    String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}"
      .replaceAll("\\{" + "addonKey" + "\\}", apiClient.escapeString(addonKey.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get app properties
   * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
   * @param addonKey The key of the app, as defined in its descriptor. (required)
   * @return PropertyKeys
   * @throws ApiException if fails to make API call
   */
  public PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(String addonKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'addonKey' is set
    if (addonKey == null) {
      throw new ApiException(400, "Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertiesGet");
    }
    // create path and map variables
    String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties"
      .replaceAll("\\{" + "addonKey" + "\\}", apiClient.escapeString(addonKey.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<PropertyKeys> localVarReturnType = new GenericType<PropertyKeys>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get app property
   * Returns the key and value of an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
   * @param addonKey The key of the app, as defined in its descriptor. (required)
   * @param propertyKey The key of the property. (required)
   * @return EntityProperty
   * @throws ApiException if fails to make API call
   */
  public EntityProperty addonPropertiesResourceGetAddonPropertyGet(String addonKey, String propertyKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'addonKey' is set
    if (addonKey == null) {
      throw new ApiException(400, "Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertyGet");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling addonPropertiesResourceGetAddonPropertyGet");
    }
    // create path and map variables
    String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}"
      .replaceAll("\\{" + "addonKey" + "\\}", apiClient.escapeString(addonKey.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<EntityProperty> localVarReturnType = new GenericType<EntityProperty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set app property
   * Sets the value of an app&#x27;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
   * @param body  (required)
   * @param addonKey The key of the app, as defined in its descriptor. (required)
   * @param propertyKey The key of the property. (required)
   * @return OperationMessage
   * @throws ApiException if fails to make API call
   */
  public OperationMessage addonPropertiesResourcePutAddonPropertyPut(Object body, String addonKey, String propertyKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addonPropertiesResourcePutAddonPropertyPut");
    }
    // verify the required parameter 'addonKey' is set
    if (addonKey == null) {
      throw new ApiException(400, "Missing the required parameter 'addonKey' when calling addonPropertiesResourcePutAddonPropertyPut");
    }
    // verify the required parameter 'propertyKey' is set
    if (propertyKey == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyKey' when calling addonPropertiesResourcePutAddonPropertyPut");
    }
    // create path and map variables
    String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}"
      .replaceAll("\\{" + "addonKey" + "\\}", apiClient.escapeString(addonKey.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<OperationMessage> localVarReturnType = new GenericType<OperationMessage>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
