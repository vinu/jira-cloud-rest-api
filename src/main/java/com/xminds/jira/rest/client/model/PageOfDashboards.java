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
import com.xminds.jira.rest.client.model.Dashboard;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A page containing dashboard details.
 */
@Schema(description = "A page containing dashboard details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class PageOfDashboards {
  @JsonProperty("startAt")
  private Integer startAt = null;

  @JsonProperty("maxResults")
  private Integer maxResults = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("prev")
  private String prev = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("dashboards")
  private List<Dashboard> dashboards = null;

   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @Schema(description = "The index of the first item returned on the page.")
  public Integer getStartAt() {
    return startAt;
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
   * The number of results on the page.
   * @return total
  **/
  @Schema(description = "The number of results on the page.")
  public Integer getTotal() {
    return total;
  }

   /**
   * The URL of the previous page of results, if any.
   * @return prev
  **/
  @Schema(description = "The URL of the previous page of results, if any.")
  public String getPrev() {
    return prev;
  }

   /**
   * The URL of the next page of results, if any.
   * @return next
  **/
  @Schema(description = "The URL of the next page of results, if any.")
  public String getNext() {
    return next;
  }

   /**
   * List of dashboards.
   * @return dashboards
  **/
  @Schema(description = "List of dashboards.")
  public List<Dashboard> getDashboards() {
    return dashboards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfDashboards pageOfDashboards = (PageOfDashboards) o;
    return Objects.equals(this.startAt, pageOfDashboards.startAt) &&
        Objects.equals(this.maxResults, pageOfDashboards.maxResults) &&
        Objects.equals(this.total, pageOfDashboards.total) &&
        Objects.equals(this.prev, pageOfDashboards.prev) &&
        Objects.equals(this.next, pageOfDashboards.next) &&
        Objects.equals(this.dashboards, pageOfDashboards.dashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, total, prev, next, dashboards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfDashboards {\n");
    
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
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
