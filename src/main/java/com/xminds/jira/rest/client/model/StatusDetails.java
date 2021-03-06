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
import java.util.HashMap;
import java.util.Map;
/**
 * A status.
 */
@Schema(description = "A status.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class StatusDetails extends HashMap<String, Object> {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("iconUrl")
  private String iconUrl = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("statusCategory")
  private AllOfStatusDetailsStatusCategory statusCategory = null;

   /**
   * The URL of the status.
   * @return self
  **/
  @Schema(description = "The URL of the status.")
  public String getSelf() {
    return self;
  }

   /**
   * The description of the status.
   * @return description
  **/
  @Schema(description = "The description of the status.")
  public String getDescription() {
    return description;
  }

   /**
   * The URL of the icon used to represent the status.
   * @return iconUrl
  **/
  @Schema(description = "The URL of the icon used to represent the status.")
  public String getIconUrl() {
    return iconUrl;
  }

   /**
   * The name of the status.
   * @return name
  **/
  @Schema(description = "The name of the status.")
  public String getName() {
    return name;
  }

   /**
   * The ID of the status.
   * @return id
  **/
  @Schema(description = "The ID of the status.")
  public String getId() {
    return id;
  }

   /**
   * The category assigned to the status.
   * @return statusCategory
  **/
  @Schema(description = "The category assigned to the status.")
  public AllOfStatusDetailsStatusCategory getStatusCategory() {
    return statusCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetails statusDetails = (StatusDetails) o;
    return Objects.equals(this.self, statusDetails.self) &&
        Objects.equals(this.description, statusDetails.description) &&
        Objects.equals(this.iconUrl, statusDetails.iconUrl) &&
        Objects.equals(this.name, statusDetails.name) &&
        Objects.equals(this.id, statusDetails.id) &&
        Objects.equals(this.statusCategory, statusDetails.statusCategory) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, description, iconUrl, name, id, statusCategory, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
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
