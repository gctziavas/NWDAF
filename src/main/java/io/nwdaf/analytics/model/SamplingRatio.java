package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.
 */
@ApiModel(description = "Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class SamplingRatio   {
	 
	private Integer samplingRatio = null;
	 
	 public SamplingRatio(String samplingRatio) {
		 int samplingRatioInteger = Integer.parseInt(samplingRatio);
		 if(samplingRatioInteger>0 && samplingRatioInteger<101) {
			 this.samplingRatio = samplingRatioInteger;
		 }
		 else {
			 throw new IllegalArgumentException("Not valid Sampling Ratio value. SamplingRatio must be within range [1 , 100].");
		 }
	 }
	
	
  public Integer getSamplingRatio() {
		return samplingRatio;
	}


	public void setSamplingRatio(Integer samplingRatio) {
		this.samplingRatio = samplingRatio;
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
    sb.append("class SamplingRatio {\n");
    
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
