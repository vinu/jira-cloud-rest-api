package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.AutoCompleteSuggestions;
import com.xminds.jira.rest.client.model.ConvertedJQLQueries;
import com.xminds.jira.rest.client.model.ErrorCollection;
import com.xminds.jira.rest.client.model.JQLPersonalDataMigrationRequest;
import com.xminds.jira.rest.client.model.JQLReferenceData;
import com.xminds.jira.rest.client.model.JqlQueriesToParse;
import com.xminds.jira.rest.client.model.ParsedJqlQueries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class JqlApi {
  private ApiClient apiClient;

  public JqlApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JqlApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get field reference data
   * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @return JQLReferenceData
   * @throws ApiException if fails to make API call
   */
  public JQLReferenceData getAutoComplete() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/jql/autocompletedata";

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

    GenericType<JQLReferenceData> localVarReturnType = new GenericType<JQLReferenceData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get field auto complete suggestions
   * Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param fieldName The name of the field. (optional)
   * @param fieldValue The partial field item name entered by the user. (optional)
   * @param predicateName The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. (optional)
   * @param predicateValue The partial predicate item name entered by the user. (optional)
   * @return AutoCompleteSuggestions
   * @throws ApiException if fails to make API call
   */
  public AutoCompleteSuggestions getFieldAutoCompleteForQueryString(String fieldName, String fieldValue, String predicateName, String predicateValue) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/jql/autocompletedata/suggestions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldName", fieldName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldValue", fieldValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "predicateName", predicateName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "predicateValue", predicateValue));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<AutoCompleteSuggestions> localVarReturnType = new GenericType<AutoCompleteSuggestions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Convert user identifiers to account IDs in JQL queries
   * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.
   * @param body  (required)
   * @return ConvertedJQLQueries
   * @throws ApiException if fails to make API call
   */
  public ConvertedJQLQueries migrateQueries(JQLPersonalDataMigrationRequest body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling migrateQueries");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/jql/pdcleaner";

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

    GenericType<ConvertedJQLQueries> localVarReturnType = new GenericType<ConvertedJQLQueries>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Parse JQL query
   * Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @param body  (required)
   * @param validation How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned. (optional, default to strict)
   * @return ParsedJqlQueries
   * @throws ApiException if fails to make API call
   */
  public ParsedJqlQueries parseJqlQueries(JqlQueriesToParse body, String validation) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling parseJqlQueries");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/jql/parse";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "validation", validation));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<ParsedJqlQueries> localVarReturnType = new GenericType<ParsedJqlQueries>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
