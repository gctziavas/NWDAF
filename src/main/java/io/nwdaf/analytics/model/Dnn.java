package io.nwdaf.analytics.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \&quot;Label1.Label2.Label3\&quot;).
 */
@ApiModel(description = "String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class Dnn   {
	
	
	private String dnn = null;
		
	public Dnn(String dnn ) {
		  setDnn(dnn);
	}
	public Dnn() {}
		
	public String getDnn() {
		return dnn;
	}
	
	public void setDnn(String dnn) {
		String pattern = "^[0-9a-zA-Z\\.]{1,100}$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(dnn );
		  if (m.matches()) {
			  this.dnn  = dnn ;
		}
		  else {
			  throw new IllegalArgumentException("Not valid dnn argument. Dnn must must follow the \"^[0-9a-zA-Z\\.]{1,100}$\" pattern.");
		  }
	}
	
	public String dnnValue() {
		return this.dnn;
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
    sb.append("class Dnn {\n");
    sb.append("    "+dnn+"\n");
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
