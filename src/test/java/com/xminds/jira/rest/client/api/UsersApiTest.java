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
import com.xminds.jira.rest.client.model.ColumnItem;
import com.xminds.jira.rest.client.model.GroupName;
import com.xminds.jira.rest.client.model.PageBeanUser;
import com.xminds.jira.rest.client.model.UnrestrictedUserEmail;
import com.xminds.jira.rest.client.model.User;
import com.xminds.jira.rest.client.model.UserMigrationBean;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Bulk get users
     *
     * Returns a [paginated](#pagination) list of the users specified by one or more account IDs.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkGetUsersTest() throws ApiException {
        List<String> accountId = null;
        Long startAt = null;
        Integer maxResults = null;
        List<String> username = null;
        List<String> key = null;
        PageBeanUser response = api.bulkGetUsers(accountId, startAt, maxResults, username, key);

        // TODO: test validations
    }
    /**
     * Get account IDs for users
     *
     * Returns the account IDs for the users specified in the &#x60;key&#x60; or &#x60;username&#x60; parameters. Note that multiple &#x60;key&#x60; or &#x60;username&#x60; parameters can be specified.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkGetUsersMigrationTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        List<String> username = null;
        List<String> key = null;
        List<UserMigrationBean> response = api.bulkGetUsersMigration(startAt, maxResults, username, key);

        // TODO: test validations
    }
    /**
     * Create user
     *
     * Creates a user. This resource is retained for legacy compatibility. As soon as a more suitable alternative is available this resource will be deprecated.  The option is provided to set or generate a password for the user. When using the option to generate a password, by omitting &#x60;password&#x60; from the request, include &#x60;\&quot;notification\&quot;: \&quot;true\&quot;&#x60; to ensure the user is sent an email advising them that their account is created. This email includes a link for the user to set their password. If the notification isn&#x27;t sent for a generated password, the user will need to be sent a reset password request from Jira.  If the user exists and has access to Jira, the operation returns a 201 status. If the user exists but does not have access to Jira, the operation returns a 400 status.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        Map<String, Object> body = null;
        User response = api.createUser(body);

        // TODO: test validations
    }
    /**
     * Get all users
     *
     * Returns a list of all (active and inactive) users.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUsersTest() throws ApiException {
        Integer startAt = null;
        Integer maxResults = null;
        List<User> response = api.getAllUsers(startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Get all users default
     *
     * Returns a list of all (active and inactive) users.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUsersDefaultTest() throws ApiException {
        Integer startAt = null;
        Integer maxResults = null;
        List<User> response = api.getAllUsersDefault(startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Get user
     *
     * Returns a user.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String accountId = null;
        String username = null;
        String key = null;
        String expand = null;
        User response = api.getUser(accountId, username, key, expand);

        // TODO: test validations
    }
    /**
     * Get user default columns
     *
     * Returns the default [issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If &#x60;accountId&#x60; is not passed in the request, the calling user&#x27;s details are returned.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLgl), to get the column details for any user.  *  Permission to access Jira, to get the calling user&#x27;s column details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDefaultColumnsTest() throws ApiException {
        String accountId = null;
        String username = null;
        List<ColumnItem> response = api.getUserDefaultColumns(accountId, username);

        // TODO: test validations
    }
    /**
     * Get user email
     *
     * Returns a user&#x27;s email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserEmailTest() throws ApiException {
        String accountId = null;
        UnrestrictedUserEmail response = api.getUserEmail(accountId);

        // TODO: test validations
    }
    /**
     * Get user email bulk
     *
     * Returns a user&#x27;s email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserEmailBulkTest() throws ApiException {
        List<String> accountId = null;
        UnrestrictedUserEmail response = api.getUserEmailBulk(accountId);

        // TODO: test validations
    }
    /**
     * Get user groups
     *
     * Returns the groups to which a user belongs.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserGroupsTest() throws ApiException {
        String accountId = null;
        String username = null;
        String key = null;
        List<GroupName> response = api.getUserGroups(accountId, username, key);

        // TODO: test validations
    }
    /**
     * Delete user
     *
     * Deletes a user.  **[Permissions](#permissions) required:** Site administration (that is, membership of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserTest() throws ApiException {
        String accountId = null;
        String username = null;
        String key = null;
        api.removeUser(accountId, username, key);

        // TODO: test validations
    }
    /**
     * Reset user default columns
     *
     * Resets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user to the system default. If &#x60;accountId&#x60; is not passed, the calling user&#x27;s default columns are reset.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.  *  Permission to access Jira, to set the calling user&#x27;s columns.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetUserColumnsTest() throws ApiException {
        String accountId = null;
        String username = null;
        api.resetUserColumns(accountId, username);

        // TODO: test validations
    }
    /**
     * Set user default columns
     *
     * Sets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If an account ID is not passed, the calling user&#x27;s default columns are set. If no column details are sent, then all default columns are removed.  The parameters for this resource are expressed as HTML form data. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/user/columns?accountId&#x3D;5b10ac8d82e05b22cc7d4ef5&#x27;&#x60;  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.  *  Permission to access Jira, to set the calling user&#x27;s columns.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserColumnsTest() throws ApiException {
        List<String> body = null;
        String accountId = null;
        Object response = api.setUserColumns(body, accountId);

        // TODO: test validations
    }
}
