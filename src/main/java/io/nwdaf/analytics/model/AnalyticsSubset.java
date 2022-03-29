package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - NUM_OF_UE_REG: The number of UE registered. This value is only applicable to NSI_LOAD_LEVEL event.   - NUM_OF_PDU_SESS_ESTBL: The number of PDU sessions established. This value is only applicable to NSI_LOAD_LEVEL event.   - RES_USAGE: The current usage of the virtual resources assigned to the NF instances belonging to a particular network slice instance. This value is only applicable to NSI_LOAD_LEVEL event.   - NUM_OF_EXCEED_RES_USAGE_LOAD_LEVEL_THR: The number of times the resource usage threshold of the network slice instance is reached or exceeded if a threshold value is provided by the consumer. This value is only applicable to NSI_LOAD_LEVEL event.   - PERIOD_OF_EXCEED_RES_USAGE_LOAD_LEVEL_THR: The time interval between each time the threshold being met or exceeded on the network slice (instance). This value is only applicable to NSI_LOAD_LEVEL event.   - EXCEED_LOAD_LEVEL_THR_IND: Whether the Load Level Threshold is met or exceeded by the statistics value. This value is only applicable to NSI_LOAD_LEVEL event.   - LIST_OF_TOP_APP_UL: The list of applications that contribute the most to the traffic in the UL direction. This value is only applicable to USER_DATA_CONGESTION event.   - LIST_OF_TOP_APP_DL: The list of applications that contribute the most to the traffic in the DL direction. This value is only applicable to USER_DATA_CONGESTION event. 
 */
@ApiModel(description = "Possible values are   - NUM_OF_UE_REG: The number of UE registered. This value is only applicable to NSI_LOAD_LEVEL event.   - NUM_OF_PDU_SESS_ESTBL: The number of PDU sessions established. This value is only applicable to NSI_LOAD_LEVEL event.   - RES_USAGE: The current usage of the virtual resources assigned to the NF instances belonging to a particular network slice instance. This value is only applicable to NSI_LOAD_LEVEL event.   - NUM_OF_EXCEED_RES_USAGE_LOAD_LEVEL_THR: The number of times the resource usage threshold of the network slice instance is reached or exceeded if a threshold value is provided by the consumer. This value is only applicable to NSI_LOAD_LEVEL event.   - PERIOD_OF_EXCEED_RES_USAGE_LOAD_LEVEL_THR: The time interval between each time the threshold being met or exceeded on the network slice (instance). This value is only applicable to NSI_LOAD_LEVEL event.   - EXCEED_LOAD_LEVEL_THR_IND: Whether the Load Level Threshold is met or exceeded by the statistics value. This value is only applicable to NSI_LOAD_LEVEL event.   - LIST_OF_TOP_APP_UL: The list of applications that contribute the most to the traffic in the UL direction. This value is only applicable to USER_DATA_CONGESTION event.   - LIST_OF_TOP_APP_DL: The list of applications that contribute the most to the traffic in the DL direction. This value is only applicable to USER_DATA_CONGESTION event. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AnalyticsSubset  implements AnyOfAnalyticsSubset {

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
    sb.append("class AnalyticsSubset {\n");
    
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
