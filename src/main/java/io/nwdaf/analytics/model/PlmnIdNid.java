package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.TS29571CommonDataYamlcomponentsschemasMcc;
import io.nwdaf.analytics.model.TS29571CommonDataYamlcomponentsschemasMnc;
import io.nwdaf.analytics.model.TS29571CommonDataYamlcomponentsschemasNid;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the serving core network operator PLMN ID and, for an SNPN, the NID that together with the PLMN ID identifies the SNPN.
 */
@ApiModel(description = "Contains the serving core network operator PLMN ID and, for an SNPN, the NID that together with the PLMN ID identifies the SNPN.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class PlmnIdNid   {
  @JsonProperty("mcc")
  private TS29571CommonDataYamlcomponentsschemasMcc mcc = null;

  @JsonProperty("mnc")
  private TS29571CommonDataYamlcomponentsschemasMnc mnc = null;

  @JsonProperty("nid")
  private TS29571CommonDataYamlcomponentsschemasNid nid = null;

  public PlmnIdNid mcc(TS29571CommonDataYamlcomponentsschemasMcc mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * Get mcc
   * @return mcc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29571CommonDataYamlcomponentsschemasMcc getMcc() {
    return mcc;
  }

  public void setMcc(TS29571CommonDataYamlcomponentsschemasMcc mcc) {
    this.mcc = mcc;
  }

  public PlmnIdNid mnc(TS29571CommonDataYamlcomponentsschemasMnc mnc) {
    this.mnc = mnc;
    return this;
  }

  /**
   * Get mnc
   * @return mnc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29571CommonDataYamlcomponentsschemasMnc getMnc() {
    return mnc;
  }

  public void setMnc(TS29571CommonDataYamlcomponentsschemasMnc mnc) {
    this.mnc = mnc;
  }

  public PlmnIdNid nid(TS29571CommonDataYamlcomponentsschemasNid nid) {
    this.nid = nid;
    return this;
  }

  /**
   * Get nid
   * @return nid
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasNid getNid() {
    return nid;
  }

  public void setNid(TS29571CommonDataYamlcomponentsschemasNid nid) {
    this.nid = nid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnIdNid plmnIdNid = (PlmnIdNid) o;
    return Objects.equals(this.mcc, plmnIdNid.mcc) &&
        Objects.equals(this.mnc, plmnIdNid.mnc) &&
        Objects.equals(this.nid, plmnIdNid.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnIdNid {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
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
