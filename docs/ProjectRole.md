# ProjectRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **String** | The URL the project role details. |  [optional]
**name** | **String** | The name of the project role. |  [optional]
**id** | **Long** | The ID of the project role. |  [optional]
**description** | **String** | The description of the project role. |  [optional]
**actors** | [**List&lt;RoleActor&gt;**](RoleActor.md) | The list of users who act in this role. |  [optional]
**scope** | **AllOfProjectRoleScope** | The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO). |  [optional]
**translatedName** | **String** | The translated name of the project role. |  [optional]
**currentUserRole** | **Boolean** | Whether the calling user is part of this role. |  [optional]
**admin** | **Boolean** | Whether this role is the admin role for the project. |  [optional]
**roleConfigurable** | **Boolean** | Whether the roles are configurable for this project. |  [optional]
**_default** | **Boolean** | Whether this role is the default role for the project |  [optional]
