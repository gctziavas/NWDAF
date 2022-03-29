package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.QosResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the QoS requirements.
 */
@ApiModel(description = "Represents the QoS requirements.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class QosRequirement   {
  @JsonProperty("5qi")
  private Integer _5qi = null;

  @JsonProperty("gfbrUl")
  private String gfbrUl = null;

  @JsonProperty("gfbrDl")
  private String gfbrDl = null;

  @JsonProperty("resType")
  private String resType = null;

  @JsonProperty("pdb")
  private Integer pdb = null;

  @JsonProperty("per")
  private String per = null;

  
  
  
  public QosRequirement _5qi(Integer _5qi) {
    this._5qi = new FiveQi(_5qi).fiveQiValue();
    return this;
  }

  /**
   * Get _5qi
   * @return _5qi
  **/
  @ApiModelProperty(value = "")
  
    public Integer get5qi() {
    return _5qi;
  }

  public void set5qi(Integer _5qi) {
	  this._5qi = new FiveQi(_5qi).fiveQiValue();
  }

  public QosRequirement gfbrUl(String gfbrUl) {
    this.gfbrUl = new BitRate(gfbrUl).bitRateValue();
    return this;
  }

  /**
   * Get gfbrUl
   * @return gfbrUl
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getGfbrUl() {
    return gfbrUl;
  }

  public void setGfbrUl(String gfbrUl) {
	  this.gfbrUl = new BitRate(gfbrUl).bitRateValue();
  }

  public QosRequirement gfbrDl(String gfbrDl) {
    this.gfbrDl = new BitRate(gfbrDl).bitRateValue();
    return this;
  }

  /**
   * Get gfbrDl
   * @return gfbrDl
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")   public String getGfbrDl() {
    return gfbrDl;
  }

  public void setGfbrDl(String gfbrDl) {
	  this.gfbrDl = new BitRate(gfbrDl).bitRateValue();
  }

  public QosRequirement resType(String resType) {
    this.resType = new QosResourceType(resType).getQosResourceType();
    return this;
  }

  /**
   * Get resType
   * @return resType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public String getResType() {
    return resType;
  }

  public void setResType(String resType) {
	  this.resType = new QosResourceType(resType).getQosResourceType();
  }

  public QosRequirement pdb(Integer pdb) {
    this.pdb = new PacketDelBudget(pdb).packetDelBudgetValue();
    return this;
  }

  /**
   * Get pdb
   * @return pdb
  **/
  @ApiModelProperty(value = "")
  
    public Integer getPdb() {
    return pdb;
  }

  public void setPdb(Integer pdb) {
	  this.pdb = new PacketDelBudget(pdb).packetDelBudgetValue();
  }

  public QosRequirement per(String per) {
    this.per = new PacketErrRate(per).getpacketErrRate();
    return this;
  }

  /**
   * Get per
   * @return per
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^([0-9]E-[0-9])$")   public String getPer() {
    return per;
  }

  public void setPer(String per) {
	  this.per = new PacketErrRate(per).getpacketErrRate();
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosRequirement qosRequirement = (QosRequirement) o;
    return Objects.equals(this._5qi, qosRequirement._5qi) &&
        Objects.equals(this.gfbrUl, qosRequirement.gfbrUl) &&
        Objects.equals(this.gfbrDl, qosRequirement.gfbrDl) &&
        Objects.equals(this.resType, qosRequirement.resType) &&
        Objects.equals(this.pdb, qosRequirement.pdb) &&
        Objects.equals(this.per, qosRequirement.per);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5qi, gfbrUl, gfbrDl, resType, pdb, per);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosRequirement {\n");
    
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    gfbrUl: ").append(toIndentedString(gfbrUl)).append("\n");
    sb.append("    gfbrDl: ").append(toIndentedString(gfbrDl)).append("\n");
    sb.append("    resType: ").append(toIndentedString(resType)).append("\n");
    sb.append("    pdb: ").append(toIndentedString(pdb)).append("\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
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
