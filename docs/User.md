# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **String** | The URL of the user. |  [optional]
**key** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional]
**accountId** | **String** | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests. |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk |  [optional]
**name** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional]
**emailAddress** | **String** | The email address of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional]
**avatarUrls** | **AllOfUserAvatarUrls** | The avatars of the user. |  [optional]
**displayName** | **String** | The display name of the user. Depending on the user’s privacy setting, this may return an alternative value. |  [optional]
**active** | **Boolean** | Whether the user is active. |  [optional]
**timeZone** | **String** | The time zone specified in the user&#x27;s profile. Depending on the user’s privacy setting, this may be returned as null. |  [optional]
**locale** | **String** | The locale of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional]
**groups** | **AllOfUserGroups** | The groups that the user belongs to. |  [optional]
**applicationRoles** | **AllOfUserApplicationRoles** | The application roles the user is assigned to. |  [optional]
**expand** | **String** | Expand options that include additional user details in the response. |  [optional]

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
ATLASSIAN | &quot;atlassian&quot;
APP | &quot;app&quot;
CUSTOMER | &quot;customer&quot;
UNKNOWN | &quot;unknown&quot;
