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
 * Represents a list of IPv4 and/or IPv6 addresses.
 */
@ApiModel(description = "Represents a list of IPv4 and/or IPv6 addresses.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AddressList   {
  @JsonProperty("ipv4Addrs")
  @Valid
  private List<String> ipv4Addrs = null;

  @JsonProperty("ipv6Addrs")
  @Valid
  private List<String> ipv6Addrs = null;

  public AddressList ipv4Addrs(List<String> ipv4Addrs) {
    this.ipv4Addrs = ipv4Addrs;
    return this;
  }

  public AddressList addIpv4AddrsItem(String ipv4AddrsItem) {
    if (this.ipv4Addrs == null) {
      this.ipv4Addrs = new ArrayList<>();
    }
    this.ipv4Addrs.add(ipv4AddrsItem);
    return this;
  }

  /**
   * Get ipv4Addrs
   * @return ipv4Addrs
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getIpv4Addrs() {
    return ipv4Addrs;
  }

  public void setIpv4Addrs(List<String> ipv4Addrs) {
    this.ipv4Addrs = ipv4Addrs;
  }

  public AddressList ipv6Addrs(List<String> ipv6Addrs) {
    this.ipv6Addrs = ipv6Addrs;
    return this;
  }

  public AddressList addIpv6AddrsItem(String ipv6AddrsItem) {
    if (this.ipv6Addrs == null) {
      this.ipv6Addrs = new ArrayList<>();
    }
    this.ipv6Addrs.add(ipv6AddrsItem);
    return this;
  }

  /**
   * Get ipv6Addrs
   * @return ipv6Addrs
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getIpv6Addrs() {
    return ipv6Addrs;
  }

  public void setIpv6Addrs(List<String> ipv6Addrs) {
    this.ipv6Addrs = ipv6Addrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressList addressList = (AddressList) o;
    return Objects.equals(this.ipv4Addrs, addressList.ipv4Addrs) &&
        Objects.equals(this.ipv6Addrs, addressList.ipv6Addrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Addrs, ipv6Addrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressList {\n");
    
    sb.append("    ipv4Addrs: ").append(toIndentedString(ipv4Addrs)).append("\n");
    sb.append("    ipv6Addrs: ").append(toIndentedString(ipv6Addrs)).append("\n");
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
