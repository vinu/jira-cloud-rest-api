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
import com.xminds.jira.rest.client.model.AutoCompleteSuggestions;
import com.xminds.jira.rest.client.model.ConvertedJQLQueries;
import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.JQLPersonalDataMigrationRequest;
import com.xminds.jira.rest.client.model.JQLReferenceData;
import com.xminds.jira.rest.client.model.JqlQueriesToParse;
import com.xminds.jira.rest.client.model.ParsedJqlQueries;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JqlApi
 */
@Ignore
public class JqlApiTest {

    private final JqlApi api = new JqlApi();

    /**
     * Get field reference data
     *
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAutoCompleteTest() throws ApiException {
        JQLReferenceData response = api.getAutoComplete();

        // TODO: test validations
    }
    /**
     * Get field auto complete suggestions
     *
     * Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldAutoCompleteForQueryStringTest() throws ApiException {
        String fieldName = null;
        String fieldValue = null;
        String predicateName = null;
        String predicateValue = null;
        AutoCompleteSuggestions response = api.getFieldAutoCompleteForQueryString(fieldName, fieldValue, predicateName, predicateValue);

        // TODO: test validations
    }
    /**
     * Convert user identifiers to account IDs in JQL queries
     *
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void migrateQueriesTest() throws ApiException {
        JQLPersonalDataMigrationRequest body = null;
        ConvertedJQLQueries response = api.migrateQueries(body);

        // TODO: test validations
    }
    /**
     * Parse JQL query
     *
     * Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseJqlQueriesTest() throws ApiException {
        JqlQueriesToParse body = null;
        String validation = null;
        ParsedJqlQueries response = api.parseJqlQueries(body, validation);

        // TODO: test validations
    }
}
