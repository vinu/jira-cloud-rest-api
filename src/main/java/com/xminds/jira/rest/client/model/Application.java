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
 * The application the linked item is in.
 */
@Schema(description = "The application the linked item is in.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class Application extends HashMap<String, Object> {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  public Application type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The name-spaced type of the application, used by registered rendering apps.
   * @return type
  **/
  @Schema(description = "The name-spaced type of the application, used by registered rendering apps.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Application name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the application. Used in conjunction with the (remote) object icon title to display a tooltip for the link&#x27;s icon. The tooltip takes the format \&quot;\\[application name\\] icon title\&quot;. Blank items are excluded from the tooltip title. If both items are blank, the icon tooltop displays as \&quot;Web Link\&quot;. Grouping and sorting of links may place links without an application name last.
   * @return name
  **/
  @Schema(description = "The name of the application. Used in conjunction with the (remote) object icon title to display a tooltip for the link's icon. The tooltip takes the format \"\\[application name\\] icon title\". Blank items are excluded from the tooltip title. If both items are blank, the icon tooltop displays as \"Web Link\". Grouping and sorting of links may place links without an application name last.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.type, application.type) &&
        Objects.equals(this.name, application.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
