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
 * Default value for a cascading select custom field.
 */
@Schema(description = "Default value for a cascading select custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class CustomFieldContextDefaultValueCascadingOption implements OneOfCustomFieldContextDefaultValue {
  @JsonProperty("contextId")
  private String contextId = null;

  @JsonProperty("optionId")
  private String optionId = null;

  @JsonProperty("cascadingOptionId")
  private String cascadingOptionId = null;

  @JsonProperty("type")
  private String type = null;

  public CustomFieldContextDefaultValueCascadingOption contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context.
   * @return contextId
  **/
  @Schema(required = true, description = "The ID of the context.")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextDefaultValueCascadingOption optionId(String optionId) {
    this.optionId = optionId;
    return this;
  }

   /**
   * The ID of the default option.
   * @return optionId
  **/
  @Schema(required = true, description = "The ID of the default option.")
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  public CustomFieldContextDefaultValueCascadingOption cascadingOptionId(String cascadingOptionId) {
    this.cascadingOptionId = cascadingOptionId;
    return this;
  }

   /**
   * The ID of the default cascading option.
   * @return cascadingOptionId
  **/
  @Schema(description = "The ID of the default cascading option.")
  public String getCascadingOptionId() {
    return cascadingOptionId;
  }

  public void setCascadingOptionId(String cascadingOptionId) {
    this.cascadingOptionId = cascadingOptionId;
  }

  public CustomFieldContextDefaultValueCascadingOption type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueCascadingOption customFieldContextDefaultValueCascadingOption = (CustomFieldContextDefaultValueCascadingOption) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueCascadingOption.contextId) &&
        Objects.equals(this.optionId, customFieldContextDefaultValueCascadingOption.optionId) &&
        Objects.equals(this.cascadingOptionId, customFieldContextDefaultValueCascadingOption.cascadingOptionId) &&
        Objects.equals(this.type, customFieldContextDefaultValueCascadingOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, optionId, cascadingOptionId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueCascadingOption {\n");
    
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    cascadingOptionId: ").append(toIndentedString(cascadingOptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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