package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.ApiClient;
import com.xminds.jira.rest.client.Configuration;
import com.xminds.jira.rest.client.Pair;

import javax.ws.rs.core.GenericType;

import com.xminds.jira.rest.client.model.NotificationScheme;
import com.xminds.jira.rest.client.model.PageBeanNotificationScheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")public class IssueNotificationSchemesApi {
  private ApiClient apiClient;

  public IssueNotificationSchemesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssueNotificationSchemesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get notification scheme
   * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with the notification scheme.
   * @param id The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs. (required)
   * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
   * @return NotificationScheme
   * @throws ApiException if fails to make API call
   */
  public NotificationScheme getNotificationScheme(Long id, String expand) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotificationScheme");
    }
    // create path and map variables
    String localVarPath = "/rest/api/3/notificationscheme/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

    GenericType<NotificationScheme> localVarReturnType = new GenericType<NotificationScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Get notification schemes paginated
   * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by display name.  ### About notification schemes ###  A notification scheme is a list of events and recipients who will receive notifications for those events. The list is contained within the &#x60;notificationSchemeEvents&#x60; object and contains pairs of &#x60;events&#x60; and &#x60;notifications&#x60;:   *  &#x60;event&#x60; Identifies the type of event. The events can be [Jira system events](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or [custom events](https://confluence.atlassian.com/x/AIlKLg).  *  &#x60;notifications&#x60; Identifies the [recipients](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-recipientsRecipients) of notifications for each event. Recipients can be any of the following types:           *  &#x60;CurrentAssignee&#x60;      *  &#x60;Reporter&#x60;      *  &#x60;CurrentUser&#x60;      *  &#x60;ProjectLead&#x60;      *  &#x60;ComponentLead&#x60;      *  &#x60;User&#x60; (the &#x60;parameter&#x60; is the user key)      *  &#x60;Group&#x60; (the &#x60;parameter&#x60; is the group name)      *  &#x60;ProjectRole&#x60; (the &#x60;parameter&#x60; is the project role ID)      *  &#x60;EmailAddress&#x60;      *  &#x60;AllWatchers&#x60;      *  &#x60;UserCustomField&#x60; (the &#x60;parameter&#x60; is the ID of the custom field)      *  &#x60;GroupCustomField&#x60;(the &#x60;parameter&#x60; is the ID of the custom field)  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
   * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
   * @param maxResults The maximum number of items to return per page. (optional, default to 50)
   * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
   * @return PageBeanNotificationScheme
   * @throws ApiException if fails to make API call
   */
  public PageBeanNotificationScheme getNotificationSchemes(Long startAt, Integer maxResults, String expand) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/rest/api/3/notificationscheme";

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

    GenericType<PageBeanNotificationScheme> localVarReturnType = new GenericType<PageBeanNotificationScheme>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
