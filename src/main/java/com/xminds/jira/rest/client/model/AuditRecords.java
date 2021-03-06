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
import com.xminds.jira.rest.client.model.AuditRecordBean;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Container for a list of audit records.
 */
@Schema(description = "Container for a list of audit records.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class AuditRecords {
  @JsonProperty("offset")
  private Integer offset = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total")
  private Long total = null;

  @JsonProperty("records")
  private List<AuditRecordBean> records = null;

   /**
   * The number of audit items skipped before the first item in this list.
   * @return offset
  **/
  @Schema(description = "The number of audit items skipped before the first item in this list.")
  public Integer getOffset() {
    return offset;
  }

   /**
   * The requested or default limit on the number of audit items to be returned.
   * @return limit
  **/
  @Schema(description = "The requested or default limit on the number of audit items to be returned.")
  public Integer getLimit() {
    return limit;
  }

   /**
   * The total number of audit items returned.
   * @return total
  **/
  @Schema(description = "The total number of audit items returned.")
  public Long getTotal() {
    return total;
  }

   /**
   * The list of audit items.
   * @return records
  **/
  @Schema(description = "The list of audit items.")
  public List<AuditRecordBean> getRecords() {
    return records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecords auditRecords = (AuditRecords) o;
    return Objects.equals(this.offset, auditRecords.offset) &&
        Objects.equals(this.limit, auditRecords.limit) &&
        Objects.equals(this.total, auditRecords.total) &&
        Objects.equals(this.records, auditRecords.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecords {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
