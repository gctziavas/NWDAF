package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.IpAddr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IP address and/or FQDN.
 */
@ApiModel(description = "IP address and/or FQDN.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AddrFqdn   {
  @JsonProperty("ipAddr")
  private IpAddr ipAddr = null;

  @JsonProperty("fqdn")
  private String fqdn = null;

  public AddrFqdn ipAddr(IpAddr ipAddr) {
    this.ipAddr = ipAddr;
    return this;
  }

  /**
   * Get ipAddr
   * @return ipAddr
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public IpAddr getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(IpAddr ipAddr) {
    this.ipAddr = ipAddr;
  }

  public AddrFqdn fqdn(String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

  /**
   * Indicates an FQDN.
   * @return fqdn
  **/
  @ApiModelProperty(value = "Indicates an FQDN.")
  
    public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddrFqdn addrFqdn = (AddrFqdn) o;
    return Objects.equals(this.ipAddr, addrFqdn.ipAddr) &&
        Objects.equals(this.fqdn, addrFqdn.fqdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddr, fqdn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddrFqdn {\n");
    
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
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
