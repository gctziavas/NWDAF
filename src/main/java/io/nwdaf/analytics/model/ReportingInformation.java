package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NotificationMethod;
import io.nwdaf.analytics.model.DateTime;
import io.nwdaf.analytics.model.DurationSec;
import io.nwdaf.analytics.model.NotificationFlag;
import io.nwdaf.analytics.model.PartitioningCriteria;
import io.nwdaf.analytics.model.SamplingRatio;
import io.nwdaf.analytics.model.UInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the type of reporting that the subscription requires.
 */
@ApiModel(description = "Represents the type of reporting that the subscription requires.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ReportingInformation   {
  @JsonProperty("immRep")
  private Boolean immRep = null;

  @JsonProperty("notifMethod")
  private NotificationMethod notifMethod = null;

  @JsonProperty("maxReportNbr")
  private UInteger maxReportNbr = null;

  @JsonProperty("monDur")
  private DateTime monDur = null;

  @JsonProperty("repPeriod")
  private DurationSec repPeriod = null;

  @JsonProperty("sampRatio")
  private SamplingRatio sampRatio = null;

  @JsonProperty("partitionCriteria")
  @Valid
  private List<PartitioningCriteria> partitionCriteria = null;

  @JsonProperty("grpRepTime")
  private DurationSec grpRepTime = null;

  @JsonProperty("notifFlag")
  private NotificationFlag notifFlag = null;

  public ReportingInformation immRep(Boolean immRep) {
    this.immRep = immRep;
    return this;
  }

  /**
   * Get immRep
   * @return immRep
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isImmRep() {
    return immRep;
  }

  public void setImmRep(Boolean immRep) {
    this.immRep = immRep;
  }

  public ReportingInformation notifMethod(NotificationMethod notifMethod) {
    this.notifMethod = notifMethod;
    return this;
  }

  /**
   * Get notifMethod
   * @return notifMethod
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NotificationMethod getNotifMethod() {
    return notifMethod;
  }

  public void setNotifMethod(NotificationMethod notifMethod) {
    this.notifMethod = notifMethod;
  }

  public ReportingInformation maxReportNbr(UInteger maxReportNbr) {
    this.maxReportNbr = maxReportNbr;
    return this;
  }

  /**
   * Get maxReportNbr
   * @return maxReportNbr
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UInteger getMaxReportNbr() {
    return maxReportNbr;
  }

  public void setMaxReportNbr(UInteger maxReportNbr) {
    this.maxReportNbr = maxReportNbr;
  }

  public ReportingInformation monDur(DateTime monDur) {
    this.monDur = monDur;
    return this;
  }

  /**
   * Get monDur
   * @return monDur
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DateTime getMonDur() {
    return monDur;
  }

  public void setMonDur(DateTime monDur) {
    this.monDur = monDur;
  }

  public ReportingInformation repPeriod(DurationSec repPeriod) {
    this.repPeriod = repPeriod;
    return this;
  }

  /**
   * Get repPeriod
   * @return repPeriod
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DurationSec getRepPeriod() {
    return repPeriod;
  }

  public void setRepPeriod(DurationSec repPeriod) {
    this.repPeriod = repPeriod;
  }

  public ReportingInformation sampRatio(SamplingRatio sampRatio) {
    this.sampRatio = sampRatio;
    return this;
  }

  /**
   * Get sampRatio
   * @return sampRatio
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SamplingRatio getSampRatio() {
    return sampRatio;
  }

  public void setSampRatio(SamplingRatio sampRatio) {
    this.sampRatio = sampRatio;
  }

  public ReportingInformation partitionCriteria(List<PartitioningCriteria> partitionCriteria) {
    this.partitionCriteria = partitionCriteria;
    return this;
  }

  public ReportingInformation addPartitionCriteriaItem(PartitioningCriteria partitionCriteriaItem) {
    if (this.partitionCriteria == null) {
      this.partitionCriteria = new ArrayList<>();
    }
    this.partitionCriteria.add(partitionCriteriaItem);
    return this;
  }

  /**
   * Criteria for partitioning the UEs before applying the sampling ratio.
   * @return partitionCriteria
  **/
  @ApiModelProperty(value = "Criteria for partitioning the UEs before applying the sampling ratio.")
      @Valid
  @Size(min=1)   public List<PartitioningCriteria> getPartitionCriteria() {
    return partitionCriteria;
  }

  public void setPartitionCriteria(List<PartitioningCriteria> partitionCriteria) {
    this.partitionCriteria = partitionCriteria;
  }

  public ReportingInformation grpRepTime(DurationSec grpRepTime) {
    this.grpRepTime = grpRepTime;
    return this;
  }

  /**
   * Get grpRepTime
   * @return grpRepTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DurationSec getGrpRepTime() {
    return grpRepTime;
  }

  public void setGrpRepTime(DurationSec grpRepTime) {
    this.grpRepTime = grpRepTime;
  }

  public ReportingInformation notifFlag(NotificationFlag notifFlag) {
    this.notifFlag = notifFlag;
    return this;
  }

  /**
   * Get notifFlag
   * @return notifFlag
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NotificationFlag getNotifFlag() {
    return notifFlag;
  }

  public void setNotifFlag(NotificationFlag notifFlag) {
    this.notifFlag = notifFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingInformation reportingInformation = (ReportingInformation) o;
    return Objects.equals(this.immRep, reportingInformation.immRep) &&
        Objects.equals(this.notifMethod, reportingInformation.notifMethod) &&
        Objects.equals(this.maxReportNbr, reportingInformation.maxReportNbr) &&
        Objects.equals(this.monDur, reportingInformation.monDur) &&
        Objects.equals(this.repPeriod, reportingInformation.repPeriod) &&
        Objects.equals(this.sampRatio, reportingInformation.sampRatio) &&
        Objects.equals(this.partitionCriteria, reportingInformation.partitionCriteria) &&
        Objects.equals(this.grpRepTime, reportingInformation.grpRepTime) &&
        Objects.equals(this.notifFlag, reportingInformation.notifFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(immRep, notifMethod, maxReportNbr, monDur, repPeriod, sampRatio, partitionCriteria, grpRepTime, notifFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingInformation {\n");
    
    sb.append("    immRep: ").append(toIndentedString(immRep)).append("\n");
    sb.append("    notifMethod: ").append(toIndentedString(notifMethod)).append("\n");
    sb.append("    maxReportNbr: ").append(toIndentedString(maxReportNbr)).append("\n");
    sb.append("    monDur: ").append(toIndentedString(monDur)).append("\n");
    sb.append("    repPeriod: ").append(toIndentedString(repPeriod)).append("\n");
    sb.append("    sampRatio: ").append(toIndentedString(sampRatio)).append("\n");
    sb.append("    partitionCriteria: ").append(toIndentedString(partitionCriteria)).append("\n");
    sb.append("    grpRepTime: ").append(toIndentedString(grpRepTime)).append("\n");
    sb.append("    notifFlag: ").append(toIndentedString(notifFlag)).append("\n");
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
