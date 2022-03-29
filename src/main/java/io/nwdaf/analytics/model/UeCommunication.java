package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.ScheduledCommunicationTime;
import io.nwdaf.analytics.model.TrafficCharacterization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents UE communication information.
 */
@ApiModel(description = "Represents UE communication information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class UeCommunication   {
  @JsonProperty("commDur")
  private Integer commDur = null;

  @JsonProperty("commDurVariance")
  private Float commDurVariance = null;

  @JsonProperty("perioTime")
  private Integer perioTime = null;

  @JsonProperty("perioTimeVariance")
  private Float perioTimeVariance = null;

  @JsonProperty("ts")
  private OffsetDateTime ts = null;

  @JsonProperty("tsVariance")
  private Float tsVariance = null;

  @JsonProperty("recurringTime")
  private ScheduledCommunicationTime recurringTime = null;

  @JsonProperty("trafChar")
  private TrafficCharacterization trafChar = null;

  @JsonProperty("ratio")
  private Integer ratio = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public UeCommunication commDur(Integer commDur) {
    this.commDur = commDur;
    return this;
  }

  /**
   * Get commDur
   * @return commDur
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getCommDur() {
    return commDur;
  }

  public void setCommDur(Integer commDur) {
    this.commDur = commDur;
  }

  public UeCommunication commDurVariance(Float commDurVariance) {
    this.commDurVariance = commDurVariance;
    return this;
  }

  /**
   * Get commDurVariance
   * @return commDurVariance
  **/
  @ApiModelProperty(value = "")
  
    public Float getCommDurVariance() {
    return commDurVariance;
  }

  public void setCommDurVariance(Float commDurVariance) {
    this.commDurVariance = commDurVariance;
  }

  public UeCommunication perioTime(Integer perioTime) {
    this.perioTime = perioTime;
    return this;
  }

  /**
   * Get perioTime
   * @return perioTime
  **/
  @ApiModelProperty(value = "")
  
    public Integer getPerioTime() {
    return perioTime;
  }

  public void setPerioTime(Integer perioTime) {
    this.perioTime = perioTime;
  }

  public UeCommunication perioTimeVariance(Float perioTimeVariance) {
    this.perioTimeVariance = perioTimeVariance;
    return this;
  }

  /**
   * Get perioTimeVariance
   * @return perioTimeVariance
  **/
  @ApiModelProperty(value = "")
  
    public Float getPerioTimeVariance() {
    return perioTimeVariance;
  }

  public void setPerioTimeVariance(Float perioTimeVariance) {
    this.perioTimeVariance = perioTimeVariance;
  }

  public UeCommunication ts(OffsetDateTime ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Get ts
   * @return ts
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTs() {
    return ts;
  }

  public void setTs(OffsetDateTime ts) {
    this.ts = ts;
  }

  public UeCommunication tsVariance(Float tsVariance) {
    this.tsVariance = tsVariance;
    return this;
  }

  /**
   * Get tsVariance
   * @return tsVariance
  **/
  @ApiModelProperty(value = "")
  
    public Float getTsVariance() {
    return tsVariance;
  }

  public void setTsVariance(Float tsVariance) {
    this.tsVariance = tsVariance;
  }

  public UeCommunication recurringTime(ScheduledCommunicationTime recurringTime) {
    this.recurringTime = recurringTime;
    return this;
  }

  /**
   * Get recurringTime
   * @return recurringTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ScheduledCommunicationTime getRecurringTime() {
    return recurringTime;
  }

  public void setRecurringTime(ScheduledCommunicationTime recurringTime) {
    this.recurringTime = recurringTime;
  }

  public UeCommunication trafChar(TrafficCharacterization trafChar) {
    this.trafChar = trafChar;
    return this;
  }

  /**
   * Get trafChar
   * @return trafChar
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TrafficCharacterization getTrafChar() {
    return trafChar;
  }

  public void setTrafChar(TrafficCharacterization trafChar) {
    this.trafChar = trafChar;
  }

  public UeCommunication ratio(Integer ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * @return ratio
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRatio() {
    return ratio;
  }

  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  public UeCommunication confidence(Integer confidence) {
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
    UeCommunication ueCommunication = (UeCommunication) o;
    return Objects.equals(this.commDur, ueCommunication.commDur) &&
        Objects.equals(this.commDurVariance, ueCommunication.commDurVariance) &&
        Objects.equals(this.perioTime, ueCommunication.perioTime) &&
        Objects.equals(this.perioTimeVariance, ueCommunication.perioTimeVariance) &&
        Objects.equals(this.ts, ueCommunication.ts) &&
        Objects.equals(this.tsVariance, ueCommunication.tsVariance) &&
        Objects.equals(this.recurringTime, ueCommunication.recurringTime) &&
        Objects.equals(this.trafChar, ueCommunication.trafChar) &&
        Objects.equals(this.ratio, ueCommunication.ratio) &&
        Objects.equals(this.confidence, ueCommunication.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commDur, commDurVariance, perioTime, perioTimeVariance, ts, tsVariance, recurringTime, trafChar, ratio, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UeCommunication {\n");
    
    sb.append("    commDur: ").append(toIndentedString(commDur)).append("\n");
    sb.append("    commDurVariance: ").append(toIndentedString(commDurVariance)).append("\n");
    sb.append("    perioTime: ").append(toIndentedString(perioTime)).append("\n");
    sb.append("    perioTimeVariance: ").append(toIndentedString(perioTimeVariance)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    tsVariance: ").append(toIndentedString(tsVariance)).append("\n");
    sb.append("    recurringTime: ").append(toIndentedString(recurringTime)).append("\n");
    sb.append("    trafChar: ").append(toIndentedString(trafChar)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
