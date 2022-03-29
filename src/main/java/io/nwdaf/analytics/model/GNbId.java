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
 * Provides the G-NB identifier.
 */
@ApiModel(description = "Provides the G-NB identifier.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class GNbId   {
  @JsonProperty("bitLength")
  private Integer bitLength = null;

  @JsonProperty("gNBValue")
  private String gNBValue = null;

  
  public GNbId(Integer bitLength , String gNBValue) {
	  setBitLength(bitLength);
	  setGNBValue(gNBValue);
  }
  
  public GNbId(String bitLength , String gNBValue) {
	  Integer bitLengthInteger = Integer.parseInt(bitLength);
	  setBitLength(bitLengthInteger);
	  setGNBValue(gNBValue);
  }
  
  public GNbId() {
	// TODO Auto-generated constructor stub
}


public GNbId bitLength(Integer bitLength) {
    if (bitLength>21 &&bitLength<33) {
		this.bitLength = bitLength;
		return this;
	}
    else {
    	throw new IllegalArgumentException("Not valid bitLength argument. BitLength must be within range [22 , 32].");
    }
  }

  /**
   * Unsigned integer representing the bit length of the gNB ID as defined in clause 9.3.1.6 of 3GPP TS 38.413 [11], within the range 22 to 32.
   * minimum: 22
   * maximum: 32
   * @return bitLength
  **/
  @ApiModelProperty(required = true, value = "Unsigned integer representing the bit length of the gNB ID as defined in clause 9.3.1.6 of 3GPP TS 38.413 [11], within the range 22 to 32.")
      @NotNull

  @Min(22) @Max(32)   public Integer getBitLength() {
    return bitLength;
  }

  public void setBitLength(Integer bitLength) {
	    if (bitLength>21 &&bitLength<33) {
			this.bitLength = bitLength;
		}
	    else {
	    	throw new IllegalArgumentException("Not valid bitLength argument. BitLength must be within range [22 , 32].");
	    }
  }

  public GNbId gNBValue(String gNBValue) {
	  String pattern = "^[A-Fa-f0-9]{6,8}$";
	  Pattern r = Pattern.compile(pattern);
	  Matcher m = r.matcher(gNBValue );
	  if (m.matches()) {
		  this.gNBValue  = gNBValue ;
		  return this;
	}
	  else {
		  throw new IllegalArgumentException("Not valid gNBValue  argument. GNBValue  must must follow the \"^[A-Fa-f0-9]{6,8}$\" pattern.");
	  }
  }

  /**
   * This represents the identifier of the gNB. The value of the gNB ID shall be encoded in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The padding 0 shall be added to make multiple nibbles, the most significant character representing the padding 0 if required together with the 4 most significant bits of the gNB ID shall appear first in the string, and the character representing the 4 least significant bit of the gNB ID shall appear last in the string. 
   * @return gNBValue
  **/
  @ApiModelProperty(required = true, value = "This represents the identifier of the gNB. The value of the gNB ID shall be encoded in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The padding 0 shall be added to make multiple nibbles, the most significant character representing the padding 0 if required together with the 4 most significant bits of the gNB ID shall appear first in the string, and the character representing the 4 least significant bit of the gNB ID shall appear last in the string. ")
      @NotNull

 public String getGNBValue() {
    return gNBValue;
  }

  public void setGNBValue(String gNBValue) {
	  String pattern = "^[A-Fa-f0-9]{6,8}$";
	  Pattern r = Pattern.compile(pattern);
	  Matcher m = r.matcher(gNBValue );
	  if (m.matches()) {
		  this.gNBValue  = gNBValue ;
	}
	  else {
		  throw new IllegalArgumentException("Not valid gNBValue  argument. GNBValue  must must follow the \"^[A-Fa-f0-9]{6,8}$\" pattern.");
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
    GNbId gnbId = (GNbId) o;
    return Objects.equals(this.bitLength, gnbId.bitLength) &&
        Objects.equals(this.gNBValue, gnbId.gNBValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitLength, gNBValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GNbId {\n");
    
    sb.append("    bitLength: ").append(toIndentedString(bitLength)).append("\n");
    sb.append("    gNBValue: ").append(toIndentedString(gNBValue)).append("\n");
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
