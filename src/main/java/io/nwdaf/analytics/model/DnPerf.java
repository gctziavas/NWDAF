package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.AddrFqdn;
import io.nwdaf.analytics.model.NetworkAreaInfo;
import io.nwdaf.analytics.model.PerfData;
import io.nwdaf.analytics.model.TimeWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents DN performance information.
 */
@ApiModel(description = "Represents DN performance information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class DnPerf   {
  @JsonProperty("appServerInsAddr")
  private AddrFqdn appServerInsAddr = null;

  @JsonProperty("upfId")
  private String upfId = null;

  @JsonProperty("dnai")
  private String dnai = null;

  @JsonProperty("perfData")
  private PerfData perfData = null;

  @JsonProperty("spatialValidCon")
  private NetworkAreaInfo spatialValidCon = null;

  @JsonProperty("temporalValidCon")
  private TimeWindow temporalValidCon = null;

  public DnPerf appServerInsAddr(AddrFqdn appServerInsAddr) {
    this.appServerInsAddr = appServerInsAddr;
    return this;
  }

  /**
   * Get appServerInsAddr
   * @return appServerInsAddr
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddrFqdn getAppServerInsAddr() {
    return appServerInsAddr;
  }

  public void setAppServerInsAddr(AddrFqdn appServerInsAddr) {
    this.appServerInsAddr = appServerInsAddr;
  }

  public DnPerf upfId(String upfId) {
    this.upfId = upfId;
    return this;
  }

  /**
   * Identifies the UPF.
   * @return upfId
  **/
  @ApiModelProperty(value = "Identifies the UPF.")
  
    public String getUpfId() {
    return upfId;
  }

  public void setUpfId(String upfId) {
    this.upfId = upfId;
  }

  public DnPerf dnai(String dnai) {
    this.dnai = dnai;
    return this;
  }

  /**
   * Get dnai
   * @return dnai
  **/
  @ApiModelProperty(value = "")
  
    public String getDnai() {
    return dnai;
  }

  public void setDnai(String dnai) {
    this.dnai = dnai;
  }

  public DnPerf perfData(PerfData perfData) {
    this.perfData = perfData;
    return this;
  }

  /**
   * Get perfData
   * @return perfData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PerfData getPerfData() {
    return perfData;
  }

  public void setPerfData(PerfData perfData) {
    this.perfData = perfData;
  }

  public DnPerf spatialValidCon(NetworkAreaInfo spatialValidCon) {
    this.spatialValidCon = spatialValidCon;
    return this;
  }

  /**
   * Get spatialValidCon
   * @return spatialValidCon
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NetworkAreaInfo getSpatialValidCon() {
    return spatialValidCon;
  }

  public void setSpatialValidCon(NetworkAreaInfo spatialValidCon) {
    this.spatialValidCon = spatialValidCon;
  }

  public DnPerf temporalValidCon(TimeWindow temporalValidCon) {
    this.temporalValidCon = temporalValidCon;
    return this;
  }

  /**
   * Get temporalValidCon
   * @return temporalValidCon
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TimeWindow getTemporalValidCon() {
    return temporalValidCon;
  }

  public void setTemporalValidCon(TimeWindow temporalValidCon) {
    this.temporalValidCon = temporalValidCon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnPerf dnPerf = (DnPerf) o;
    return Objects.equals(this.appServerInsAddr, dnPerf.appServerInsAddr) &&
        Objects.equals(this.upfId, dnPerf.upfId) &&
        Objects.equals(this.dnai, dnPerf.dnai) &&
        Objects.equals(this.perfData, dnPerf.perfData) &&
        Objects.equals(this.spatialValidCon, dnPerf.spatialValidCon) &&
        Objects.equals(this.temporalValidCon, dnPerf.temporalValidCon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appServerInsAddr, upfId, dnai, perfData, spatialValidCon, temporalValidCon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnPerf {\n");
    
    sb.append("    appServerInsAddr: ").append(toIndentedString(appServerInsAddr)).append("\n");
    sb.append("    upfId: ").append(toIndentedString(upfId)).append("\n");
    sb.append("    dnai: ").append(toIndentedString(dnai)).append("\n");
    sb.append("    perfData: ").append(toIndentedString(perfData)).append("\n");
    sb.append("    spatialValidCon: ").append(toIndentedString(spatialValidCon)).append("\n");
    sb.append("    temporalValidCon: ").append(toIndentedString(temporalValidCon)).append("\n");
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
