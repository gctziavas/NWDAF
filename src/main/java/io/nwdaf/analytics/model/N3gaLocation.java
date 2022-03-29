package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Gli;
import io.nwdaf.analytics.model.HfcNodeId;
import io.nwdaf.analytics.model.LineType;
import io.nwdaf.analytics.model.Tai;
import io.nwdaf.analytics.model.TnapId;
import io.nwdaf.analytics.model.TransportProtocol;
import io.nwdaf.analytics.model.TwapId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the Non-3GPP access user location.
 */
@ApiModel(description = "Contains the Non-3GPP access user location.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class N3gaLocation   {
  @JsonProperty("n3gppTai")
  private Tai n3gppTai = null;

  @JsonProperty("n3IwfId")
  private String n3IwfId = null;

  @JsonProperty("ueIpv4Addr")
  private String ueIpv4Addr = null;

  @JsonProperty("ueIpv6Addr")
  private String ueIpv6Addr = null;

  @JsonProperty("portNumber")
  private Integer portNumber = null;

  @JsonProperty("protocol")
  private TransportProtocol protocol = null;

  @JsonProperty("tnapId")
  private TnapId tnapId = null;

  @JsonProperty("twapId")
  private TwapId twapId = null;

  @JsonProperty("hfcNodeId")
  private HfcNodeId hfcNodeId = null;

  @JsonProperty("gli")
  private Gli gli = null;

  @JsonProperty("w5gbanLineType")
  private LineType w5gbanLineType = null;

  @JsonProperty("gci")
  private String gci = null;

  public N3gaLocation n3gppTai(Tai n3gppTai) {
    this.n3gppTai = n3gppTai;
    return this;
  }

  /**
   * Get n3gppTai
   * @return n3gppTai
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Tai getN3gppTai() {
    return n3gppTai;
  }

  public void setN3gppTai(Tai n3gppTai) {
    this.n3gppTai = n3gppTai;
  }

  public N3gaLocation n3IwfId(String n3IwfId) {
    this.n3IwfId = n3IwfId;
    return this;
  }

  /**
   * This IE shall contain the N3IWF identifier received over NGAP and shall be encoded as a string of hexadecimal characters. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the N3IWF ID shall appear first in the string, and the character representing the 4 least significant bit of the N3IWF ID shall appear last in the string.
   * @return n3IwfId
  **/
  @ApiModelProperty(value = "This IE shall contain the N3IWF identifier received over NGAP and shall be encoded as a string of hexadecimal characters. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the N3IWF ID shall appear first in the string, and the character representing the 4 least significant bit of the N3IWF ID shall appear last in the string.")
  
  @Pattern(regexp="^[A-Fa-f0-9]+$")   public String getN3IwfId() {
    return n3IwfId;
  }

  public void setN3IwfId(String n3IwfId) {
    this.n3IwfId = n3IwfId;
  }

  public N3gaLocation ueIpv4Addr(String ueIpv4Addr) {
    this.ueIpv4Addr = ueIpv4Addr;
    return this;
  }

  /**
   * Get ueIpv4Addr
   * @return ueIpv4Addr
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$")   public String getUeIpv4Addr() {
    return ueIpv4Addr;
  }

  public void setUeIpv4Addr(String ueIpv4Addr) {
    this.ueIpv4Addr = ueIpv4Addr;
  }

  public N3gaLocation ueIpv6Addr(String ueIpv6Addr) {
    this.ueIpv6Addr = ueIpv6Addr;
    return this;
  }

  /**
   * Get ueIpv6Addr
   * @return ueIpv6Addr
  **/
  @ApiModelProperty(value = "")
  
    public String getUeIpv6Addr() {
    return ueIpv6Addr;
  }

  public void setUeIpv6Addr(String ueIpv6Addr) {
    this.ueIpv6Addr = ueIpv6Addr;
  }

  public N3gaLocation portNumber(Integer portNumber) {
    this.portNumber = portNumber;
    return this;
  }

  /**
   * Get portNumber
   * @return portNumber
  **/
  @ApiModelProperty(value = "")
  
    public Integer getPortNumber() {
    return portNumber;
  }

  public void setPortNumber(Integer portNumber) {
    this.portNumber = portNumber;
  }

  public N3gaLocation protocol(TransportProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TransportProtocol getProtocol() {
    return protocol;
  }

  public void setProtocol(TransportProtocol protocol) {
    this.protocol = protocol;
  }

  public N3gaLocation tnapId(TnapId tnapId) {
    this.tnapId = tnapId;
    return this;
  }

  /**
   * Get tnapId
   * @return tnapId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TnapId getTnapId() {
    return tnapId;
  }

  public void setTnapId(TnapId tnapId) {
    this.tnapId = tnapId;
  }

  public N3gaLocation twapId(TwapId twapId) {
    this.twapId = twapId;
    return this;
  }

  /**
   * Get twapId
   * @return twapId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TwapId getTwapId() {
    return twapId;
  }

  public void setTwapId(TwapId twapId) {
    this.twapId = twapId;
  }

  public N3gaLocation hfcNodeId(HfcNodeId hfcNodeId) {
    this.hfcNodeId = hfcNodeId;
    return this;
  }

  /**
   * Get hfcNodeId
   * @return hfcNodeId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public HfcNodeId getHfcNodeId() {
    return hfcNodeId;
  }

  public void setHfcNodeId(HfcNodeId hfcNodeId) {
    this.hfcNodeId = hfcNodeId;
  }

  public N3gaLocation gli(Gli gli) {
    this.gli = gli;
    return this;
  }

  /**
   * Get gli
   * @return gli
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Gli getGli() {
    return gli;
  }

  public void setGli(Gli gli) {
    this.gli = gli;
  }

  public N3gaLocation w5gbanLineType(LineType w5gbanLineType) {
    this.w5gbanLineType = w5gbanLineType;
    return this;
  }

  /**
   * Get w5gbanLineType
   * @return w5gbanLineType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LineType getW5gbanLineType() {
    return w5gbanLineType;
  }

  public void setW5gbanLineType(LineType w5gbanLineType) {
    this.w5gbanLineType = w5gbanLineType;
  }

  public N3gaLocation gci(String gci) {
    this.gci = gci;
    return this;
  }

  /**
   * Get gci
   * @return gci
  **/
  @ApiModelProperty(value = "")
  
    public String getGci() {
    return gci;
  }

  public void setGci(String gci) {
    this.gci = gci;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    N3gaLocation n3gaLocation = (N3gaLocation) o;
    return Objects.equals(this.n3gppTai, n3gaLocation.n3gppTai) &&
        Objects.equals(this.n3IwfId, n3gaLocation.n3IwfId) &&
        Objects.equals(this.ueIpv4Addr, n3gaLocation.ueIpv4Addr) &&
        Objects.equals(this.ueIpv6Addr, n3gaLocation.ueIpv6Addr) &&
        Objects.equals(this.portNumber, n3gaLocation.portNumber) &&
        Objects.equals(this.protocol, n3gaLocation.protocol) &&
        Objects.equals(this.tnapId, n3gaLocation.tnapId) &&
        Objects.equals(this.twapId, n3gaLocation.twapId) &&
        Objects.equals(this.hfcNodeId, n3gaLocation.hfcNodeId) &&
        Objects.equals(this.gli, n3gaLocation.gli) &&
        Objects.equals(this.w5gbanLineType, n3gaLocation.w5gbanLineType) &&
        Objects.equals(this.gci, n3gaLocation.gci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(n3gppTai, n3IwfId, ueIpv4Addr, ueIpv6Addr, portNumber, protocol, tnapId, twapId, hfcNodeId, gli, w5gbanLineType, gci);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class N3gaLocation {\n");
    
    sb.append("    n3gppTai: ").append(toIndentedString(n3gppTai)).append("\n");
    sb.append("    n3IwfId: ").append(toIndentedString(n3IwfId)).append("\n");
    sb.append("    ueIpv4Addr: ").append(toIndentedString(ueIpv4Addr)).append("\n");
    sb.append("    ueIpv6Addr: ").append(toIndentedString(ueIpv6Addr)).append("\n");
    sb.append("    portNumber: ").append(toIndentedString(portNumber)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    tnapId: ").append(toIndentedString(tnapId)).append("\n");
    sb.append("    twapId: ").append(toIndentedString(twapId)).append("\n");
    sb.append("    hfcNodeId: ").append(toIndentedString(hfcNodeId)).append("\n");
    sb.append("    gli: ").append(toIndentedString(gli)).append("\n");
    sb.append("    w5gbanLineType: ").append(toIndentedString(w5gbanLineType)).append("\n");
    sb.append("    gci: ").append(toIndentedString(gci)).append("\n");
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
