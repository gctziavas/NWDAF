package io.nwdaf.analytics.model;

import java.util.Arrays;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are: -DOWNLINK_ONLY: Downlink only -UPLINK_ONLY: Uplink only -BIDIRECTIONA: Bi-directional 
 */
@ApiModel(description = "Possible values are: -DOWNLINK_ONLY: Downlink only -UPLINK_ONLY: Uplink only -BIDIRECTIONA: Bi-directional ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ScheduledCommunicationType  implements AnyOfScheduledCommunicationType {

	private String scheduledCommunicationType = null;
	
	@JsonIgnore
	private String[] possibleValues = {"DOWNLINK_ONLY" , "UPLINK_ONLY" , "BIDIRECTIONAL"};                                                                                         
	
	
	public ScheduledCommunicationType(String scheduledCommunicationType) {
		setScheduledCommunicationType(scheduledCommunicationType);
	}
	
	public void setScheduledCommunicationType(String scheduledCommunicationType) {

		  if (Arrays.asList(possibleValues).contains(scheduledCommunicationType)) {
			  this.scheduledCommunicationType = scheduledCommunicationType;
		}
		  else {
			  throw new IllegalArgumentException("Not valid scheduledCommunicationType value.");
		  }
	}
  
	public String getNetworkPerfType() {
		return this.scheduledCommunicationType;
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
    sb.append("class ScheduledCommunicationType {\n");
    sb.append("    "+this.scheduledCommunicationType+"\n");
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
