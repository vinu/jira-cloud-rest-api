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
import com.xminds.jira.rest.client.model.StatusCategory;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowStatusCategoriesApi
 */
@Ignore
public class WorkflowStatusCategoriesApiTest {

    private final WorkflowStatusCategoriesApi api = new WorkflowStatusCategoriesApi();

    /**
     * Get all status categories
     *
     * Returns a list of all status categories.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusCategoriesTest() throws ApiException {
        List<StatusCategory> response = api.getStatusCategories();

        // TODO: test validations
    }
    /**
     * Get status category
     *
     * Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-3-status-idOrName-get).  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusCategoryTest() throws ApiException {
        String idOrKey = null;
        StatusCategory response = api.getStatusCategory(idOrKey);

        // TODO: test validations
    }
}
