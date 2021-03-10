/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.xminds.jira.rest.client.api;

import com.xminds.jira.rest.client.ApiException;
import com.xminds.jira.rest.client.model.IssueTypeWithStatus;
import com.xminds.jira.rest.client.model.NotificationScheme;
import com.xminds.jira.rest.client.model.PageBeanProject;
import com.xminds.jira.rest.client.model.Project;
import com.xminds.jira.rest.client.model.ProjectIdentifiers;
import com.xminds.jira.rest.client.model.ProjectInputBean;
import com.xminds.jira.rest.client.model.ProjectIssueTypeHierarchy;
import com.xminds.jira.rest.client.model.StringList;
import com.xminds.jira.rest.client.model.TaskProgressBeanObject;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    /**
     * Archive project
     *
     * Archives a project. Archived projects cannot be deleted. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archiveProjectTest() throws ApiException {
        String projectIdOrKey = null;
        Object response = api.archiveProject(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Create project
     *
     * Creates a project based on a project type template, as shown in the following table:  | Project Type Key | Project Template Key |   |--|--|   | &#x60;business&#x60; | &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-content-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-process-control&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-procurement&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-project-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking&#x60; |   | &#x60;service_desk&#x60; | &#x60;com.atlassian.servicedesk:simplified-it-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-internal-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-external-service-desk&#x60; |   | &#x60;software&#x60; | &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-kanban&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-scrum&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-basic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-kanban-classic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-scrum-classic&#x60; |   The project types are available according to the installed Jira features as follows:   *  Jira Core, the default, enables &#x60;business&#x60; projects.  *  Jira Service Management enables &#x60;service_desk&#x60; projects.  *  Jira Software enables &#x60;software&#x60; projects.  To determine which features are installed, go to **Jira settings** &gt; **Apps** &gt; **Manage apps** and review the System Apps list. To add Jira Software or Jira Service Management into a JIRA instance, use **Jira settings** &gt; **Apps** &gt; **Finding new apps**. For more information, see [ Managing add-ons](https://confluence.atlassian.com/x/S31NLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        ProjectInputBean body = null;
        ProjectIdentifiers response = api.createProject(body);

        // TODO: test validations
    }
    /**
     * Delete project
     *
     * Deletes a project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String projectIdOrKey = null;
        Boolean enableUndo = null;
        api.deleteProject(projectIdOrKey, enableUndo);

        // TODO: test validations
    }
    /**
     * Delete project asynchronously
     *
     * Deletes a project asynchronously.  This operation is:   *  transactional, that is, if part of the delete fails the project is not deleted.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectAsynchronouslyTest() throws ApiException {
        String projectIdOrKey = null;
        api.deleteProjectAsynchronously(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Get all projects
     *
     * Returns all projects visible to the user. Deprecated, use [ Get projects paginated](#api-rest-api-3-project-search-get) that supports search and pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Projects are returned only where the user has *Browse Projects* or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllProjectsTest() throws ApiException {
        String expand = null;
        Integer recent = null;
        List<String> properties = null;
        List<Project> response = api.getAllProjects(expand, recent, properties);

        // TODO: test validations
    }
    /**
     * Get all statuses for project
     *
     * Returns the valid statuses for a project. The statuses are grouped by issue type, as each project has a set of valid issue types and each issue type has a set of valid statuses.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStatusesTest() throws ApiException {
        String projectIdOrKey = null;
        List<IssueTypeWithStatus> response = api.getAllStatuses(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Get project issue type hierarchy
     *
     * Get the issue type hierarchy for a next-gen project.  The issue type hierarchy for a project consists of:   *  *Epic* at level 1 (optional).  *  One or more issue types at level 0 such as *Story*, *Task*, or *Bug*. Where the issue type *Epic* is defined, these issue types are used to break down the content of an epic.  *  *Subtask* at level -1 (optional). This issue type enables level 0 issue types to be broken down into components. Issues based on a level -1 issue type must have a parent issue.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHierarchyTest() throws ApiException {
        Long projectId = null;
        ProjectIssueTypeHierarchy response = api.getHierarchy(projectId);

        // TODO: test validations
    }
    /**
     * Get project notification scheme
     *
     * Gets a [notification scheme](https://confluence.atlassian.com/x/8YdKLg) associated with the project. See the [Get notification scheme](#api-rest-api-3-notificationscheme-id-get) resource for more information about notification schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationSchemeForProjectTest() throws ApiException {
        String projectKeyOrId = null;
        String expand = null;
        NotificationScheme response = api.getNotificationSchemeForProject(projectKeyOrId, expand);

        // TODO: test validations
    }
    /**
     * Get project
     *
     * Returns the [project details](https://confluence.atlassian.com/x/ahLpNw) for a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String projectIdOrKey = null;
        String expand = null;
        List<String> properties = null;
        Project response = api.getProject(projectIdOrKey, expand, properties);

        // TODO: test validations
    }
    /**
     * Restore deleted project
     *
     * Restores a project from the Jira recycle bin.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreTest() throws ApiException {
        String projectIdOrKey = null;
        Project response = api.restore(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Get projects paginated
     *
     * Returns a [paginated](#pagination) list of projects visible to the user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Projects are returned only where the user has one of:   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchProjectsTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String query = null;
        String typeKey = null;
        Long categoryId = null;
        String action = null;
        String expand = null;
        List<String> status = null;
        List<StringList> properties = null;
        String propertyQuery = null;
        PageBeanProject response = api.searchProjects(startAt, maxResults, orderBy, query, typeKey, categoryId, action, expand, status, properties, propertyQuery);

        // TODO: test validations
    }
    /**
     * Update project
     *
     * Updates the [project details](https://confluence.atlassian.com/x/ahLpNw) of a project.  All parameters are optional in the body of the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        ProjectInputBean body = null;
        String projectIdOrKey = null;
        String expand = null;
        Project response = api.updateProject(body, projectIdOrKey, expand);

        // TODO: test validations
    }
    /**
     * Update project type
     *
     * Deprecated, this feature is no longer supported and no alternatives are available, see [Convert project to a different template or type](https://confluence.atlassian.com/x/yEKeOQ). Updates a [project type](https://confluence.atlassian.com/x/GwiiLQ). The project type can be updated for classic projects only, project type cannot be updated for next-gen projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTypeTest() throws ApiException {
        String projectIdOrKey = null;
        String newProjectTypeKey = null;
        Project response = api.updateProjectType(projectIdOrKey, newProjectTypeKey);

        // TODO: test validations
    }
}
