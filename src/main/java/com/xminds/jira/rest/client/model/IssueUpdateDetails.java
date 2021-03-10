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
import com.xminds.jira.rest.client.model.EntityProperty;
import com.xminds.jira.rest.client.model.FieldUpdateOperation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of an issue update request.
 */
@Schema(description = "Details of an issue update request.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class IssueUpdateDetails extends HashMap<String, Object> {
  @JsonProperty("transition")
  private AllOfIssueUpdateDetailsTransition transition = null;

  @JsonProperty("fields")
  private Map<String, Object> fields = null;

  @JsonProperty("update")
  private Map<String, List<FieldUpdateOperation>> update = null;

  @JsonProperty("historyMetadata")
  private AllOfIssueUpdateDetailsHistoryMetadata historyMetadata = null;

  @JsonProperty("properties")
  private List<EntityProperty> properties = null;

  public IssueUpdateDetails transition(AllOfIssueUpdateDetailsTransition transition) {
    this.transition = transition;
    return this;
  }

   /**
   * Details of a transition. Required when performing a transition, optional when creating or editing an issue.
   * @return transition
  **/
  @Schema(description = "Details of a transition. Required when performing a transition, optional when creating or editing an issue.")
  public AllOfIssueUpdateDetailsTransition getTransition() {
    return transition;
  }

  public void setTransition(AllOfIssueUpdateDetailsTransition transition) {
    this.transition = transition;
  }

  public IssueUpdateDetails fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IssueUpdateDetails putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<String, Object>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use &#x60;update&#x60;. Fields included in here cannot be included in &#x60;update&#x60;.
   * @return fields
  **/
  @Schema(description = "List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.")
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public IssueUpdateDetails update(Map<String, List<FieldUpdateOperation>> update) {
    this.update = update;
    return this;
  }

  public IssueUpdateDetails putUpdateItem(String key, List<FieldUpdateOperation> updateItem) {
    if (this.update == null) {
      this.update = new HashMap<String, List<FieldUpdateOperation>>();
    }
    this.update.put(key, updateItem);
    return this;
  }

   /**
   * List of operations to perform on issue screen fields. Note that fields included in here cannot be included in &#x60;fields&#x60;.
   * @return update
  **/
  @Schema(description = "List of operations to perform on issue screen fields. Note that fields included in here cannot be included in `fields`.")
  public Map<String, List<FieldUpdateOperation>> getUpdate() {
    return update;
  }

  public void setUpdate(Map<String, List<FieldUpdateOperation>> update) {
    this.update = update;
  }

  public IssueUpdateDetails historyMetadata(AllOfIssueUpdateDetailsHistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
    return this;
  }

   /**
   * Additional issue history details.
   * @return historyMetadata
  **/
  @Schema(description = "Additional issue history details.")
  public AllOfIssueUpdateDetailsHistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }

  public void setHistoryMetadata(AllOfIssueUpdateDetailsHistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
  }

  public IssueUpdateDetails properties(List<EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public IssueUpdateDetails addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<EntityProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Details of issue properties to be add or update.
   * @return properties
  **/
  @Schema(description = "Details of issue properties to be add or update.")
  public List<EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<EntityProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueUpdateDetails issueUpdateDetails = (IssueUpdateDetails) o;
    return Objects.equals(this.transition, issueUpdateDetails.transition) &&
        Objects.equals(this.fields, issueUpdateDetails.fields) &&
        Objects.equals(this.update, issueUpdateDetails.update) &&
        Objects.equals(this.historyMetadata, issueUpdateDetails.historyMetadata) &&
        Objects.equals(this.properties, issueUpdateDetails.properties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transition, fields, update, historyMetadata, properties, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueUpdateDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
