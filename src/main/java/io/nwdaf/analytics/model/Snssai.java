package io.nwdaf.analytics.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * When Snssai needs to be converted to string (e.g. when used in maps as key), the string shall be composed of one to three digits \&quot;sst\&quot; optionally followed by \&quot;-\&quot; and 6 hexadecimal digits \&quot;sd\&quot;.
 */
@ApiModel(description = "When Snssai needs to be converted to string (e.g. when used in maps as key), the string shall be composed of one to three digits \"sst\" optionally followed by \"-\" and 6 hexadecimal digits \"sd\".")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class Snssai   {
  @JsonProperty("sst")
  private Integer sst = null;

  @JsonProperty("sd")
  private String sd = null;

  public Snssai sst(Integer sst) {
    if (sst>=0 && sst<256) {
		this.sst = sst;
		return this;
	}
    else {
    	throw new IllegalArgumentException("Not valid sst argument. Sst must be within range [0 , 255]");
    }
  }

  public Snssai(Integer sst , String sd) {
	  setSst(sst);
	  setSd(sd);
  }
  
  public Snssai(String sst , String sd) {
	  setSst(Integer.parseInt(sst));
	  setSd(sd);
  }
  
  public Snssai(Integer sst) {
	  setSst(sst);
  }
  
  /**
   * Unsigned integer, within the range 0 to 255, representing the Slice/Service Type. It indicates the expected Network Slice behaviour in terms of features and services.  Values 0 to 127 correspond to the standardized SST range. Values 128 to 255 correspond to the Operator-specific range. See clause 28.4.2 of 3GPP TS 23.003.  Standardized values are defined in clause 5.15.2.2 of 3GPP TS 23.501. 
   * minimum: 0
   * maximum: 255
   * @return sst
  **/
  @ApiModelProperty(required = true, value = "Unsigned integer, within the range 0 to 255, representing the Slice/Service Type. It indicates the expected Network Slice behaviour in terms of features and services.  Values 0 to 127 correspond to the standardized SST range. Values 128 to 255 correspond to the Operator-specific range. See clause 28.4.2 of 3GPP TS 23.003.  Standardized values are defined in clause 5.15.2.2 of 3GPP TS 23.501. ")
      @NotNull

  @Min(0) @Max(255)   public Integer getSst() {
    return sst;
  }

  public void setSst(Integer sst) {
	  if (sst>=0 && sst<256) {
			this.sst = sst;
		}
	    else {
	    	throw new IllegalArgumentException("Not valid sst argument. Sst must be within range [0 , 255]");
	    }
  }

  public Snssai sd(String sd) {
	  String pattern = "^[A-Fa-f0-9]{6}$";
	  Pattern r = Pattern.compile(pattern);
	  Matcher m = r.matcher(sd);
	  if (m.matches()) {	
		  this.sd = sd;
		  return this;
	}
	  else {
		  throw new IllegalArgumentException("Not valid sd argument. Sd must must follow the \"^[A-Fa-f0-9]{6}$\" pattern.");
	  }
  }

  /**
   * 3-octet string, representing the Slice Differentiator, in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the SD shall appear first in the string, and the character representing the 4 least significant bit of the SD shall appear last in the string.  This is an optional parameter that complements the Slice/Service type(s) to allow to differentiate amongst multiple Network Slices of the same Slice/Service type. This IE shall be absent if no SD value is associated with the SST. 
   * @return sd
  **/
  @ApiModelProperty(value = "3-octet string, representing the Slice Differentiator, in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the SD shall appear first in the string, and the character representing the 4 least significant bit of the SD shall appear last in the string.  This is an optional parameter that complements the Slice/Service type(s) to allow to differentiate amongst multiple Network Slices of the same Slice/Service type. This IE shall be absent if no SD value is associated with the SST. ")
  
  public String getSd() {
    return sd;
  }

  public void setSd(String sd) {
	  String pattern = "^[A-Fa-f0-9]{6}$";
	  Pattern r = Pattern.compile(pattern);
	  Matcher m = r.matcher(sd);
	  if (m.matches()) {
		  this.sd = sd;
	}
	  else {
		  throw new IllegalArgumentException("Not valid sd argument. Sd must must follow the \"^[A-Fa-f0-9]{6}$\" pattern.");
	  }
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snssai snssai = (Snssai) o;
    return Objects.equals(this.sst, snssai.sst) &&
        Objects.equals(this.sd, snssai.sd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sst, sd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snssai {\n");
    
    sb.append("    sst: ").append(toIndentedString(sst)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
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
