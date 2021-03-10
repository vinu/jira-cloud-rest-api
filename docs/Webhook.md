# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the webhook. | 
**jqlFilter** | **String** | The JQL filter that specifies which issues the webhook is sent for. | 
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | The Jira events that trigger the webhook. | 
**expirationDate** | **Long** |  | 

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
