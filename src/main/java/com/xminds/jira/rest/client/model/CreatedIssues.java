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
import com.xminds.jira.rest.client.model.BulkOperationErrorResult;
import com.xminds.jira.rest.client.model.CreatedIssue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about the issues created and the errors for requests that failed.
 */
@Schema(description = "Details about the issues created and the errors for requests that failed.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class CreatedIssues {
  @JsonProperty("issues")
  private List<CreatedIssue> issues = null;

  @JsonProperty("errors")
  private List<BulkOperationErrorResult> errors = null;

   /**
   * Details of the issues created.
   * @return issues
  **/
  @Schema(description = "Details of the issues created.")
  public List<CreatedIssue> getIssues() {
    return issues;
  }

   /**
   * Error details for failed issue creation requests.
   * @return errors
  **/
  @Schema(description = "Error details for failed issue creation requests.")
  public List<BulkOperationErrorResult> getErrors() {
    return errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssues createdIssues = (CreatedIssues) o;
    return Objects.equals(this.issues, createdIssues.issues) &&
        Objects.equals(this.errors, createdIssues.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssues {\n");
    
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
