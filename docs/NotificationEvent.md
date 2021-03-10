# NotificationEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg). |  [optional]
**name** | **String** | The name of the event. |  [optional]
**description** | **String** | The description of the event. |  [optional]
**templateEvent** | **AllOfNotificationEventTemplateEvent** | The template of the event. Only custom events configured by Jira administrators have template. |  [optional]
