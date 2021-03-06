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
 * IssueTypeUpdateBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class IssueTypeUpdateBean {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("avatarId")
  private Long avatarId = null;

  public IssueTypeUpdateBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name for the issue type. The maximum length is 60 characters.
   * @return name
  **/
  @Schema(description = "The unique name for the issue type. The maximum length is 60 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueTypeUpdateBean description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type.
   * @return description
  **/
  @Schema(description = "The description of the issue type.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeUpdateBean avatarId(Long avatarId) {
    this.avatarId = avatarId;
    return this;
  }

   /**
   * The ID of an issue type avatar.
   * @return avatarId
  **/
  @Schema(description = "The ID of an issue type avatar.")
  public Long getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeUpdateBean issueTypeUpdateBean = (IssueTypeUpdateBean) o;
    return Objects.equals(this.name, issueTypeUpdateBean.name) &&
        Objects.equals(this.description, issueTypeUpdateBean.description) &&
        Objects.equals(this.avatarId, issueTypeUpdateBean.avatarId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, avatarId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeUpdateBean {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
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
