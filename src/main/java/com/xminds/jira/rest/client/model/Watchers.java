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
import com.xminds.jira.rest.client.model.UserDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The details of watchers on an issue.
 */
@Schema(description = "The details of watchers on an issue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class Watchers {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("isWatching")
  private Boolean isWatching = null;

  @JsonProperty("watchCount")
  private Integer watchCount = null;

  @JsonProperty("watchers")
  private List<UserDetails> watchers = null;

   /**
   * The URL of these issue watcher details.
   * @return self
  **/
  @Schema(description = "The URL of these issue watcher details.")
  public String getSelf() {
    return self;
  }

   /**
   * Whether the calling user is watching this issue.
   * @return isWatching
  **/
  @Schema(description = "Whether the calling user is watching this issue.")
  public Boolean isIsWatching() {
    return isWatching;
  }

   /**
   * The number of users watching this issue.
   * @return watchCount
  **/
  @Schema(description = "The number of users watching this issue.")
  public Integer getWatchCount() {
    return watchCount;
  }

   /**
   * Details of the users watching this issue.
   * @return watchers
  **/
  @Schema(description = "Details of the users watching this issue.")
  public List<UserDetails> getWatchers() {
    return watchers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watchers watchers = (Watchers) o;
    return Objects.equals(this.self, watchers.self) &&
        Objects.equals(this.isWatching, watchers.isWatching) &&
        Objects.equals(this.watchCount, watchers.watchCount) &&
        Objects.equals(this.watchers, watchers.watchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, isWatching, watchCount, watchers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watchers {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    isWatching: ").append(toIndentedString(isWatching)).append("\n");
    sb.append("    watchCount: ").append(toIndentedString(watchCount)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
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
