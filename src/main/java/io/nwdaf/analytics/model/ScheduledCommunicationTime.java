package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents an offered scheduled communication time.
 */
@ApiModel(description = "Represents an offered scheduled communication time.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ScheduledCommunicationTime   {
  @JsonProperty("daysOfWeek")
  @Valid
  private List<Integer> daysOfWeek = null;

  @JsonProperty("timeOfDayStart")
  private String timeOfDayStart = null;

  @JsonProperty("timeOfDayEnd")
  private String timeOfDayEnd = null;

  public ScheduledCommunicationTime daysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public ScheduledCommunicationTime addDaysOfWeekItem(Integer daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

  /**
   * Identifies the day(s) of the week. If absent, it indicates every day of the week.
   * @return daysOfWeek
  **/
  @ApiModelProperty(value = "Identifies the day(s) of the week. If absent, it indicates every day of the week.")
  
  @Size(min=1,max=6)   public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public ScheduledCommunicationTime timeOfDayStart(String timeOfDayStart) {
    this.timeOfDayStart = timeOfDayStart;
    return this;
  }

  /**
   * Get timeOfDayStart
   * @return timeOfDayStart
  **/
  @ApiModelProperty(value = "")
  
    public String getTimeOfDayStart() {
    return timeOfDayStart;
  }

  public void setTimeOfDayStart(String timeOfDayStart) {
    this.timeOfDayStart = timeOfDayStart;
  }

  public ScheduledCommunicationTime timeOfDayEnd(String timeOfDayEnd) {
    this.timeOfDayEnd = timeOfDayEnd;
    return this;
  }

  /**
   * Get timeOfDayEnd
   * @return timeOfDayEnd
  **/
  @ApiModelProperty(value = "")
  
    public String getTimeOfDayEnd() {
    return timeOfDayEnd;
  }

  public void setTimeOfDayEnd(String timeOfDayEnd) {
    this.timeOfDayEnd = timeOfDayEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledCommunicationTime scheduledCommunicationTime = (ScheduledCommunicationTime) o;
    return Objects.equals(this.daysOfWeek, scheduledCommunicationTime.daysOfWeek) &&
        Objects.equals(this.timeOfDayStart, scheduledCommunicationTime.timeOfDayStart) &&
        Objects.equals(this.timeOfDayEnd, scheduledCommunicationTime.timeOfDayEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, timeOfDayStart, timeOfDayEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledCommunicationTime {\n");
    
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    timeOfDayStart: ").append(toIndentedString(timeOfDayStart)).append("\n");
    sb.append("    timeOfDayEnd: ").append(toIndentedString(timeOfDayEnd)).append("\n");
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
