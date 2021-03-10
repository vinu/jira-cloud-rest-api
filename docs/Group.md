# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of group. |  [optional]
**self** | **String** | The URL for these group details. |  [optional]
**users** | **AllOfGroupUsers** | A paginated list of the users that are members of the group. A maximum of 50 users is returned in the list, to access additional users append &#x60;[start-index:end-index]&#x60; to the expand request. For example, to access the next 50 users, use&#x60;?expand&#x3D;users[51:100]&#x60;. |  [optional]
**expand** | **String** | Expand options that include additional group details in the response. |  [optional]
