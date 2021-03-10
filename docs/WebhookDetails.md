# WebhookDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jqlFilter** | **String** | The JQL filter that specifies which issues the webhook is sent for. Only a subset of JQL can be used. The supported elements are:   *  Fields: &#x60;issueKey&#x60;, &#x60;project&#x60;, &#x60;issuetype&#x60;, &#x60;status&#x60;, &#x60;assignee&#x60;, &#x60;reporter&#x60;, &#x60;issue.property&#x60;, and &#x60;cf[id]&#x60; (for custom fields—only the epic label custom field is supported).  *  Operators: &#x60;&#x3D;&#x60;, &#x60;!&#x3D;&#x60;, &#x60;IN&#x60;, and &#x60;NOT IN&#x60;. | 
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | The Jira events that trigger the webhook. | 

<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----
JIRA_ISSUE_CREATED | &quot;jira:issue_created&quot;
JIRA_ISSUE_UPDATED | &quot;jira:issue_updated&quot;
JIRA_ISSUE_DELETED | &quot;jira:issue_deleted&quot;
COMMENT_CREATED | &quot;comment_created&quot;
COMMENT_UPDATED | &quot;comment_updated&quot;
COMMENT_DELETED | &quot;comment_deleted&quot;
ISSUE_PROPERTY_SET | &quot;issue_property_set&quot;
ISSUE_PROPERTY_DELETED | &quot;issue_property_deleted&quot;
