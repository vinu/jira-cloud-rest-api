# PermissionScheme

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **String** | The expand options available for the permission scheme. |  [optional]
**id** | **Long** | The ID of the permission scheme. |  [optional]
**self** | **String** | The URL of the permission scheme. |  [optional]
**name** | **String** | The name of the permission scheme. Must be unique. | 
**description** | **String** | A description for the permission scheme. |  [optional]
**scope** | **AllOfPermissionSchemeScope** | The scope of the permission scheme. |  [optional]
**permissions** | [**List&lt;PermissionGrant&gt;**](PermissionGrant.md) | The permission scheme to create or update. See [About permission schemes and grants](#about-permission-schemes-and-grants) for more information. |  [optional]
