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
import com.xminds.jira.rest.client.model.CustomFieldOptionCreate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of the options to create for a custom field.
 */
@Schema(description = "Details of the options to create for a custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class BulkCustomFieldOptionCreateRequest {
  @JsonProperty("options")
  private List<CustomFieldOptionCreate> options = null;

  public BulkCustomFieldOptionCreateRequest options(List<CustomFieldOptionCreate> options) {
    this.options = options;
    return this;
  }

  public BulkCustomFieldOptionCreateRequest addOptionsItem(CustomFieldOptionCreate optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<CustomFieldOptionCreate>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Details of options to create.
   * @return options
  **/
  @Schema(description = "Details of options to create.")
  public List<CustomFieldOptionCreate> getOptions() {
    return options;
  }

  public void setOptions(List<CustomFieldOptionCreate> options) {
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
    BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest = (BulkCustomFieldOptionCreateRequest) o;
    return Objects.equals(this.options, bulkCustomFieldOptionCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCustomFieldOptionCreateRequest {\n");
    
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
