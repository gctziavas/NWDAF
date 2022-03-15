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
 * Possible values are - STATIONARY: Identifies the UE is stationary - MOBILE: Identifies the UE is mobile 
 */
@ApiModel(description = "Possible values are - STATIONARY: Identifies the UE is stationary - MOBILE: Identifies the UE is mobile ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class StationaryIndication  implements AnyOfStationaryIndication {

	@JsonProperty
	private String stationaryIndication = null;
	
	@JsonIgnore
	private String[] possibleValues = {"STATIONARY" , "MOBILE"};                                                                                         
	
	public StationaryIndication() {};
	
	public StationaryIndication(String stationaryIndication) {
		setStationaryIndication(stationaryIndication);
	}
	
	public void setStationaryIndication(String stationaryIndication) {
		stationaryIndication = stationaryIndication.toUpperCase();
		if (Arrays.asList(possibleValues).contains(stationaryIndication)) {
			this.stationaryIndication = stationaryIndication;
		}
		else {
			throw new IllegalArgumentException("Not valid stationaryIndication value.");
		  }
	}
  
	public String getNetworkPerfType() {
		return this.stationaryIndication;
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
    sb.append("class StationaryIndication {\n");
    sb.append("    "+this.stationaryIndication+"\n");
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
