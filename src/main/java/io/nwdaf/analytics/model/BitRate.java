package io.nwdaf.analytics.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * String representing a bit rate that shall be formatted as follows.
 */
@ApiModel(description = "String representing a bit rate that shall be formatted as follows.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class BitRate   {
	
	private String bitRate = null;
	
	public BitRate(String bitRate) {
		  String pattern = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(bitRate);
		  if (m.matches()) {
			  this.bitRate = bitRate;
		}
		  else {
			  throw new IllegalArgumentException("Not valid bitRate argument. BitRate must must follow the \"^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$\" pattern.");
		  }
	}
  
	public String bitRateValue() {
		return this.bitRate;
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
    sb.append("class BitRate {\n");
    
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
