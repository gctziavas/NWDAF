package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - LOAD_LEVEL_INFORMATION: Represent the analytics of load level information of corresponding network slice. - NETWORK_PERFORMANCE: Represent the analytics of network performance information. - NF_LOAD: Indicates that the event subscribed is NF Load. - SERVICE_EXPERIENCE: Represent the analytics of service experience information of the specific applications. - UE_MOBILITY: Represent the analytics of UE mobility. - UE_COMMUNICATION: Represent the analytics of UE communication. - QOS_SUSTAINABILITY: Represent the analytics of QoS sustainability information in the certain area.  - ABNORMAL_BEHAVIOUR: Indicates that the event subscribed is abnormal behaviour information. - USER_DATA_CONGESTION: Represent the analytics of the user data congestion in the certain area. - NSI_LOAD_LEVEL: Represent the analytics of Network Slice and the optionally associated Network Slice Instance.  - SM_CONGESTION: Represent the analytics of Session Management congestion control experience information for specific DNN and/or S-NSSAI. 
 */
@ApiModel(description = "Possible values are - LOAD_LEVEL_INFORMATION: Represent the analytics of load level information of corresponding network slice. - NETWORK_PERFORMANCE: Represent the analytics of network performance information. - NF_LOAD: Indicates that the event subscribed is NF Load. - SERVICE_EXPERIENCE: Represent the analytics of service experience information of the specific applications. - UE_MOBILITY: Represent the analytics of UE mobility. - UE_COMMUNICATION: Represent the analytics of UE communication. - QOS_SUSTAINABILITY: Represent the analytics of QoS sustainability information in the certain area.  - ABNORMAL_BEHAVIOUR: Indicates that the event subscribed is abnormal behaviour information. - USER_DATA_CONGESTION: Represent the analytics of the user data congestion in the certain area. - NSI_LOAD_LEVEL: Represent the analytics of Network Slice and the optionally associated Network Slice Instance.  - SM_CONGESTION: Represent the analytics of Session Management congestion control experience information for specific DNN and/or S-NSSAI. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class EventId  implements AnyOfEventId {
	
	private String eventId = null;
	
	public EventId(String eventId) {
		eventId = eventId.toUpperCase();
	 
		if(eventId.equals("LOAD_LEVEL_INFORMATION")||eventId.equals("NETWORK_PERFORMANCE")||eventId.equals("NF_LOAD")||eventId.equals("QOS_SUSTAINABILITY")||eventId.equals("SERVICE_EXPERIENCE")||eventId.equals("UE_MOBILITY")||eventId.equals("UE_COMM")||eventId.equals("USER_DATA_CONGESTION")||eventId.equals("ABNORMAL_BEHAVIOUR")||eventId.equals("NSI_LOAD_LEVEL")||eventId.equals("SM_CONGESTION")||eventId.equals("DN_PERFORMANCE")) {
			this.eventId = eventId;
		}
		else { 
			throw new IllegalArgumentException("Not valid EventId argument");
		}
	}
	
	
	
  public String getEventId() {
		return eventId;
	}



	public void setEventId(String eventId) {
		this.eventId = eventId;
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
    sb.append("EventId {\n");
    sb.append("    eventId:"+getEventId());
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
