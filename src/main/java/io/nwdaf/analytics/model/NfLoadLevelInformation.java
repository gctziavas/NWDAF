package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NFType;
import io.nwdaf.analytics.model.NfStatus;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents load level information of a given NF instance.
 */
@ApiModel(description = "Represents load level information of a given NF instance.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NfLoadLevelInformation   {
  @JsonProperty("nfType")
  private NFType nfType = null;

  @JsonProperty("nfInstanceId")
  private UUID nfInstanceId = null;

  @JsonProperty("nfSetId")
  private String nfSetId = null;

  @JsonProperty("nfStatus")
  private NfStatus nfStatus = null;

  @JsonProperty("nfCpuUsage")
  private Integer nfCpuUsage = null;

  @JsonProperty("nfMemoryUsage")
  private Integer nfMemoryUsage = null;

  @JsonProperty("nfStorageUsage")
  private Integer nfStorageUsage = null;

  @JsonProperty("nfLoadLevelAverage")
  private Integer nfLoadLevelAverage = null;

  @JsonProperty("nfLoadLevelpeak")
  private Integer nfLoadLevelpeak = null;

  @JsonProperty("snssai")
  private Snssai snssai = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public NfLoadLevelInformation nfType(NFType nfType) {
    this.nfType = nfType;
    return this;
  }

  /**
   * Get nfType
   * @return nfType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NFType getNfType() {
    return nfType;
  }

  public void setNfType(NFType nfType) {
    this.nfType = nfType;
  }

  public NfLoadLevelInformation nfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
    return this;
  }

  /**
   * Get nfInstanceId
   * @return nfInstanceId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public UUID getNfInstanceId() {
    return nfInstanceId;
  }

  public void setNfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
  }

  public NfLoadLevelInformation nfSetId(String nfSetId) {
    this.nfSetId = nfSetId;
    return this;
  }

  /**
   * Get nfSetId
   * @return nfSetId
  **/
  @ApiModelProperty(value = "")
  
    public String getNfSetId() {
    return nfSetId;
  }

  public void setNfSetId(String nfSetId) {
    this.nfSetId = nfSetId;
  }

  public NfLoadLevelInformation nfStatus(NfStatus nfStatus) {
    this.nfStatus = nfStatus;
    return this;
  }

  /**
   * Get nfStatus
   * @return nfStatus
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NfStatus getNfStatus() {
    return nfStatus;
  }

  public void setNfStatus(NfStatus nfStatus) {
    this.nfStatus = nfStatus;
  }

  public NfLoadLevelInformation nfCpuUsage(Integer nfCpuUsage) {
    this.nfCpuUsage = nfCpuUsage;
    return this;
  }

  /**
   * Get nfCpuUsage
   * @return nfCpuUsage
  **/
  @ApiModelProperty(value = "")
  
    public Integer getNfCpuUsage() {
    return nfCpuUsage;
  }

  public void setNfCpuUsage(Integer nfCpuUsage) {
    this.nfCpuUsage = nfCpuUsage;
  }

  public NfLoadLevelInformation nfMemoryUsage(Integer nfMemoryUsage) {
    this.nfMemoryUsage = nfMemoryUsage;
    return this;
  }

  /**
   * Get nfMemoryUsage
   * @return nfMemoryUsage
  **/
  @ApiModelProperty(value = "")
  
    public Integer getNfMemoryUsage() {
    return nfMemoryUsage;
  }

  public void setNfMemoryUsage(Integer nfMemoryUsage) {
    this.nfMemoryUsage = nfMemoryUsage;
  }

  public NfLoadLevelInformation nfStorageUsage(Integer nfStorageUsage) {
    this.nfStorageUsage = nfStorageUsage;
    return this;
  }

  /**
   * Get nfStorageUsage
   * @return nfStorageUsage
  **/
  @ApiModelProperty(value = "")
  
    public Integer getNfStorageUsage() {
    return nfStorageUsage;
  }

  public void setNfStorageUsage(Integer nfStorageUsage) {
    this.nfStorageUsage = nfStorageUsage;
  }

  public NfLoadLevelInformation nfLoadLevelAverage(Integer nfLoadLevelAverage) {
    this.nfLoadLevelAverage = nfLoadLevelAverage;
    return this;
  }

  /**
   * Get nfLoadLevelAverage
   * @return nfLoadLevelAverage
  **/
  @ApiModelProperty(value = "")
  
    public Integer getNfLoadLevelAverage() {
    return nfLoadLevelAverage;
  }

  public void setNfLoadLevelAverage(Integer nfLoadLevelAverage) {
    this.nfLoadLevelAverage = nfLoadLevelAverage;
  }

  public NfLoadLevelInformation nfLoadLevelpeak(Integer nfLoadLevelpeak) {
    this.nfLoadLevelpeak = nfLoadLevelpeak;
    return this;
  }

  /**
   * Get nfLoadLevelpeak
   * @return nfLoadLevelpeak
  **/
  @ApiModelProperty(value = "")
  
    public Integer getNfLoadLevelpeak() {
    return nfLoadLevelpeak;
  }

  public void setNfLoadLevelpeak(Integer nfLoadLevelpeak) {
    this.nfLoadLevelpeak = nfLoadLevelpeak;
  }

  public NfLoadLevelInformation snssai(Snssai snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }

  public NfLoadLevelInformation confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  
    public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfLoadLevelInformation nfLoadLevelInformation = (NfLoadLevelInformation) o;
    return Objects.equals(this.nfType, nfLoadLevelInformation.nfType) &&
        Objects.equals(this.nfInstanceId, nfLoadLevelInformation.nfInstanceId) &&
        Objects.equals(this.nfSetId, nfLoadLevelInformation.nfSetId) &&
        Objects.equals(this.nfStatus, nfLoadLevelInformation.nfStatus) &&
        Objects.equals(this.nfCpuUsage, nfLoadLevelInformation.nfCpuUsage) &&
        Objects.equals(this.nfMemoryUsage, nfLoadLevelInformation.nfMemoryUsage) &&
        Objects.equals(this.nfStorageUsage, nfLoadLevelInformation.nfStorageUsage) &&
        Objects.equals(this.nfLoadLevelAverage, nfLoadLevelInformation.nfLoadLevelAverage) &&
        Objects.equals(this.nfLoadLevelpeak, nfLoadLevelInformation.nfLoadLevelpeak) &&
        Objects.equals(this.snssai, nfLoadLevelInformation.snssai) &&
        Objects.equals(this.confidence, nfLoadLevelInformation.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfType, nfInstanceId, nfSetId, nfStatus, nfCpuUsage, nfMemoryUsage, nfStorageUsage, nfLoadLevelAverage, nfLoadLevelpeak, snssai, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfLoadLevelInformation {\n");
    
    sb.append("    nfType: ").append(toIndentedString(nfType)).append("\n");
    sb.append("    nfInstanceId: ").append(toIndentedString(nfInstanceId)).append("\n");
    sb.append("    nfSetId: ").append(toIndentedString(nfSetId)).append("\n");
    sb.append("    nfStatus: ").append(toIndentedString(nfStatus)).append("\n");
    sb.append("    nfCpuUsage: ").append(toIndentedString(nfCpuUsage)).append("\n");
    sb.append("    nfMemoryUsage: ").append(toIndentedString(nfMemoryUsage)).append("\n");
    sb.append("    nfStorageUsage: ").append(toIndentedString(nfStorageUsage)).append("\n");
    sb.append("    nfLoadLevelAverage: ").append(toIndentedString(nfLoadLevelAverage)).append("\n");
    sb.append("    nfLoadLevelpeak: ").append(toIndentedString(nfLoadLevelpeak)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
