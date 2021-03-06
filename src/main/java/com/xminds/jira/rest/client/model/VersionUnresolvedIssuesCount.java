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
 * Count of a version&#x27;s unresolved issues.
 */
@Schema(description = "Count of a version's unresolved issues.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class VersionUnresolvedIssuesCount {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("issuesUnresolvedCount")
  private Long issuesUnresolvedCount = null;

  @JsonProperty("issuesCount")
  private Long issuesCount = null;

   /**
   * The URL of these count details.
   * @return self
  **/
  @Schema(description = "The URL of these count details.")
  public String getSelf() {
    return self;
  }

   /**
   * Count of unresolved issues.
   * @return issuesUnresolvedCount
  **/
  @Schema(description = "Count of unresolved issues.")
  public Long getIssuesUnresolvedCount() {
    return issuesUnresolvedCount;
  }

   /**
   * Count of issues.
   * @return issuesCount
  **/
  @Schema(description = "Count of issues.")
  public Long getIssuesCount() {
    return issuesCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUnresolvedIssuesCount versionUnresolvedIssuesCount = (VersionUnresolvedIssuesCount) o;
    return Objects.equals(this.self, versionUnresolvedIssuesCount.self) &&
        Objects.equals(this.issuesUnresolvedCount, versionUnresolvedIssuesCount.issuesUnresolvedCount) &&
        Objects.equals(this.issuesCount, versionUnresolvedIssuesCount.issuesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, issuesUnresolvedCount, issuesCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUnresolvedIssuesCount {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    issuesUnresolvedCount: ").append(toIndentedString(issuesUnresolvedCount)).append("\n");
    sb.append("    issuesCount: ").append(toIndentedString(issuesCount)).append("\n");
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
