package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.IpEthFlowDescription;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies the detailed traffic characterization.
 */
@ApiModel(description = "Identifies the detailed traffic characterization.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class TrafficCharacterization   {
  @JsonProperty("dnn")
  private String dnn = null;

  @JsonProperty("snssai")
  private Snssai snssai = null;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("fDescs")
  @Valid
  private List<IpEthFlowDescription> fDescs = null;

  @JsonProperty("ulVol")
  private Long ulVol = null;

  @JsonProperty("ulVolVariance")
  private Float ulVolVariance = null;

  @JsonProperty("dlVol")
  private Long dlVol = null;

  @JsonProperty("dlVolVariance")
  private Float dlVolVariance = null;

  public TrafficCharacterization dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * Get dnn
   * @return dnn
  **/
  @ApiModelProperty(value = "")
  
    public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public TrafficCharacterization snssai(Snssai snssai) {
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

  public TrafficCharacterization appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(value = "")
  
    public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public TrafficCharacterization fDescs(List<IpEthFlowDescription> fDescs) {
    this.fDescs = fDescs;
    return this;
  }

  public TrafficCharacterization addFDescsItem(IpEthFlowDescription fDescsItem) {
    if (this.fDescs == null) {
      this.fDescs = new ArrayList<>();
    }
    this.fDescs.add(fDescsItem);
    return this;
  }

  /**
   * Get fDescs
   * @return fDescs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1,max=2)   public List<IpEthFlowDescription> getFDescs() {
    return fDescs;
  }

  public void setFDescs(List<IpEthFlowDescription> fDescs) {
    this.fDescs = fDescs;
  }

  public TrafficCharacterization ulVol(Long ulVol) {
    this.ulVol = ulVol;
    return this;
  }

  /**
   * Get ulVol
   * @return ulVol
  **/
  @ApiModelProperty(value = "")
  
    public Long getUlVol() {
    return ulVol;
  }

  public void setUlVol(Long ulVol) {
    this.ulVol = ulVol;
  }

  public TrafficCharacterization ulVolVariance(Float ulVolVariance) {
    this.ulVolVariance = ulVolVariance;
    return this;
  }

  /**
   * Get ulVolVariance
   * @return ulVolVariance
  **/
  @ApiModelProperty(value = "")
  
    public Float getUlVolVariance() {
    return ulVolVariance;
  }

  public void setUlVolVariance(Float ulVolVariance) {
    this.ulVolVariance = ulVolVariance;
  }

  public TrafficCharacterization dlVol(Long dlVol) {
    this.dlVol = dlVol;
    return this;
  }

  /**
   * Get dlVol
   * @return dlVol
  **/
  @ApiModelProperty(value = "")
  
    public Long getDlVol() {
    return dlVol;
  }

  public void setDlVol(Long dlVol) {
    this.dlVol = dlVol;
  }

  public TrafficCharacterization dlVolVariance(Float dlVolVariance) {
    this.dlVolVariance = dlVolVariance;
    return this;
  }

  /**
   * Get dlVolVariance
   * @return dlVolVariance
  **/
  @ApiModelProperty(value = "")
  
    public Float getDlVolVariance() {
    return dlVolVariance;
  }

  public void setDlVolVariance(Float dlVolVariance) {
    this.dlVolVariance = dlVolVariance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficCharacterization trafficCharacterization = (TrafficCharacterization) o;
    return Objects.equals(this.dnn, trafficCharacterization.dnn) &&
        Objects.equals(this.snssai, trafficCharacterization.snssai) &&
        Objects.equals(this.appId, trafficCharacterization.appId) &&
        Objects.equals(this.fDescs, trafficCharacterization.fDescs) &&
        Objects.equals(this.ulVol, trafficCharacterization.ulVol) &&
        Objects.equals(this.ulVolVariance, trafficCharacterization.ulVolVariance) &&
        Objects.equals(this.dlVol, trafficCharacterization.dlVol) &&
        Objects.equals(this.dlVolVariance, trafficCharacterization.dlVolVariance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnn, snssai, appId, fDescs, ulVol, ulVolVariance, dlVol, dlVolVariance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficCharacterization {\n");
    
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    fDescs: ").append(toIndentedString(fDescs)).append("\n");
    sb.append("    ulVol: ").append(toIndentedString(ulVol)).append("\n");
    sb.append("    ulVolVariance: ").append(toIndentedString(ulVolVariance)).append("\n");
    sb.append("    dlVol: ").append(toIndentedString(dlVol)).append("\n");
    sb.append("    dlVolVariance: ").append(toIndentedString(dlVolVariance)).append("\n");
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
