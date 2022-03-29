package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.EthFlowDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the description of an Uplink and/or Downlink Ethernet flow.
 */
@ApiModel(description = "Contains the description of an Uplink and/or Downlink Ethernet flow.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class IpEthFlowDescription   {
  @JsonProperty("ipTrafficFilter")
  private String ipTrafficFilter = null;

  @JsonProperty("ethTrafficFilter")
  private EthFlowDescription ethTrafficFilter = null;

  public IpEthFlowDescription ipTrafficFilter(String ipTrafficFilter) {
    this.ipTrafficFilter = ipTrafficFilter;
    return this;
  }

  /**
   * Get ipTrafficFilter
   * @return ipTrafficFilter
  **/
  @ApiModelProperty(value = "")
  
    public String getIpTrafficFilter() {
    return ipTrafficFilter;
  }

  public void setIpTrafficFilter(String ipTrafficFilter) {
    this.ipTrafficFilter = ipTrafficFilter;
  }

  public IpEthFlowDescription ethTrafficFilter(EthFlowDescription ethTrafficFilter) {
    this.ethTrafficFilter = ethTrafficFilter;
    return this;
  }

  /**
   * Get ethTrafficFilter
   * @return ethTrafficFilter
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EthFlowDescription getEthTrafficFilter() {
    return ethTrafficFilter;
  }

  public void setEthTrafficFilter(EthFlowDescription ethTrafficFilter) {
    this.ethTrafficFilter = ethTrafficFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpEthFlowDescription ipEthFlowDescription = (IpEthFlowDescription) o;
    return Objects.equals(this.ipTrafficFilter, ipEthFlowDescription.ipTrafficFilter) &&
        Objects.equals(this.ethTrafficFilter, ipEthFlowDescription.ethTrafficFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipTrafficFilter, ethTrafficFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpEthFlowDescription {\n");
    
    sb.append("    ipTrafficFilter: ").append(toIndentedString(ipTrafficFilter)).append("\n");
    sb.append("    ethTrafficFilter: ").append(toIndentedString(ethTrafficFilter)).append("\n");
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
