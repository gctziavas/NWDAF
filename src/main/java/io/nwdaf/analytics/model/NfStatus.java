package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the percentage of time spent on various NF states.
 */
@ApiModel(description = "Contains the percentage of time spent on various NF states.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NfStatus   {
  @JsonProperty("statusRegistered")
  private Integer statusRegistered = null;

  @JsonProperty("statusUnregistered")
  private Integer statusUnregistered = null;

  @JsonProperty("statusUndiscoverable")
  private Integer statusUndiscoverable = null;

  public NfStatus statusRegistered(Integer statusRegistered) {
    this.statusRegistered = statusRegistered;
    return this;
  }

  /**
   * Get statusRegistered
   * @return statusRegistered
  **/
  @ApiModelProperty(value = "")
  
    public Integer getStatusRegistered() {
    return statusRegistered;
  }

  public void setStatusRegistered(Integer statusRegistered) {
    this.statusRegistered = statusRegistered;
  }

  public NfStatus statusUnregistered(Integer statusUnregistered) {
    this.statusUnregistered = statusUnregistered;
    return this;
  }

  /**
   * Get statusUnregistered
   * @return statusUnregistered
  **/
  @ApiModelProperty(value = "")
  
    public Integer getStatusUnregistered() {
    return statusUnregistered;
  }

  public void setStatusUnregistered(Integer statusUnregistered) {
    this.statusUnregistered = statusUnregistered;
  }

  public NfStatus statusUndiscoverable(Integer statusUndiscoverable) {
    this.statusUndiscoverable = statusUndiscoverable;
    return this;
  }

  /**
   * Get statusUndiscoverable
   * @return statusUndiscoverable
  **/
  @ApiModelProperty(value = "")
  
    public Integer getStatusUndiscoverable() {
    return statusUndiscoverable;
  }

  public void setStatusUndiscoverable(Integer statusUndiscoverable) {
    this.statusUndiscoverable = statusUndiscoverable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfStatus nfStatus = (NfStatus) o;
    return Objects.equals(this.statusRegistered, nfStatus.statusRegistered) &&
        Objects.equals(this.statusUnregistered, nfStatus.statusUnregistered) &&
        Objects.equals(this.statusUndiscoverable, nfStatus.statusUndiscoverable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusRegistered, statusUnregistered, statusUndiscoverable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfStatus {\n");
    
    sb.append("    statusRegistered: ").append(toIndentedString(statusRegistered)).append("\n");
    sb.append("    statusUnregistered: ").append(toIndentedString(statusUnregistered)).append("\n");
    sb.append("    statusUndiscoverable: ").append(toIndentedString(statusUndiscoverable)).append("\n");
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
