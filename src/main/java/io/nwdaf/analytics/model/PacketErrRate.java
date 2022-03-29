package io.nwdaf.analytics.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * String representing Packet Error Rate (see clause 5.7.3.5 and 5.7.4 of 3GPP TS 23.501, expressed as a \&quot;scalar x 10-k\&quot; where the scalar and the exponent k are each encoded as one decimal digit
 */
@ApiModel(description = "String representing Packet Error Rate (see clause 5.7.3.5 and 5.7.4 of 3GPP TS 23.501, expressed as a \"scalar x 10-k\" where the scalar and the exponent k are each encoded as one decimal digit")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class PacketErrRate   {

	
	
	private String packetErrRate = null;
	
	public PacketErrRate(String packetErrRate ) {
		  String pattern = "^([0-9]E-[0-9])$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(packetErrRate );
		  if (m.matches()) {
			  this.packetErrRate  = packetErrRate ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid packetErrRate  argument. PacketErrRate must must follow the \"^([0-9]E-[0-9])$\" pattern.");
		  }
	}
	
	public String getpacketErrRate() {
		return packetErrRate;
	}


	public void setpacketErrRate(String packetErrRate) {
		  String pattern = "^([0-9]E-[0-9])$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(packetErrRate );
		  if (m.matches()) {
			  this.packetErrRate  = packetErrRate ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid packetErrRate  argument. PacketErrRate must must follow the \"^([0-9]E-[0-9])$\" pattern.");
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacketErrRate {\n");
    
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
