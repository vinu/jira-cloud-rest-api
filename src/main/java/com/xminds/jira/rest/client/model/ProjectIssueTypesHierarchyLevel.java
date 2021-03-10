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
import com.xminds.jira.rest.client.model.IssueTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Details of an issue type hierarchy level.
 */
@Schema(description = "Details of an issue type hierarchy level.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class ProjectIssueTypesHierarchyLevel {
  @JsonProperty("entityId")
  private UUID entityId = null;

  @JsonProperty("level")
  private Integer level = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("issueTypes")
  private List<IssueTypeInfo> issueTypes = null;

   /**
   * The ID of the issue type hierarchy level.
   * @return entityId
  **/
  @Schema(description = "The ID of the issue type hierarchy level.")
  public UUID getEntityId() {
    return entityId;
  }

   /**
   * The level of the issue type hierarchy level.
   * @return level
  **/
  @Schema(description = "The level of the issue type hierarchy level.")
  public Integer getLevel() {
    return level;
  }

   /**
   * The name of the issue type hierarchy level.
   * @return name
  **/
  @Schema(description = "The name of the issue type hierarchy level.")
  public String getName() {
    return name;
  }

   /**
   * The list of issue types in the hierarchy level.
   * @return issueTypes
  **/
  @Schema(description = "The list of issue types in the hierarchy level.")
  public List<IssueTypeInfo> getIssueTypes() {
    return issueTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueTypesHierarchyLevel projectIssueTypesHierarchyLevel = (ProjectIssueTypesHierarchyLevel) o;
    return Objects.equals(this.entityId, projectIssueTypesHierarchyLevel.entityId) &&
        Objects.equals(this.level, projectIssueTypesHierarchyLevel.level) &&
        Objects.equals(this.name, projectIssueTypesHierarchyLevel.name) &&
        Objects.equals(this.issueTypes, projectIssueTypesHierarchyLevel.issueTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, level, name, issueTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypesHierarchyLevel {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
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