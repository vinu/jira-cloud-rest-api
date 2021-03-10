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
import com.xminds.jira.rest.client.model.IssueTypeIds;
import com.xminds.jira.rest.client.model.IssueTypeSchemeDetails;
import com.xminds.jira.rest.client.model.IssueTypeSchemeID;
import com.xminds.jira.rest.client.model.IssueTypeSchemeProjectAssociation;
import com.xminds.jira.rest.client.model.IssueTypeSchemeUpdateDetails;
import com.xminds.jira.rest.client.model.OrderOfIssueTypes;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScheme;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeSchemeMapping;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeSchemeProjects;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueTypeSchemesApi
 */
@Ignore
public class IssueTypeSchemesApiTest {

    private final IssueTypeSchemesApi api = new IssueTypeSchemesApi();

    /**
     * Add issue types to issue type scheme
     *
     * Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addIssueTypesToIssueTypeSchemeTest() throws ApiException {
        IssueTypeIds body = null;
        Long issueTypeSchemeId = null;
        Object response = api.addIssueTypesToIssueTypeScheme(body, issueTypeSchemeId);

        // TODO: test validations
    }
    /**
     * Assign issue type scheme to project
     *
     * Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignIssueTypeSchemeToProjectTest() throws ApiException {
        IssueTypeSchemeProjectAssociation body = null;
        Object response = api.assignIssueTypeSchemeToProject(body);

        // TODO: test validations
    }
    /**
     * Create issue type scheme
     *
     * Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIssueTypeSchemeTest() throws ApiException {
        IssueTypeSchemeDetails body = null;
        IssueTypeSchemeID response = api.createIssueTypeScheme(body);

        // TODO: test validations
    }
    /**
     * Delete issue type scheme
     *
     * Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIssueTypeSchemeTest() throws ApiException {
        Long issueTypeSchemeId = null;
        Object response = api.deleteIssueTypeScheme(issueTypeSchemeId);

        // TODO: test validations
    }
    /**
     * Get all issue type schemes
     *
     * Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllIssueTypeSchemesTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        List<Long> id = null;
        PageBeanIssueTypeScheme response = api.getAllIssueTypeSchemes(startAt, maxResults, id);

        // TODO: test validations
    }
    /**
     * Get issue type schemes for projects
     *
     * Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueTypeSchemeForProjectsTest() throws ApiException {
        List<Long> projectId = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanIssueTypeSchemeProjects response = api.getIssueTypeSchemeForProjects(projectId, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Get issue type scheme items
     *
     * Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueTypeSchemesMappingTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        List<Long> issueTypeSchemeId = null;
        PageBeanIssueTypeSchemeMapping response = api.getIssueTypeSchemesMapping(startAt, maxResults, issueTypeSchemeId);

        // TODO: test validations
    }
    /**
     * Remove issue type from issue type scheme
     *
     * Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeIssueTypeFromIssueTypeSchemeTest() throws ApiException {
        Long issueTypeSchemeId = null;
        Long issueTypeId = null;
        Object response = api.removeIssueTypeFromIssueTypeScheme(issueTypeSchemeId, issueTypeId);

        // TODO: test validations
    }
    /**
     * Change order of issue types
     *
     * Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either &#x60;after&#x60; or &#x60;position&#x60; must be provided.  *  the issue type in &#x60;after&#x60; must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reorderIssueTypesInIssueTypeSchemeTest() throws ApiException {
        OrderOfIssueTypes body = null;
        Long issueTypeSchemeId = null;
        Object response = api.reorderIssueTypesInIssueTypeScheme(body, issueTypeSchemeId);

        // TODO: test validations
    }
    /**
     * Update issue type scheme
     *
     * Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIssueTypeSchemeTest() throws ApiException {
        IssueTypeSchemeUpdateDetails body = null;
        Long issueTypeSchemeId = null;
        Object response = api.updateIssueTypeScheme(body, issueTypeSchemeId);

        // TODO: test validations
    }
}
