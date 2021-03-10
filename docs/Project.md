# Project

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **String** | Expand options that include additional project details in the response. |  [optional]
**self** | **String** | The URL of the project details. |  [optional]
**id** | **String** | The ID of the project. |  [optional]
**key** | **String** | The key of the project. |  [optional]
**description** | **String** | A brief description of the project. |  [optional]
**lead** | **AllOfProjectLead** | The username of the project lead. |  [optional]
**components** | [**List&lt;Component&gt;**](Component.md) | List of the components contained in the project. |  [optional]
**issueTypes** | [**List&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md) | List of the issue types available in the project. |  [optional]
**url** | **String** | A link to information about this project, such as project documentation. |  [optional]
**email** | **String** | An email address associated with the project. |  [optional]
**assigneeType** | [**AssigneeTypeEnum**](#AssigneeTypeEnum) | The default assignee when creating issues for this project. |  [optional]
**versions** | [**List&lt;Version&gt;**](Version.md) | The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post). |  [optional]
**name** | **String** | The name of the project. |  [optional]
**roles** | **Map&lt;String, String&gt;** | The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post). |  [optional]
**avatarUrls** | **AllOfProjectAvatarUrls** | The URLs of the project&#x27;s avatars. |  [optional]
**projectCategory** | **AllOfProjectProjectCategory** | The category the project belongs to. |  [optional]
**projectTypeKey** | [**ProjectTypeKeyEnum**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project. |  [optional]
**simplified** | **Boolean** | Whether the project is simplified. |  [optional]
**style** | [**StyleEnum**](#StyleEnum) | The type of the project. |  [optional]
**favourite** | **Boolean** | Whether the project is selected as a favorite. |  [optional]
**isPrivate** | **Boolean** | Whether the project is private. |  [optional]
**issueTypeHierarchy** | **AllOfProjectIssueTypeHierarchy** | The issue type hierarchy for the project |  [optional]
**permissions** | **AllOfProjectPermissions** | User permissions on the project |  [optional]
**properties** | **Map&lt;String, Object&gt;** | Map of project properties |  [optional]
**uuid** | [**UUID**](UUID.md) | Unique ID for next-gen projects. |  [optional]
**insight** | **AllOfProjectInsight** | Insights about the project. |  [optional]
**deleted** | **Boolean** | Whether the project is marked as deleted. |  [optional]
**retentionTillDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when the project is deleted permanently. |  [optional]
**deletedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when the project was marked as deleted. |  [optional]
**deletedBy** | **AllOfProjectDeletedBy** | The user who marked the project as deleted. |  [optional]
**archived** | **Boolean** | Whether the project is archived. |  [optional]
**archivedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when the project was archived. |  [optional]
**archivedBy** | **AllOfProjectArchivedBy** | The user who archived the project. |  [optional]

<a name="AssigneeTypeEnum"></a>
## Enum: AssigneeTypeEnum
Name | Value
---- | -----
PROJECT_LEAD | &quot;PROJECT_LEAD&quot;
UNASSIGNED | &quot;UNASSIGNED&quot;

<a name="ProjectTypeKeyEnum"></a>
## Enum: ProjectTypeKeyEnum
Name | Value
---- | -----
SOFTWARE | &quot;software&quot;
SERVICE_DESK | &quot;service_desk&quot;
BUSINESS | &quot;business&quot;

<a name="StyleEnum"></a>
## Enum: StyleEnum
Name | Value
---- | -----
CLASSIC | &quot;classic&quot;
NEXT_GEN | &quot;next-gen&quot;
