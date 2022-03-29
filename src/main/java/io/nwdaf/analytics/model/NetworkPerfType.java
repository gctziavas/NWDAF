package io.nwdaf.analytics.model;

import java.util.Arrays;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - GNB_ACTIVE_RATIO: Indicates that the network performance requirement is gNodeB active (i.e. up and running) rate. Indicates the ratio of gNB active (i.e. up and running) number to the total number of gNB   - GNB_COMPUTING_USAGE: Indicates gNodeB computing resource usage.   - GNB_MEMORY_USAGE: Indicates gNodeB memory usage.   - GNB_DISK_USAGE: Indicates gNodeB disk usage.   - NUM_OF_UE: Indicates number of UEs.   - SESS_SUCC_RATIO: Indicates ratio of successful setup of PDU sessions to total PDU session setup attempts.   - SESS_SUCC_RATIO: Indicates Ratio of successful handovers to the total handover attempts.  
 */
@ApiModel(description = "Possible values are   - GNB_ACTIVE_RATIO: Indicates that the network performance requirement is gNodeB active (i.e. up and running) rate. Indicates the ratio of gNB active (i.e. up and running) number to the total number of gNB   - GNB_COMPUTING_USAGE: Indicates gNodeB computing resource usage.   - GNB_MEMORY_USAGE: Indicates gNodeB memory usage.   - GNB_DISK_USAGE: Indicates gNodeB disk usage.   - NUM_OF_UE: Indicates number of UEs.   - SESS_SUCC_RATIO: Indicates ratio of successful setup of PDU sessions to total PDU session setup attempts.   - SESS_SUCC_RATIO: Indicates Ratio of successful handovers to the total handover attempts.  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NetworkPerfType  implements AnyOfNetworkPerfType {
	
	private String networkPerfType = null;
	
	@JsonIgnore
	private String[] possibleValues = {"GNB_ACTIVE_RATIO", "GNB_COMPUTING_USAGE","GNB_MEMORY_USAGE","GNB_DISK_USAGE","NUM_OF_UE","SESS_SUCC_RATIO","HO_SUCC_RATIO","MOBILITY","COMMUN","MOBILITY_AND_COMMUN"};                                                                                         
	
	
	public NetworkPerfType(String networkPerfType) {

		  if (Arrays.asList(possibleValues).contains(networkPerfType)) {
			  this.networkPerfType = networkPerfType;
		}
		  else {
			  throw new IllegalArgumentException("Not valid networkPerfType value.");
		  }
	}
  
	public String getNetworkPerfType() {
		return this.networkPerfType;
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
    sb.append("class NetworkPerfType {\n");
    sb.append("    "+this.networkPerfType+"\n");
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
