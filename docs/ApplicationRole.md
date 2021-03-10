# ApplicationRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the application role. |  [optional]
**groups** | **List&lt;String&gt;** | The groups associated with the application role. |  [optional]
**name** | **String** | The display name of the application role. |  [optional]
**defaultGroups** | **List&lt;String&gt;** | The groups that are granted default access for this application role. |  [optional]
**selectedByDefault** | **Boolean** | Determines whether this application role should be selected by default on user creation. |  [optional]
**defined** | **Boolean** | Deprecated. |  [optional]
**numberOfSeats** | **Integer** | The maximum count of users on your license. |  [optional]
**remainingSeats** | **Integer** | The count of users remaining on your license. |  [optional]
**userCount** | **Integer** | The number of users counting against your license. |  [optional]
**userCountDescription** | **String** | The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license. |  [optional]
**hasUnlimitedSeats** | **Boolean** |  |  [optional]
**platform** | **Boolean** | Indicates if the application role belongs to Jira platform (&#x60;jira-core&#x60;). |  [optional]
