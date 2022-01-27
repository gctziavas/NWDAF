package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Ipv4Addr;
import io.nwdaf.analytics.model.Ipv6Addr;
import io.nwdaf.analytics.model.Ipv6Prefix;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains an IP adresse.
 */
@ApiModel(description = "Contains an IP adresse.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class IpAddr  implements OneOfIpAddr {
  @JsonProperty("ipv4Addr")
  private Ipv4Addr ipv4Addr = null;

  @JsonProperty("ipv6Addr")
  private Ipv6Addr ipv6Addr = null;

  @JsonProperty("ipv6Prefix")
  private Ipv6Prefix ipv6Prefix = null;

  public IpAddr ipv4Addr(Ipv4Addr ipv4Addr) {
    this.ipv4Addr = ipv4Addr;
    return this;
  }

  /**
   * Get ipv4Addr
   * @return ipv4Addr
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Ipv4Addr getIpv4Addr() {
    return ipv4Addr;
  }

  public void setIpv4Addr(Ipv4Addr ipv4Addr) {
    this.ipv4Addr = ipv4Addr;
  }

  public IpAddr ipv6Addr(Ipv6Addr ipv6Addr) {
    this.ipv6Addr = ipv6Addr;
    return this;
  }

  /**
   * Get ipv6Addr
   * @return ipv6Addr
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Ipv6Addr getIpv6Addr() {
    return ipv6Addr;
  }

  public void setIpv6Addr(Ipv6Addr ipv6Addr) {
    this.ipv6Addr = ipv6Addr;
  }

  public IpAddr ipv6Prefix(Ipv6Prefix ipv6Prefix) {
    this.ipv6Prefix = ipv6Prefix;
    return this;
  }

  /**
   * Get ipv6Prefix
   * @return ipv6Prefix
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Ipv6Prefix getIpv6Prefix() {
    return ipv6Prefix;
  }

  public void setIpv6Prefix(Ipv6Prefix ipv6Prefix) {
    this.ipv6Prefix = ipv6Prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddr ipAddr = (IpAddr) o;
    return Objects.equals(this.ipv4Addr, ipAddr.ipv4Addr) &&
        Objects.equals(this.ipv6Addr, ipAddr.ipv6Addr) &&
        Objects.equals(this.ipv6Prefix, ipAddr.ipv6Prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Addr, ipv6Addr, ipv6Prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddr {\n");
    
    sb.append("    ipv4Addr: ").append(toIndentedString(ipv4Addr)).append("\n");
    sb.append("    ipv6Addr: ").append(toIndentedString(ipv6Addr)).append("\n");
    sb.append("    ipv6Prefix: ").append(toIndentedString(ipv6Prefix)).append("\n");
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
