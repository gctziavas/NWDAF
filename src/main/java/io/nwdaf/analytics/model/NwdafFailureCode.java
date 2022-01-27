package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - UNAVAILABLE_DATA: Indicates the requested statistics information for the event is rejected since necessary data to perform the service is unavailable.   - BOTH_STAT_PRED_NOT_ALLOWED: Indicates the requested analysis information for the event is rejected since the start time is in the past and the end time is in the future, which means the NF service consumer requested both statistics and prediction for the analytics.   - UNSATISFIED_REQUESTED_ANALYTICS_TIME: Indicates that the requested event is rejected since the analytics information is not ready when the time indicated by the \&quot;timeAnaNeeded\&quot; attribute (as provided during the creation or modification of subscription) is reached.   - OTHER: Indicates the requested analysis information for the event is rejected due to other reasons.  
 */
@ApiModel(description = "Possible values are   - UNAVAILABLE_DATA: Indicates the requested statistics information for the event is rejected since necessary data to perform the service is unavailable.   - BOTH_STAT_PRED_NOT_ALLOWED: Indicates the requested analysis information for the event is rejected since the start time is in the past and the end time is in the future, which means the NF service consumer requested both statistics and prediction for the analytics.   - UNSATISFIED_REQUESTED_ANALYTICS_TIME: Indicates that the requested event is rejected since the analytics information is not ready when the time indicated by the \"timeAnaNeeded\" attribute (as provided during the creation or modification of subscription) is reached.   - OTHER: Indicates the requested analysis information for the event is rejected due to other reasons.  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NwdafFailureCode  implements AnyOfNwdafFailureCode {

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
    sb.append("class NwdafFailureCode {\n");
    
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
