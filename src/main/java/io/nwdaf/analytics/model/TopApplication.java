package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.FlowInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Top application that contributes the most to the traffic.
 */
@ApiModel(description = "Top application that contributes the most to the traffic.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class TopApplication   {
  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("ipTrafficFilter")
  private FlowInfo ipTrafficFilter = null;

  @JsonProperty("ratio")
  private Integer ratio = null;

  public TopApplication appId(String appId) {
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

  public TopApplication ipTrafficFilter(FlowInfo ipTrafficFilter) {
    this.ipTrafficFilter = ipTrafficFilter;
    return this;
  }

  /**
   * Get ipTrafficFilter
   * @return ipTrafficFilter
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public FlowInfo getIpTrafficFilter() {
    return ipTrafficFilter;
  }

  public void setIpTrafficFilter(FlowInfo ipTrafficFilter) {
    this.ipTrafficFilter = ipTrafficFilter;
  }

  public TopApplication ratio(Integer ratio) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopApplication topApplication = (TopApplication) o;
    return Objects.equals(this.appId, topApplication.appId) &&
        Objects.equals(this.ipTrafficFilter, topApplication.ipTrafficFilter) &&
        Objects.equals(this.ratio, topApplication.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, ipTrafficFilter, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopApplication {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    ipTrafficFilter: ").append(toIndentedString(ipTrafficFilter)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
