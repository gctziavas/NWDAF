package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a time window identified by a start time and a stop time.
 */
@ApiModel(description = "Represents a time window identified by a start time and a stop time.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class TimeWindow   {
  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("stopTime")
  private OffsetDateTime stopTime = null;

  public TimeWindow(OffsetDateTime startTime, OffsetDateTime stopTime) {
	  this.startTime = startTime;
	  this.stopTime = stopTime;
  }
  public TimeWindow() {
	  
  }
  
  public TimeWindow startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }
  
  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public TimeWindow stopTime(OffsetDateTime stopTime) {
    this.stopTime = stopTime;
    return this;
  }

  /**
   * Get stopTime
   * @return stopTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getStopTime() {
    return stopTime;
  }

  public void setStopTime(OffsetDateTime stopTime) {
    this.stopTime = stopTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeWindow timeWindow = (TimeWindow) o;
    return Objects.equals(this.startTime, timeWindow.startTime) &&
        Objects.equals(this.stopTime, timeWindow.stopTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append(",\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
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
