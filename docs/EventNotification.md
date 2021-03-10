# EventNotification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **String** | Expand options that include additional event notification details in the response. |  [optional]
**id** | **Long** | The ID of the notification. |  [optional]
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | Identifies the recipients of the notification. |  [optional]
**parameter** | **String** | The value of the &#x60;notificationType&#x60;:   *  &#x60;User&#x60; The &#x60;parameter&#x60; is the user account ID.  *  &#x60;Group&#x60; The &#x60;parameter&#x60; is the group name.  *  &#x60;ProjectRole&#x60; The &#x60;parameter&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field. |  [optional]
**group** | **AllOfEventNotificationGroup** | The specified group. |  [optional]
**field** | **AllOfEventNotificationField** | The custom user or group field. |  [optional]
**emailAddress** | **String** | The email address. |  [optional]
**projectRole** | **AllOfEventNotificationProjectRole** | The specified project role. |  [optional]
**user** | **AllOfEventNotificationUser** | The specified user. |  [optional]

<a name="NotificationTypeEnum"></a>
## Enum: NotificationTypeEnum
Name | Value
---- | -----
CURRENTASSIGNEE | &quot;CurrentAssignee&quot;
REPORTER | &quot;Reporter&quot;
CURRENTUSER | &quot;CurrentUser&quot;
PROJECTLEAD | &quot;ProjectLead&quot;
COMPONENTLEAD | &quot;ComponentLead&quot;
USER | &quot;User&quot;
GROUP | &quot;Group&quot;
PROJECTROLE | &quot;ProjectRole&quot;
EMAILADDRESS | &quot;EmailAddress&quot;
ALLWATCHERS | &quot;AllWatchers&quot;
USERCUSTOMFIELD | &quot;UserCustomField&quot;
GROUPCUSTOMFIELD | &quot;GroupCustomField&quot;
