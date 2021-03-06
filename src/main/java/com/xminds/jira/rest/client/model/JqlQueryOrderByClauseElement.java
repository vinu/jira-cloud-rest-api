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
import com.xminds.jira.rest.client.model.JqlQueryField;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * An element of the order-by JQL clause.
 */
@Schema(description = "An element of the order-by JQL clause.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class JqlQueryOrderByClauseElement {
  @JsonProperty("field")
  private JqlQueryField field = null;

  /**
   * The direction in which to order the results.
   */
  public enum DirectionEnum {
    ASC("asc"),
    DESC("desc");

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("direction")
  private DirectionEnum direction = null;

  public JqlQueryOrderByClauseElement field(JqlQueryField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public JqlQueryField getField() {
    return field;
  }

  public void setField(JqlQueryField field) {
    this.field = field;
  }

  public JqlQueryOrderByClauseElement direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction in which to order the results.
   * @return direction
  **/
  @Schema(description = "The direction in which to order the results.")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryOrderByClauseElement jqlQueryOrderByClauseElement = (JqlQueryOrderByClauseElement) o;
    return Objects.equals(this.field, jqlQueryOrderByClauseElement.field) &&
        Objects.equals(this.direction, jqlQueryOrderByClauseElement.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, direction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryOrderByClauseElement {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
