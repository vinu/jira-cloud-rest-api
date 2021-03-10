/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.model.EntityProperty;
import com.xminds.jira.rest.client.model.OperationMessage;
import com.xminds.jira.rest.client.model.PropertyKeys;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppPropertiesApi
 */
@Ignore
public class AppPropertiesApiTest {

    private final AppPropertiesApi api = new AppPropertiesApi();

    /**
     * Delete app property
     *
     * Deletes an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonPropertiesResourceDeleteAddonPropertyDeleteTest() throws ApiException {
        String addonKey = null;
        String propertyKey = null;
        api.addonPropertiesResourceDeleteAddonPropertyDelete(addonKey, propertyKey);

        // TODO: test validations
    }
    /**
     * Get app properties
     *
     * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonPropertiesResourceGetAddonPropertiesGetTest() throws ApiException {
        String addonKey = null;
        PropertyKeys response = api.addonPropertiesResourceGetAddonPropertiesGet(addonKey);

        // TODO: test validations
    }
    /**
     * Get app property
     *
     * Returns the key and value of an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonPropertiesResourceGetAddonPropertyGetTest() throws ApiException {
        String addonKey = null;
        String propertyKey = null;
        EntityProperty response = api.addonPropertiesResourceGetAddonPropertyGet(addonKey, propertyKey);

        // TODO: test validations
    }
    /**
     * Set app property
     *
     * Sets the value of an app&#x27;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonPropertiesResourcePutAddonPropertyPutTest() throws ApiException {
        Object body = null;
        String addonKey = null;
        String propertyKey = null;
        OperationMessage response = api.addonPropertiesResourcePutAddonPropertyPut(body, addonKey, propertyKey);

        // TODO: test validations
    }
}
