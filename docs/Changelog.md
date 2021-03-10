# Changelog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the changelog. |  [optional]
**author** | **AllOfChangelogAuthor** | The user who made the change. |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the change took place. |  [optional]
**items** | [**List&lt;ChangeDetails&gt;**](ChangeDetails.md) | The list of items changed. |  [optional]
**historyMetadata** | **AllOfChangelogHistoryMetadata** | The history metadata associated with the changed. |  [optional]
