# SharePermissionInputBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the share permission.Specify the type as follows:   *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set. | 
**projectId** | **String** | The ID of the project to share the filter with. Set &#x60;type&#x60; to &#x60;project&#x60;. |  [optional]
**groupname** | **String** | The name of the group to share the filter with. Set &#x60;type&#x60; to &#x60;group&#x60;. |  [optional]
**projectRoleId** | **String** | The ID of the project role to share the filter with. Set &#x60;type&#x60; to &#x60;projectRole&#x60; and the &#x60;projectId&#x60; for the project that the role is in. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PROJECT | &quot;project&quot;
GROUP | &quot;group&quot;
PROJECTROLE | &quot;projectRole&quot;
GLOBAL | &quot;global&quot;
AUTHENTICATED | &quot;authenticated&quot;
