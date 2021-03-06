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
 * The IDs of the screens for the screen types of the screen scheme.
 */
@Schema(description = "The IDs of the screens for the screen types of the screen scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-10T13:09:14.296+05:30[Asia/Kolkata]")
public class UpdateScreenTypes {
  @JsonProperty("edit")
  private String edit = null;

  @JsonProperty("create")
  private String create = null;

  @JsonProperty("view")
  private String view = null;

  @JsonProperty("default")
  private String _default = null;

  public UpdateScreenTypes edit(String edit) {
    this.edit = edit;
    return this;
  }

   /**
   * The ID of the edit screen. To remove the screen association, pass a null.
   * @return edit
  **/
  @Schema(description = "The ID of the edit screen. To remove the screen association, pass a null.")
  public String getEdit() {
    return edit;
  }

  public void setEdit(String edit) {
    this.edit = edit;
  }

  public UpdateScreenTypes create(String create) {
    this.create = create;
    return this;
  }

   /**
   * The ID of the create screen. To remove the screen association, pass a null.
   * @return create
  **/
  @Schema(description = "The ID of the create screen. To remove the screen association, pass a null.")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public UpdateScreenTypes view(String view) {
    this.view = view;
    return this;
  }

   /**
   * The ID of the view screen. To remove the screen association, pass a null.
   * @return view
  **/
  @Schema(description = "The ID of the view screen. To remove the screen association, pass a null.")
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }

  public UpdateScreenTypes _default(String _default) {
    this._default = _default;
    return this;
  }

   /**
   * The ID of the default screen. When specified, must include a screen ID as a default screen is required.
   * @return _default
  **/
  @Schema(description = "The ID of the default screen. When specified, must include a screen ID as a default screen is required.")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScreenTypes updateScreenTypes = (UpdateScreenTypes) o;
    return Objects.equals(this.edit, updateScreenTypes.edit) &&
        Objects.equals(this.create, updateScreenTypes.create) &&
        Objects.equals(this.view, updateScreenTypes.view) &&
        Objects.equals(this._default, updateScreenTypes._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edit, create, view, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScreenTypes {\n");
    
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
