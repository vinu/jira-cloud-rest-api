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

package com.xminds.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Details about a permission granted to a user or group.
 */
@Schema(description = "Details about a permission granted to a user or group.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class PermissionGrant {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("holder")
  private AllOfPermissionGrantHolder holder = null;

  @JsonProperty("permission")
  private String permission = null;

   /**
   * The ID of the permission granted details.
   * @return id
  **/
  @Schema(description = "The ID of the permission granted details.")
  public Long getId() {
    return id;
  }

   /**
   * The URL of the permission granted details.
   * @return self
  **/
  @Schema(description = "The URL of the permission granted details.")
  public String getSelf() {
    return self;
  }

  public PermissionGrant holder(AllOfPermissionGrantHolder holder) {
    this.holder = holder;
    return this;
  }

   /**
   * The user or group being granted the permission. It consists of a &#x60;type&#x60; and a type-dependent &#x60;parameter&#x60;. See [Holder object](#holder-object) in *Get all permission schemes* for more information.
   * @return holder
  **/
  @Schema(description = "The user or group being granted the permission. It consists of a `type` and a type-dependent `parameter`. See [Holder object](#holder-object) in *Get all permission schemes* for more information.")
  public AllOfPermissionGrantHolder getHolder() {
    return holder;
  }

  public void setHolder(AllOfPermissionGrantHolder holder) {
    this.holder = holder;
  }

  public PermissionGrant permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * The permission to grant. This permission can be one of the built-in permissions or a custom permission added by an app. See [Built-in permissions](#built-in-permissions) in *Get all permission schemes* for more information about the built-in permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information about custom permissions.
   * @return permission
  **/
  @Schema(description = "The permission to grant. This permission can be one of the built-in permissions or a custom permission added by an app. See [Built-in permissions](#built-in-permissions) in *Get all permission schemes* for more information about the built-in permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information about custom permissions.")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionGrant permissionGrant = (PermissionGrant) o;
    return Objects.equals(this.id, permissionGrant.id) &&
        Objects.equals(this.self, permissionGrant.self) &&
        Objects.equals(this.holder, permissionGrant.holder) &&
        Objects.equals(this.permission, permissionGrant.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, holder, permission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionGrant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
