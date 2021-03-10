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
import java.util.ArrayList;
import java.util.List;
/**
 * An ordered list of custom field option IDs and information on where to move them.
 */
@Schema(description = "An ordered list of custom field option IDs and information on where to move them.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class OrderOfCustomFieldOptions {
  @JsonProperty("customFieldOptionIds")
  private List<String> customFieldOptionIds = new ArrayList<String>();

  @JsonProperty("after")
  private String after = null;

  /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#x27;t provided.
   */
  public enum PositionEnum {
    FIRST("First"),
    LAST("Last");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("position")
  private PositionEnum position = null;

  public OrderOfCustomFieldOptions customFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
    return this;
  }

  public OrderOfCustomFieldOptions addCustomFieldOptionIdsItem(String customFieldOptionIdsItem) {
    this.customFieldOptionIds.add(customFieldOptionIdsItem);
    return this;
  }

   /**
   * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
   * @return customFieldOptionIds
  **/
  @Schema(required = true, description = "A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.")
  public List<String> getCustomFieldOptionIds() {
    return customFieldOptionIds;
  }

  public void setCustomFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
  }

  public OrderOfCustomFieldOptions after(String after) {
    this.after = after;
    return this;
  }

   /**
   * The ID of the custom field option or cascading option to place the moved options after. Required if &#x60;position&#x60; isn&#x27;t provided.
   * @return after
  **/
  @Schema(description = "The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public OrderOfCustomFieldOptions position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#x27;t provided.
   * @return position
  **/
  @Schema(description = "The position the custom field options should be moved to. Required if `after` isn't provided.")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderOfCustomFieldOptions orderOfCustomFieldOptions = (OrderOfCustomFieldOptions) o;
    return Objects.equals(this.customFieldOptionIds, orderOfCustomFieldOptions.customFieldOptionIds) &&
        Objects.equals(this.after, orderOfCustomFieldOptions.after) &&
        Objects.equals(this.position, orderOfCustomFieldOptions.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldOptionIds, after, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOfCustomFieldOptions {\n");
    
    sb.append("    customFieldOptionIds: ").append(toIndentedString(customFieldOptionIds)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
