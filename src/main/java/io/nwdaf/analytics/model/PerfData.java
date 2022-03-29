package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents DN performance data.
 */
@ApiModel(description = "Represents DN performance data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class PerfData   {
  @JsonProperty("avgTrafficRate")
  private String avgTrafficRate = null;

  @JsonProperty("maxTrafficRate")
  private String maxTrafficRate = null;

  @JsonProperty("avePacketDelay")
  private Integer avePacketDelay = null;

  @JsonProperty("maxPacketDelay")
  private Integer maxPacketDelay = null;

  @JsonProperty("avgPacketLossRate")
  private Integer avgPacketLossRate = null;

  public PerfData avgTrafficRate(String avgTrafficRate) {
    this.avgTrafficRate = avgTrafficRate;
    return this;
  }

  /**
   * Get avgTrafficRate
   * @return avgTrafficRate
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getAvgTrafficRate() {
    return avgTrafficRate;
  }

  public void setAvgTrafficRate(String avgTrafficRate) {
    this.avgTrafficRate = avgTrafficRate;
  }

  public PerfData maxTrafficRate(String maxTrafficRate) {
    this.maxTrafficRate = maxTrafficRate;
    return this;
  }

  /**
   * Get maxTrafficRate
   * @return maxTrafficRate
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getMaxTrafficRate() {
    return maxTrafficRate;
  }

  public void setMaxTrafficRate(String maxTrafficRate) {
    this.maxTrafficRate = maxTrafficRate;
  }

  public PerfData avePacketDelay(Integer avePacketDelay) {
    this.avePacketDelay = avePacketDelay;
    return this;
  }

  /**
   * Get avePacketDelay
   * @return avePacketDelay
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAvePacketDelay() {
    return avePacketDelay;
  }

  public void setAvePacketDelay(Integer avePacketDelay) {
    this.avePacketDelay = avePacketDelay;
  }

  public PerfData maxPacketDelay(Integer maxPacketDelay) {
    this.maxPacketDelay = maxPacketDelay;
    return this;
  }

  /**
   * Get maxPacketDelay
   * @return maxPacketDelay
  **/
  @ApiModelProperty(value = "")
  
    public Integer getMaxPacketDelay() {
    return maxPacketDelay;
  }

  public void setMaxPacketDelay(Integer maxPacketDelay) {
    this.maxPacketDelay = maxPacketDelay;
  }

  public PerfData avgPacketLossRate(Integer avgPacketLossRate) {
    this.avgPacketLossRate = avgPacketLossRate;
    return this;
  }

  /**
   * Get avgPacketLossRate
   * @return avgPacketLossRate
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAvgPacketLossRate() {
    return avgPacketLossRate;
  }

  public void setAvgPacketLossRate(Integer avgPacketLossRate) {
    this.avgPacketLossRate = avgPacketLossRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfData perfData = (PerfData) o;
    return Objects.equals(this.avgTrafficRate, perfData.avgTrafficRate) &&
        Objects.equals(this.maxTrafficRate, perfData.maxTrafficRate) &&
        Objects.equals(this.avePacketDelay, perfData.avePacketDelay) &&
        Objects.equals(this.maxPacketDelay, perfData.maxPacketDelay) &&
        Objects.equals(this.avgPacketLossRate, perfData.avgPacketLossRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgTrafficRate, maxTrafficRate, avePacketDelay, maxPacketDelay, avgPacketLossRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfData {\n");
    
    sb.append("    avgTrafficRate: ").append(toIndentedString(avgTrafficRate)).append("\n");
    sb.append("    maxTrafficRate: ").append(toIndentedString(maxTrafficRate)).append("\n");
    sb.append("    avePacketDelay: ").append(toIndentedString(avePacketDelay)).append("\n");
    sb.append("    maxPacketDelay: ").append(toIndentedString(maxPacketDelay)).append("\n");
    sb.append("    avgPacketLossRate: ").append(toIndentedString(avgPacketLossRate)).append("\n");
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
