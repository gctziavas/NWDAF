package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains historical data related to an analytics subscription.
 */
@ApiModel(description = "Contains historical data related to an analytics subscription.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class HistoricalData   {
  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("subsWithSources")
  @Valid
  private List<String> subsWithSources = null;

  @JsonProperty("data")
  @Valid
  private List<String> data = new ArrayList<>();

  public HistoricalData startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public HistoricalData endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricalData subsWithSources(List<String> subsWithSources) {
    this.subsWithSources = subsWithSources;
    return this;
  }

  public HistoricalData addSubsWithSourcesItem(String subsWithSourcesItem) {
    if (this.subsWithSources == null) {
      this.subsWithSources = new ArrayList<>();
    }
    this.subsWithSources.add(subsWithSourcesItem);
    return this;
  }

  /**
   * Information about subscriptions with the data sources.
   * @return subsWithSources
  **/
  @ApiModelProperty(value = "Information about subscriptions with the data sources.")
  
  @Size(min=1)   public List<String> getSubsWithSources() {
    return subsWithSources;
  }

  public void setSubsWithSources(List<String> subsWithSources) {
    this.subsWithSources = subsWithSources;
  }

  public HistoricalData data(List<String> data) {
    this.data = data;
    return this;
  }

  public HistoricalData addDataItem(String dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Historical data related to the analytics.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Historical data related to the analytics.")
      @NotNull

  @Size(min=1)   public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalData historicalData = (HistoricalData) o;
    return Objects.equals(this.startTime, historicalData.startTime) &&
        Objects.equals(this.endTime, historicalData.endTime) &&
        Objects.equals(this.subsWithSources, historicalData.subsWithSources) &&
        Objects.equals(this.data, historicalData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, subsWithSources, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalData {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    subsWithSources: ").append(toIndentedString(subsWithSources)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
