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
import com.xminds.jira.rest.client.model.SecurityLevel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about a security scheme.
 */
@Schema(description = "Details about a security scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class SecurityScheme {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("defaultSecurityLevelId")
  private Long defaultSecurityLevelId = null;

  @JsonProperty("levels")
  private List<SecurityLevel> levels = null;

   /**
   * The URL of the issue security scheme.
   * @return self
  **/
  @Schema(description = "The URL of the issue security scheme.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the issue security scheme.
   * @return id
  **/
  @Schema(description = "The ID of the issue security scheme.")
  public Long getId() {
    return id;
  }

   /**
   * The name of the issue security scheme.
   * @return name
  **/
  @Schema(description = "The name of the issue security scheme.")
  public String getName() {
    return name;
  }

   /**
   * The description of the issue security scheme.
   * @return description
  **/
  @Schema(description = "The description of the issue security scheme.")
  public String getDescription() {
    return description;
  }

   /**
   * The ID of the default security level.
   * @return defaultSecurityLevelId
  **/
  @Schema(description = "The ID of the default security level.")
  public Long getDefaultSecurityLevelId() {
    return defaultSecurityLevelId;
  }

  public SecurityScheme levels(List<SecurityLevel> levels) {
    this.levels = levels;
    return this;
  }

  public SecurityScheme addLevelsItem(SecurityLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<SecurityLevel>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  @Schema(description = "")
  public List<SecurityLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<SecurityLevel> levels) {
    this.levels = levels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScheme securityScheme = (SecurityScheme) o;
    return Objects.equals(this.self, securityScheme.self) &&
        Objects.equals(this.id, securityScheme.id) &&
        Objects.equals(this.name, securityScheme.name) &&
        Objects.equals(this.description, securityScheme.description) &&
        Objects.equals(this.defaultSecurityLevelId, securityScheme.defaultSecurityLevelId) &&
        Objects.equals(this.levels, securityScheme.levels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, defaultSecurityLevelId, levels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScheme {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultSecurityLevelId: ").append(toIndentedString(defaultSecurityLevelId)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
