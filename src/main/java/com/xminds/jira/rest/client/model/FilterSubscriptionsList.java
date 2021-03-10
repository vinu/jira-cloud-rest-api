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
import com.xminds.jira.rest.client.model.FilterSubscription;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A paginated list of subscriptions to a filter.
 */
@Schema(description = "A paginated list of subscriptions to a filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class FilterSubscriptionsList {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("items")
  private List<FilterSubscription> items = null;

  @JsonProperty("max-results")
  private Integer maxResults = null;

  @JsonProperty("start-index")
  private Integer startIndex = null;

  @JsonProperty("end-index")
  private Integer endIndex = null;

   /**
   * The number of items on the page.
   * @return size
  **/
  @Schema(description = "The number of items on the page.")
  public Integer getSize() {
    return size;
  }

   /**
   * The list of items.
   * @return items
  **/
  @Schema(description = "The list of items.")
  public List<FilterSubscription> getItems() {
    return items;
  }

   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @Schema(description = "The maximum number of results that could be on the page.")
  public Integer getMaxResults() {
    return maxResults;
  }

   /**
   * The index of the first item returned on the page.
   * @return startIndex
  **/
  @Schema(description = "The index of the first item returned on the page.")
  public Integer getStartIndex() {
    return startIndex;
  }

   /**
   * The index of the last item returned on the page.
   * @return endIndex
  **/
  @Schema(description = "The index of the last item returned on the page.")
  public Integer getEndIndex() {
    return endIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSubscriptionsList filterSubscriptionsList = (FilterSubscriptionsList) o;
    return Objects.equals(this.size, filterSubscriptionsList.size) &&
        Objects.equals(this.items, filterSubscriptionsList.items) &&
        Objects.equals(this.maxResults, filterSubscriptionsList.maxResults) &&
        Objects.equals(this.startIndex, filterSubscriptionsList.startIndex) &&
        Objects.equals(this.endIndex, filterSubscriptionsList.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, maxResults, startIndex, endIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSubscriptionsList {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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