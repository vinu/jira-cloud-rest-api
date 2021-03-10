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
 * Details of an issue level security item.
 */
@Schema(description = "Details of an issue level security item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class SecurityLevel {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

   /**
   * The URL of the issue level security item.
   * @return self
  **/
  @Schema(description = "The URL of the issue level security item.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the issue level security item.
   * @return id
  **/
  @Schema(description = "The ID of the issue level security item.")
  public String getId() {
    return id;
  }

   /**
   * The description of the issue level security item.
   * @return description
  **/
  @Schema(description = "The description of the issue level security item.")
  public String getDescription() {
    return description;
  }

   /**
   * The name of the issue level security item.
   * @return name
  **/
  @Schema(description = "The name of the issue level security item.")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityLevel securityLevel = (SecurityLevel) o;
    return Objects.equals(this.self, securityLevel.self) &&
        Objects.equals(this.id, securityLevel.id) &&
        Objects.equals(this.description, securityLevel.description) &&
        Objects.equals(this.name, securityLevel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevel {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
