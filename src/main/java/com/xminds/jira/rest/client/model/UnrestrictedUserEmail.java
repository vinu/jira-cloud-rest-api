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
 * UnrestrictedUserEmail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class UnrestrictedUserEmail {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("email")
  private String email = null;

  public UnrestrictedUserEmail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The accountId of the user
   * @return accountId
  **/
  @Schema(description = "The accountId of the user")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UnrestrictedUserEmail email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the user
   * @return email
  **/
  @Schema(description = "The email of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnrestrictedUserEmail unrestrictedUserEmail = (UnrestrictedUserEmail) o;
    return Objects.equals(this.accountId, unrestrictedUserEmail.accountId) &&
        Objects.equals(this.email, unrestrictedUserEmail.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnrestrictedUserEmail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
