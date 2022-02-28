package io.nwdaf.analytics.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * String identifying a Gpsi shall contain either an External Id or an MSISDN. It shall be formatted as follows -External Identifier&#x3D; \&quot;extid-&lt;extid&gt;, where &lt;extid&gt; shall be formatted according to clause 19.7.2 of 3GPP TS 23.003 that describes an External Identifier.
 */
@ApiModel(description = "String identifying a Gpsi shall contain either an External Id or an MSISDN. It shall be formatted as follows -External Identifier= \"extid-<extid>, where <extid> shall be formatted according to clause 19.7.2 of 3GPP TS 23.003 that describes an External Identifier.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class Gpsi   {

	private String gpsi = null;
	
	public Gpsi(String gpsi ) {
		  String pattern = "^(msisdn-[0-9]{5,15}|extid-.+@.+|.+)$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(gpsi );
		  if (m.matches()) {
			  this.gpsi  = gpsi ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid gpsi argument. Gpsi must must follow the \"^(msisdn-[0-9]{5,15}|extid-.+@.+|.+)$\" pattern.");
		  }
	}
	
	public String gpsiValue() {
		return this.gpsi;
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
    sb.append("class Gpsi {\n");
    
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
