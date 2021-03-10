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
import java.util.List;
import java.util.Map;
/**
 * The schema of a field.
 */
@Schema(description = "The schema of a field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class JsonTypeBean {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("items")
  private String items = null;

  @JsonProperty("system")
  private String system = null;

  @JsonProperty("custom")
  private String custom = null;

  @JsonProperty("customId")
  private Long customId = null;

  @JsonProperty("configuration")
  private Map<String, Object> _configuration = null;

   /**
   * The data type of the field.
   * @return type
  **/
  @Schema(required = true, description = "The data type of the field.")
  public String getType() {
    return type;
  }

   /**
   * When the data type is an array, the name of the field items within the array.
   * @return items
  **/
  @Schema(description = "When the data type is an array, the name of the field items within the array.")
  public String getItems() {
    return items;
  }

   /**
   * If the field is a system field, the name of the field.
   * @return system
  **/
  @Schema(description = "If the field is a system field, the name of the field.")
  public String getSystem() {
    return system;
  }

   /**
   * If the field is a custom field, the URI of the field.
   * @return custom
  **/
  @Schema(description = "If the field is a custom field, the URI of the field.")
  public String getCustom() {
    return custom;
  }

   /**
   * If the field is a custom field, the custom ID of the field.
   * @return customId
  **/
  @Schema(description = "If the field is a custom field, the custom ID of the field.")
  public Long getCustomId() {
    return customId;
  }

   /**
   * If the field is a custom field, the configuration of the field.
   * @return _configuration
  **/
  @Schema(description = "If the field is a custom field, the configuration of the field.")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonTypeBean jsonTypeBean = (JsonTypeBean) o;
    return Objects.equals(this.type, jsonTypeBean.type) &&
        Objects.equals(this.items, jsonTypeBean.items) &&
        Objects.equals(this.system, jsonTypeBean.system) &&
        Objects.equals(this.custom, jsonTypeBean.custom) &&
        Objects.equals(this.customId, jsonTypeBean.customId) &&
        Objects.equals(this._configuration, jsonTypeBean._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, items, system, custom, customId, _configuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonTypeBean {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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