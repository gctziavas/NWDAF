package io.nwdaf.analytics.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This represents the identifier of the ng-eNB ID as specified in clause 9.3.1.8 of 3GPP TS 38.413. The value of the ng-eNB ID shall be encoded in hexadecimal representation. Each character in the string shall take a value of \&quot;0\&quot; to \&quot;9\&quot;, \&quot;a\&quot; to \&quot;f\&quot; or \&quot;A\&quot; to \&quot;F\&quot; and shall represent 4 bits. The padding 0 shall be added to make multiple nibbles, so the most significant character representing the padding 0 if required together with the 4 most significant bits of the ng-eNB ID shall appear first in the string, and the character representing the 4 least significant bit of the ng-eNB ID (to form a nibble) shall appear last in the string.
 */
@ApiModel(description = "This represents the identifier of the ng-eNB ID as specified in clause 9.3.1.8 of 3GPP TS 38.413. The value of the ng-eNB ID shall be encoded in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The padding 0 shall be added to make multiple nibbles, so the most significant character representing the padding 0 if required together with the 4 most significant bits of the ng-eNB ID shall appear first in the string, and the character representing the 4 least significant bit of the ng-eNB ID (to form a nibble) shall appear last in the string.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NgeNbId   {
	
	private String ngeNbId = null;
	
	public NgeNbId(String ngeNbId ) {
		  String pattern = "^('MacroNGeNB-[A-Fa-f0-9]{5}|LMacroNGeNB-[A-Fa-f0-9]{6}|SMacroNGeNB-[A-Fa-f0-9]{5})$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(ngeNbId );
		  if (m.matches()) {
			  this.ngeNbId  = ngeNbId ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid ngeNbId  argument. NgeNbId  must must follow the \"^('MacroNGeNB-[A-Fa-f0-9]{5}|LMacroNGeNB-[A-Fa-f0-9]{6}|SMacroNGeNB-[A-Fa-f0-9]{5})$\" pattern.");
		  }
	}
	
	public String getNgeNbId() {
		return ngeNbId;
	}


	public void setNgeNbId(String ngeNbId) {
		  String pattern = "^('MacroNGeNB-[A-Fa-f0-9]{5}|LMacroNGeNB-[A-Fa-f0-9]{6}|SMacroNGeNB-[A-Fa-f0-9]{5})$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(ngeNbId );
		  if (m.matches()) {
			  this.ngeNbId  = ngeNbId ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid ngeNbId  argument. NgeNbId  must must follow the \"^('MacroNGeNB-[A-Fa-f0-9]{5}|LMacroNGeNB-[A-Fa-f0-9]{6}|SMacroNGeNB-[A-Fa-f0-9]{5})$\" pattern.");
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
    sb.append("class NgeNbId {\n");
    sb.append("    "+this.ngeNbId+"\n");
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
