package io.nwdaf.analytics.model;

import java.util.Arrays;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates the radio access used.
 */
@ApiModel(description = "Indicates the radio access used.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class RatType  implements AnyOfRatType {

	@JsonProperty
	private String ratType = null;
	
	@JsonIgnore
	private String[] possibleValues = {"NR","EUTRA","WLAN","VIRTUAL","NBIOT","WIRELINE","WIRELINE_CABLE","WIRELINE_BBF","LTE-M","NR_U","EUTRA_U","TRUSTED_N3GA","TRUSTED_WLAN","UTRA","GERA","NR_LEO","NR_MEO","NR_GEO","NR_OTHER_SAT","NR_REDCAP"};                                                                                         
	
	
	public RatType(String ratType) {
		ratType = ratType.toUpperCase();
		if (Arrays.asList(possibleValues).contains(ratType)) {
			this.ratType = ratType;
		}
		else {
			throw new IllegalArgumentException("Not valid ratType value.");
		  }
	}
  
	public String getNetworkPerfType() {
		return this.ratType;
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
    sb.append("class RatType {\n");
    
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
