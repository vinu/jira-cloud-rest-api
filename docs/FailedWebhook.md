# FailedWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The webhook ID, as sent in the &#x60;X-Atlassian-Webhook-Identifier&#x60; header with the webhook. | 
**body** | **String** | The webhook body. |  [optional]
**url** | **String** | The original webhook destination. | 
**failureTime** | **Long** | The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry). | 
