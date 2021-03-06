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
import com.xminds.jira.rest.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The details of votes on an issue.
 */
@Schema(description = "The details of votes on an issue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class Votes {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("votes")
  private Long votes = null;

  @JsonProperty("hasVoted")
  private Boolean hasVoted = null;

  @JsonProperty("voters")
  private List<User> voters = null;

   /**
   * The URL of these issue vote details.
   * @return self
  **/
  @Schema(description = "The URL of these issue vote details.")
  public String getSelf() {
    return self;
  }

   /**
   * The number of votes on the issue.
   * @return votes
  **/
  @Schema(description = "The number of votes on the issue.")
  public Long getVotes() {
    return votes;
  }

   /**
   * Whether the user making this request has voted on the issue.
   * @return hasVoted
  **/
  @Schema(description = "Whether the user making this request has voted on the issue.")
  public Boolean isHasVoted() {
    return hasVoted;
  }

   /**
   * List of the users who have voted on this issue. An empty list is returned when the calling user doesn&#x27;t have the *View voters and watchers* project permission.
   * @return voters
  **/
  @Schema(description = "List of the users who have voted on this issue. An empty list is returned when the calling user doesn't have the *View voters and watchers* project permission.")
  public List<User> getVoters() {
    return voters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Votes votes = (Votes) o;
    return Objects.equals(this.self, votes.self) &&
        Objects.equals(this.votes, votes.votes) &&
        Objects.equals(this.hasVoted, votes.hasVoted) &&
        Objects.equals(this.voters, votes.voters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, votes, hasVoted, voters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Votes {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    hasVoted: ").append(toIndentedString(hasVoted)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
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
