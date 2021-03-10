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
 * Details about a workflow.
 */
@Schema(description = "Details about a workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class DeprecatedWorkflow {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lastModifiedDate")
  private String lastModifiedDate = null;

  @JsonProperty("lastModifiedUser")
  private String lastModifiedUser = null;

  @JsonProperty("lastModifiedUserAccountId")
  private String lastModifiedUserAccountId = null;

  @JsonProperty("steps")
  private Integer steps = null;

  @JsonProperty("scope")
  private AllOfDeprecatedWorkflowScope scope = null;

  @JsonProperty("default")
  private Boolean _default = null;

   /**
   * The name of the workflow.
   * @return name
  **/
  @Schema(description = "The name of the workflow.")
  public String getName() {
    return name;
  }

   /**
   * The description of the workflow.
   * @return description
  **/
  @Schema(description = "The description of the workflow.")
  public String getDescription() {
    return description;
  }

   /**
   * The datetime the workflow was last modified.
   * @return lastModifiedDate
  **/
  @Schema(description = "The datetime the workflow was last modified.")
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return lastModifiedUser
  **/
  @Schema(description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getLastModifiedUser() {
    return lastModifiedUser;
  }

   /**
   * The account ID of the user that last modified the workflow.
   * @return lastModifiedUserAccountId
  **/
  @Schema(description = "The account ID of the user that last modified the workflow.")
  public String getLastModifiedUserAccountId() {
    return lastModifiedUserAccountId;
  }

   /**
   * The number of steps included in the workflow.
   * @return steps
  **/
  @Schema(description = "The number of steps included in the workflow.")
  public Integer getSteps() {
    return steps;
  }

   /**
   * The scope where this workflow applies
   * @return scope
  **/
  @Schema(description = "The scope where this workflow applies")
  public AllOfDeprecatedWorkflowScope getScope() {
    return scope;
  }

  public DeprecatedWorkflow _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @Schema(description = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeprecatedWorkflow deprecatedWorkflow = (DeprecatedWorkflow) o;
    return Objects.equals(this.name, deprecatedWorkflow.name) &&
        Objects.equals(this.description, deprecatedWorkflow.description) &&
        Objects.equals(this.lastModifiedDate, deprecatedWorkflow.lastModifiedDate) &&
        Objects.equals(this.lastModifiedUser, deprecatedWorkflow.lastModifiedUser) &&
        Objects.equals(this.lastModifiedUserAccountId, deprecatedWorkflow.lastModifiedUserAccountId) &&
        Objects.equals(this.steps, deprecatedWorkflow.steps) &&
        Objects.equals(this.scope, deprecatedWorkflow.scope) &&
        Objects.equals(this._default, deprecatedWorkflow._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, lastModifiedDate, lastModifiedUser, lastModifiedUserAccountId, steps, scope, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeprecatedWorkflow {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    lastModifiedUserAccountId: ").append(toIndentedString(lastModifiedUserAccountId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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