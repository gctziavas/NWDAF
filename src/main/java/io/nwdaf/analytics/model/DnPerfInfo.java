package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.DnPerf;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents DN performance information.
 */
@ApiModel(description = "Represents DN performance information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class DnPerfInfo   {
  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("dnn")
  private String dnn = null;

  @JsonProperty("snssai")
  private Snssai snssai = null;

  @JsonProperty("dnPerf")
  @Valid
  private List<DnPerf> dnPerf = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public DnPerfInfo appId(String appId) {
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

  public DnPerfInfo dnn(String dnn) {
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

  public DnPerfInfo snssai(Snssai snssai) {
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

  public DnPerfInfo dnPerf(List<DnPerf> dnPerf) {
    this.dnPerf = dnPerf;
    return this;
  }

  public DnPerfInfo addDnPerfItem(DnPerf dnPerfItem) {
    if (this.dnPerf == null) {
      this.dnPerf = new ArrayList<>();
    }
    this.dnPerf.add(dnPerfItem);
    return this;
  }

  /**
   * Get dnPerf
   * @return dnPerf
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<DnPerf> getDnPerf() {
    return dnPerf;
  }

  public void setDnPerf(List<DnPerf> dnPerf) {
    this.dnPerf = dnPerf;
  }

  public DnPerfInfo confidence(Integer confidence) {
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
    DnPerfInfo dnPerfInfo = (DnPerfInfo) o;
    return Objects.equals(this.appId, dnPerfInfo.appId) &&
        Objects.equals(this.dnn, dnPerfInfo.dnn) &&
        Objects.equals(this.snssai, dnPerfInfo.snssai) &&
        Objects.equals(this.dnPerf, dnPerfInfo.dnPerf) &&
        Objects.equals(this.confidence, dnPerfInfo.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, dnn, snssai, dnPerf, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnPerfInfo {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    dnPerf: ").append(toIndentedString(dnPerf)).append("\n");
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
