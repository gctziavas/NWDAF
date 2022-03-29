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
 * Represents bandwidth requirements.
 */
@ApiModel(description = "Represents bandwidth requirements.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class BwRequirement   {
  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("marBwDl")
  private String marBwDl = null;

  @JsonProperty("marBwUl")
  private String marBwUl = null;

  @JsonProperty("mirBwDl")
  private String mirBwDl = null;

  @JsonProperty("mirBwUl")
  private String mirBwUl = null;

  public BwRequirement appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public BwRequirement marBwDl(String marBwDl) {
    this.marBwDl = new BitRate(marBwDl).bitRateValue();
    return this;
  }

  /**
   * Get marBwDl
   * @return marBwDl
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getMarBwDl() {
    return marBwDl;
  }

  public void setMarBwDl(String marBwDl) {
	  this.marBwDl = new BitRate(marBwDl).bitRateValue();
  }

  public BwRequirement marBwUl(String marBwUl) {
	  this.marBwUl = new BitRate(marBwUl).bitRateValue();
    return this;
  }

  /**
   * Get marBwUl
   * @return marBwUl
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getMarBwUl() {
    return marBwUl;
  }

  public void setMarBwUl(String marBwUl) {
	  this.marBwUl = new BitRate(marBwUl).bitRateValue();
  }

  public BwRequirement mirBwDl(String mirBwDl) {
	  this.mirBwDl = new BitRate(mirBwDl).bitRateValue();
    return this;
  }

  /**
   * Get mirBwDl
   * @return mirBwDl
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getMirBwDl() {
    return mirBwDl;
  }

  public void setMirBwDl(String mirBwDl) {
	  this.mirBwDl = new BitRate(mirBwDl).bitRateValue();
  }

  public BwRequirement mirBwUl(String mirBwUl) {
	  this.mirBwUl = new BitRate(mirBwUl).bitRateValue();
    return this;
  }

  /**
   * Get mirBwUl
   * @return mirBwUl
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getMirBwUl() {
    return mirBwUl;
  }

  public void setMirBwUl(String mirBwUl) {
	  this.mirBwUl = new BitRate(mirBwUl).bitRateValue();
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BwRequirement bwRequirement = (BwRequirement) o;
    return Objects.equals(this.appId, bwRequirement.appId) &&
        Objects.equals(this.marBwDl, bwRequirement.marBwDl) &&
        Objects.equals(this.marBwUl, bwRequirement.marBwUl) &&
        Objects.equals(this.mirBwDl, bwRequirement.mirBwDl) &&
        Objects.equals(this.mirBwUl, bwRequirement.mirBwUl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, marBwDl, marBwUl, mirBwDl, mirBwUl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BwRequirement {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    marBwDl: ").append(toIndentedString(marBwDl)).append("\n");
    sb.append("    marBwUl: ").append(toIndentedString(marBwUl)).append("\n");
    sb.append("    mirBwDl: ").append(toIndentedString(mirBwDl)).append("\n");
    sb.append("    mirBwUl: ").append(toIndentedString(mirBwUl)).append("\n");
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
