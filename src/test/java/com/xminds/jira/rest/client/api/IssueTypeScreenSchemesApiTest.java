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
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeDetails;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeId;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeMappingDetails;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeProjectAssociation;
import com.xminds.jira.rest.client.model.IssueTypeScreenSchemeUpdateDetails;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScreenScheme;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScreenSchemeItem;
import com.xminds.jira.rest.client.model.PageBeanIssueTypeScreenSchemesProjects;
import com.xminds.jira.rest.client.model.UpdateDefaultScreenScheme;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueTypeScreenSchemesApi
 */
@Ignore
public class IssueTypeScreenSchemesApiTest {

    private final IssueTypeScreenSchemesApi api = new IssueTypeScreenSchemesApi();

    /**
     * Append mappings to issue type screen scheme
     *
     * Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void appendMappingsForIssueTypeScreenSchemeTest() throws ApiException {
        IssueTypeScreenSchemeMappingDetails body = null;
        String issueTypeScreenSchemeId = null;
        Object response = api.appendMappingsForIssueTypeScreenScheme(body, issueTypeScreenSchemeId);

        // TODO: test validations
    }
    /**
     * Assign issue type screen scheme to project
     *
     * Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignIssueTypeScreenSchemeToProjectTest() throws ApiException {
        IssueTypeScreenSchemeProjectAssociation body = null;
        Object response = api.assignIssueTypeScreenSchemeToProject(body);

        // TODO: test validations
    }
    /**
     * Create issue type screen scheme
     *
     * Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIssueTypeScreenSchemeTest() throws ApiException {
        IssueTypeScreenSchemeDetails body = null;
        IssueTypeScreenSchemeId response = api.createIssueTypeScreenScheme(body);

        // TODO: test validations
    }
    /**
     * Delete issue type screen scheme
     *
     * Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIssueTypeScreenSchemeTest() throws ApiException {
        String issueTypeScreenSchemeId = null;
        Object response = api.deleteIssueTypeScreenScheme(issueTypeScreenSchemeId);

        // TODO: test validations
    }
    /**
     * Get issue type screen scheme items
     *
     * Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueTypeScreenSchemeMappingsTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        List<Long> issueTypeScreenSchemeId = null;
        PageBeanIssueTypeScreenSchemeItem response = api.getIssueTypeScreenSchemeMappings(startAt, maxResults, issueTypeScreenSchemeId);

        // TODO: test validations
    }
    /**
     * Get issue type screen schemes for projects
     *
     * Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueTypeScreenSchemeProjectAssociationsTest() throws ApiException {
        List<Long> projectId = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanIssueTypeScreenSchemesProjects response = api.getIssueTypeScreenSchemeProjectAssociations(projectId, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Get issue type screen schemes
     *
     * Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueTypeScreenSchemesTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        List<Long> id = null;
        PageBeanIssueTypeScreenScheme response = api.getIssueTypeScreenSchemes(startAt, maxResults, id);

        // TODO: test validations
    }
    /**
     * Remove mappings from issue type screen scheme
     *
     * Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeMappingsFromIssueTypeScreenSchemeTest() throws ApiException {
        IssueTypeIds body = null;
        String issueTypeScreenSchemeId = null;
        Object response = api.removeMappingsFromIssueTypeScreenScheme(body, issueTypeScreenSchemeId);

        // TODO: test validations
    }
    /**
     * Update issue type screen scheme default screen scheme
     *
     * Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDefaultScreenSchemeTest() throws ApiException {
        UpdateDefaultScreenScheme body = null;
        String issueTypeScreenSchemeId = null;
        Object response = api.updateDefaultScreenScheme(body, issueTypeScreenSchemeId);

        // TODO: test validations
    }
    /**
     * Update issue type screen scheme
     *
     * Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIssueTypeScreenSchemeTest() throws ApiException {
        IssueTypeScreenSchemeUpdateDetails body = null;
        String issueTypeScreenSchemeId = null;
        Object response = api.updateIssueTypeScreenScheme(body, issueTypeScreenSchemeId);

        // TODO: test validations
    }
}
