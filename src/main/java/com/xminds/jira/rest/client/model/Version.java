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
import com.xminds.jira.rest.client.model.SimpleLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
/**
 * Details about a project version.
 */
@Schema(description = "Details about a project version.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class Version {
  @JsonProperty("expand")
  private String expand = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("archived")
  private Boolean archived = null;

  @JsonProperty("released")
  private Boolean released = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("releaseDate")
  private LocalDate releaseDate = null;

  @JsonProperty("overdue")
  private Boolean overdue = null;

  @JsonProperty("userStartDate")
  private String userStartDate = null;

  @JsonProperty("userReleaseDate")
  private String userReleaseDate = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("projectId")
  private Long projectId = null;

  @JsonProperty("moveUnfixedIssuesTo")
  private String moveUnfixedIssuesTo = null;

  @JsonProperty("operations")
  private List<SimpleLink> operations = null;

  @JsonProperty("issuesStatusForFixVersion")
  private AllOfVersionIssuesStatusForFixVersion issuesStatusForFixVersion = null;

  public Version expand(String expand) {
    this.expand = expand;
    return this;
  }

   /**
   * Use [expand](em&gt;#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;operations&#x60; Returns the list of operations available for this version.  *  &#x60;issuesstatus&#x60; Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update.
   * @return expand
  **/
  @Schema(description = "Use [expand](em>#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  `operations` Returns the list of operations available for this version.  *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update.")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

   /**
   * The URL of the version.
   * @return self
  **/
  @Schema(description = "The URL of the version.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the version.
   * @return id
  **/
  @Schema(description = "The ID of the version.")
  public String getId() {
    return id;
  }

  public Version description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the version. Optional when creating or updating a version.
   * @return description
  **/
  @Schema(description = "The description of the version. Optional when creating or updating a version.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Version name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
   * @return name
  **/
  @Schema(description = "The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Version archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Indicates that the version is archived. Optional when creating or updating a version.
   * @return archived
  **/
  @Schema(description = "Indicates that the version is archived. Optional when creating or updating a version.")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Version released(Boolean released) {
    this.released = released;
    return this;
  }

   /**
   * Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
   * @return released
  **/
  @Schema(description = "Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.")
  public Boolean isReleased() {
    return released;
  }

  public void setReleased(Boolean released) {
    this.released = released;
  }

  public Version startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return startDate
  **/
  @Schema(description = "The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Version releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return releaseDate
  **/
  @Schema(description = "The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

   /**
   * Indicates that the version is overdue.
   * @return overdue
  **/
  @Schema(description = "Indicates that the version is overdue.")
  public Boolean isOverdue() {
    return overdue;
  }

   /**
   * The date on which work on this version is expected to start, expressed in the instance&#x27;s *Day/Month/Year Format* date format.
   * @return userStartDate
  **/
  @Schema(description = "The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.")
  public String getUserStartDate() {
    return userStartDate;
  }

   /**
   * The date on which work on this version is expected to finish, expressed in the instance&#x27;s *Day/Month/Year Format* date format.
   * @return userReleaseDate
  **/
  @Schema(description = "The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.")
  public String getUserReleaseDate() {
    return userReleaseDate;
  }

  public Version project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Deprecated. Use &#x60;projectId&#x60;.
   * @return project
  **/
  @Schema(description = "Deprecated. Use `projectId`.")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Version projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
   * @return projectId
  **/
  @Schema(description = "The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Version moveUnfixedIssuesTo(String moveUnfixedIssuesTo) {
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
    return this;
  }

   /**
   * The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
   * @return moveUnfixedIssuesTo
  **/
  @Schema(description = "The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.")
  public String getMoveUnfixedIssuesTo() {
    return moveUnfixedIssuesTo;
  }

  public void setMoveUnfixedIssuesTo(String moveUnfixedIssuesTo) {
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
  }

   /**
   * If the expand option &#x60;operations&#x60; is used, returns the list of operations available for this version.
   * @return operations
  **/
  @Schema(description = "If the expand option `operations` is used, returns the list of operations available for this version.")
  public List<SimpleLink> getOperations() {
    return operations;
  }

   /**
   * If the expand option &#x60;issuesstatus&#x60; is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
   * @return issuesStatusForFixVersion
  **/
  @Schema(description = "If the expand option `issuesstatus` is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.")
  public AllOfVersionIssuesStatusForFixVersion getIssuesStatusForFixVersion() {
    return issuesStatusForFixVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.expand, version.expand) &&
        Objects.equals(this.self, version.self) &&
        Objects.equals(this.id, version.id) &&
        Objects.equals(this.description, version.description) &&
        Objects.equals(this.name, version.name) &&
        Objects.equals(this.archived, version.archived) &&
        Objects.equals(this.released, version.released) &&
        Objects.equals(this.startDate, version.startDate) &&
        Objects.equals(this.releaseDate, version.releaseDate) &&
        Objects.equals(this.overdue, version.overdue) &&
        Objects.equals(this.userStartDate, version.userStartDate) &&
        Objects.equals(this.userReleaseDate, version.userReleaseDate) &&
        Objects.equals(this.project, version.project) &&
        Objects.equals(this.projectId, version.projectId) &&
        Objects.equals(this.moveUnfixedIssuesTo, version.moveUnfixedIssuesTo) &&
        Objects.equals(this.operations, version.operations) &&
        Objects.equals(this.issuesStatusForFixVersion, version.issuesStatusForFixVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, self, id, description, name, archived, released, startDate, releaseDate, overdue, userStartDate, userReleaseDate, project, projectId, moveUnfixedIssuesTo, operations, issuesStatusForFixVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
    sb.append("    userStartDate: ").append(toIndentedString(userStartDate)).append("\n");
    sb.append("    userReleaseDate: ").append(toIndentedString(userReleaseDate)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    moveUnfixedIssuesTo: ").append(toIndentedString(moveUnfixedIssuesTo)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    issuesStatusForFixVersion: ").append(toIndentedString(issuesStatusForFixVersion)).append("\n");
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
