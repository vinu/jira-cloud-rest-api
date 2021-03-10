package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.ApplicationProperty;
import com.xminds.jira.rest.client.model.ModelConfiguration;
import com.xminds.jira.rest.client.model.SimpleApplicationPropertyBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class JiraSettingsApi {
  private ApiClient apiClient;

  public JiraSettingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JiraSettingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get advanced settings
   * Returns the application properties that are accessible on the *Advanced Settings* page. To navigate to the *Advanced Settings* page in Jira, choose the Jira icon &gt; **Jira settings** &gt; **System**, **General Configuration** and then click **Advanced Settings** (in the upper right).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @return List&lt;ApplicationProperty&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ApplicationProperty> getAdvancedSettings() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/application-properties/advanced-settings";

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

    GenericType<List<ApplicationProperty>> localVarReturnType = new GenericType<List<ApplicationProperty>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get application property
   * Returns all application properties or an application property.  If you specify a value for the &#x60;key&#x60; parameter, then an application property is returned as an object (not in an array). Otherwise, an array of all editable application properties is returned. See [Set application property](#api-rest-api-3-application-properties-id-put) for descriptions of editable properties.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param key The key of the application property. (optional)
   * @param permissionLevel The permission level of all items being returned in the list. (optional)
   * @param keyFilter When a &#x60;key&#x60; isn&#x27;t provided, this filters the list of results by the application property &#x60;key&#x60; using a regular expression. For example, using &#x60;jira.lf.*&#x60; will return all application properties with keys that start with *jira.lf.*. (optional)
   * @return List&lt;ApplicationProperty&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ApplicationProperty> getApplicationProperty(String key, String permissionLevel, String keyFilter) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/application-properties";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permissionLevel", permissionLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyFilter", keyFilter));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<List<ApplicationProperty>> localVarReturnType = new GenericType<List<ApplicationProperty>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get global settings
   * Returns the [global settings](https://confluence.atlassian.com/x/qYXKM) in Jira. These settings determine whether optional features (for example, subtasks, time tracking, and others) are enabled. If time tracking is enabled, this operation also returns the time tracking configuration.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
   * @return ModelConfiguration
   * @throws ApiException if fails to make API call
   */
  public ModelConfiguration getConfiguration() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/configuration";

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

    GenericType<ModelConfiguration> localVarReturnType = new GenericType<ModelConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set application property
   * Changes the value of an application property. For example, you can change the value of the &#x60;jira.clone.prefix&#x60; from its default value of *CLONE -* to *Clone -* if you prefer sentence case capitalization. Editable properties are described below along with their default values.  #### Advanced settings ####  The advanced settings below are also accessible in [Jira](https://confluence.atlassian.com/x/vYXKM).  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.clone.prefix&#x60; | The string of text prefixed to the title of a cloned issue. | &#x60;CLONE -&#x60; |   | &#x60;jira.date.picker.java.format&#x60; | The date format for the Java (server-side) generated dates. This must be the same as the &#x60;jira.date.picker.javascript.format&#x60; format setting. | &#x60;d/MMM/yy&#x60; |   | &#x60;jira.date.picker.javascript.format&#x60; | The date format for the JavaScript (client-side) generated dates. This must be the same as the &#x60;jira.date.picker.java.format&#x60; format setting. | &#x60;%e/%b/%y&#x60; |   | &#x60;jira.date.time.picker.java.format&#x60; | The date format for the Java (server-side) generated date times. This must be the same as the &#x60;jira.date.time.picker.javascript.format&#x60; format setting. | &#x60;dd/MMM/yy h:mm a&#x60; |   | &#x60;jira.date.time.picker.javascript.format&#x60; | The date format for the JavaScript (client-side) generated date times. This must be the same as the &#x60;jira.date.time.picker.java.format&#x60; format setting. | &#x60;%e/%b/%y %I:%M %p&#x60; |   | &#x60;jira.issue.actions.order&#x60; | The default order of actions (such as *Comments* or *Change history*) displayed on the issue view. | &#x60;asc&#x60; |   | &#x60;jira.table.cols.subtasks&#x60; | The columns to show while viewing subtask issues in a table. For example, a list of subtasks on an issue. | &#x60;issuetype, status, assignee, progress&#x60; |   | &#x60;jira.view.issue.links.sort.order&#x60; | The sort order of the list of issue links on the issue view. | &#x60;type, status, priority&#x60; |   | &#x60;jira.comment.collapsing.minimum.hidden&#x60; | The minimum number of comments required for comment collapsing to occur. A value of &#x60;0&#x60; disables comment collapsing. | &#x60;4&#x60; |   | &#x60;jira.newsletter.tip.delay.days&#x60; | The number of days before a prompt to sign up to the Jira Insiders newsletter is shown. A value of &#x60;-1&#x60; disables this feature. | &#x60;7&#x60; |     #### Look and feel ####  The settings listed below adjust the [look and feel](https://confluence.atlassian.com/x/VwCLLg).  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.lf.date.time&#x60; | The [ time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;h:mm a&#x60; |   | &#x60;jira.lf.date.day&#x60; | The [ day format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;EEEE h:mm a&#x60; |   | &#x60;jira.lf.date.complete&#x60; | The [ date and time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;dd/MMM/yy h:mm a&#x60; |   | &#x60;jira.lf.date.dmy&#x60; | The [ date format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;dd/MMM/yy&#x60; |   | &#x60;jira.date.time.picker.use.iso8061&#x60; | When enabled, sets Monday as the first day of the week in the date picker, as specified by the ISO8601 standard. | &#x60;false&#x60; |   | &#x60;jira.lf.logo.url&#x60; | The URL of the logo image file. | &#x60;/images/icon-jira-logo.png&#x60; |   | &#x60;jira.lf.logo.show.application.title&#x60; | Controls the visibility of the application title on the sidebar. | &#x60;false&#x60; |   | &#x60;jira.lf.favicon.url&#x60; | The URL of the favicon. | &#x60;/favicon.ico&#x60; |   | &#x60;jira.lf.favicon.hires.url&#x60; | The URL of the high-resolution favicon. | &#x60;/images/64jira.png&#x60; |   | &#x60;jira.lf.top.adg3.bgcolour&#x60; | The background color of the sidebar. | &#x60;#0747A6&#x60; |   | &#x60;jira.lf.top.adg3.textcolour&#x60; | The color of the text and logo of the sidebar. | &#x60;#DEEBFF&#x60; |   | &#x60;jira.lf.hero.button.base.bg.colour&#x60; | The background color of the hero button. | &#x60;#3b7fc4&#x60; |   | &#x60;jira.title&#x60; | The text for the application title. The application title can also be set in *General settings*. | &#x60;Jira&#x60; |   | &#x60;jira.option.globalsharing&#x60; | Whether filters and dashboards can be shared with anyone signed into Jira. | &#x60;true&#x60; |   | &#x60;xflow.product.suggestions.enabled&#x60; | Whether to expose product suggestions for other Atlassian products within Jira. | &#x60;true&#x60; |     #### Other settings ####  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.issuenav.criteria.autoupdate&#x60; | Whether instant updates to search criteria is active. | &#x60;true&#x60; |     *Note: Be careful when changing [application properties and advanced settings](https://confluence.atlassian.com/x/vYXKM).*  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
   * @param body  (required)
   * @param id The key of the application property to update. (required)
   * @return ApplicationProperty
   * @throws ApiException if fails to make API call
   */
  public ApplicationProperty setApplicationProperty(SimpleApplicationPropertyBean body, String id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setApplicationProperty");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setApplicationProperty");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/application-properties/{id}"
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

    GenericType<ApplicationProperty> localVarReturnType = new GenericType<ApplicationProperty>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
