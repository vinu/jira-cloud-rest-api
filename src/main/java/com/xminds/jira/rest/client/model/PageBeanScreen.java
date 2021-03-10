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
import com.xminds.jira.rest.client.model.Screen;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A page of items.
 */
@Schema(description = "A page of items.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class PageBeanScreen {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("nextPage")
  private String nextPage = null;

  @JsonProperty("maxResults")
  private Integer maxResults = null;

  @JsonProperty("startAt")
  private Long startAt = null;

  @JsonProperty("total")
  private Long total = null;

  @JsonProperty("isLast")
  private Boolean isLast = null;

  @JsonProperty("values")
  private List<Screen> values = null;

   /**
   * The URL of the page.
   * @return self
  **/
  @Schema(description = "The URL of the page.")
  public String getSelf() {
    return self;
  }

   /**
   * If there is another page of results, the URL of the next page.
   * @return nextPage
  **/
  @Schema(description = "If there is another page of results, the URL of the next page.")
  public String getNextPage() {
    return nextPage;
  }

   /**
   * The maximum number of items that could be returned.
   * @return maxResults
  **/
  @Schema(description = "The maximum number of items that could be returned.")
  public Integer getMaxResults() {
    return maxResults;
  }

   /**
   * The index of the first item returned.
   * @return startAt
  **/
  @Schema(description = "The index of the first item returned.")
  public Long getStartAt() {
    return startAt;
  }

   /**
   * The number of items returned.
   * @return total
  **/
  @Schema(description = "The number of items returned.")
  public Long getTotal() {
    return total;
  }

   /**
   * Whether this is the last page.
   * @return isLast
  **/
  @Schema(description = "Whether this is the last page.")
  public Boolean isIsLast() {
    return isLast;
  }

   /**
   * The list of items.
   * @return values
  **/
  @Schema(description = "The list of items.")
  public List<Screen> getValues() {
    return values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBeanScreen pageBeanScreen = (PageBeanScreen) o;
    return Objects.equals(this.self, pageBeanScreen.self) &&
        Objects.equals(this.nextPage, pageBeanScreen.nextPage) &&
        Objects.equals(this.maxResults, pageBeanScreen.maxResults) &&
        Objects.equals(this.startAt, pageBeanScreen.startAt) &&
        Objects.equals(this.total, pageBeanScreen.total) &&
        Objects.equals(this.isLast, pageBeanScreen.isLast) &&
        Objects.equals(this.values, pageBeanScreen.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, nextPage, maxResults, startAt, total, isLast, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBeanScreen {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
