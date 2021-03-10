# FieldReferenceData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The field identifier. |  [optional]
**displayName** | **String** | The display name of the field. |  [optional]
**orderable** | [**OrderableEnum**](#OrderableEnum) | Whether the field can be used in a query&#x27;s &#x60;ORDER BY&#x60; clause. |  [optional]
**searchable** | [**SearchableEnum**](#SearchableEnum) | Whether the content of this field can be searched. |  [optional]
**auto** | [**AutoEnum**](#AutoEnum) | Whether the field provide auto-complete suggestions. |  [optional]
**cfid** | **String** | If the item is a custom field, the ID of the custom field. |  [optional]
**operators** | **List&lt;String&gt;** | The valid search operators for the field. |  [optional]
**types** | **List&lt;String&gt;** | The data types of items in the field. |  [optional]

<a name="OrderableEnum"></a>
## Enum: OrderableEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;

<a name="SearchableEnum"></a>
## Enum: SearchableEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;

<a name="AutoEnum"></a>
## Enum: AutoEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;
