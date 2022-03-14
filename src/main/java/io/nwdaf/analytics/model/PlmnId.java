package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * When PlmnId needs to be converted to string (e.g. when used in maps as key), the string shall be composed of three digits \&quot;mcc\&quot; followed by \&quot;-\&quot; and two or three digits \&quot;mnc\&quot;.
 */
@ApiModel(description = "When PlmnId needs to be converted to string (e.g. when used in maps as key), the string shall be composed of three digits \"mcc\" followed by \"-\" and two or three digits \"mnc\".")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class PlmnId   {
  @JsonProperty("mcc")
  private String mcc = null;

  @JsonProperty("mnc")
  private String mnc = null;
  
   
  
  public PlmnId(String mcc, String mnc) {
	  setMcc(mcc);
	  setMnc(mnc);
  }
  
  public PlmnId() {
	// TODO Auto-generated constructor stub
}

public String plmnIdValue() {
	  String plmnIdValue = this.mcc+"-"+this.mnc;
	  return plmnIdValue;
  }
  
  
  public PlmnId mcc(String mcc) {
    this.mcc = new Mcc(mcc).mccValue();
    return this;
  }

  /**
   * Get mcc
   * @return mcc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="^\\d{3}$")   public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
	  this.mcc = new Mcc(mcc).mccValue();
  }

  public PlmnId mnc(String mnc) {
	  this.mnc = new Mnc(mnc).mncValue();
    return this;
  }

  /**
   * Get mnc
   * @return mnc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="^\\d{2,3}$")   public String getMnc() {
    return mnc;
  }

  public void setMnc(String mnc) {
	  this.mnc = new Mnc(mnc).mncValue();
  }
  
  
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnId plmnId = (PlmnId) o;
    return Objects.equals(this.mcc, plmnId.mcc) &&
        Objects.equals(this.mnc, plmnId.mnc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnId {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
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
