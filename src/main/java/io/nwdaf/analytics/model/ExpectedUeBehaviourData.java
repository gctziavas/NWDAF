package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.BatteryIndication;
import io.nwdaf.analytics.model.LocationArea;
import io.nwdaf.analytics.model.ScheduledCommunicationTime2;
import io.nwdaf.analytics.model.ScheduledCommunicationType;
import io.nwdaf.analytics.model.StationaryIndication;
import io.nwdaf.analytics.model.TrafficProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExpectedUeBehaviourData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ExpectedUeBehaviourData   {
  @JsonProperty("stationaryIndication")
  private StationaryIndication stationaryIndication = null;

  @JsonProperty("communicationDurationTime")
  private Integer communicationDurationTime = null;

  @JsonProperty("periodicTime")
  private Integer periodicTime = null;

  @JsonProperty("scheduledCommunicationTime")
  private ScheduledCommunicationTime2 scheduledCommunicationTime = null;

  @JsonProperty("scheduledCommunicationType")
  private ScheduledCommunicationType scheduledCommunicationType = null;

  @JsonProperty("expectedUmts")
  @Valid
  private List<LocationArea> expectedUmts = null;

  @JsonProperty("trafficProfile")
  private TrafficProfile trafficProfile = null;

  @JsonProperty("batteryIndication")
  private BatteryIndication batteryIndication = null;

  @JsonProperty("validityTime")
  private OffsetDateTime validityTime = null;

  public ExpectedUeBehaviourData stationaryIndication(StationaryIndication stationaryIndication) {
    this.stationaryIndication = stationaryIndication;
    return this;
  }

  /**
   * Get stationaryIndication
   * @return stationaryIndication
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StationaryIndication getStationaryIndication() {
    return stationaryIndication;
  }

  public void setStationaryIndication(StationaryIndication stationaryIndication) {
    this.stationaryIndication = stationaryIndication;
  }

  public ExpectedUeBehaviourData communicationDurationTime(Integer communicationDurationTime) {
    this.communicationDurationTime = communicationDurationTime;
    return this;
  }

  /**
   * Get communicationDurationTime
   * @return communicationDurationTime
  **/
  @ApiModelProperty(value = "")
  
    public Integer getCommunicationDurationTime() {
    return communicationDurationTime;
  }

  public void setCommunicationDurationTime(Integer communicationDurationTime) {
    this.communicationDurationTime = communicationDurationTime;
  }

  public ExpectedUeBehaviourData periodicTime(Integer periodicTime) {
    this.periodicTime = periodicTime;
    return this;
  }

  /**
   * Get periodicTime
   * @return periodicTime
  **/
  @ApiModelProperty(value = "")
  
    public Integer getPeriodicTime() {
    return periodicTime;
  }

  public void setPeriodicTime(Integer periodicTime) {
    this.periodicTime = periodicTime;
  }

  public ExpectedUeBehaviourData scheduledCommunicationTime(ScheduledCommunicationTime2 scheduledCommunicationTime) {
    this.scheduledCommunicationTime = scheduledCommunicationTime;
    return this;
  }

  /**
   * Get scheduledCommunicationTime
   * @return scheduledCommunicationTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ScheduledCommunicationTime2 getScheduledCommunicationTime() {
    return scheduledCommunicationTime;
  }

  public void setScheduledCommunicationTime(ScheduledCommunicationTime2 scheduledCommunicationTime) {
    this.scheduledCommunicationTime = scheduledCommunicationTime;
  }

  public ExpectedUeBehaviourData scheduledCommunicationType(ScheduledCommunicationType scheduledCommunicationType) {
    this.scheduledCommunicationType = scheduledCommunicationType;
    return this;
  }

  /**
   * Get scheduledCommunicationType
   * @return scheduledCommunicationType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ScheduledCommunicationType getScheduledCommunicationType() {
    return scheduledCommunicationType;
  }

  public void setScheduledCommunicationType(ScheduledCommunicationType scheduledCommunicationType) {
    this.scheduledCommunicationType = scheduledCommunicationType;
  }

  public ExpectedUeBehaviourData expectedUmts(List<LocationArea> expectedUmts) {
    this.expectedUmts = expectedUmts;
    return this;
  }

  public ExpectedUeBehaviourData addExpectedUmtsItem(LocationArea expectedUmtsItem) {
    if (this.expectedUmts == null) {
      this.expectedUmts = new ArrayList<>();
    }
    this.expectedUmts.add(expectedUmtsItem);
    return this;
  }

  /**
   * Identifies the UE's expected geographical movement. The attribute is only applicable in 5G.
   * @return expectedUmts
  **/
  @ApiModelProperty(value = "Identifies the UE's expected geographical movement. The attribute is only applicable in 5G.")
      @Valid
  @Size(min=1)   public List<LocationArea> getExpectedUmts() {
    return expectedUmts;
  }

  public void setExpectedUmts(List<LocationArea> expectedUmts) {
    this.expectedUmts = expectedUmts;
  }

  public ExpectedUeBehaviourData trafficProfile(TrafficProfile trafficProfile) {
    this.trafficProfile = trafficProfile;
    return this;
  }

  /**
   * Get trafficProfile
   * @return trafficProfile
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TrafficProfile getTrafficProfile() {
    return trafficProfile;
  }

  public void setTrafficProfile(TrafficProfile trafficProfile) {
    this.trafficProfile = trafficProfile;
  }

  public ExpectedUeBehaviourData batteryIndication(BatteryIndication batteryIndication) {
    this.batteryIndication = batteryIndication;
    return this;
  }

  /**
   * Get batteryIndication
   * @return batteryIndication
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BatteryIndication getBatteryIndication() {
    return batteryIndication;
  }

  public void setBatteryIndication(BatteryIndication batteryIndication) {
    this.batteryIndication = batteryIndication;
  }

  public ExpectedUeBehaviourData validityTime(OffsetDateTime validityTime) {
    this.validityTime = validityTime;
    return this;
  }

  /**
   * Get validityTime
   * @return validityTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getValidityTime() {
    return validityTime;
  }

  public void setValidityTime(OffsetDateTime validityTime) {
    this.validityTime = validityTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpectedUeBehaviourData expectedUeBehaviourData = (ExpectedUeBehaviourData) o;
    return Objects.equals(this.stationaryIndication, expectedUeBehaviourData.stationaryIndication) &&
        Objects.equals(this.communicationDurationTime, expectedUeBehaviourData.communicationDurationTime) &&
        Objects.equals(this.periodicTime, expectedUeBehaviourData.periodicTime) &&
        Objects.equals(this.scheduledCommunicationTime, expectedUeBehaviourData.scheduledCommunicationTime) &&
        Objects.equals(this.scheduledCommunicationType, expectedUeBehaviourData.scheduledCommunicationType) &&
        Objects.equals(this.expectedUmts, expectedUeBehaviourData.expectedUmts) &&
        Objects.equals(this.trafficProfile, expectedUeBehaviourData.trafficProfile) &&
        Objects.equals(this.batteryIndication, expectedUeBehaviourData.batteryIndication) &&
        Objects.equals(this.validityTime, expectedUeBehaviourData.validityTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stationaryIndication, communicationDurationTime, periodicTime, scheduledCommunicationTime, scheduledCommunicationType, expectedUmts, trafficProfile, batteryIndication, validityTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpectedUeBehaviourData {\n");
    
    sb.append("    stationaryIndication: ").append(toIndentedString(stationaryIndication)).append("\n");
    sb.append("    communicationDurationTime: ").append(toIndentedString(communicationDurationTime)).append("\n");
    sb.append("    periodicTime: ").append(toIndentedString(periodicTime)).append("\n");
    sb.append("    scheduledCommunicationTime: ").append(toIndentedString(scheduledCommunicationTime)).append("\n");
    sb.append("    scheduledCommunicationType: ").append(toIndentedString(scheduledCommunicationType)).append("\n");
    sb.append("    expectedUmts: ").append(toIndentedString(expectedUmts)).append("\n");
    sb.append("    trafficProfile: ").append(toIndentedString(trafficProfile)).append("\n");
    sb.append("    batteryIndication: ").append(toIndentedString(batteryIndication)).append("\n");
    sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
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
