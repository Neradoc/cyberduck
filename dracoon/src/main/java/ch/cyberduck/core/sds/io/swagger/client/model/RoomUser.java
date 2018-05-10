/*
 * DRACOON
 * Version 4.4.0 - built at: 2017-12-04 04:14:43, API server: https://demo.dracoon.com/api/v4
 *
 * OpenAPI spec version: 4.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import ch.cyberduck.core.sds.io.swagger.client.model.NodePermissions;
import ch.cyberduck.core.sds.io.swagger.client.model.PublicKeyContainer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class RoomUser {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isGranted")
  private Boolean isGranted = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  @JsonProperty("publicKeyContainer")
  private PublicKeyContainer publicKeyContainer = null;

  public RoomUser id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * User Id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "User Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoomUser isGranted(Boolean isGranted) {
    this.isGranted = isGranted;
    return this;
  }

   /**
   * Is user granted room permissions
   * @return isGranted
  **/
  @ApiModelProperty(required = true, value = "Is user granted room permissions")
  public Boolean getIsGranted() {
    return isGranted;
  }

  public void setIsGranted(Boolean isGranted) {
    this.isGranted = isGranted;
  }

  public RoomUser login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Login name
   * @return login
  **/
  @ApiModelProperty(required = true, value = "Login name")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public RoomUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RoomUser displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * User display name
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "User display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RoomUser permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * User permissions. Empty for not granted users
   * @return permissions
  **/
  @ApiModelProperty(value = "User permissions. Empty for not granted users")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }

  public RoomUser publicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
    return this;
  }

   /**
   * User Public Key. Only if Room is encrypted
   * @return publicKeyContainer
  **/
  @ApiModelProperty(value = "User Public Key. Only if Room is encrypted")
  public PublicKeyContainer getPublicKeyContainer() {
    return publicKeyContainer;
  }

  public void setPublicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomUser roomUser = (RoomUser) o;
    return Objects.equals(this.id, roomUser.id) &&
        Objects.equals(this.isGranted, roomUser.isGranted) &&
        Objects.equals(this.login, roomUser.login) &&
        Objects.equals(this.email, roomUser.email) &&
        Objects.equals(this.displayName, roomUser.displayName) &&
        Objects.equals(this.permissions, roomUser.permissions) &&
        Objects.equals(this.publicKeyContainer, roomUser.publicKeyContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isGranted, login, email, displayName, permissions, publicKeyContainer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGranted: ").append(toIndentedString(isGranted)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    publicKeyContainer: ").append(toIndentedString(publicKeyContainer)).append("\n");
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
