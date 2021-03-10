# CustomFieldDefinitionJsonBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the custom field, which is displayed in Jira. This is not the unique identifier. | 
**description** | **String** | The description of the custom field, which is displayed in Jira. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the custom field. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppicker*.   *  &#x60;cascadingselect&#x60;: Allows multiple values to be selected using two select lists  *  &#x60;datepicker&#x60;: Stores a date using a picker control  *  &#x60;datetime&#x60;: Stores a date with a time component  *  &#x60;float&#x60;: Stores and validates a numeric (floating point) input  *  &#x60;grouppicker&#x60;: Stores a user group using a picker control  *  &#x60;importid&#x60;: A read-only field that stores the previous ID of the issue from the system that it was imported from  *  &#x60;labels&#x60;: Stores labels  *  &#x60;multicheckboxes&#x60;: Stores multiple values using checkboxes  *  &#x60;multigrouppicker&#x60;: Stores multiple user groups using a picker control  *  &#x60;multiselect&#x60;: Stores multiple values using a select list  *  &#x60;multiuserpicker&#x60;: Stores multiple users using a picker control  *  &#x60;multiversion&#x60;: Stores multiple versions from the versions available in a project using a picker control  *  &#x60;project&#x60;: Stores a project from a list of projects that the user is permitted to view  *  &#x60;radiobuttons&#x60;: Stores a value using radio buttons  *  &#x60;readonlyfield&#x60;: Stores a read-only text value, which can only be populated via the API  *  &#x60;select&#x60;: Stores a value from a configurable list of options  *  &#x60;textarea&#x60;: Stores a long text string using a multiline text area  *  &#x60;textfield&#x60;: Stores a text string using a single-line text box  *  &#x60;url&#x60;: Stores a URL  *  &#x60;userpicker&#x60;: Stores a user using a picker control  *  &#x60;version&#x60;: Stores a version using a picker control | 
**searcherKey** | [**SearcherKeyEnum**](#SearcherKeyEnum) | The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60; | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CASCADINGSELECT | &quot;com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect&quot;
DATEPICKER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:datepicker&quot;
DATETIME | &quot;com.atlassian.jira.plugin.system.customfieldtypes:datetime&quot;
FLOAT | &quot;com.atlassian.jira.plugin.system.customfieldtypes:float&quot;
GROUPPICKER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:grouppicker&quot;
IMPORTID | &quot;com.atlassian.jira.plugin.system.customfieldtypes:importid&quot;
LABELS | &quot;com.atlassian.jira.plugin.system.customfieldtypes:labels&quot;
MULTICHECKBOXES | &quot;com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes&quot;
MULTIGROUPPICKER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker&quot;
MULTISELECT | &quot;com.atlassian.jira.plugin.system.customfieldtypes:multiselect&quot;
MULTIUSERPICKER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:multiuserpicker&quot;
MULTIVERSION | &quot;com.atlassian.jira.plugin.system.customfieldtypes:multiversion&quot;
PROJECT | &quot;com.atlassian.jira.plugin.system.customfieldtypes:project&quot;
RADIOBUTTONS | &quot;com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons&quot;
READONLYFIELD | &quot;com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield&quot;
SELECT | &quot;com.atlassian.jira.plugin.system.customfieldtypes:select&quot;
TEXTAREA | &quot;com.atlassian.jira.plugin.system.customfieldtypes:textarea&quot;
TEXTFIELD | &quot;com.atlassian.jira.plugin.system.customfieldtypes:textfield&quot;
URL | &quot;com.atlassian.jira.plugin.system.customfieldtypes:url&quot;
USERPICKER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:userpicker&quot;
VERSION | &quot;com.atlassian.jira.plugin.system.customfieldtypes:version&quot;

<a name="SearcherKeyEnum"></a>
## Enum: SearcherKeyEnum
Name | Value
---- | -----
CASCADINGSELECTSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher&quot;
DATERANGE | &quot;com.atlassian.jira.plugin.system.customfieldtypes:daterange&quot;
DATETIMERANGE | &quot;com.atlassian.jira.plugin.system.customfieldtypes:datetimerange&quot;
EXACTNUMBER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:exactnumber&quot;
EXACTTEXTSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher&quot;
GROUPPICKERSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher&quot;
LABELSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher&quot;
MULTISELECTSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher&quot;
NUMBERRANGE | &quot;com.atlassian.jira.plugin.system.customfieldtypes:numberrange&quot;
PROJECTSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher&quot;
TEXTSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:textsearcher&quot;
USERPICKERGROUPSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher&quot;
VERSIONSEARCHER | &quot;com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher&quot;
