package io.nwdaf.analytics.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This represents the identifier of the eNB ID as specified in clause 9.2.1.37 of 3GPP TS 36.413. The string shall be formatted with the following pattern &#x27;^(&#x27;MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})$&#x27; The value of the eNB ID shall be encoded in hexadecimal representation. Each character in the string shall take a value of \&quot;0\&quot; to \&quot;9\&quot;, \&quot;a\&quot; to \&quot;f\&quot; or \&quot;A\&quot; to \&quot;F\&quot; and shall represent 4 bits. The padding 0 shall be added to make multiple nibbles, so the most significant character representing the padding 0 if required together with the 4 most significant bits of the eNB ID shall appear first in the string, and the character representing the 4 least significant bit of the eNB ID (to form a nibble) shall appear last in the string.
 */
@ApiModel(description = "This represents the identifier of the eNB ID as specified in clause 9.2.1.37 of 3GPP TS 36.413. The string shall be formatted with the following pattern '^('MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})$' The value of the eNB ID shall be encoded in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The padding 0 shall be added to make multiple nibbles, so the most significant character representing the padding 0 if required together with the 4 most significant bits of the eNB ID shall appear first in the string, and the character representing the 4 least significant bit of the eNB ID (to form a nibble) shall appear last in the string.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ENbId   {

	private String eNbId = null;
	
	public ENbId(String eNbId ) {
		  String pattern = "^('MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|\n"
		  		+ "SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(eNbId );
		  if (m.matches()) {
			  this.eNbId  = eNbId ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid eNbId  argument. ENbId  must must follow the \"^('MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})\" pattern.");
		  }
	}
	
	public String geteNbId() {
		return eNbId;
	}


	public void seteNbId(String eNbId) {
		  String pattern = "^[A-Fa-f0-9]+$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(eNbId );
		  if (m.matches()) {
			  this.eNbId  = eNbId ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid eNbId  argument. ENbId  must must follow the \"^('MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})\" pattern.");
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
    sb.append("class ENbId {\n");
    
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
