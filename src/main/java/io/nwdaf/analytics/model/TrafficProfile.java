package io.nwdaf.analytics.model;

import java.util.Arrays;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - SINGLE_TRANS_UL: Uplink single packet transmission. - SINGLE_TRANS_DL: Downlink single packet transmission. - DUAL_TRANS_UL_FIRST: Dual packet transmission, firstly uplink packet transmission with subsequent downlink packet transmission. - DUAL_TRANS_DL_FIRST: Dual packet transmission, firstly downlink packet transmission with subsequent uplink packet transmission. 
 */
@ApiModel(description = "Possible values are - SINGLE_TRANS_UL: Uplink single packet transmission. - SINGLE_TRANS_DL: Downlink single packet transmission. - DUAL_TRANS_UL_FIRST: Dual packet transmission, firstly uplink packet transmission with subsequent downlink packet transmission. - DUAL_TRANS_DL_FIRST: Dual packet transmission, firstly downlink packet transmission with subsequent uplink packet transmission. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class TrafficProfile  implements AnyOfTrafficProfile {

	private String trafficProfile = null;
	
	@JsonIgnore
	private String[] possibleValues = {"SINGLE_TRANS_UL" , "SINGLE_TRANS_DL" , "DUAL_TRANS_UL_FIRST" , "DUAL_TRANS_DL_FIRST" , "MULTI_TRANS"};                                                                                         
	
	
	public TrafficProfile(String trafficProfile) {
		setScheduledCommunicationType(trafficProfile);
	}
	
	public void setScheduledCommunicationType(String trafficProfile) {

		  if (Arrays.asList(possibleValues).contains(trafficProfile)) {
			  this.trafficProfile = trafficProfile;
		}
		  else {
			  throw new IllegalArgumentException("Not valid trafficProfile value.");
		  }
	}
  
	public String getNetworkPerfType() {
		return this.trafficProfile;
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
    sb.append("class TrafficProfile {\n");
    sb.append("    " + this.trafficProfile +"\n");
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
