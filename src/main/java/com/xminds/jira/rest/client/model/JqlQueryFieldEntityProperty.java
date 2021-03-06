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
 * Details of an entity property.
 */
@Schema(description = "Details of an entity property.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class JqlQueryFieldEntityProperty {
  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("path")
  private String path = null;

  /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   */
  public enum TypeEnum {
    NUMBER("number"),
    STRING("string"),
    TEXT("text"),
    DATE("date"),
    USER("user");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  public JqlQueryFieldEntityProperty entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * The object on which the property is set.
   * @return entity
  **/
  @Schema(example = "issue", required = true, description = "The object on which the property is set.")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public JqlQueryFieldEntityProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the property.
   * @return key
  **/
  @Schema(example = "stats", required = true, description = "The key of the property.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public JqlQueryFieldEntityProperty path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path in the property value to query.
   * @return path
  **/
  @Schema(example = "comments.count", required = true, description = "The path in the property value to query.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JqlQueryFieldEntityProperty type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   * @return type
  **/
  @Schema(example = "number", description = "The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    JqlQueryFieldEntityProperty jqlQueryFieldEntityProperty = (JqlQueryFieldEntityProperty) o;
    return Objects.equals(this.entity, jqlQueryFieldEntityProperty.entity) &&
        Objects.equals(this.key, jqlQueryFieldEntityProperty.key) &&
        Objects.equals(this.path, jqlQueryFieldEntityProperty.path) &&
        Objects.equals(this.type, jqlQueryFieldEntityProperty.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, key, path, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryFieldEntityProperty {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
