# FieldDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the field. |  [optional]
**key** | **String** | The key of the field. |  [optional]
**name** | **String** | The name of the field. |  [optional]
**custom** | **Boolean** | Whether the field is a custom field. |  [optional]
**orderable** | **Boolean** | Whether the content of the field can be used to order lists. |  [optional]
**navigable** | **Boolean** | Whether the field can be used as a column on the issue navigator. |  [optional]
**searchable** | **Boolean** | Whether the content of the field can be searched. |  [optional]
**clauseNames** | **List&lt;String&gt;** | The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ). |  [optional]
**scope** | **AllOfFieldDetailsScope** | The scope of the field. |  [optional]
**schema** | **AllOfFieldDetailsSchema** | The data schema for the field. |  [optional]
