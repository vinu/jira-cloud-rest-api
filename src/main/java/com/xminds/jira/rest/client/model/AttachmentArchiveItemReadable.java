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
 * Metadata for an item in an attachment archive.
 */
@Schema(description = "Metadata for an item in an attachment archive.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class AttachmentArchiveItemReadable {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("index")
  private Long index = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("mediaType")
  private String mediaType = null;

  @JsonProperty("label")
  private String label = null;

   /**
   * The path of the archive item.
   * @return path
  **/
  @Schema(description = "The path of the archive item.")
  public String getPath() {
    return path;
  }

   /**
   * The position of the item within the archive.
   * @return index
  **/
  @Schema(description = "The position of the item within the archive.")
  public Long getIndex() {
    return index;
  }

   /**
   * The size of the archive item.
   * @return size
  **/
  @Schema(description = "The size of the archive item.")
  public String getSize() {
    return size;
  }

   /**
   * The MIME type of the archive item.
   * @return mediaType
  **/
  @Schema(description = "The MIME type of the archive item.")
  public String getMediaType() {
    return mediaType;
  }

   /**
   * The label for the archive item.
   * @return label
  **/
  @Schema(description = "The label for the archive item.")
  public String getLabel() {
    return label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveItemReadable attachmentArchiveItemReadable = (AttachmentArchiveItemReadable) o;
    return Objects.equals(this.path, attachmentArchiveItemReadable.path) &&
        Objects.equals(this.index, attachmentArchiveItemReadable.index) &&
        Objects.equals(this.size, attachmentArchiveItemReadable.size) &&
        Objects.equals(this.mediaType, attachmentArchiveItemReadable.mediaType) &&
        Objects.equals(this.label, attachmentArchiveItemReadable.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, index, size, mediaType, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveItemReadable {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
