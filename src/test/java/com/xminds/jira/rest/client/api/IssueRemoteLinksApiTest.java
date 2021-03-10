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
import com.xminds.jira.rest.client.model.RemoteIssueLink;
import com.xminds.jira.rest.client.model.RemoteIssueLinkIdentifies;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueRemoteLinksApi
 */
@Ignore
public class IssueRemoteLinksApiTest {

    private final IssueRemoteLinksApi api = new IssueRemoteLinksApi();

    /**
     * Create or update remote issue link
     *
     * Creates or updates a remote issue link for an issue.  If a &#x60;globalId&#x60; is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateRemoteIssueLinkTest() throws ApiException {
        Map<String, Object> body = null;
        String issueIdOrKey = null;
        RemoteIssueLinkIdentifies response = api.createOrUpdateRemoteIssueLink(body, issueIdOrKey);

        // TODO: test validations
    }
    /**
     * Delete remote issue link by global ID
     *
     * Deletes the remote issue link from the issue using the link&#x27;s global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRemoteIssueLinkByGlobalIdTest() throws ApiException {
        String issueIdOrKey = null;
        String globalId = null;
        api.deleteRemoteIssueLinkByGlobalId(issueIdOrKey, globalId);

        // TODO: test validations
    }
    /**
     * Delete remote issue link by ID
     *
     * Deletes a remote issue link from an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRemoteIssueLinkByIdTest() throws ApiException {
        String issueIdOrKey = null;
        String linkId = null;
        api.deleteRemoteIssueLinkById(issueIdOrKey, linkId);

        // TODO: test validations
    }
    /**
     * Get remote issue link by ID
     *
     * Returns a remote issue link for an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteIssueLinkByIdTest() throws ApiException {
        String issueIdOrKey = null;
        String linkId = null;
        RemoteIssueLink response = api.getRemoteIssueLinkById(issueIdOrKey, linkId);

        // TODO: test validations
    }
    /**
     * Get remote issue links
     *
     * Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteIssueLinksTest() throws ApiException {
        String issueIdOrKey = null;
        String globalId = null;
        RemoteIssueLink response = api.getRemoteIssueLinks(issueIdOrKey, globalId);

        // TODO: test validations
    }
    /**
     * Update remote issue link by ID
     *
     * Updates a remote issue link for an issue.  Note: Fields without values in the request are set to null.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteIssueLinkTest() throws ApiException {
        Map<String, Object> body = null;
        String issueIdOrKey = null;
        String linkId = null;
        Object response = api.updateRemoteIssueLink(body, issueIdOrKey, linkId);

        // TODO: test validations
    }
}
