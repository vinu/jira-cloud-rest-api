# ProjectForScope

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **String** | The URL of the project details. |  [optional]
**id** | **String** | The ID of the project. |  [optional]
**key** | **String** | The key of the project. |  [optional]
**name** | **String** | The name of the project. |  [optional]
**projectTypeKey** | [**ProjectTypeKeyEnum**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project. |  [optional]
**simplified** | **Boolean** | Whether or not the project is simplified. |  [optional]
**avatarUrls** | **AllOfProjectForScopeAvatarUrls** | The URLs of the project&#x27;s avatars. |  [optional]
**projectCategory** | **AllOfProjectForScopeProjectCategory** | The category the project belongs to. |  [optional]

<a name="ProjectTypeKeyEnum"></a>
## Enum: ProjectTypeKeyEnum
Name | Value
---- | -----
SOFTWARE | &quot;software&quot;
SERVICE_DESK | &quot;service_desk&quot;
BUSINESS | &quot;business&quot;
