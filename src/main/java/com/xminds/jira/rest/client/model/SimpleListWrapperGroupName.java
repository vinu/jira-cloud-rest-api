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
import com.xminds.jira.rest.client.model.GroupName;
import com.xminds.jira.rest.client.model.ListWrapperCallbackGroupName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SimpleListWrapperGroupName
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class SimpleListWrapperGroupName {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("items")
  private List<GroupName> items = null;

  @JsonProperty("pagingCallback")
  private ListWrapperCallbackGroupName pagingCallback = null;

  @JsonProperty("callback")
  private ListWrapperCallbackGroupName callback = null;

  @JsonProperty("max-results")
  private Integer maxResults = null;

  public SimpleListWrapperGroupName size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SimpleListWrapperGroupName items(List<GroupName> items) {
    this.items = items;
    return this;
  }

  public SimpleListWrapperGroupName addItemsItem(GroupName itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<GroupName>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<GroupName> getItems() {
    return items;
  }

  public void setItems(List<GroupName> items) {
    this.items = items;
  }

  public SimpleListWrapperGroupName pagingCallback(ListWrapperCallbackGroupName pagingCallback) {
    this.pagingCallback = pagingCallback;
    return this;
  }

   /**
   * Get pagingCallback
   * @return pagingCallback
  **/
  @Schema(description = "")
  public ListWrapperCallbackGroupName getPagingCallback() {
    return pagingCallback;
  }

  public void setPagingCallback(ListWrapperCallbackGroupName pagingCallback) {
    this.pagingCallback = pagingCallback;
  }

  public SimpleListWrapperGroupName callback(ListWrapperCallbackGroupName callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @Schema(description = "")
  public ListWrapperCallbackGroupName getCallback() {
    return callback;
  }

  public void setCallback(ListWrapperCallbackGroupName callback) {
    this.callback = callback;
  }

  public SimpleListWrapperGroupName maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleListWrapperGroupName simpleListWrapperGroupName = (SimpleListWrapperGroupName) o;
    return Objects.equals(this.size, simpleListWrapperGroupName.size) &&
        Objects.equals(this.items, simpleListWrapperGroupName.items) &&
        Objects.equals(this.pagingCallback, simpleListWrapperGroupName.pagingCallback) &&
        Objects.equals(this.callback, simpleListWrapperGroupName.callback) &&
        Objects.equals(this.maxResults, simpleListWrapperGroupName.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, pagingCallback, callback, maxResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleListWrapperGroupName {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pagingCallback: ").append(toIndentedString(pagingCallback)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
