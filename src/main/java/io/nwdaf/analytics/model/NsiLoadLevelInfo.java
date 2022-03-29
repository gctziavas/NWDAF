package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NetworkAreaInfo;
import io.nwdaf.analytics.model.NumberAverage;
import io.nwdaf.analytics.model.ResourceUsage;
import io.nwdaf.analytics.model.Snssai;
import io.nwdaf.analytics.model.TimeWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the network slice and optionally the associated network slice instance and the load level information.
 */
@ApiModel(description = "Represents the network slice and optionally the associated network slice instance and the load level information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NsiLoadLevelInfo   {
  @JsonProperty("loadLevelInformation")
  private Integer loadLevelInformation = null;

  @JsonProperty("snssai")
  private Snssai snssai = null;

  @JsonProperty("nsiId")
  private String nsiId = null;

  @JsonProperty("resUsage")
  private ResourceUsage resUsage = null;

  @JsonProperty("numOfExceedLoadLevelThr")
  private Integer numOfExceedLoadLevelThr = null;

  @JsonProperty("exceedLoadLevelThrInd")
  private Boolean exceedLoadLevelThrInd = null;

  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea = null;

  @JsonProperty("timePeriod")
  private TimeWindow timePeriod = null;

  @JsonProperty("numOfUes")
  private NumberAverage numOfUes = null;

  @JsonProperty("numOfPduSess")
  private NumberAverage numOfPduSess = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public NsiLoadLevelInfo loadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
    return this;
  }

  /**
   * Get loadLevelInformation
   * @return loadLevelInformation
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getLoadLevelInformation() {
    return loadLevelInformation;
  }

  public void setLoadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
  }

  public NsiLoadLevelInfo snssai(Snssai snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }

  public NsiLoadLevelInfo nsiId(String nsiId) {
    this.nsiId = nsiId;
    return this;
  }

  /**
   * Get nsiId
   * @return nsiId
  **/
  @ApiModelProperty(value = "")
  
    public String getNsiId() {
    return nsiId;
  }

  public void setNsiId(String nsiId) {
    this.nsiId = nsiId;
  }

  public NsiLoadLevelInfo resUsage(ResourceUsage resUsage) {
    this.resUsage = resUsage;
    return this;
  }

  /**
   * Get resUsage
   * @return resUsage
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ResourceUsage getResUsage() {
    return resUsage;
  }

  public void setResUsage(ResourceUsage resUsage) {
    this.resUsage = resUsage;
  }

  public NsiLoadLevelInfo numOfExceedLoadLevelThr(Integer numOfExceedLoadLevelThr) {
    this.numOfExceedLoadLevelThr = numOfExceedLoadLevelThr;
    return this;
  }

  /**
   * Get numOfExceedLoadLevelThr
   * @return numOfExceedLoadLevelThr
  **/
  @ApiModelProperty(value = "")
  
    public Integer getNumOfExceedLoadLevelThr() {
    return numOfExceedLoadLevelThr;
  }

  public void setNumOfExceedLoadLevelThr(Integer numOfExceedLoadLevelThr) {
    this.numOfExceedLoadLevelThr = numOfExceedLoadLevelThr;
  }

  public NsiLoadLevelInfo exceedLoadLevelThrInd(Boolean exceedLoadLevelThrInd) {
    this.exceedLoadLevelThrInd = exceedLoadLevelThrInd;
    return this;
  }

  /**
   * Get exceedLoadLevelThrInd
   * @return exceedLoadLevelThrInd
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isExceedLoadLevelThrInd() {
    return exceedLoadLevelThrInd;
  }

  public void setExceedLoadLevelThrInd(Boolean exceedLoadLevelThrInd) {
    this.exceedLoadLevelThrInd = exceedLoadLevelThrInd;
  }

  public NsiLoadLevelInfo networkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
    return this;
  }

  /**
   * Get networkArea
   * @return networkArea
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NetworkAreaInfo getNetworkArea() {
    return networkArea;
  }

  public void setNetworkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
  }

  public NsiLoadLevelInfo timePeriod(TimeWindow timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * Get timePeriod
   * @return timePeriod
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TimeWindow getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(TimeWindow timePeriod) {
    this.timePeriod = timePeriod;
  }

  public NsiLoadLevelInfo numOfUes(NumberAverage numOfUes) {
    this.numOfUes = numOfUes;
    return this;
  }

  /**
   * Get numOfUes
   * @return numOfUes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NumberAverage getNumOfUes() {
    return numOfUes;
  }

  public void setNumOfUes(NumberAverage numOfUes) {
    this.numOfUes = numOfUes;
  }

  public NsiLoadLevelInfo numOfPduSess(NumberAverage numOfPduSess) {
    this.numOfPduSess = numOfPduSess;
    return this;
  }

  /**
   * Get numOfPduSess
   * @return numOfPduSess
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NumberAverage getNumOfPduSess() {
    return numOfPduSess;
  }

  public void setNumOfPduSess(NumberAverage numOfPduSess) {
    this.numOfPduSess = numOfPduSess;
  }

  public NsiLoadLevelInfo confidence(Integer confidence) {
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
    NsiLoadLevelInfo nsiLoadLevelInfo = (NsiLoadLevelInfo) o;
    return Objects.equals(this.loadLevelInformation, nsiLoadLevelInfo.loadLevelInformation) &&
        Objects.equals(this.snssai, nsiLoadLevelInfo.snssai) &&
        Objects.equals(this.nsiId, nsiLoadLevelInfo.nsiId) &&
        Objects.equals(this.resUsage, nsiLoadLevelInfo.resUsage) &&
        Objects.equals(this.numOfExceedLoadLevelThr, nsiLoadLevelInfo.numOfExceedLoadLevelThr) &&
        Objects.equals(this.exceedLoadLevelThrInd, nsiLoadLevelInfo.exceedLoadLevelThrInd) &&
        Objects.equals(this.networkArea, nsiLoadLevelInfo.networkArea) &&
        Objects.equals(this.timePeriod, nsiLoadLevelInfo.timePeriod) &&
        Objects.equals(this.numOfUes, nsiLoadLevelInfo.numOfUes) &&
        Objects.equals(this.numOfPduSess, nsiLoadLevelInfo.numOfPduSess) &&
        Objects.equals(this.confidence, nsiLoadLevelInfo.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadLevelInformation, snssai, nsiId, resUsage, numOfExceedLoadLevelThr, exceedLoadLevelThrInd, networkArea, timePeriod, numOfUes, numOfPduSess, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsiLoadLevelInfo {\n");
    
    sb.append("    loadLevelInformation: ").append(toIndentedString(loadLevelInformation)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    nsiId: ").append(toIndentedString(nsiId)).append("\n");
    sb.append("    resUsage: ").append(toIndentedString(resUsage)).append("\n");
    sb.append("    numOfExceedLoadLevelThr: ").append(toIndentedString(numOfExceedLoadLevelThr)).append("\n");
    sb.append("    exceedLoadLevelThrInd: ").append(toIndentedString(exceedLoadLevelThrInd)).append("\n");
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    numOfUes: ").append(toIndentedString(numOfUes)).append("\n");
    sb.append("    numOfPduSess: ").append(toIndentedString(numOfPduSess)).append("\n");
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
