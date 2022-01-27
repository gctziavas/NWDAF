package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.CongestionType;
import io.nwdaf.analytics.model.ThresholdLevel;
import io.nwdaf.analytics.model.TimeWindow;
import io.nwdaf.analytics.model.TopApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the congestion information.
 */
@ApiModel(description = "Represents the congestion information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class CongestionInfo   {
  @JsonProperty("congType")
  private CongestionType congType = null;

  @JsonProperty("timeIntev")
  private TimeWindow timeIntev = null;

  @JsonProperty("nsi")
  private ThresholdLevel nsi = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  @JsonProperty("topAppListUl")
  @Valid
  private List<TopApplication> topAppListUl = null;

  @JsonProperty("topAppListDl")
  @Valid
  private List<TopApplication> topAppListDl = null;

  public CongestionInfo congType(CongestionType congType) {
    this.congType = congType;
    return this;
  }

  /**
   * Get congType
   * @return congType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public CongestionType getCongType() {
    return congType;
  }

  public void setCongType(CongestionType congType) {
    this.congType = congType;
  }

  public CongestionInfo timeIntev(TimeWindow timeIntev) {
    this.timeIntev = timeIntev;
    return this;
  }

  /**
   * Get timeIntev
   * @return timeIntev
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TimeWindow getTimeIntev() {
    return timeIntev;
  }

  public void setTimeIntev(TimeWindow timeIntev) {
    this.timeIntev = timeIntev;
  }

  public CongestionInfo nsi(ThresholdLevel nsi) {
    this.nsi = nsi;
    return this;
  }

  /**
   * Get nsi
   * @return nsi
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ThresholdLevel getNsi() {
    return nsi;
  }

  public void setNsi(ThresholdLevel nsi) {
    this.nsi = nsi;
  }

  public CongestionInfo confidence(Integer confidence) {
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

  public CongestionInfo topAppListUl(List<TopApplication> topAppListUl) {
    this.topAppListUl = topAppListUl;
    return this;
  }

  public CongestionInfo addTopAppListUlItem(TopApplication topAppListUlItem) {
    if (this.topAppListUl == null) {
      this.topAppListUl = new ArrayList<>();
    }
    this.topAppListUl.add(topAppListUlItem);
    return this;
  }

  /**
   * Get topAppListUl
   * @return topAppListUl
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<TopApplication> getTopAppListUl() {
    return topAppListUl;
  }

  public void setTopAppListUl(List<TopApplication> topAppListUl) {
    this.topAppListUl = topAppListUl;
  }

  public CongestionInfo topAppListDl(List<TopApplication> topAppListDl) {
    this.topAppListDl = topAppListDl;
    return this;
  }

  public CongestionInfo addTopAppListDlItem(TopApplication topAppListDlItem) {
    if (this.topAppListDl == null) {
      this.topAppListDl = new ArrayList<>();
    }
    this.topAppListDl.add(topAppListDlItem);
    return this;
  }

  /**
   * Get topAppListDl
   * @return topAppListDl
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<TopApplication> getTopAppListDl() {
    return topAppListDl;
  }

  public void setTopAppListDl(List<TopApplication> topAppListDl) {
    this.topAppListDl = topAppListDl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CongestionInfo congestionInfo = (CongestionInfo) o;
    return Objects.equals(this.congType, congestionInfo.congType) &&
        Objects.equals(this.timeIntev, congestionInfo.timeIntev) &&
        Objects.equals(this.nsi, congestionInfo.nsi) &&
        Objects.equals(this.confidence, congestionInfo.confidence) &&
        Objects.equals(this.topAppListUl, congestionInfo.topAppListUl) &&
        Objects.equals(this.topAppListDl, congestionInfo.topAppListDl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(congType, timeIntev, nsi, confidence, topAppListUl, topAppListDl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CongestionInfo {\n");
    
    sb.append("    congType: ").append(toIndentedString(congType)).append("\n");
    sb.append("    timeIntev: ").append(toIndentedString(timeIntev)).append("\n");
    sb.append("    nsi: ").append(toIndentedString(nsi)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    topAppListUl: ").append(toIndentedString(topAppListUl)).append("\n");
    sb.append("    topAppListDl: ").append(toIndentedString(topAppListDl)).append("\n");
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
