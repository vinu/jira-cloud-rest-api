# PermissionGrant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the permission granted details. |  [optional]
**self** | **String** | The URL of the permission granted details. |  [optional]
**holder** | **AllOfPermissionGrantHolder** | The user or group being granted the permission. It consists of a &#x60;type&#x60; and a type-dependent &#x60;parameter&#x60;. See [Holder object](#holder-object) in *Get all permission schemes* for more information. |  [optional]
**permission** | **String** | The permission to grant. This permission can be one of the built-in permissions or a custom permission added by an app. See [Built-in permissions](#built-in-permissions) in *Get all permission schemes* for more information about the built-in permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information about custom permissions. |  [optional]
