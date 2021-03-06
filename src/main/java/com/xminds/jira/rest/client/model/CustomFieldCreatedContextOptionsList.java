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
import com.xminds.jira.rest.client.model.CustomFieldContextOption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A list of custom field options for a context.
 */
@Schema(description = "A list of custom field options for a context.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class CustomFieldCreatedContextOptionsList {
  @JsonProperty("options")
  private List<CustomFieldContextOption> options = null;

  public CustomFieldCreatedContextOptionsList options(List<CustomFieldContextOption> options) {
    this.options = options;
    return this;
  }

  public CustomFieldCreatedContextOptionsList addOptionsItem(CustomFieldContextOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<CustomFieldContextOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The created custom field options.
   * @return options
  **/
  @Schema(description = "The created custom field options.")
  public List<CustomFieldContextOption> getOptions() {
    return options;
  }

  public void setOptions(List<CustomFieldContextOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldCreatedContextOptionsList customFieldCreatedContextOptionsList = (CustomFieldCreatedContextOptionsList) o;
    return Objects.equals(this.options, customFieldCreatedContextOptionsList.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldCreatedContextOptionsList {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
