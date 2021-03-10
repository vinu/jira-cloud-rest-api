# ProjectInputBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters. Required when creating a project. Optional when updating a project. |  [optional]
**name** | **String** | The name of the project. Required when creating a project. Optional when updating a project. |  [optional]
**projectTypeKey** | [**ProjectTypeKeyEnum**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which dictates the application-specific feature set. Required when creating a project. Not applicable for the Update project resource. |  [optional]
**projectTemplateKey** | [**ProjectTemplateKeyEnum**](#ProjectTemplateKeyEnum) | A prebuilt configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;. Required when creating a project. Not applicable for the Update project resource. |  [optional]
**description** | **String** | A brief description of the project. |  [optional]
**lead** | **String** | This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Optional when updating a project. Cannot be provided with &#x60;leadAccountId&#x60;. |  [optional]
**leadAccountId** | **String** | The account ID of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Optional when updating a project. Cannot be provided with &#x60;lead&#x60;. |  [optional]
**url** | **String** | A link to information about this project, such as project documentation |  [optional]
**assigneeType** | [**AssigneeTypeEnum**](#AssigneeTypeEnum) | The default assignee when creating issues for this project. |  [optional]
**avatarId** | **Long** | An integer value for the project&#x27;s avatar. |  [optional]
**issueSecurityScheme** | **Long** | The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs. |  [optional]
**permissionScheme** | **Long** | The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs. |  [optional]
**notificationScheme** | **Long** | The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs. |  [optional]
**categoryId** | **Long** | The ID of the project&#x27;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. |  [optional]

<a name="ProjectTypeKeyEnum"></a>
## Enum: ProjectTypeKeyEnum
Name | Value
---- | -----
SOFTWARE | &quot;software&quot;
SERVICE_DESK | &quot;service_desk&quot;
BUSINESS | &quot;business&quot;

<a name="ProjectTemplateKeyEnum"></a>
## Enum: ProjectTemplateKeyEnum
Name | Value
---- | -----
PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_KANBAN | &quot;com.pyxis.greenhopper.jira:gh-simplified-agility-kanban&quot;
PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_SCRUM | &quot;com.pyxis.greenhopper.jira:gh-simplified-agility-scrum&quot;
PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_BASIC | &quot;com.pyxis.greenhopper.jira:gh-simplified-basic&quot;
PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_KANBAN_CLASSIC | &quot;com.pyxis.greenhopper.jira:gh-simplified-kanban-classic&quot;
PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_SCRUM_CLASSIC | &quot;com.pyxis.greenhopper.jira:gh-simplified-scrum-classic&quot;
ATLASSIAN_SERVICEDESK_SIMPLIFIED_IT_SERVICE_DESK | &quot;com.atlassian.servicedesk:simplified-it-service-desk&quot;
ATLASSIAN_SERVICEDESK_SIMPLIFIED_INTERNAL_SERVICE_DESK | &quot;com.atlassian.servicedesk:simplified-internal-service-desk&quot;
ATLASSIAN_SERVICEDESK_SIMPLIFIED_EXTERNAL_SERVICE_DESK | &quot;com.atlassian.servicedesk:simplified-external-service-desk&quot;
ATLASSIAN_SERVICEDESK_SIMPLIFIED_HR_SERVICE_DESK | &quot;com.atlassian.servicedesk:simplified-hr-service-desk&quot;
ATLASSIAN_SERVICEDESK_SIMPLIFIED_FACILITIES_SERVICE_DESK | &quot;com.atlassian.servicedesk:simplified-facilities-service-desk&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_CONTENT_MANAGEMENT | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-content-management&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_DOCUMENT_APPROVAL | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_LEAD_TRACKING | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCESS_CONTROL | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-process-control&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCUREMENT | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-procurement&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROJECT_MANAGEMENT | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-project-management&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_RECRUITMENT | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment&quot;
ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_TASK_ | &quot;com.atlassian.jira-core-project-templates:jira-core-simplified-task-&quot;

<a name="AssigneeTypeEnum"></a>
## Enum: AssigneeTypeEnum
Name | Value
---- | -----
PROJECT_LEAD | &quot;PROJECT_LEAD&quot;
UNASSIGNED | &quot;UNASSIGNED&quot;
